package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PerfilAssembler;
import co.edu.uco.publiuco.business.business.PerfilBusiness;
import co.edu.uco.publiuco.business.domain.PerfilDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PerfilEntity;

public class PerfilBusinessImpl implements PerfilBusiness {

	DAOFactory daoFactory;

	public PerfilBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PerfilDomain domain) {
		final PerfilEntity entity = PerfilAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPerfilDAO().create(entity);

	}

	@Override
	public List<PerfilDomain> list(PerfilDomain domain) {
		final PerfilEntity entity = PerfilAssembler.getInstance().toEntityFromDomain(domain);

		List<PerfilEntity> resultEntityList = daoFactory.getPerfilDAO().read(entity);

		return PerfilAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(PerfilDomain domain) {
		final PerfilEntity entity = PerfilAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPerfilDAO().update(entity);

	}

	@Override
	public void drop(PerfilDomain domain) {
		final PerfilEntity entity = PerfilAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPerfilDAO().delete(entity);

	}

}
