package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.TipoAccesoDomain;

public interface TipoAccesoBusiness {
	
	void register(TipoAccesoDomain domain);

	List<TipoAccesoDomain> list(TipoAccesoDomain domain);

	void modify(TipoAccesoDomain domain);

	void drop(TipoAccesoDomain domain);

}
