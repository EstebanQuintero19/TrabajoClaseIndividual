package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoPublicacionEntity;

public interface EstadoPublicacionDAO {
	
	void create(EstadoPublicacionEntity entity);

	List<EstadoPublicacionEntity> read(EstadoPublicacionEntity entity);

}
