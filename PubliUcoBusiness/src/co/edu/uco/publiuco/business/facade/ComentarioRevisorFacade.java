package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.ComentarioRevisorDTO;

public interface ComentarioRevisorFacade {

	void register(ComentarioRevisorDTO dto);

	List<ComentarioRevisorDTO> list(ComentarioRevisorDTO dto);

	void modify(ComentarioRevisorDTO dto);

	void drop(ComentarioRevisorDTO dto);

}
