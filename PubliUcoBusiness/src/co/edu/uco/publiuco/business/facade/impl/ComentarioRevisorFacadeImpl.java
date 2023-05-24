package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioRevisorBusiness;
import co.edu.uco.publiuco.business.business.impl.ComentarioRevisorBusinessImpl;
import co.edu.uco.publiuco.business.facade.ComentarioRevisorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ComentarioRevisorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.ComentarioRevisorDTO;

public final class ComentarioRevisorFacadeImpl implements ComentarioRevisorFacade {
	
	private DAOFactory daoFactory;
	private final ComentarioRevisorBusiness business;

	public ComentarioRevisorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new ComentarioRevisorBusinessImpl(daoFactory);
	}

	@Override
	public void register(ComentarioRevisorDTO dto) {
		try {

			final var domain = ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioRevisorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioRevisorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<ComentarioRevisorDTO> list(ComentarioRevisorDTO dto) {
		try {
			final var domain = ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return ComentarioRevisorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = ComentarioRevisorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioRevisorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(ComentarioRevisorDTO dto) {
		try {

			final var domain = ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioRevisorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioRevisorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(ComentarioRevisorDTO dto) {
		try {

			final var domain = ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioRevisorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioRevisorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
