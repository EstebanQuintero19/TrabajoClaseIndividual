package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoTipoIdentificacionDomain;

public interface EstadoTipoIdentificacionBusiness {

	void register(EstadoTipoIdentificacionDomain domain);

	List<EstadoTipoIdentificacionDomain> list(EstadoTipoIdentificacionDomain domain);

}
