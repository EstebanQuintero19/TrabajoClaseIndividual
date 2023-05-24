package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoPlanDomain;

public interface EstadoPlanBusiness {
	
	void register(EstadoPlanDomain domain);
	
	List<EstadoPlanDomain> list(EstadoPlanDomain domain);

}
