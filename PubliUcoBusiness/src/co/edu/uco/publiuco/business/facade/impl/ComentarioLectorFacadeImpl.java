package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioLectorBusiness;
import co.edu.uco.publiuco.business.business.impl.ComentarioLectorBusinessImpl;
import co.edu.uco.publiuco.business.facade.ComentarioLectorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ComentarioLectorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.ComentarioLectorDTO;

public final class ComentarioLectorFacadeImpl implements ComentarioLectorFacade {
	
	private DAOFactory daoFactory;
	private final ComentarioLectorBusiness business;

	public ComentarioLectorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new ComentarioLectorBusinessImpl(daoFactory);
	}

	@Override
	public void register(ComentarioLectorDTO dto) {
		try {

			final var domain = ComentarioLectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioLectorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioLectorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<ComentarioLectorDTO> list(ComentarioLectorDTO dto) {
		try {
			final var domain = ComentarioLectorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return ComentarioLectorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = ComentarioLectorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioLectorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(ComentarioLectorDTO dto) {
		try {

			final var domain = ComentarioLectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioLectorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioLectorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(ComentarioLectorDTO dto) {
		try {

			final var domain = ComentarioLectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = ComentarioLectorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = ComentarioLectorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
