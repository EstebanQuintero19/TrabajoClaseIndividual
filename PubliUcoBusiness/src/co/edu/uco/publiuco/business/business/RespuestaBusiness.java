package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.RespuestaDomain;

public interface RespuestaBusiness {

	void register(RespuestaDomain domain);

	List<RespuestaDomain> list(RespuestaDomain domain);

}
