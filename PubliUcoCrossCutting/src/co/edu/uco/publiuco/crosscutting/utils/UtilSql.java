package co.edu.uco.publiuco.crosscutting.utils;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;

public class UtilSql {

	private UtilSql() {
		super();
	}

	public static boolean connectionIsOpen(final Connection connection) {
		if (UtilObject.isNull(connection)) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION;
			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage);
		}
		try {
			return !connection.isClosed();
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}

	}

	public static final void closeConnection(final Connection connection) {
		try {
			if (!connectionIsOpen(connection)) {
				connection.close();
			}
		} catch (PubliucoCrossCuttingException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
		}
	}

	public static final void initCommitIsReady(final Connection connection) {

		try {
			connectionIsOpen(connection);
			if (connection.getAutoCommit()) {
				var userMessage = UtilSqlMessages.COMMIT_IS_STARTED_USER_MESSAGE;
				var technicalMessage = UtilSqlMessages.COMMIT_IS_STARTED_TECHNICAL_AUTOCOMMIT;
				throw PubliucoCrossCuttingException.create(technicalMessage, userMessage);
			}
		} catch (PubliucoCrossCuttingException exception) {
			throw exception;
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.COMMIT_IS_STARTED_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_IS_STARTED_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(technicalMessage, userMessage, exception);
		} catch (final Exception exception) {
			var userMessage = UtilSqlMessages.COMMIT_IS_STARTED_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_IS_STARTED_TECHNICAL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}
}
