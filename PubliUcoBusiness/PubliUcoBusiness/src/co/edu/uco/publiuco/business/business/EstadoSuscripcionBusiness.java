package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoSuscripcionDomain;

public interface EstadoSuscripcionBusiness {
	
	void register(EstadoSuscripcionDomain domain);
	
	List<EstadoSuscripcionDomain> list(EstadoSuscripcionDomain domain);

}
