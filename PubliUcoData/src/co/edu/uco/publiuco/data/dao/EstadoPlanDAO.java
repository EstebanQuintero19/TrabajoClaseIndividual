package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoPlanEntity;

public interface EstadoPlanDAO {

	void create(EstadoPlanEntity entity);

	List<EstadoPlanEntity> read(EstadoPlanEntity entity);

}
