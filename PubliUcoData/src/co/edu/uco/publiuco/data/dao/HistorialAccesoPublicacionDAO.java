package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.HistorialAccesoPublicacionEntity;

public interface HistorialAccesoPublicacionDAO {
	
	void create(HistorialAccesoPublicacionEntity entity);

	List<HistorialAccesoPublicacionEntity> read(HistorialAccesoPublicacionEntity entity);

	void update(HistorialAccesoPublicacionEntity entity);

	void delete(HistorialAccesoPublicacionEntity entity);

}
