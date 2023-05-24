package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public interface EstadoCategoriaDAO {

	void create(EstadoCategoriaEntity entity);

	List<EstadoCategoriaEntity> read(EstadoCategoriaEntity entity);

}
