package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoObservacionRevisorAssembler;
import co.edu.uco.publiuco.business.business.EstadoObservacionRevisorBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoObservacionRevisorBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoObservacionRevisorFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoObservacionRevisorFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoObservacionRevisorDTO;

public final class EstadoObservacionRevisorFacadeImpl implements EstadoObservacionRevisorFacade {

	private DAOFactory daoFactory;
	private final EstadoObservacionRevisorBusiness business;

	public EstadoObservacionRevisorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoObservacionRevisorBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoObservacionRevisorDTO dto) {
		try {

			final var domain = EstadoObservacionRevisorAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoObservacionRevisorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoObservacionRevisorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<EstadoObservacionRevisorDTO> list(EstadoObservacionRevisorDTO dto) {
		try {
			final var domain = EstadoObservacionRevisorAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoObservacionRevisorAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoObservacionRevisorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoObservacionRevisorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
