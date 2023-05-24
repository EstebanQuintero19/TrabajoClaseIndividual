package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.LectorAssembler;
import co.edu.uco.publiuco.business.business.LectorBusiness;
import co.edu.uco.publiuco.business.business.impl.LectorBusinessImpl;
import co.edu.uco.publiuco.business.facade.LectorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.LectorDTO;

public final class LectorFacadeImpl implements LectorFacade {

	private DAOFactory daoFactory;
	private final LectorBusiness business;

	public LectorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new LectorBusinessImpl(daoFactory);
	}

	@Override
	public void register(LectorDTO dto) {
		try {

			final var domain = LectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = LectorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = LectorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<LectorDTO> list(LectorDTO dto) {
		try {
			final var domain = LectorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return LectorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = LectorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = LectorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(LectorDTO dto) {
		try {

			final var domain = LectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = LectorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = LectorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(LectorDTO dto) {
		try {

			final var domain = LectorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = LectorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = LectorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
