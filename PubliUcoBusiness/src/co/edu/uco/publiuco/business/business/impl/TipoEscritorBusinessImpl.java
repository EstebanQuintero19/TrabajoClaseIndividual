package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoEscritorAssembler;
import co.edu.uco.publiuco.business.business.TipoEscritorBusiness;
import co.edu.uco.publiuco.business.domain.TipoEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoEscritorEntity;

public class TipoEscritorBusinessImpl implements TipoEscritorBusiness {

	DAOFactory daoFactory;

	public TipoEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().create(entity);

	}

	@Override
	public List<TipoEscritorDomain> list(TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getInstance().toEntityFromDomain(domain);

		List<TipoEscritorEntity> resultEntityList = daoFactory.getTipoEscritorDAO().read(entity);

		return TipoEscritorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().update(entity);

	}

	@Override
	public void drop(TipoEscritorDomain domain) {
		final TipoEscritorEntity entity = TipoEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoEscritorDAO().delete(entity);

	}

}
