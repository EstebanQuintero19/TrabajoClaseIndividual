package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PreferenciaEscritorDTO;

public interface PreferenciaEscritorFacade {

	void register(PreferenciaEscritorDTO dto);

	List<PreferenciaEscritorDTO> list(PreferenciaEscritorDTO dto);

	void modify(PreferenciaEscritorDTO dto);

	void drop(PreferenciaEscritorDTO dto);

}
