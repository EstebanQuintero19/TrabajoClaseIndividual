package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.EstadoComentarioLectorBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoComentarioLectorBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoComentarioLectorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoComentarioLectorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoComentarioLectorDTO;

public final class EstadoComentarioLectorFacadeImpl implements EstadoComentarioLectorFacade {
	
	private DAOFactory daoFactory;
	private final EstadoComentarioLectorBusiness business;

	public EstadoComentarioLectorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoComentarioLectorBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoComentarioLectorDTO dto) {
		try {

			final var domain = EstadoComentarioLectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoComentarioLectorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoComentarioLectorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EstadoComentarioLectorDTO> list(EstadoComentarioLectorDTO dto) {
		try {
			final var domain = EstadoComentarioLectorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoComentarioLectorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoComentarioLectorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoComentarioLectorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
