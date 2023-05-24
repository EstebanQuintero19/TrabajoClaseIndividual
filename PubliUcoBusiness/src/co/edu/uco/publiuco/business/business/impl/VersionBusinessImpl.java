package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.VersionAssembler;
import co.edu.uco.publiuco.business.business.VersionBusiness;
import co.edu.uco.publiuco.business.domain.VersionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.VersionEntity;

public class VersionBusinessImpl implements VersionBusiness {

	DAOFactory daoFactory;

	public VersionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getVersionDAO().create(entity);

	}

	@Override
	public List<VersionDomain> list(VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getInstance().toEntityFromDomain(domain);

		List<VersionEntity> resultEntityList = daoFactory.getVersionDAO().read(entity);

		return VersionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getVersionDAO().update(entity);

	}

	@Override
	public void drop(VersionDomain domain) {
		final VersionEntity entity = VersionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getVersionDAO().delete(entity);

	}

}
