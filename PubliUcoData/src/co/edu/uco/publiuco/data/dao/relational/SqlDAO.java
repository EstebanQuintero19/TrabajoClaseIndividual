package co.edu.uco.publiuco.data.dao.relational;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliUcoDataException;
import co.edu.uco.publiuco.crosscutting.utils.UtilSql;

public abstract class SqlDAO <E>{
	
	private Connection connection;
	
	protected SqlDAO(final Connection connection) {
		setConnection(connection);
		if (!UtilSql.connectionIsOpen(connection)) {
			var userMessage = "Se ha presentado un problema tratando de llevar a cabo la operacion sobre el estado de tipo de relacion institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
			var technicalMessage = " No se ha podido crear el EstadoTipoRelacionInsitucionSqlServerDAO, debido a que la conexion no esta abierta";
		
			throw PubliUcoDataException.create(technicalMessage, userMessage);
		}
	}
	
	protected Connection getConnection() {
		return connection;
	}
	
	private final void setConnection(final Connection connection) {
		this.connection = connection;
	}
	
	protected abstract String prepareSelect();
	
	protected abstract String prepareFrom();
	
	protected abstract String prepareWhere(E entity, List<Object> parameters);
		
	protected abstract String prepareOrderBy();
	
	
}
