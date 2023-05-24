package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.RevisorDomain;

public interface RevisorBusiness {

	void register(RevisorDomain domain);

	List<RevisorDomain> list(RevisorDomain domain);

	void modify(RevisorDomain domain);

	void drop(RevisorDomain domain);

}
