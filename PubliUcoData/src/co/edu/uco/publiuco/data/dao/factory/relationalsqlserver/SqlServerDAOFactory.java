package co.edu.uco.publiuco.data.dao.factory.relationalsqlserver;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.sqlserver.EstadoTipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.sqlserver.TipoRelacionInstitucionSqlServerDAO;

public final class SqlServerDAOFactory extends DAOFactory {

	private Connection connection;
	
	public SqlServerDAOFactory() {
		abrirConexion();
	}
	
	@Override
	protected  final void abrirConexion() {
		// TODO Auto-generated method stub
		connection = null;
	}

	@Override
	public  final void cerrarConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  final void iniciarTransaccion() {
		// (setAutoCOmmit -> false)
		
	}

	@Override
	public  final void confirmarTransaccion() {
		//  (commit)
		
	}

	@Override
	public final void cancelarTransaccion() {
		//  (rollback)
		
	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return new EstadoTipoRelacionInstitucionSqlServerDAO(connection);
		
	}

	@Override
	public TipoRelacionInstitucionDAO geTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}

}
