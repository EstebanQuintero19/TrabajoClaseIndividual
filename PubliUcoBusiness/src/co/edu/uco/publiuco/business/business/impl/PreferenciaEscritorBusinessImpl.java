package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.PreferenciaEscritorAssembler;
import co.edu.uco.publiuco.business.business.PreferenciaEscritorBusiness;
import co.edu.uco.publiuco.business.domain.PreferenciaEscritorDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.PreferenciaEscritorEntity;

public class PreferenciaEscritorBusinessImpl implements PreferenciaEscritorBusiness {

	DAOFactory daoFactory;

	public PreferenciaEscritorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().create(entity);

	}

	@Override
	public List<PreferenciaEscritorDomain> list(PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getInstance().toEntityFromDomain(domain);

		List<PreferenciaEscritorEntity> resultEntityList = daoFactory.getPreferenciaEscritorDAO().read(entity);

		return PreferenciaEscritorAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public void modify(PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().update(entity);

	}

	@Override
	public void drop(PreferenciaEscritorDomain domain) {
		final PreferenciaEscritorEntity entity = PreferenciaEscritorAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getPreferenciaEscritorDAO().delete(entity);

	}

}
