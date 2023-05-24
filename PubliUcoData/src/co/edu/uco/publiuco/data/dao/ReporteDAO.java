package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.ReporteEntity;

public interface ReporteDAO {
	
	void create(ReporteEntity entity);

	List<ReporteEntity> read(ReporteEntity entity);

	void update(ReporteEntity entity);

	void delete(ReporteEntity entity);

}
