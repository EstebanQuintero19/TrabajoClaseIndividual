package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionSqlServerDAO implements EstadoTipoRelacionInstitucionDAO {

	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		
	}
	
	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntity> read(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}