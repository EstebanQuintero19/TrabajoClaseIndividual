package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoRevisionEntity;

public interface TipoRevisionDAO {
	
	void create(TipoRevisionEntity entity);

	List<TipoRevisionEntity> read(TipoRevisionEntity entity);

}
