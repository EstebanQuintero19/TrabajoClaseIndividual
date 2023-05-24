package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.EscritorDTO;

public interface EscritorFacade {

	void register(EscritorDTO dto);

	List<EscritorDTO> list(EscritorDTO dto);

	void modify(EscritorDTO dto);

	void drop(EscritorDTO dto);

}
