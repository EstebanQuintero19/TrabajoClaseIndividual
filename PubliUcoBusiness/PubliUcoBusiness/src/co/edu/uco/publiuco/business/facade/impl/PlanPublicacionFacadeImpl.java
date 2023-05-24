package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PlanPublicacionAssembler;
import co.edu.uco.publiuco.business.business.PlanPublicacionBusiness;
import co.edu.uco.publiuco.business.business.impl.PlanPublicacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.PlanPublicacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PlanPublicacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.PlanPublicacionDTO;

public final class PlanPublicacionFacadeImpl implements PlanPublicacionFacade {
	
	private DAOFactory daoFactory;
	private final PlanPublicacionBusiness business;

	public PlanPublicacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new PlanPublicacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(PlanPublicacionDTO dto) {
		try {

			final var domain = PlanPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PlanPublicacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PlanPublicacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<PlanPublicacionDTO> list(PlanPublicacionDTO dto) {
		try {
			final var domain = PlanPublicacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return PlanPublicacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = PlanPublicacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PlanPublicacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(PlanPublicacionDTO dto) {
		try {

			final var domain = PlanPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PlanPublicacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PlanPublicacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(PlanPublicacionDTO dto) {
		try {

			final var domain = PlanPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PlanPublicacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PlanPublicacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
