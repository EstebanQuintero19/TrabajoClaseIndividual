package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RespuestaAssembler;
import co.edu.uco.publiuco.business.business.RespuestaBusiness;
import co.edu.uco.publiuco.business.business.impl.RespuestaBusinessImpl;
import co.edu.uco.publiuco.business.facade.RespuestaFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.RespuestaFacadeImplMessages;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.RespuestaDTO;

public class RespuestaFacadeImpl implements RespuestaFacade {

	private DAOFactory daoFactory;
	private final RespuestaBusiness business;

	public RespuestaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.POSTGRESQL);
		business = new RespuestaBusinessImpl(daoFactory);
	}

	@Override
	public void register(RespuestaDTO dto) {
		try {

			final var domain = RespuestaAssembler.getInstance().toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = RespuestaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage = RespuestaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}

	}

	@Override
	public List<RespuestaDTO> list(RespuestaDTO dto) {
		try {
			final var domain = RespuestaAssembler.getInstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);

			return RespuestaAssembler.getInstance().toDTOListFromDomainList(returnDomainList);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final Exception exception) {
			var userMessage = RespuestaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage = RespuestaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.closeConection();
		}
	}

}
