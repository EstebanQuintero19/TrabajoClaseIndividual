package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.TipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public class TipoRelacionInstitucionBusinessImpl implements TipoRelacionInstitucionBusiness {

	DAOFactory daoFactory;

	public TipoRelacionInstitucionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().create(entity);

	}

	@Override
	public List<TipoRelacionInstitucionDomain> list(TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);

		final List<TipoRelacionInstitucionEntity> result = daoFactory.getTipoRelacionInstitucionDAO().read(entity);

		return null;
	}

	@Override
	public void modify(TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().update(entity);

	}

	@Override
	public void drop(TipoRelacionInstitucionDomain domain) {
		final TipoRelacionInstitucionEntity entity = TipoRelacionInstitucionAssembler.getInstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRelacionInstitucionDAO().delete(entity);

	}

}