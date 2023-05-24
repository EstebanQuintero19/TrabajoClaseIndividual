package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoEscritorAssembler;
import co.edu.uco.publiuco.business.business.EstadoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoEscritorEntity;

public class EstadoEscritorBusinessImpl implements EstadoEscritorBusiness {

	DAOFactory daoFactory;

	public EstadoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoEscritorDomain domain) {
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoEscritorDAO().create(entity);

	}

	@Override
	public List<EstadoEscritorDomain> list(EstadoEscritorDomain domain) {
		final EstadoEscritorEntity entity = EstadoEscritorAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoEscritorEntity> resultEntityList = daoFactory.getEstadoEscritorDAO().read(entity);

		return EstadoEscritorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
