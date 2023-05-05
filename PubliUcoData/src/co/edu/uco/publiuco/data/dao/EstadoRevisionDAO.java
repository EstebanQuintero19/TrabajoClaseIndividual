package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoRevisionEntity;

public interface EstadoRevisionDAO {
	
	void create(EstadoRevisionEntity entity);

	List<EstadoRevisionEntity> read(EstadoRevisionEntity entity);

}
