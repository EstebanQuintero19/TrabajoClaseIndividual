package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.AdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.AdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.AdministradorCategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.AdministradorCategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.AdministradorCategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.AdministradorCategoriaDTO;

public final class AdministradorCategoriaFacadeImpl implements AdministradorCategoriaFacade {

	private DAOFactory daoFactory;
	private final AdministradorCategoriaBusiness business;

	public AdministradorCategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new AdministradorCategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(AdministradorCategoriaDTO dto) {
		try {

			final var domain = AdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = AdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = AdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<AdministradorCategoriaDTO> list(AdministradorCategoriaDTO dto) {
		try {
			final var domain = AdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return AdministradorCategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = AdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = AdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(AdministradorCategoriaDTO dto) {
		try {

			final var domain = AdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = AdministradorCategoriaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = AdministradorCategoriaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(AdministradorCategoriaDTO dto) {
		try {

			final var domain = AdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = AdministradorCategoriaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = AdministradorCategoriaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
