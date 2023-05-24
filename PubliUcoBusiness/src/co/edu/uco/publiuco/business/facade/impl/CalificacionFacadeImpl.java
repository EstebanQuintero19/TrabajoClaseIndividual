package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.CalificacionAssembler;
import co.edu.uco.publiuco.business.business.CalificacionBusiness;
import co.edu.uco.publiuco.business.business.impl.CalificacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.CalificacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CalificacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.CalificacionDTO;

public final class CalificacionFacadeImpl implements CalificacionFacade {

	private DAOFactory daoFactory;
	private final CalificacionBusiness business;

	public CalificacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new CalificacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(CalificacionDTO dto) {
		try {

			final var domain = CalificacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CalificacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CalificacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<CalificacionDTO> list(CalificacionDTO dto) {
		try {
			final var domain = CalificacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return CalificacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = CalificacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CalificacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(CalificacionDTO dto) {
		try {

			final var domain = CalificacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CalificacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CalificacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(CalificacionDTO dto) {
		try {

			final var domain = CalificacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = CalificacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = CalificacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
