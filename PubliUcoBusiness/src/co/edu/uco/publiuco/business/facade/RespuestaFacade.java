package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.RespuestaDTO;

public interface RespuestaFacade {

	void register(RespuestaDTO dto);

	List<RespuestaDTO> list(RespuestaDTO dto);

}
