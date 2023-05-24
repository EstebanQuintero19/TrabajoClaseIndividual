package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.ReporteDomain;

public interface ReporteBusiness {

	void register(ReporteDomain domain);

	List<ReporteDomain> list(ReporteDomain domain);

	void modify(ReporteDomain domain);

	void drop(ReporteDomain domain);

}
