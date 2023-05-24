package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoComentarioLectorAssembler;
import co.edu.uco.publiuco.business.business.EstadoComentarioLectorBusiness;
import co.edu.uco.publiuco.business.domain.EstadoComentarioLectorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoComentarioLectorEntity;

public class EstadoComentarioLectorBusinessImpl implements EstadoComentarioLectorBusiness {

	DAOFactory daoFactory;

	public EstadoComentarioLectorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoComentarioLectorDomain domain) {
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoComentarioLectorDAO().create(entity);

	}

	@Override
	public List<EstadoComentarioLectorDomain> list(EstadoComentarioLectorDomain domain) {
		final EstadoComentarioLectorEntity entity = EstadoComentarioLectorAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<EstadoComentarioLectorEntity> resultEntityList = daoFactory.getEstadoComentarioLectorDAO().read(entity);

		return EstadoComentarioLectorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
