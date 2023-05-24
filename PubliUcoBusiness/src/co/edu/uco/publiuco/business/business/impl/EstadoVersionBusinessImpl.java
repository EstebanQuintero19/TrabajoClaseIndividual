package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoVersionAssembler;
import co.edu.uco.publiuco.business.business.EstadoVersionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoVersionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoVersionEntity;

public class EstadoVersionBusinessImpl implements EstadoVersionBusiness {

	DAOFactory daoFactory;

	public EstadoVersionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoVersionDomain domain) {
		final EstadoVersionEntity entity = EstadoVersionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoVersionDAO().create(entity);

	}

	@Override
	public List<EstadoVersionDomain> list(EstadoVersionDomain domain) {
		final EstadoVersionEntity entity = EstadoVersionAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoVersionEntity> resultEntityList = daoFactory.getEstadoVersionDAO().read(entity);

		return EstadoVersionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
