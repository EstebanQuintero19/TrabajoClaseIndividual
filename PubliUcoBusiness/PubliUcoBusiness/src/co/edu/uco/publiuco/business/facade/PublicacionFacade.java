package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PublicacionDTO;

public interface PublicacionFacade {

	void register(PublicacionDTO dto);

	List<PublicacionDTO> list(PublicacionDTO dto);

	void modify(PublicacionDTO dto);

	void drop(PublicacionDTO dto);

}
