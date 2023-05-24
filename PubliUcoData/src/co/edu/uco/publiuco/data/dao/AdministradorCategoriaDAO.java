package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public interface AdministradorCategoriaDAO {

	void create(AdministradorCategoriaEntity entity);

	List<AdministradorCategoriaEntity> read(AdministradorCategoriaEntity entity);

	void update(AdministradorCategoriaEntity entity);

	void delete(AdministradorCategoriaEntity entity);

}
