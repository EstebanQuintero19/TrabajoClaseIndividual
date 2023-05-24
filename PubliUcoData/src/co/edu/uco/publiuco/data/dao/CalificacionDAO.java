package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.CalificacionEntity;

public interface CalificacionDAO {
	
	void create(CalificacionEntity entity);

	List<CalificacionEntity> read(CalificacionEntity entity);

	void update(CalificacionEntity entity);

	void delete(CalificacionEntity entity);

}
