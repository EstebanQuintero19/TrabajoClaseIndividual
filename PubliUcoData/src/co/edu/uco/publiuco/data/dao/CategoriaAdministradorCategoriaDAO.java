package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.CategoriaAdministradorCategoriaEntity;

public interface CategoriaAdministradorCategoriaDAO {
	
	void create(CategoriaAdministradorCategoriaEntity entity);

	List<CategoriaAdministradorCategoriaEntity> read(CategoriaAdministradorCategoriaEntity entity);

	void update(CategoriaAdministradorCategoriaEntity entity);

	void delete(CategoriaAdministradorCategoriaEntity entity);

}
