package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;

public interface TipoRelacionInstitucionFacade {

	void register(TipoRelacionInstitucionDTO dto);

	List<TipoRelacionInstitucionDTO> list(TipoRelacionInstitucionDTO dto);

	void modify(TipoRelacionInstitucionDTO dto);

	void drop(TipoRelacionInstitucionDTO dto);

}
