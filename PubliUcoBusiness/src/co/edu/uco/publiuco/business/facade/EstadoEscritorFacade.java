package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoEscritorDTO;

public interface EstadoEscritorFacade {

	void register(EstadoEscritorDTO dto);

	List<EstadoEscritorDTO> list(EstadoEscritorDTO dto);

}
