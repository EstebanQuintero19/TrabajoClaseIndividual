package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntity;

public interface EstadoAdministradorCategoriaDAO {
	
	void create(EstadoAdministradorCategoriaEntity entity);

	List<EstadoAdministradorCategoriaEntity> read(EstadoAdministradorCategoriaEntity entity);

}
