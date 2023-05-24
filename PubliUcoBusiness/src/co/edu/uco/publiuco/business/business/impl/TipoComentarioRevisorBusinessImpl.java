package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoComentarioRevisorAssembler;
import co.edu.uco.publiuco.business.business.TipoComentarioRevisorBusiness;
import co.edu.uco.publiuco.business.domain.TipoComentarioRevisorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public class TipoComentarioRevisorBusinessImpl implements TipoComentarioRevisorBusiness {

	DAOFactory daoFactory;

	public TipoComentarioRevisorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(TipoComentarioRevisorDomain domain) {
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoComentarioRevisorDAO().create(entity);

	}

	@Override
	public List<TipoComentarioRevisorDomain> list(TipoComentarioRevisorDomain domain) {
		final TipoComentarioRevisorEntity entity = TipoComentarioRevisorAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<TipoComentarioRevisorEntity> resultEntityList = daoFactory.getTipoComentarioRevisorDAO().read(entity);

		return TipoComentarioRevisorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
