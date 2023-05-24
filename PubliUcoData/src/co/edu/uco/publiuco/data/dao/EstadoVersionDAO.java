package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoVersionEntity;

public interface EstadoVersionDAO {
	
	void create(EstadoVersionEntity entity);

	List<EstadoVersionEntity> read(EstadoVersionEntity entity);

}
