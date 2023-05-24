package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.LectorDTO;

public interface LectorFacade {

	void register(LectorDTO dto);

	List<LectorDTO> list(LectorDTO dto);

	void modify(LectorDTO dto);

	void drop(LectorDTO dto);

}
