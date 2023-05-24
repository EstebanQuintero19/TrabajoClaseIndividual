package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoSuscripcionDTO;

public interface EstadoSuscripcionFacade {

	void register(EstadoSuscripcionDTO dto);

	List<EstadoSuscripcionDTO> list(EstadoSuscripcionDTO dto);

}
