package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EscritorPublicacionAssembler;
import co.edu.uco.publiuco.business.business.EscritorPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EscritorPublicacionEntity;

public class EstadoPublicacionBusinessImpl implements EscritorPublicacionBusiness {

	DAOFactory daoFactory;

	public EstadoPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().create(entity);

	}

	@Override
	public List<EscritorPublicacionDomain> list(EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain);

		final List<EscritorPublicacionEntity> result = daoFactory.getEscritorPublicacionDAO().read(entity);

		return null;
	}

	@Override
	public void modify(EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().update(entity);

	}

	@Override
	public void drop(EscritorPublicacionDomain domain) {
		final EscritorPublicacionEntity entity = EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEscritorPublicacionDAO().delete(entity);

	}

}