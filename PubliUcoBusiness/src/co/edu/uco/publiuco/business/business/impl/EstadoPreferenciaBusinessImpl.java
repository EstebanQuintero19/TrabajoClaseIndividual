package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoPreferenciaAssembler;
import co.edu.uco.publiuco.business.business.EstadoPreferenciaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoPreferenciaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoPreferenciaEntity;

public class EstadoPreferenciaBusinessImpl implements EstadoPreferenciaBusiness {

	DAOFactory daoFactory;

	public EstadoPreferenciaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoPreferenciaDomain domain) {
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoPreferenciaDAO().create(entity);

	}

	@Override
	public List<EstadoPreferenciaDomain> list(EstadoPreferenciaDomain domain) {
		final EstadoPreferenciaEntity entity = EstadoPreferenciaAssembler.getInstance().toEntityFromDomain(domain);

		final List<EstadoPreferenciaEntity> result = daoFactory.getEstadoPreferenciaDAO().read(entity);

		return null;
	}

}