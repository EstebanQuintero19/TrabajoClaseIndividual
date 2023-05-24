package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.CategoriaAdministradorCategoriaDTO;

public interface CategoriaAdministradorCategoriaFacade {
	
	void register(CategoriaAdministradorCategoriaDTO dto);

	List<CategoriaAdministradorCategoriaDTO> list(CategoriaAdministradorCategoriaDTO dto);

	void modify(CategoriaAdministradorCategoriaDTO dto);

	void drop(CategoriaAdministradorCategoriaDTO dto);

}
