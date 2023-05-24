package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;

public interface EstadoTipoIdentificacionFacade {

	void register(EstadoTipoIdentificacionDTO dto);

	List<EstadoTipoIdentificacionDTO> list(EstadoTipoIdentificacionDTO dto);

}
