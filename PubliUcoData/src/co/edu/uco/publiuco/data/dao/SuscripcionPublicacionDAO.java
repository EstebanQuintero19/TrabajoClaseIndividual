package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public interface SuscripcionPublicacionDAO {
	
	void create(SuscripcionPublicacionEntity entity);

	List<SuscripcionPublicacionEntity> read(SuscripcionPublicacionEntity entity);

	void update(SuscripcionPublicacionEntity entity);

	void delete(SuscripcionPublicacionEntity entity);

}
