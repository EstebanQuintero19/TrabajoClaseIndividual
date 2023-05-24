package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.PlanCategoriaDomain;

public interface PlanCategoriaBusiness {

	void register(PlanCategoriaDomain domain);

	List<PlanCategoriaDomain> list(PlanCategoriaDomain domain);

	void modify(PlanCategoriaDomain domain);

	void drop(PlanCategoriaDomain domain);

}
