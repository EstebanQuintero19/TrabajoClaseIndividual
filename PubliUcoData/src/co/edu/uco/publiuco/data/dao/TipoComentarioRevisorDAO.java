package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public interface TipoComentarioRevisorDAO {
	
	void create(TipoComentarioRevisorEntity entity);

	List<TipoComentarioRevisorEntity> read(TipoComentarioRevisorEntity entity);

}
