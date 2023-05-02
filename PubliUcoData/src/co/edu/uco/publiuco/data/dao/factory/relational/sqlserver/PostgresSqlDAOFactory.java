package co.edu.uco.publiuco.data.dao.factory.relational.sqlserver;

import java.sql.Connection;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactoy;

public class PostgresSqlDAOFactory extends DAOFactoy{
	
	private Connection connection;

	@Override
	protected void abrirConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}