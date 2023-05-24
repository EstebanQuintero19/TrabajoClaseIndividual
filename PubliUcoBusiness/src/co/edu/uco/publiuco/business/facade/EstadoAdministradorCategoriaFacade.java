package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoAdministradorCategoriaDTO;

public interface EstadoAdministradorCategoriaFacade {
	
	void register(EstadoAdministradorCategoriaDTO dto);

	List<EstadoAdministradorCategoriaDTO> list(EstadoAdministradorCategoriaDTO dto);

}
