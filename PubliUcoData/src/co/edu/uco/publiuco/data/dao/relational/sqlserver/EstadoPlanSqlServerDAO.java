package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.EstadoPlanDAO;
import co.edu.uco.publiuco.entities.EstadoPlanEntity;

public final class EstadoPlanSqlServerDAO implements EstadoPlanDAO {

	public EstadoPlanSqlServerDAO(final Connection connection) {

	}

	@Override
	public void create(EstadoPlanEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EstadoPlanEntity> read(EstadoPlanEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
