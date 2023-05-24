package co.edu.uco.publiuco.business.business.impl;

import java.util.List;


import co.edu.uco.publiuco.business.assembler.concrete.EstadoObservacionRevisorAssembler;
import co.edu.uco.publiuco.business.business.EstadoObservacionRevisorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoObservacionRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoObservacionRevisorEntity;

public class EstadoObservacionRevisorBusinessImpl implements EstadoObservacionRevisorBusiness {

	DAOFactory daoFactory;

	public EstadoObservacionRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoObservacionRevisorDomain domain) {
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoObservacionRevisorDAO().create(entity);

	}

	@Override
	public List<EstadoObservacionRevisorDomain> list(EstadoObservacionRevisorDomain domain) {
		final EstadoObservacionRevisorEntity entity = EstadoObservacionRevisorAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<EstadoObservacionRevisorEntity> resultEntityList = daoFactory.getEstadoObservacionRevisorDAO()
				.read(entity);

		return EstadoObservacionRevisorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
