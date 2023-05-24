package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoEscritorAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoEscritorEntity;

public class EstadoTipoEscritorBusinessImpl implements EstadoTipoEscritorBusiness {

	DAOFactory daoFactory;

	public EstadoTipoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoTipoEscritorDomain domain) {
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoTipoEscritorDAO().create(entity);

	}

	@Override
	public List<EstadoTipoEscritorDomain> list(EstadoTipoEscritorDomain domain) {
		final EstadoTipoEscritorEntity entity = EstadoTipoEscritorAssembler.getInstance().toEntityFromDomain(domain);

		List<EstadoTipoEscritorEntity> resultEntityList = daoFactory.getEstadoTipoEscritorDAO().read(entity);

		return EstadoTipoEscritorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
