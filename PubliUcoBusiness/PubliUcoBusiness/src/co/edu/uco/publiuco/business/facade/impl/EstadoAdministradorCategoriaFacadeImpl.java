package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoAdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoAdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoAdministradorCategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoAdministradorCategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoAdministradorCategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoAdministradorCategoriaDTO;

public final class EstadoAdministradorCategoriaFacadeImpl implements EstadoAdministradorCategoriaFacade {
	
	private DAOFactory daoFactory;
	private final EstadoAdministradorCategoriaBusiness business;

	public EstadoAdministradorCategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoAdministradorCategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoAdministradorCategoriaDTO dto) {
		try {

			final var domain = EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoAdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoAdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EstadoAdministradorCategoriaDTO> list(EstadoAdministradorCategoriaDTO dto) {
		try {
			final var domain = EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoAdministradorCategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoAdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoAdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
