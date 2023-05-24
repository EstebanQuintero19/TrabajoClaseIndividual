package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoComentarioRevisorDomain;

public interface TipoComentarioRevisorBusiness {
	
	void register(TipoComentarioRevisorDomain domain); 
	
	List<TipoComentarioRevisorDomain> list(TipoComentarioRevisorDomain domain);

}
