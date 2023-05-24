package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public class EstadoCategoriaBusinessImpl implements EstadoCategoriaBusiness {

	DAOFactory daoFactory;

	public EstadoCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoCategoriaDomain domain) {
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoCategoriaDAO().create(entity);

	}

	@Override
	public List<EstadoCategoriaDomain> list(EstadoCategoriaDomain domain) {
		final EstadoCategoriaEntity entity = EstadoCategoriaAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoCategoriaEntity> resultEntityList = daoFactory.getEstadoCategoriaDAO().read(entity);

		return EstadoCategoriaAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
