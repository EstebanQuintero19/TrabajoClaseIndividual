package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoObservacionRevisorDTO;

public interface EstadoObservacionRevisorFacade {
	
	void register(EstadoObservacionRevisorDTO dto);

	List<EstadoObservacionRevisorDTO> list(EstadoObservacionRevisorDTO dto);

}
