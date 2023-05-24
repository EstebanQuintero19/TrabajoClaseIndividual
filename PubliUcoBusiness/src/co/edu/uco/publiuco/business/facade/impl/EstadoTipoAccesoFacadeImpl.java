package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoAccesoAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoAccesoBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoAccesoBusinessImpl;
import co.edu.uco.publiuco.business.facade.EstadoTipoAccesoFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoAccesoFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoAccesoDTO;

public final class EstadoTipoAccesoFacadeImpl  implements EstadoTipoAccesoFacade {
	
	private DAOFactory daoFactory;
	private final EstadoTipoAccesoBusiness business;

	public EstadoTipoAccesoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EstadoTipoAccesoBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoTipoAccesoDTO dto) {
		try {

			final var domain = EstadoTipoAccesoAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EstadoTipoAccesoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoAccesoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EstadoTipoAccesoDTO> list(EstadoTipoAccesoDTO dto) {
		try {
			final var domain = EstadoTipoAccesoAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EstadoTipoAccesoAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EstadoTipoAccesoFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoAccesoFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
