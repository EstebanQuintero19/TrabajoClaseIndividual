package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public interface TipoAccesoDAO {
	
	void create(TipoAccesoEntity entity);

	List<TipoAccesoEntity> read(TipoAccesoEntity entity);
	
	void update(TipoAccesoEntity entity);

	void delete(TipoAccesoEntity entity);

}
