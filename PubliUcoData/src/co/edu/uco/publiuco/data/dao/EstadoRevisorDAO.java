package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoRevisorEntity;

public interface EstadoRevisorDAO {
	
	void create(EstadoRevisorEntity entity);

	List<EstadoRevisorEntity> read(EstadoRevisorEntity entity);

}
