package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoEscritorDomain;

public interface TipoEscritorBusiness {
	
	void register(TipoEscritorDomain domain);

	List<TipoEscritorDomain> list(TipoEscritorDomain domain);

	void modify(TipoEscritorDomain domain);

	void drop(TipoEscritorDomain domain);

}
