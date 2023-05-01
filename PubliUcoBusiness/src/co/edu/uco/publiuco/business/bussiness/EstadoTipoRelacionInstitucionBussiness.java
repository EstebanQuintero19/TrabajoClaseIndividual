package co.edu.uco.publiuco.business.bussiness;

import java.util.List;

import co.edu.uco.publiuco.bussiness.domain.EstadoTipoRelacionInstitucionDomain;

public interface  EstadoTipoRelacionInstitucionBussiness {
	
	void registrer(EstadoTipoRelacionInstitucionDomain domain);
	
	List<EstadoTipoRelacionInstitucionDomain> list(EstadoTipoRelacionInstitucionDomain domain);

	void modify (EstadoTipoRelacionInstitucionDomain domain);
	
	void drop(EstadoTipoRelacionInstitucionDomain domain);
}
