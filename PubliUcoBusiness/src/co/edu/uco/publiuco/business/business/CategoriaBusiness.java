package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.CategoriaDomain;

public interface CategoriaBusiness {

	void register(CategoriaDomain domain);

	List<CategoriaDomain> list(CategoriaDomain domain);

	void modify(CategoriaDomain domain);

	void drop(CategoriaDomain domain);

}
