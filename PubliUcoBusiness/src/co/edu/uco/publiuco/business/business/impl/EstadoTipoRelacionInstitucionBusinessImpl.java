package co.edu.uco.publiuco.business.business.impl;

import java.util.List;
import java.util.UUID;

import javax.naming.spi.DirStateFactory.Result;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoAccesoDomain;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.crosscutting.exception.PubliUcoBusinessException;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionBusinessImpl implements EstadoTipoRelacionInstitucionBusiness {

	private DAOFactory daoFactory;

	public EstadoTipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
		
		UUID identificador;
		EstadoTipoIdentificacionBusinessEntity entityTmp;
		List<EstadoTipoIdentificacionBusinessImpl> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = new EstadoTipoRelacionInstitucionEntity.createWhitIdentificador(identificador);
			result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = new EstadoTipoRelacionInstitucionEntity.createWhitNombre(domain.getNombre());
		result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
		
		
		if(!result.isEmpty()) {
			throw PubliUcoBusinessException.create("El estado de tipo relacion institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario proceda a actualizarlo");
		}
		
		final var domainTocreate = new EstadoTipoRelacionInstitucionDomain
				(identificador, domain.getNombre(), domain.getDescripcion());
		
		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {

		final EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<EstadoTipoRelacionInstitucionEntity> resultEntityList = daoFactory.getEstadoTipoRelacionInstitucionDAO()
				.read(entity);

		return EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainListFromEntity(resultEntityList);
	}
}