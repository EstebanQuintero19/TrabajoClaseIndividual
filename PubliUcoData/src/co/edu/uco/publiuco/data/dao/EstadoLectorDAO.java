package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoLectorEntity;

public interface EstadoLectorDAO {

	void create(EstadoLectorEntity entity);

	List<EstadoLectorEntity> read(EstadoLectorEntity entity);

}
