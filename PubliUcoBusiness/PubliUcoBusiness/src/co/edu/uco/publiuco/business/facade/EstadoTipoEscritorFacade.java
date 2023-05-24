package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoTipoEscritorDTO;

public interface EstadoTipoEscritorFacade {

	void register(EstadoTipoEscritorDTO dto);

	List<EstadoTipoEscritorDTO> list(EstadoTipoEscritorDTO dto);

}
