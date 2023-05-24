package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EscritorPublicacionDTO;

public interface EscritorPublicacionFacade {

	void register(EscritorPublicacionDTO dto);

	List<EscritorPublicacionDTO> list(EscritorPublicacionDTO dto);

	void modify(EscritorPublicacionDTO dto);

	void drop(EscritorPublicacionDTO dto);

}
