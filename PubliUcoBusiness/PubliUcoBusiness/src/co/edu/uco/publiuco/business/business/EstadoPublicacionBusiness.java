package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoPublicacionDomain;

public interface EstadoPublicacionBusiness {
	
	void register(EstadoPublicacionDomain domain);
	
	List<EstadoPublicacionDomain> list(EstadoPublicacionDomain domain);

}
