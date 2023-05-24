package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoPublicacionDTO;

public interface EstadoPublicacionFacade {

	void register(EstadoPublicacionDTO dto);

	List<EstadoPublicacionDTO> list(EstadoPublicacionDTO dto);

}
