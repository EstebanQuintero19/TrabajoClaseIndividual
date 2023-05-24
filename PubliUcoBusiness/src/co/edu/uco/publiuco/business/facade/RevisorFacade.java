package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.RevisorDTO;

public interface RevisorFacade {

	void register(RevisorDTO dto);

	List<RevisorDTO> list(RevisorDTO dto);

	void modify(RevisorDTO dto);

	void drop(RevisorDTO dto);

}
