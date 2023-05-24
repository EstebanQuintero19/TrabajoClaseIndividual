package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.TipoEscritorDTO;

public interface TipoEscritorFacade {

	void register(TipoEscritorDTO dto);

	List<TipoEscritorDTO> list(TipoEscritorDTO dto);

	void modify(TipoEscritorDTO dto);

	void drop(TipoEscritorDTO dto);

}
