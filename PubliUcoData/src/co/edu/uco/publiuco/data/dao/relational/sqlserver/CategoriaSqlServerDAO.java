package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoRelacionInstitucionSqlServerDAOMessages;
import co.edu.uco.publiuco.data.dao.CategoriaDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.CategoriaEntity;

public final class CategoriaSqlServerDAO extends SqlDAO<CategoriaEntity> implements CategoriaDAO {

	public CategoriaSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public void create(CategoriaEntity entity) {
		var sqlStatement = "INSERT INTO Categoria(identificador, categoriaPadre, nombre, descripcion, estado) VALUES (?,?,?,?,?)";

		try (var PreparedStatement = getConnection().prepareStatement(sqlStatement)) {

			PreparedStatement.setObject(1, entity.getIdentificador());
			PreparedStatement.setString(2, entity.getNombre());
			PreparedStatement.setString(3, entity.getDescripcion());
			PreparedStatement.setObject(4, entity.getEstado());

			PreparedStatement.executeUpdate();

		} catch (SQLException exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.CREATE_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.CREATE_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.CREATE_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	public List<CategoriaEntity> read(CategoriaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CategoriaEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(CategoriaEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	protected String prepareSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareFrom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareWhere(CategoriaEntity entity, List<Object> parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareOrderBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setParameters(PreparedStatement preparedStatement, List<Object> parameters) {
		// TODO Auto-generated method stub

	}

	@Override
	protected List<CategoriaEntity> executeQuery(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}

}
