package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.CalificacionDTO;

public interface CalificacionFacade {
	
	void register(CalificacionDTO dto);

	List<CalificacionDTO> list(CalificacionDTO dto);

	void modify(CalificacionDTO dto);

	void drop(CalificacionDTO dto);

}
