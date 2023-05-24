package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EscritorPublicacionAssembler;
import co.edu.uco.publiuco.business.assembler.concrete.EstadoPublicacionAssembler;
import co.edu.uco.publiuco.business.business.EscritorPublicacionBusiness;
import co.edu.uco.publiuco.business.business.EstadoPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.publiuco.business.domain.EstadoPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EscritorPublicacionEntity;
import co.edu.uco.publiuco.entities.EstadoPublicacionEntity;

public class EstadoPublicacionBusinessImpl implements EstadoPublicacionBusiness {

	DAOFactory daoFactory;

	public EstadoPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoPublicacionDomain domain) {
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoPublicacionDAO().create(entity);

	}

	@Override
	public List<EstadoPublicacionDomain> list(EstadoPublicacionDomain domain) {
		final EstadoPublicacionEntity entity = EstadoPublicacionAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoPublicacionEntity> resultEntityList = daoFactory.getEstadoPublicacionDAO().read(entity);

		return EstadoPublicacionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
