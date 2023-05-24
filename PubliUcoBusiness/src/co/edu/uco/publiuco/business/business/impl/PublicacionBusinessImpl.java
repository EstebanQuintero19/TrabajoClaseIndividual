package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PublicacionAssembler;
import co.edu.uco.publiuco.business.business.PublicacionBusiness;
import co.edu.uco.publiuco.business.domain.PublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PublicacionEntity;

public class PublicacionBusinessImpl implements PublicacionBusiness {

	DAOFactory daoFactory;

	public PublicacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().create(entity);

	}

	@Override
	public List<PublicacionDomain> list(PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getInstance().toEntityFromDomain(domain);

		List<PublicacionEntity> resultEntityList = daoFactory.getPublicacionDAO().read(entity);

		return PublicacionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().update(entity);

	}

	@Override
	public void drop(PublicacionDomain domain) {
		final PublicacionEntity entity = PublicacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPublicacionDAO().delete(entity);

	}

}
