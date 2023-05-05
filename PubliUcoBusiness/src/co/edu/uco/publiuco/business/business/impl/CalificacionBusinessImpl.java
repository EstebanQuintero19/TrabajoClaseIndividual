package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.CalificacionAssembler;
import co.edu.uco.publiuco.business.business.CalificacionBusiness;
import co.edu.uco.publiuco.business.domain.CalificacionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.CalificacionEntity;

public class CalificacionBusinessImpl implements CalificacionBusiness {

	DAOFactory daoFactory;

	public CalificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().create(entity);

	}

	@Override
	public List<CalificacionDomain> list(CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getInstance().toEntityFromDomain(domain);

		final List<CalificacionEntity> result = daoFactory.getCalificacionDAO().read(entity);

		return null;
	}

	@Override
	public void modify(CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().update(entity);

	}

	@Override
	public void drop(CalificacionDomain domain) {
		final CalificacionEntity entity = CalificacionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getCalificacionDAO().delete(entity);

	}

}
