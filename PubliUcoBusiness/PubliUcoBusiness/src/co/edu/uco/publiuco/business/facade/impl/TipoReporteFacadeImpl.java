package co.edu.uco.publiuco.business.facade.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.TipoReporteAssembler;
import co.edu.uco.publiuco.business.business.TipoReporteBusiness;
import co.edu.uco.publiuco.business.domain.TipoReporteDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.TipoReporteEntity;

public class TipoReporteFacadeImpl implements TipoReporteBusiness {

	DAOFactory daoFactory;

	public TipoReporteFacadeImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void register(TipoReporteDomain domain) {
		final TipoReporteEntity entity = TipoReporteAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getTipoReporteDAO().create(entity);

	}

	@Override
	public List<TipoReporteDomain> list(TipoReporteDomain domain) {
		final TipoReporteEntity entity = TipoReporteAssembler.getInstance().toEntityFromDomain(domain);

		List<TipoReporteEntity> resultEntityList = daoFactory.getTipoReporteDAO().read(entity);

		return TipoReporteAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

}
