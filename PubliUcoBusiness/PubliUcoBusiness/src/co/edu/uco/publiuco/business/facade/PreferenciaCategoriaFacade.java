package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PreferenciaCategoriaDTO;

public interface PreferenciaCategoriaFacade {

	void register(PreferenciaCategoriaDTO dto);

	List<PreferenciaCategoriaDTO> list(PreferenciaCategoriaDTO dto);

	void modify(PreferenciaCategoriaDTO dto);

	void drop(PreferenciaCategoriaDTO dto);

}
