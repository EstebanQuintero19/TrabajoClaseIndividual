package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PlanCategoriaDTO;

public interface PlanCategoriaFacade {

	void register(PlanCategoriaDTO dto);

	List<PlanCategoriaDTO> list(PlanCategoriaDTO dto);

	void modify(PlanCategoriaDTO dto);

	void drop(PlanCategoriaDTO dto);

}
