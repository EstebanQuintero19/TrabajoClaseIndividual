package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoRevisionAssembler;
import co.edu.uco.publiuco.business.business.EstadoRevisionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoRevisionEntity;

public class EstadoRevisionBusinessImpl implements EstadoRevisionBusiness {

	DAOFactory daoFactory;

	public EstadoRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoRevisionDomain domain) {
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoRevisionDAO().create(entity);

	}

	@Override
	public List<EstadoRevisionDomain> list(EstadoRevisionDomain domain) {
		final EstadoRevisionEntity entity = EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoRevisionEntity> resultEntityList = daoFactory.getEstadoRevisionDAO().read(entity);

		return EstadoRevisionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
