package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.PublicacionDAO;
import co.edu.uco.publiuco.entities.PublicacionEntity;

public final class PublicacionSqlServerDAO implements PublicacionDAO {

	public PublicacionSqlServerDAO(final Connection connection) {

	}

	@Override
	public void create(PublicacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PublicacionEntity> read(PublicacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PublicacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PublicacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	

}
