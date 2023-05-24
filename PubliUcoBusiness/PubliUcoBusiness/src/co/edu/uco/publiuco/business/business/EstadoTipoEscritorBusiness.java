package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoTipoEscritorDomain;

public interface EstadoTipoEscritorBusiness {

	void register(EstadoTipoEscritorDomain domain);

	List<EstadoTipoEscritorDomain> list(EstadoTipoEscritorDomain domain);

}
