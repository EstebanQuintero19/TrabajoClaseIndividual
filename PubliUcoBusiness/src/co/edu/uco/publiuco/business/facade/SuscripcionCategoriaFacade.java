package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.SuscripcionCategoriaDTO;

public interface SuscripcionCategoriaFacade {

	void register(SuscripcionCategoriaDTO dto);

	List<SuscripcionCategoriaDTO> list(SuscripcionCategoriaDTO dto);

	void modify(SuscripcionCategoriaDTO dto);

	void drop(SuscripcionCategoriaDTO dto);

}
