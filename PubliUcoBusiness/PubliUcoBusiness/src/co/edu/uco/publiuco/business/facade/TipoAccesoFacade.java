package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.TipoAccesoDTO;

public interface TipoAccesoFacade {

	void register(TipoAccesoDTO dto);

	List<TipoAccesoDTO> list(TipoAccesoDTO dto);

	void modify(TipoAccesoDTO dto);

	void drop(TipoAccesoDTO dto);

}
