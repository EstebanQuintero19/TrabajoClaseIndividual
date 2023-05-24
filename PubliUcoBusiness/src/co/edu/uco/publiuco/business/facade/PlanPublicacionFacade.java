package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PlanPublicacionDTO;

public interface PlanPublicacionFacade {

	void register(PlanPublicacionDTO dto);

	List<PlanPublicacionDTO> list(PlanPublicacionDTO dto);

	void modify(PlanPublicacionDTO dto);

	void drop(PlanPublicacionDTO dto);

}
