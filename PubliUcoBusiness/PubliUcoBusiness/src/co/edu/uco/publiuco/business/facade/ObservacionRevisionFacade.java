package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.ObservacionRevisionDTO;

public interface ObservacionRevisionFacade {

	void register(ObservacionRevisionDTO dto);

	List<ObservacionRevisionDTO> list(ObservacionRevisionDTO dto);

	void modify(ObservacionRevisionDTO dto);

	void drop(ObservacionRevisionDTO dto);

}
