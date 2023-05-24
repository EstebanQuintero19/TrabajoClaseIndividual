package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.RevisionDomain;

public interface RevisionBusiness {

	void register(RevisionDomain domain);

	List<RevisionDomain> list(RevisionDomain domain);

	void modify(RevisionDomain domain);

	void drop(RevisionDomain domain);

}
