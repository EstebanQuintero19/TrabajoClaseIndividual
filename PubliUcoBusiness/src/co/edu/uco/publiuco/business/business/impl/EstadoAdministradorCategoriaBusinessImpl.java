package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoAdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.EstadoAdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.EstadoAdministradorCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntity;

public class EstadoAdministradorCategoriaBusinessImpl implements EstadoAdministradorCategoriaBusiness {

	DAOFactory daoFactory;

	public EstadoAdministradorCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(EstadoAdministradorCategoriaDomain domain) {
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoAdministradorCategoriaDAO().create(entity);

	}

	@Override
	public List<EstadoAdministradorCategoriaDomain> list(EstadoAdministradorCategoriaDomain domain) {
		final EstadoAdministradorCategoriaEntity entity = EstadoAdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<EstadoAdministradorCategoriaEntity> resultEntityList = daoFactory.getEstadoAdministradorCategoriaDAO()
				.read(entity);

		return EstadoAdministradorCategoriaAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
