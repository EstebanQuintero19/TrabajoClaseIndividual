package co.edu.uco.publiuco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.relational.SqlDAO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionSqlServerDAO extends SqlDAO implements TipoRelacionInstitucionDAO {

	public TipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final TipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public final List<TipoRelacionInstitucionEntity> read(final TipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final void update(final TipoRelacionInstitucionEntity entity) {
		var sqlStatement = "UPDATE TipoRelacionInstitucion SET nombre=?, descripcion=? WHERE identificador=? ";

		try (var PreparedStatement = getConnection().prepareStatement(sqlStatement)) {

			PreparedStatement.setString(1, entity.getNombre());
			PreparedStatement.setString(2, entity.getDescripcion());
			PreparedStatement.setObject(3, entity.getIdentificador());

			PreparedStatement.executeUpdate();

		} catch (SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de modificar la informacion del estado de tipo relacion institucion deseado";
			var technicalMessage = "Se ha presentado un problema de tipo SQLException dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de actualizar la informacion del estado de tipo relacion institucion deseado";
			var technicalMessage = "Se ha presentado un problema inesperadp dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

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
			var userMessage = "Se ha presentado un problema tratando de modificar la informacion del estado de tipo relacion institucion deseado";
			var technicalMessage = "Se ha presentado un problema de tipo SQLException dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);
		} catch (Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de actualizar la informacion del estado de tipo relacion institucion deseado";
			var technicalMessage = "Se ha presentado un problema inesperadp dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

			throw PubliucoDataException.create(technicalMessage, userMessage, exception);

		}

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
	protected String prepareWhere(Object entity, List parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String prepareOrderBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setParameters(PreparedStatement preparedStatement, List parameters) {
		// TODO Auto-generated method stub

	}

	@Override
	protected List executeQuery(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}

}
