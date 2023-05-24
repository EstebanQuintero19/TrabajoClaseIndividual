package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.LectorAssembler;
import co.edu.uco.publiuco.business.business.LectorBusiness;
import co.edu.uco.publiuco.business.domain.LectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.LectorEntity;

public class LectorBusinessImpl implements LectorBusiness {

	DAOFactory daoFactory;

	public LectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getLectorDAO().create(entity);

	}

	@Override
	public List<LectorDomain> list(LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getInstance().toEntityFromDomain(domain);

		List<LectorEntity> resultEntityList = daoFactory.getLectorDAO().read(entity);

		return LectorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getLectorDAO().update(entity);

	}

	@Override
	public void drop(LectorDomain domain) {
		final LectorEntity entity = LectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getLectorDAO().delete(entity);

	}

}
