package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PalabraClavePublicacionDomain;

public interface PalabraClavePublicacionBusiness {

	void register(PalabraClavePublicacionDomain domain);

	List<PalabraClavePublicacionDomain> list(PalabraClavePublicacionDomain domain);

	void modify(PalabraClavePublicacionDomain domain);

	void drop(PalabraClavePublicacionDomain domain);

}
