package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoLectorDomain;

public interface EstadoLectorBusiness {
	
	void register(EstadoLectorDomain domain);
	
	List<EstadoLectorDomain> list(EstadoLectorDomain domain);

}
