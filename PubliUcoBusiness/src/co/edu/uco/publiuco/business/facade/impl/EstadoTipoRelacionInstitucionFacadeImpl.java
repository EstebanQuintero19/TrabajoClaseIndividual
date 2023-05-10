package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.business.impl.EstadoTipoRelacionInstitucionBusinessImpl;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoBusinessException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public final class EstadoTipoRelacionInstitucionFacadeImpl implements EstadoTipoRelacionInstitucionFacade {

	private DAOFactory daoFactory;
	private final EstadoTipoRelacionInstitucionBusiness business;

	public EstadoTipoRelacionInstitucionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoTipoRelacionInstitucionBusinessImpl(daoFactory);
	}

	@Override
	public void register(EstadoTipoRelacionInstitucionDTO dto) {
		try {

			final EstadoTipoRelacionInstitucionDomain domain = EstadoTipoRelacionInstitucionAssembler.getInstance()
					.toDomainFromDto(dto);

			daoFactory.initTransaction();
			business.register(domain);
			daoFactory.commitTransaction();
		} catch (PubliucoException exception) {
			daoFactory.cancelTransaction();
			throw exception;
		} catch (Exception exception) {
			daoFactory.cancelTransaction();

			var userMessage = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
			var technicalMessage = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoRelacionInstitucion. Por favor valide la traza completa de la excepcion presentada...";

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);
		} finally {
			daoFactory.cerrarConexion();
		}

	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionFacade dto) {
		// TODO Auto-generated method stub
		return null;
	}

}