package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoPlanDTO;

public interface EstadoPlanFacade {

	void register(EstadoPlanDTO dto);

	List<EstadoPlanDTO> list(EstadoPlanDTO dto);

}
