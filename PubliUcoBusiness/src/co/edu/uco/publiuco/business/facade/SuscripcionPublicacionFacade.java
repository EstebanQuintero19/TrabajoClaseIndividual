package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.SuscripcionPublicacionDTO;

public interface SuscripcionPublicacionFacade {

	void register(SuscripcionPublicacionDTO dto);

	List<SuscripcionPublicacionDTO> list(SuscripcionPublicacionDTO dto);

	void modify(SuscripcionPublicacionDTO dto);

	void drop(SuscripcionPublicacionDTO dto);

}
