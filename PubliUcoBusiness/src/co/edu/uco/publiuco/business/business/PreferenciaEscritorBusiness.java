package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PreferenciaEscritorDomain;

public interface PreferenciaEscritorBusiness {

	void register(PreferenciaEscritorDomain domain);

	List<PreferenciaEscritorDomain> list(PreferenciaEscritorDomain domain);

	void modify(PreferenciaEscritorDomain domain);

	void drop(PreferenciaEscritorDomain domain);

}
