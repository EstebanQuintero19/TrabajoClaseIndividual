package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PlanPublicacionEntity;

public interface PlanPublicacionDAO {
	
	void create(PlanPublicacionEntity entity);

	List<PlanPublicacionEntity> read(PlanPublicacionEntity entity);

	void update(PlanPublicacionEntity entity);

	void delete(PlanPublicacionEntity entity);

}
