package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoObservacionRevisorDomain;

public interface EstadoObservacionRevisorBusiness {
	
	void register(EstadoObservacionRevisorDomain domain);
	
	List<EstadoObservacionRevisorDomain> list(EstadoObservacionRevisorDomain domain);

}
