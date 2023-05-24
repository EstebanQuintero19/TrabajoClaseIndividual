package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoEscritorDomain;

public interface EstadoEscritorBusiness {
	
	void register(EstadoEscritorDomain domain);
	
	List<EstadoEscritorDomain> list(EstadoEscritorDomain domain);

}
