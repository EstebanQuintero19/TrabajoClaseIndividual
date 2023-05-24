package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;

public interface EscritorPublicacionBusiness {

	void register(EscritorPublicacionDomain domain);

	List<EscritorPublicacionDomain> list(EscritorPublicacionDomain domain);

	void modify(EscritorPublicacionDomain domain);

	void drop(EscritorPublicacionDomain domain);

}
