package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.VersionDTO;

public interface VersionFacade {

	void register(VersionDTO dto);

	List<VersionDTO> list(VersionDTO dto);

	void modify(VersionDTO dto);

	void drop(VersionDTO dto);

}
