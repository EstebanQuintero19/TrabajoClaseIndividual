package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.HistorialAccesoPublicacionAssembler;
import co.edu.uco.publiuco.business.business.HistorialAccesoPublicacionBusiness;
import co.edu.uco.publiuco.business.business.impl.HistorialAccesoPublicacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.HistorialAccesoPublicacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.HistorialAccesoPublicacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.HistorialAccesoPublicacionDTO;

public final class HistorialAccesoPublicacionFacadeImpl implements HistorialAccesoPublicacionFacade {

	private DAOFactory daoFactory;
	private final HistorialAccesoPublicacionBusiness business;

	public HistorialAccesoPublicacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new HistorialAccesoPublicacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(HistorialAccesoPublicacionDTO dto) {
		try {

			final var domain = HistorialAccesoPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = HistorialAccesoPublicacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = HistorialAccesoPublicacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<HistorialAccesoPublicacionDTO> list(HistorialAccesoPublicacionDTO dto) {
		try {
			final var domain = HistorialAccesoPublicacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return HistorialAccesoPublicacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = HistorialAccesoPublicacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = HistorialAccesoPublicacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(HistorialAccesoPublicacionDTO dto) {
		try {

			final var domain = HistorialAccesoPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = HistorialAccesoPublicacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = HistorialAccesoPublicacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public void drop(HistorialAccesoPublicacionDTO dto) {
		try {

			final var domain = HistorialAccesoPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = HistorialAccesoPublicacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = HistorialAccesoPublicacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

}
