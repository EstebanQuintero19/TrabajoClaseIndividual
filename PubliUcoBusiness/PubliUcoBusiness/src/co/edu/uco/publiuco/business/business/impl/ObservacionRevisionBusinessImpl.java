package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.ObservacionRevisionAssembler;
import co.edu.uco.publiuco.business.business.ObservacionRevisionBusiness;
import co.edu.uco.publiuco.business.domain.ObservacionRevisionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.ObservacionRevisionEntity;

public class ObservacionRevisionBusinessImpl implements ObservacionRevisionBusiness {

	DAOFactory daoFactory;

	public ObservacionRevisionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().create(entity);

	}

	@Override
	public List<ObservacionRevisionDomain> list(ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getInstance().toEntityFromDomain(domain);

		List<ObservacionRevisionEntity> resultEntityList = daoFactory.getObservacionRevisionDAO().read(entity);

		return ObservacionRevisionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().update(entity);

	}

	@Override
	public void drop(ObservacionRevisionDomain domain) {
		final ObservacionRevisionEntity entity = ObservacionRevisionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getObservacionRevisionDAO().delete(entity);

	}

}
