package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoObservacionRevisorEntity;

public interface EstadoObservacionRevisorDAO {
	
	void create(EstadoObservacionRevisorEntity entity);

	List<EstadoObservacionRevisorEntity> read(EstadoObservacionRevisorEntity entity);

}
