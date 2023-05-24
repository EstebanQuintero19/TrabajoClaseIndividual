package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ObservacionRevisionAssembler;
import co.edu.uco.publiuco.business.business.ObservacionRevisionBusiness;
import co.edu.uco.publiuco.business.business.impl.ObservacionRevisionBusinessImpl;
import co.edu.uco.publiuco.business.facade.ObservacionRevisionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ObservacionRevisionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.ObservacionRevisionDTO;

public final class ObservacionRevisionFacadeImpl implements ObservacionRevisionFacade {
	
	private DAOFactory daoFactory;
	private final ObservacionRevisionBusiness business;

	public ObservacionRevisionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new ObservacionRevisionBusinessImpl(daoFactory);
	}

	@Override
	public void register(ObservacionRevisionDTO dto) {
		try {

			final var domain = ObservacionRevisionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ObservacionRevisionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ObservacionRevisionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<ObservacionRevisionDTO> list(ObservacionRevisionDTO dto) {
		try {
			final var domain = ObservacionRevisionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return ObservacionRevisionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = ObservacionRevisionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ObservacionRevisionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(ObservacionRevisionDTO dto) {
		try {

			final var domain = ObservacionRevisionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ObservacionRevisionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ObservacionRevisionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(ObservacionRevisionDTO dto) {
		try {

			final var domain = ObservacionRevisionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ObservacionRevisionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ObservacionRevisionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
