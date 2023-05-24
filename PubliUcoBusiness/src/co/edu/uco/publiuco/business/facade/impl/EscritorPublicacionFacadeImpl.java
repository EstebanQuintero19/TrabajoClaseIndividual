package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EscritorPublicacionAssembler;
import co.edu.uco.publiuco.business.business.EscritorPublicacionBusiness;
import co.edu.uco.publiuco.business.business.impl.EscritorPublicacionBusinessImpl;
import co.edu.uco.publiuco.business.facade.EscritorPublicacionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EscritorPublicacionFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EscritorPublicacionDTO;

public final class EscritorPublicacionFacadeImpl implements EscritorPublicacionFacade {
	
	private DAOFactory daoFactory;
	private final EscritorPublicacionBusiness business;

	public EscritorPublicacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new EscritorPublicacionBusinessImpl(daoFactory);
	}

	@Override
	public void register(EscritorPublicacionDTO dto) {
		try {

			final var domain = EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EscritorPublicacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EscritorPublicacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public List<EscritorPublicacionDTO> list(EscritorPublicacionDTO dto) {
		try {
			final var domain = EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return EscritorPublicacionAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = EscritorPublicacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EscritorPublicacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

	@Override
	public void modify(EscritorPublicacionDTO dto) {
		try {

			final var domain = EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.modify(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EscritorPublicacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EscritorPublicacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

	@Override
	public void drop(EscritorPublicacionDTO dto) {
		try {

			final var domain = EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.drop(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = EscritorPublicacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EscritorPublicacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
		
	}

}
