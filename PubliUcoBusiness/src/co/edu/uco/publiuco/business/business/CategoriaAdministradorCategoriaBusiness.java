package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.CategoriaAdministradorCategoriaDomain;

public interface CategoriaAdministradorCategoriaBusiness {

	void register(CategoriaAdministradorCategoriaDomain domain);

	List<CategoriaAdministradorCategoriaDomain> list(CategoriaAdministradorCategoriaDomain domain);

	void modify(CategoriaAdministradorCategoriaDomain domain);

	void drop(CategoriaAdministradorCategoriaDomain domain);

}
