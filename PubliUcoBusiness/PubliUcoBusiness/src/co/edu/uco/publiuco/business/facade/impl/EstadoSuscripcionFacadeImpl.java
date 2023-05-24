package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoSuscripcionAssembler;
import co.edu.uco.publiuco.business.business.EstadoSuscripcionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoSuscripcionBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoSuscripcionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoSuscripcionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoSuscripcionDTO;

public final class EstadoSuscripcionFacadeImpl implements EstadoSuscripcionFacade {
	
	private DAOFactory daoFactory;
	private final EstadoSuscripcionBusiness business;

	public EstadoSuscripcionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoSuscripcionBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoSuscripcionDTO dto) {
		try {

			final var domain = EstadoSuscripcionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoSuscripcionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoSuscripcionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EstadoSuscripcionDTO> list(EstadoSuscripcionDTO dto) {
		try {
			final var domain = EstadoSuscripcionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoSuscripcionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoSuscripcionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoSuscripcionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
