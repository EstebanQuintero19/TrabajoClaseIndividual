package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoRelacionInstitucionSqlServerDAOMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionSqlServerDAO extends SqlDAO<EstadoTipoRelacionInstitucionEntity>
		implements EstadoTipoRelacionInstitucionDAO {

	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = "INSERT INTO EstadoTipoRelacionInstitucion(identificador, nombre, descripcion) VALUES (?,?,?)";

		try (var PreparedStatement = getConnection().prepareStatement(sqlStatement)) {

			PreparedStatement.setObject(1, entity.getIdentificador());
			PreparedStatement.setString(2, entity.getNombre());
			PreparedStatement.setString(3, entity.getDescripcion());

			PreparedStatement.executeUpdate();

		} catch (SQLException exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.CREATE_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.CREATE_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.CREATE_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntity> read(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();

		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		sqlStatement.append(prepareOrderBy());

		try (var preparedStatement = getConnection().prepareStatement(sqlStatement.toString())) {

			setParameters(preparedStatement, parameters);

			return executeQuery(preparedStatement);

		} catch (final PubliucoException exception) {
			throw exception;
		} catch (SQLException exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.READ_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.READ_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.READ_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.READ_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, descripcion ";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM EstadoTipoRelacionInstitucion ";
	}

	@Override
	protected final String prepareWhere(final EstadoTipoRelacionInstitucionEntity entity, List<Object> parameters) {
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;

		if (!UtilObject.isNull(entity)) {

			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=? ");
				setWhere = false;
			}

			if (!UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND ").append("nombre=? ");
				setWhere = false;
			}

			if (!UtilText.getUtilText().isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append(setWhere ? "WHERE " : "AND ").append("descripcion LIKE %?% ");
			}

		}

		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

	@Override
	protected final void setParameters(final PreparedStatement preparedStatement, final List<Object> parameters) {
		try {
			if (!UtilObject.isNull(parameters) && !UtilObject.isNull(preparedStatement)) {
				for (int index = 0; index < parameters.size(); index++) {
					preparedStatement.setObject(index + 1, parameters.get(index));
				}
			}
		} catch (SQLException exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	protected List<EstadoTipoRelacionInstitucionEntity> executeQuery(PreparedStatement preparedStatement) {

		final List<EstadoTipoRelacionInstitucionEntity> result = new ArrayList<>();

		try (var resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {
				var entityTmp = new EstadoTipoRelacionInstitucionEntity(
						resultSet.getObject("identificador", UUID.class), resultSet.getString("nombre"),
						resultSet.getString("descripcion"));

				result.add(entityTmp);
			}

		} catch (SQLException exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = EstadoTipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}
		return result;
	}
}