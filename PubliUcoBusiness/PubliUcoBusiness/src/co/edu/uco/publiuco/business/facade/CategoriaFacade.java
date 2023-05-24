package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.CategoriaDTO;

public interface CategoriaFacade {

	void register(CategoriaDTO dto);

	List<CategoriaDTO> list(CategoriaDTO dto);

	void modify(CategoriaDTO dto);

	void drop(CategoriaDTO dto);

}
