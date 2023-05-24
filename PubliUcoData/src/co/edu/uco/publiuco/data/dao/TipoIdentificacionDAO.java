package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public interface TipoIdentificacionDAO {
	
	void create(TipoIdentificacionEntity entity);

	List<TipoIdentificacionEntity> read(TipoIdentificacionEntity entity);
	
	void update(TipoIdentificacionEntity entity);

	void delete(TipoIdentificacionEntity entity);

}
