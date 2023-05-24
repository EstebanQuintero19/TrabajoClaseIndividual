package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaCategoriaAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaCategoriaBusiness;
import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntity;

public class PreferenciaCategoriaBusinessImpl implements PreferenciaCategoriaBusiness {

	DAOFactory daoFactory;

	public PreferenciaCategoriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().create(entity);

	}

	@Override
	public List<PreferenciaCategoriaDomain> list(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);

		List<PreferenciaCategoriaEntity> resultEntityList = daoFactory.getPreferenciaCategoriaDAO().read(entity);

		return PreferenciaCategoriaAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().update(entity);

	}

	@Override
	public void drop(PreferenciaCategoriaDomain domain) {
		final PreferenciaCategoriaEntity entity = PreferenciaCategoriaAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getPreferenciaCategoriaDAO().delete(entity);

	}

}
