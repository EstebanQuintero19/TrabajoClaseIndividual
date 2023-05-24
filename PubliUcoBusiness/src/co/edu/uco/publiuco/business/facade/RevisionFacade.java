package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.RevisionDTO;

public interface RevisionFacade {

	void register(RevisionDTO dto);

	List<RevisionDTO> list(RevisionDTO dto);

	void modify(RevisionDTO dto);

	void drop(RevisionDTO dto);

}
