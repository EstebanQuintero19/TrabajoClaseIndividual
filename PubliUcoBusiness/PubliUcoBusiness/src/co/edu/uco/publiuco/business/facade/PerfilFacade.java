package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.PerfilDTO;

public interface PerfilFacade {

	void register(PerfilDTO dto);

	List<PerfilDTO> list(PerfilDTO dto);

	void modify(PerfilDTO dto);

	void drop(PerfilDTO dto);

}
