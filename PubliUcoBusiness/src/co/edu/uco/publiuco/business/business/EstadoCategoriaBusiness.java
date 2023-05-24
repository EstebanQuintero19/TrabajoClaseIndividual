package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoCategoriaDomain;

public interface EstadoCategoriaBusiness {
	
	void register(EstadoCategoriaDomain domain);
	
	List<EstadoCategoriaDomain> list(EstadoCategoriaDomain domain);

}
