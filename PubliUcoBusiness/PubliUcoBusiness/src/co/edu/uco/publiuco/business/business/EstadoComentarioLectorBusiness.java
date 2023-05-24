package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.EstadoComentarioLectorDomain;

public interface EstadoComentarioLectorBusiness {
	
	void register(EstadoComentarioLectorDomain domain);
	
	List<EstadoComentarioLectorDomain> list(EstadoComentarioLectorDomain domain);

}
