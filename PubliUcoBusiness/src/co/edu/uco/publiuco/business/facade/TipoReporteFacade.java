package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.TipoReporteDTO;

public interface TipoReporteFacade {

	void register(TipoReporteDTO dto);

	List<TipoReporteDTO> list(TipoReporteDTO dto);

}
