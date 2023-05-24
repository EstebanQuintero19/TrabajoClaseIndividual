package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RevisionAssembler;
import co.edu.uco.publiuco.business.business.RevisionBusiness;
import co.edu.uco.publiuco.business.domain.RevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RevisionEntity;

public class RevisionBusinessImpl implements RevisionBusiness {

	DAOFactory daoFactory;

	public RevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().create(entity);

	}

	@Override
	public List<RevisionDomain> list(RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getInstance().toEntityFromDomain(domain);

		List<RevisionEntity> resultEntityList = daoFactory.getRevisionDAO().read(entity);

		return RevisionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().update(entity);

	}

	@Override
	public void drop(RevisionDomain domain) {
		final RevisionEntity entity = RevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getRevisionDAO().delete(entity);

	}

}
