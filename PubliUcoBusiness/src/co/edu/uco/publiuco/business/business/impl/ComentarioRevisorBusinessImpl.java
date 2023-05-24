package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorAssembler;
import co.edu.uco.publiuco.business.business.ComentarioRevisorBusiness;
import co.edu.uco.publiuco.business.domain.ComentarioRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ComentarioRevisorEntity;

public class ComentarioRevisorBusinessImpl implements ComentarioRevisorBusiness {

	DAOFactory daoFactory;

	public ComentarioRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().create(entity);

	}

	@Override
	public List<ComentarioRevisorDomain> list(ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain);

		List<ComentarioRevisorEntity> resultEntityList = daoFactory.getComentarioRevisorDAO().read(entity);

		return ComentarioRevisorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().update(entity);

	}

	@Override
	public void drop(ComentarioRevisorDomain domain) {
		final ComentarioRevisorEntity entity = ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getComentarioRevisorDAO().delete(entity);

	}

}
