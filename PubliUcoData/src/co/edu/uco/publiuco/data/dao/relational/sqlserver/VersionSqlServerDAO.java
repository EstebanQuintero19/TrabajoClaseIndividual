package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.VersionDAO;
import co.edu.uco.publiuco.entities.VersionEntity;

public final class VersionSqlServerDAO implements VersionDAO {

	public VersionSqlServerDAO(final Connection connection) {

	}

	@Override
	public void create(VersionEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<VersionEntity> read(VersionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(VersionEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(VersionEntity entity) {
		// TODO Auto-generated method stub

	}

}
