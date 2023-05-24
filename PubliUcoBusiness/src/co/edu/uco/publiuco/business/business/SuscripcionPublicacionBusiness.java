package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.SuscripcionPublicacionDomain;

public interface SuscripcionPublicacionBusiness {

	void register(SuscripcionPublicacionDomain domain);

	List<SuscripcionPublicacionDomain> list(SuscripcionPublicacionDomain domain);

	void modify(SuscripcionPublicacionDomain domain);

	void drop(SuscripcionPublicacionDomain domain);

}
