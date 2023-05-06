package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucion;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.factory.Factory;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public final class EstadoTipoRelacionInstitucionFacadeImpl implements EstadoTipoRelacionInstitucionFacade {

	private final DAOFactory daoFactory;
	private final EstadoTipoRelacionInstitucionbusiness business;
	
	public EstadoTipoRelacionInstitucionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoTipoRelacionInstitucionBusinessImpl(daoFactory);
	}

	private final DAOFactory daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);

	public void register(final EstadoTipoRelacionInstitucionDTO dto) {
		try {
			daoFactory.iniciarTransaccion();
			final EstadoTipoRelacionInstitucionDomain domain =	
				EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto);
			
			business.register(domain);
			
			daoFactory.commitTransaction();
		} catch (final PubliucoException exception) {
			daoFactory.confirmarTransaccion();
			throw exception;
		} catch (final PubliucoException exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = "Se ha presentado un problema tratando de registrar la infromación del nuevo estado del tipo de relacion parauna institucion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			var technicalMessage = "Se ha presentado una excepción no conocida al momento de registrar el nuevo EstadoTipoRelacionInstitucion, por favor valide la traza completa de la excepción presentada...";

			throw PubliucoBusinessException.create(technicalMessage, userMessage, exception);{
		} finally {
			daoFactory.cerrarConexion();
		}
	}
	
	public List<EstadoTipoRelacionInstitucion> list(EstadoTipoRelacionInstitucion)


	@Override
	public java.util.List<EstadoTipoRelacionInstitucionDTO> List(EstadoTipoRelacionInstitucionFacade dto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public java.util.List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionFacade dto) {
		// TODO Auto-generated method stub
		return null;
	}