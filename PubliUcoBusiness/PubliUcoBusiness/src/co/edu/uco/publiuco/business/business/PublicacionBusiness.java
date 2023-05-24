package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PublicacionDomain;

public interface PublicacionBusiness {

	void register(PublicacionDomain domain);

	List<PublicacionDomain> list(PublicacionDomain domain);

	void modify(PublicacionDomain domain);

	void drop(PublicacionDomain domain);

}
