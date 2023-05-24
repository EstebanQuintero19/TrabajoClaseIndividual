package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.AdministradorCategoriaDTO;

public interface AdministradorCategoriaFacade {

	void register(AdministradorCategoriaDTO dto);

	List<AdministradorCategoriaDTO> list(AdministradorCategoriaDTO dto);

	void modify(AdministradorCategoriaDTO dto);

	void drop(AdministradorCategoriaDTO dto);

}
