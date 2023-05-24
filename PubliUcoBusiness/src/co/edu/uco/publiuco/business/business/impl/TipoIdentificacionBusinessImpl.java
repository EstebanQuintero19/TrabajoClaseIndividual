package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoIdentificacionAssembler;
import co.edu.uco.publiuco.business.business.TipoIdentificacionBusiness;
import co.edu.uco.publiuco.business.domain.TipoIdentificacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public class TipoIdentificacionBusinessImpl implements TipoIdentificacionBusiness {

	DAOFactory daoFactory;

	public TipoIdentificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().create(entity);

	}

	@Override
	public List<TipoIdentificacionDomain> list(TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain);

		List<TipoIdentificacionEntity> resultEntityList = daoFactory.getTipoIdentificacionDAO().read(entity);

		return TipoIdentificacionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().update(entity);

	}

	@Override
	public void drop(TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().delete(entity);

	}

}
