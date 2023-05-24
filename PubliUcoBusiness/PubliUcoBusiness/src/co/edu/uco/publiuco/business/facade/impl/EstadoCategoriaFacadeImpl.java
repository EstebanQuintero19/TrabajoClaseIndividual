package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoCategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoCategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoCategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoCategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoCategoriaDTO;

public final class EstadoCategoriaFacadeImpl implements EstadoCategoriaFacade {

	private DAOFactory daoFactory;
	private final EstadoCategoriaBusiness business;

	public EstadoCategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoCategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoCategoriaDTO dto) {
		try {

			final var domain = EstadoCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoCategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoCategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<EstadoCategoriaDTO> list(EstadoCategoriaDTO dto) {
		try {
			final var domain = EstadoCategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoCategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoCategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoCategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
