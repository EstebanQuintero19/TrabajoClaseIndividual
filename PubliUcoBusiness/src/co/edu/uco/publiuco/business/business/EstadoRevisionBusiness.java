package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoRevisionDomain;

public interface EstadoRevisionBusiness {
	
	void register(EstadoRevisionDomain domain);
	
	List<EstadoRevisionDomain> list(EstadoRevisionDomain domain);

}
