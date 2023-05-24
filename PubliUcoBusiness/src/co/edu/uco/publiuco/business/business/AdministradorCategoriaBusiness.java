package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.AdministradorCategoriaDomain;

public interface AdministradorCategoriaBusiness {
	
	void register(AdministradorCategoriaDomain domain);

	List<AdministradorCategoriaDomain> list(AdministradorCategoriaDomain domain);

	void modify(AdministradorCategoriaDomain domain);

	void drop(AdministradorCategoriaDomain domain);

}
