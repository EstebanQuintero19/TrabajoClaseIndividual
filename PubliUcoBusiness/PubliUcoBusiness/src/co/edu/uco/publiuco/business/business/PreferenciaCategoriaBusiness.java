package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;

public interface PreferenciaCategoriaBusiness {

	void register(PreferenciaCategoriaDomain domain);

	List<PreferenciaCategoriaDomain> list(PreferenciaCategoriaDomain domain);

	void modify(PreferenciaCategoriaDomain domain);

	void drop(PreferenciaCategoriaDomain domain);

}
