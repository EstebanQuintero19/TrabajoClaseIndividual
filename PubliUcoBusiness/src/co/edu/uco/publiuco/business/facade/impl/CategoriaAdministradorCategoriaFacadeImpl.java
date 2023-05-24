package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.CategoriaAdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.CategoriaAdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.CategoriaAdministradorCategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.CategoriaAdministradorCategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CategoriaAdministradorCategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.CategoriaAdministradorCategoriaDTO;

public final class CategoriaAdministradorCategoriaFacadeImpl implements CategoriaAdministradorCategoriaFacade {

	private DAOFactory daoFactory;
	private final CategoriaAdministradorCategoriaBusiness business;

	public CategoriaAdministradorCategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new CategoriaAdministradorCategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(CategoriaAdministradorCategoriaDTO dto) {
		try {

			final var domain = CategoriaAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaAdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaAdministradorCategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<CategoriaAdministradorCategoriaDTO> list(CategoriaAdministradorCategoriaDTO dto) {
		try {
			final var domain = CategoriaAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return CategoriaAdministradorCategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = CategoriaAdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaAdministradorCategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(CategoriaAdministradorCategoriaDTO dto) {
		try {

			final var domain = CategoriaAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaAdministradorCategoriaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaAdministradorCategoriaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(CategoriaAdministradorCategoriaDTO dto) {
		try {

			final var domain = CategoriaAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaAdministradorCategoriaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaAdministradorCategoriaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
