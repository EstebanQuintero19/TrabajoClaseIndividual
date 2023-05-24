package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioLectorBusiness;
import co.edu.uco.publiuco.business.domain.ComentarioLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ComentarioLectorEntity;

public class ComentarioLectorBusinessImpl implements ComentarioLectorBusiness {

	DAOFactory daoFactory;

	public ComentarioLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().create(entity);

	}

	@Override
	public List<ComentarioLectorDomain> list(ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain);

		List<ComentarioLectorEntity> resultEntityList = daoFactory.getComentarioLectorDAO()
				.read(entity);

		return ComentarioLectorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().update(entity);

	}

	@Override
	public void drop(ComentarioLectorDomain domain) {
		final ComentarioLectorEntity entity = ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioLectorDAO().delete(entity);

	}

}
