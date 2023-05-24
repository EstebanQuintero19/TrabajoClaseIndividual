package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaEscritorAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaEscritorBusiness;
import co.edu.uco.publiuco.business.business.impl.PreferenciaEscritorBusinessImpl;
import co.edu.uco.publiuco.business.facade.PreferenciaEscritorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PreferenciaEscritorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.PreferenciaEscritorDTO;

public class PreferenciaEscritorFacadeImpl implements PreferenciaEscritorFacade {

	private DAOFactory daoFactory;
	private final PreferenciaEscritorBusiness business;

	public PreferenciaEscritorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new PreferenciaEscritorBusinessImpl(daoFactory);
	}

	@Override
	public void register(PreferenciaEscritorDTO dto) {
		try {

			final var domain = PreferenciaEscritorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaEscritorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaEscritorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<PreferenciaEscritorDTO> list(PreferenciaEscritorDTO dto) {
		try {
			final var domain = PreferenciaEscritorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return PreferenciaEscritorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = PreferenciaEscritorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaEscritorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(PreferenciaEscritorDTO dto) {
		try {

			final var domain = PreferenciaEscritorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaEscritorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaEscritorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(PreferenciaEscritorDTO dto) {
		try {

			final var domain = PreferenciaEscritorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = PreferenciaEscritorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = PreferenciaEscritorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
