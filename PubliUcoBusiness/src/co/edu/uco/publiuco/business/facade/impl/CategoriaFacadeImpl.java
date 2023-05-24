package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.CategoriaAssembler;
import co.edu.uco.publiuco.business.business.CategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.CategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.CategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.CategoriaDTO;

public final class CategoriaFacadeImpl implements CategoriaFacade {

	private DAOFactory daoFactory;
	private final CategoriaBusiness business;

	public CategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new CategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(CategoriaDTO dto) {
		try {

			final var domain = CategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<CategoriaDTO> list(CategoriaDTO dto) {
		try {
			final var domain = CategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return CategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = CategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(CategoriaDTO dto) {
		try {

			final var domain = CategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(CategoriaDTO dto) {
		try {

			final var domain = CategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CategoriaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CategoriaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
