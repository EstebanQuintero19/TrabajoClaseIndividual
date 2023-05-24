package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PlanPublicacionAssembler;
import co.edu.uco.publiuco.business.business.PlanPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.PlanPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PlanPublicacionEntity;

public class PlanPublicacionBusinessImpl implements PlanPublicacionBusiness {

	DAOFactory daoFactory;

	public PlanPublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().create(entity);

	}

	@Override
	public List<PlanPublicacionDomain> list(PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getInstance().toEntityFromDomain(domain);

		List<PlanPublicacionEntity> resultEntityList = daoFactory.getPlanPublicacionDAO().read(entity);

		return PlanPublicacionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().update(entity);

	}

	@Override
	public void drop(PlanPublicacionDomain domain) {
		final PlanPublicacionEntity entity = PlanPublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanPublicacionDAO().delete(entity);

	}

}
