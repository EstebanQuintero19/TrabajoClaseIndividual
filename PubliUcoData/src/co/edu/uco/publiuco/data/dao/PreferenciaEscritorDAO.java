package co.edu.uco.publiuco.data.dao;

import java.util.List;

import co.edu.uco.publiuco.entities.PreferenciaEscritorEntity;

public interface PreferenciaEscritorDAO {
	
	void create(PreferenciaEscritorEntity entity);

	List<PreferenciaEscritorEntity> read(PreferenciaEscritorEntity entity);

	void update(PreferenciaEscritorEntity entity);

	void delete(PreferenciaEscritorEntity entity);

}
