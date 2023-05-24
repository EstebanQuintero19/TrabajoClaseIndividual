package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoReporteDomain;

public interface TipoReporteBusiness {
	
	void register(TipoReporteDomain domain); 
	
	List<TipoReporteDomain> list(TipoReporteDomain domain);

}
