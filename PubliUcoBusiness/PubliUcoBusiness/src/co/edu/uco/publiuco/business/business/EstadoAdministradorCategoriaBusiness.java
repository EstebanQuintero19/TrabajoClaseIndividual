package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoAdministradorCategoriaDomain;

public interface EstadoAdministradorCategoriaBusiness {

	void register(EstadoAdministradorCategoriaDomain domain);

	List<EstadoAdministradorCategoriaDomain> list(EstadoAdministradorCategoriaDomain domain);

}
