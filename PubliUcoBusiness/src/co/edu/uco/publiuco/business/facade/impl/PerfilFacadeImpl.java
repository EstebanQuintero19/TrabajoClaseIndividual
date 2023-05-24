package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PerfilAssembler;
import co.edu.uco.publiuco.business.business.PerfilBusiness;
import co.edu.uco.publiuco.business.business.impl.PerfilBusinessImpl;
import co.edu.uco.publiuco.business.facade.PerfilFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PerfilFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.PerfilDTO;

public final class PerfilFacadeImpl implements PerfilFacade {

	private DAOFactory daoFactory;
	private final PerfilBusiness business;

	public PerfilFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new PerfilBusinessImpl(daoFactory);
	}

	@Override
	public void register(PerfilDTO dto) {
		try {

			final var domain = PerfilAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PerfilFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PerfilFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<PerfilDTO> list(PerfilDTO dto) {
		try {
			final var domain = PerfilAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return PerfilAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = PerfilFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PerfilFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(PerfilDTO dto) {
		try {

			final var domain = PerfilAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PerfilFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PerfilFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(PerfilDTO dto) {
		try {

			final var domain = PerfilAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PerfilFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PerfilFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
