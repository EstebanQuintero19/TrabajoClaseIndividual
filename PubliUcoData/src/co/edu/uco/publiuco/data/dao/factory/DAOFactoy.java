package co.edu.uco.publiuco.data.dao.factory;

import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.factory.relational.sqlserver.SqlServerDAOFactory;

public abstract class DAOFactoy {

	public static void getFactory(final Factory factory) {
		
		DAOFactoy daoFactoy;
		
		switch (factory) {
		case SQLSERVER: {
			daoFactoy = new SqlServerDAOFactory();
			break;
		}
		case POSTGRESQL:{
			daoFactoy = new Post
			break;
		}default:
			throw new IllegalArgumentException("Unexpected value: "+factory);

	}}
	

	protected abstract void abrirConexion();

	public abstract void cerrarConexion();

	public abstract void iniciarTransaccion();

	public abstract void confirmarTransaccion();

	public abstract void cancelarTransaccion();

	public abstract EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO();

	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();
}