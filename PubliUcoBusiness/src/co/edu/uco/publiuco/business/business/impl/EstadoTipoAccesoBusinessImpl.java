package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoAccesoAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoAccesoBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoAccesoDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoAccesoEntity;

public class EstadoTipoAccesoBusinessImpl implements EstadoTipoAccesoBusiness {

	DAOFactory daoFactory;

	public EstadoTipoAccesoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoTipoAccesoDomain domain) {
		final EstadoTipoAccesoEntity entity = EstadoTipoAccesoAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoTipoAccesoDAO().create(entity);

	}

	@Override
	public List<EstadoTipoAccesoDomain> list(EstadoTipoAccesoDomain domain) {
		final EstadoTipoAccesoEntity entity = EstadoTipoAccesoAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoTipoAccesoEntity> resultEntityList = daoFactory.getEstadoTipoAccesoDAO().read(entity);

		return EstadoTipoAccesoAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
