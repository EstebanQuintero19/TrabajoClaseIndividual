package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.SuscripcionCategoriaDomain;

public interface SuscripcionCategoriaBusiness {
	
	void register(SuscripcionCategoriaDomain domain);

	List<SuscripcionCategoriaDomain> list(SuscripcionCategoriaDomain domain);

	void modify(SuscripcionCategoriaDomain domain);

	void drop(SuscripcionCategoriaDomain domain);

}
