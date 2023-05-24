package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoPreferenciaDTO;

public interface EstadoPreferenciaFacade {

	void register(EstadoPreferenciaDTO dto);

	List<EstadoPreferenciaDTO> list(EstadoPreferenciaDTO dto);

}
