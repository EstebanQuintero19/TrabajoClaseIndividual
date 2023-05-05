package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PlanCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PlanCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.PlanCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PlanCategoriaEntity;

public class PlanCategoriaBusinessImpl implements PlanCategoriaBusiness {

	DAOFactory daoFactory;

	public PlanCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().create(entity);

	}

	@Override
	public List<PlanCategoriaDomain> list(PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain);

		final List<PlanCategoriaEntity> result = daoFactory.getPlanCategoriaDAO().read(entity);

		return null;
	}

	@Override
	public void modify(PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().update(entity);

	}

	@Override
	public void drop(PlanCategoriaDomain domain) {
		final PlanCategoriaEntity entity = PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPlanCategoriaDAO().delete(entity);

	}

}
