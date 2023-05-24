package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PalabraClavePublicacionAssembler;
import co.edu.uco.publiuco.business.business.PalabraClavePublicacionBusiness;
import co.edu.uco.publiuco.business.business.impl.PalabraClavePublicacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.PalabraClavePublicacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PalabraClavePublicacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.PalabraClavePublicacionDTO;

public final class PalabraClavePublicacionFacadeImpl implements PalabraClavePublicacionFacade {
	
	private DAOFactory daoFactory;
	private final PalabraClavePublicacionBusiness business;

	public PalabraClavePublicacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new PalabraClavePublicacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(PalabraClavePublicacionDTO dto) {
		try {

			final var domain = PalabraClavePublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PalabraClavePublicacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PalabraClavePublicacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<PalabraClavePublicacionDTO> list(PalabraClavePublicacionDTO dto) {
		try {
			final var domain = PalabraClavePublicacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return PalabraClavePublicacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = PalabraClavePublicacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PalabraClavePublicacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(PalabraClavePublicacionDTO dto) {
		try {

			final var domain = PalabraClavePublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PalabraClavePublicacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PalabraClavePublicacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(PalabraClavePublicacionDTO dto) {
		try {

			final var domain = PalabraClavePublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PalabraClavePublicacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PalabraClavePublicacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
