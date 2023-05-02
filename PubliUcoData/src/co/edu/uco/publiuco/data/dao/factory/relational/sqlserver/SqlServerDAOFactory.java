package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactoy;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoTipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;

public final class SqlServerDAOFactory extends DAOFactoy{
	
	private Connection connection;
	
	public SqlServerDAOFactory() {
		abrirConexion();
	}

	@Override
	protected void abrirConexion() {
		connection = null;
		
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarTransaccion() {
		// setAutoCommit->false
		
	}

	@Override
	public void confirmarTransaccion() {
		// commit
		
	}

	@Override
	public void cancelarTransaccion() {
		// rollback
		
	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return new EstadoTipoRelacionInstitucionSqlServerDAO(connection);
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}

}