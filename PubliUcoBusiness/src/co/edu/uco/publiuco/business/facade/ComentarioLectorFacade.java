package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.ComentarioLectorDTO;

public interface ComentarioLectorFacade {

	void register(ComentarioLectorDTO dto);

	List<ComentarioLectorDTO> list(ComentarioLectorDTO dto);

	void modify(ComentarioLectorDTO dto);

	void drop(ComentarioLectorDTO dto);

}
