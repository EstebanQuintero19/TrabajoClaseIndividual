package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.RevisorRevisionDTO;

public interface RevisorRevisionFacade {

	void register(RevisorRevisionDTO dto);

	List<RevisorRevisionDTO> list(RevisorRevisionDTO dto);

	void modify(RevisorRevisionDTO dto);

	void drop(RevisorRevisionDTO dto);

}
