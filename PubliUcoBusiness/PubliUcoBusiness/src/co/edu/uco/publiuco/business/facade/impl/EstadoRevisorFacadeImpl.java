package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoRevisorAssembler;
import co.edu.uco.publiuco.business.business.EstadoRevisorBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoRevisorBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoRevisorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoRevisorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoRevisorDTO;

public final class EstadoRevisorFacadeImpl implements EstadoRevisorFacade {
	
	private DAOFactory daoFactory;
	private final EstadoRevisorBusiness business;

	public EstadoRevisorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoRevisorBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoRevisorDTO dto) {
		try {

			final var domain = EstadoRevisorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoRevisorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoRevisorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EstadoRevisorDTO> list(EstadoRevisorDTO dto) {
		try {
			final var domain = EstadoRevisorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoRevisorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoRevisorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoRevisorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
