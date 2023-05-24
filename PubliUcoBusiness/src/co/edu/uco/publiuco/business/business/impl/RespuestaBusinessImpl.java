package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.RespuestaAssembler;
import co.edu.uco.publiuco.business.business.RespuestaBusiness;
import co.edu.uco.publiuco.business.domain.RespuestaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.RespuestaEntity;

public class RespuestaBusinessImpl implements RespuestaBusiness {

	DAOFactory daoFactory;

	public RespuestaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(RespuestaDomain domain) {
		final RespuestaEntity entity = RespuestaAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getRespuestaDAO().create(entity);

	}

	@Override
	public List<RespuestaDomain> list(RespuestaDomain domain) {
		final RespuestaEntity entity = RespuestaAssembler.getInstance().toEntityFromDomain(domain);

		List<RespuestaEntity> resultEntityList = daoFactory.getRespuestaDAO().read(entity);

		return RespuestaAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
