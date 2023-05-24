package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.RevisorRevisionDomain;

public interface RevisorRevisionBusiness {

	void register(RevisorRevisionDomain domain);

	List<RevisorRevisionDomain> list(RevisorRevisionDomain domain);

	void modify(RevisorRevisionDomain domain);

	void drop(RevisorRevisionDomain domain);

}
