package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoRelacionInstitucionSqlServerDAOMessages;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionSqlServerDAO extends SqlDAO<TipoRelacionInstitucionEntity>
		implements TipoRelacionInstitucionDAO {

	public TipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final TipoRelacionInstitucionEntity entity) {
		var sqlStatement = "INSERT INTO TipoRelacionInstitucion(identificador, nombre, descripcion, estado) VALUES (?,?,?,?)";

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
	public final List<TipoRelacionInstitucionEntity> read(final TipoRelacionInstitucionEntity entity) {
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
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.READ_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.READ_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.READ_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.READ_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}
	}

	@Override
	public final void update(final TipoRelacionInstitucionEntity entity) {
		var sqlStatement = "UPDATE TipoRelacionInstitucion SET nombre=?, descripcion=?, estado=? WHERE identificador=? ";

		try (var PreparedStatement = getConnection().prepareStatement(sqlStatement)) {

			PreparedStatement.setString(1, entity.getNombre());
			PreparedStatement.setString(2, entity.getDescripcion());
			PreparedStatement.setObject(3, entity.getEstado());
			PreparedStatement.setObject(4, entity.getIdentificador());

			PreparedStatement.executeUpdate();

		} catch (SQLException exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.UPDATE_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.UPDATE_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.UPDATE_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	public final void delete(final TipoRelacionInstitucionEntity entity) {
		var sqlStatement = "DELETE FROM TipoRelacionInstitucion WHERE identificador=? ";

		try (var PreparedStatement = getConnection().prepareStatement(sqlStatement)) {

			PreparedStatement.setObject(1, entity.getIdentificador());

			PreparedStatement.executeUpdate();

		} catch (SQLException exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.DELETE_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.DELETE_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.DELETE_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	protected String prepareSelect() {
		return "SELECT identificador, nombre, descripcion, estado ";
	}

	@Override
	protected String prepareFrom() {
		return "FROM TipoRelacionInstitucion ";
	}

	@Override
	protected String prepareWhere(TipoRelacionInstitucionEntity entity, List<Object> parameters) {
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

			if (!UtilObject.isNull(entity.getEstado())) {
				parameters.add(entity.getEstado());
				where.append(setWhere ? "WHERE " : "AND ").append("estado=? ");
			}

		}

		return where.toString();
	}

	@Override
	protected String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

	@Override
	protected void setParameters(PreparedStatement preparedStatement, List<Object> parameters) {
		try {
			if (!UtilObject.isNull(parameters) && !UtilObject.isNull(preparedStatement)) {
				for (int index = 0; index < parameters.size(); index++) {
					preparedStatement.setObject(index + 1, parameters.get(index));
				}
			}
		} catch (SQLException exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.SET_PARAMETERS_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

	}

	@Override
	protected List<TipoRelacionInstitucionEntity> executeQuery(PreparedStatement preparedStatement) {
		final List<TipoRelacionInstitucionEntity> result = new ArrayList<>();

		try (var resultSet = preparedStatement.executeQuery()) {

			while (resultSet.next()) {
				var entityTmp = new TipoRelacionInstitucionEntity(resultSet.getObject("identificador", UUID.class),
						resultSet.getString("nombre"), resultSet.getString("descripcion"),
						resultSet.getObject("estado", EstadoTipoRelacionInstitucionEntity.class));

				result.add(entityTmp);
			}

		} catch (SQLException exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_SQL_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_SQL_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = TipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_EXCEPTION_USER_MESSAGE;
			var technicalMessage = TipoRelacionInstitucionSqlServerDAOMessages.EXECUTE_QUERY_EXCEPTION_TECHNICAL_MESSAGE;

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}
		return result;
	}

}
