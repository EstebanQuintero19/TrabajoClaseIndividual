package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoLectorAssembler;
import co.edu.uco.publiuco.business.business.EstadoLectorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoLectorEntity;

public class EstadoLectorBusinessImpl implements EstadoLectorBusiness {

	DAOFactory daoFactory;

	public EstadoLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoLectorDomain domain) {
		final EstadoLectorEntity entity = EstadoLectorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoLectorDAO().create(entity);

	}

	@Override
	public List<EstadoLectorDomain> list(EstadoLectorDomain domain) {
		final EstadoLectorEntity entity = EstadoLectorAssembler.getInstance().toEntityFromDomain(domain);

		final List<EstadoLectorEntity> result = daoFactory.getEstadoLectorDAO().read(entity);

		return null;
	}

}
