package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoIdentificacionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoIdentificacionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoIdentificacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoTipoIdentificacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoIdentificacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;

public final class EstadoTipoIdentificacionFacadeImpl implements EstadoTipoIdentificacionFacade {

	private DAOFactory daoFactory;
	private final EstadoTipoIdentificacionBusiness business;

	public EstadoTipoIdentificacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoTipoIdentificacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoTipoIdentificacionDTO dto) {
		try {

			final var domain = EstadoTipoIdentificacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoTipoIdentificacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoIdentificacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<EstadoTipoIdentificacionDTO> list(EstadoTipoIdentificacionDTO dto) {
		try {
			final var domain = EstadoTipoIdentificacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoTipoIdentificacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoTipoIdentificacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoIdentificacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
