package co.edu.uco.publiuco.business.facade;

import java.util.List;

import co.edu.uco.publiuco.dto.ReporteDTO;

public interface ReporteFacade {

	void register(ReporteDTO dto);

	List<ReporteDTO> list(ReporteDTO dto);

	void modify(ReporteDTO dto);

	void drop(ReporteDTO dto);

}
