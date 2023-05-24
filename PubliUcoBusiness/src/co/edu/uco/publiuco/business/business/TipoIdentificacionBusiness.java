package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoIdentificacionDomain;

public interface TipoIdentificacionBusiness {
	
	void register(TipoIdentificacionDomain domain);

	List<TipoIdentificacionDomain> list(TipoIdentificacionDomain domain);

	void modify(TipoIdentificacionDomain domain);

	void drop(TipoIdentificacionDomain domain);

}
