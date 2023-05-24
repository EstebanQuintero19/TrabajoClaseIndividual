package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.AdministradorCategoriaAssembler;
import co.edu.uco.publiuco.business.business.AdministradorCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.AdministradorCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public class AdministradorCategoriaBusinessImpl implements AdministradorCategoriaBusiness {

	DAOFactory daoFactory;

	public AdministradorCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().create(entity);
	}

	@Override
	public final List<AdministradorCategoriaDomain> list(AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<AdministradorCategoriaEntity> resultEntityList = daoFactory.getAdministradorCategoriaDAO()
				.read(entity);

		return AdministradorCategoriaAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().update(entity);

	}

	@Override
	public final void drop(AdministradorCategoriaDomain domain) {
		final AdministradorCategoriaEntity entity = AdministradorCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getAdministradorCategoriaDAO().delete(entity);

	}

}
