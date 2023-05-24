package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoSuscripcionEntity;

public interface EstadoSuscripcionDAO {
	
	void create(EstadoSuscripcionEntity entity);

	List<EstadoSuscripcionEntity> read(EstadoSuscripcionEntity entity);

}
