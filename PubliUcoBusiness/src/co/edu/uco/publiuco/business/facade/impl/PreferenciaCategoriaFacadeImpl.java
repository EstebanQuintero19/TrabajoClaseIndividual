package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaCategoriaBusiness;
import co.edu.uco.publiuco.business.business.impl.PreferenciaCategoriaBusinessImpl;
import co.edu.uco.publiuco.business.facade.PreferenciaCategoriaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PreferenciaCategoriaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.PreferenciaCategoriaDTO;

public class PreferenciaCategoriaFacadeImpl implements PreferenciaCategoriaFacade {

	private DAOFactory daoFactory;
	private final PreferenciaCategoriaBusiness business;

	public PreferenciaCategoriaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new PreferenciaCategoriaBusinessImpl(daoFactory);
	}

	@Override
	public void register(PreferenciaCategoriaDTO dto) {
		try {

			final var domain = PreferenciaCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaCategoriaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaCategoriaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<PreferenciaCategoriaDTO> list(PreferenciaCategoriaDTO dto) {
		try {
			final var domain = PreferenciaCategoriaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return PreferenciaCategoriaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = PreferenciaCategoriaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaCategoriaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(PreferenciaCategoriaDTO dto) {
		try {

			final var domain = PreferenciaCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaCategoriaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaCategoriaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(PreferenciaCategoriaDTO dto) {
		try {

			final var domain = PreferenciaCategoriaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaCategoriaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaCategoriaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
