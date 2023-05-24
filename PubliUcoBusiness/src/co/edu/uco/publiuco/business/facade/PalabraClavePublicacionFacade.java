package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PalabraClavePublicacionDTO;

public interface PalabraClavePublicacionFacade {

	void register(PalabraClavePublicacionDTO dto);

	List<PalabraClavePublicacionDTO> list(PalabraClavePublicacionDTO dto);

	void modify(PalabraClavePublicacionDTO dto);

	void drop(PalabraClavePublicacionDTO dto);

}
