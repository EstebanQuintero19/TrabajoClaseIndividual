package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoAccesoAssembler;
import co.edu.uco.publiuco.business.business.TipoAccesoBusiness;
import co.edu.uco.publiuco.business.business.impl.TipoAccesoBusinessImpl;
import co.edu.uco.publiuco.business.facade.TipoAccesoFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoAccesoFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.TipoAccesoDTO;

public class TipoAccesoFacadeImpl implements TipoAccesoFacade {
	
	private DAOFactory daoFactory;
	private final TipoAccesoBusiness business;

	public TipoAccesoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new TipoAccesoBusinessImpl(daoFactory);
	}

	@Override
	public void register(TipoAccesoDTO dto) {
		try {

			final var domain = TipoAccesoAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = TipoAccesoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoAccesoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<TipoAccesoDTO> list(TipoAccesoDTO dto) {
		try {
			final var domain = TipoAccesoAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return TipoAccesoAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = TipoAccesoFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoAccesoFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(TipoAccesoDTO dto) {
		try {

			final var domain = TipoAccesoAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = TipoAccesoFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoAccesoFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(TipoAccesoDTO dto) {
		try {

			final var domain = TipoAccesoAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = TipoAccesoFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoAccesoFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	

}
