package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoCategoriaDTO;

public interface EstadoCategoriaFacade {
	
	void register(EstadoCategoriaDTO dto);

	List<EstadoCategoriaDTO> list(EstadoCategoriaDTO dto);


}
