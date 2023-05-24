package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.HistorialAccesoPublicacionDTO;

public interface HistorialAccesoPublicacionFacade {

	void register(HistorialAccesoPublicacionDTO dto);

	List<HistorialAccesoPublicacionDTO> list(HistorialAccesoPublicacionDTO dto);

	void modify(HistorialAccesoPublicacionDTO dto);

	void drop(HistorialAccesoPublicacionDTO dto);

}
