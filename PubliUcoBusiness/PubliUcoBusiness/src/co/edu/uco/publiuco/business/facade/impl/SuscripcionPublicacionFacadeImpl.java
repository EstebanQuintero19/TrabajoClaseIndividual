package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.SuscripcionPublicacionAssembler;
import co.edu.uco.publiuco.business.business.SuscripcionPublicacionBusiness;
import co.edu.uco.publiuco.business.domain.SuscripcionPublicacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public class SuscripcionPublicacionFacadeImpl implements SuscripcionPublicacionBusiness {

	DAOFactory daoFactory;

	public SuscripcionPublicacionFacadeImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().create(entity);

	}

	@Override
	public List<SuscripcionPublicacionDomain> list(SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<SuscripcionPublicacionEntity> resultEntityList = daoFactory.getSuscripcionPublicacionDAO().read(entity);

		return SuscripcionPublicacionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().update(entity);

	}

	@Override
	public void drop(SuscripcionPublicacionDomain domain) {
		final SuscripcionPublicacionEntity entity = SuscripcionPublicacionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getSuscripcionPublicacionDAO().delete(entity);

	}

}
