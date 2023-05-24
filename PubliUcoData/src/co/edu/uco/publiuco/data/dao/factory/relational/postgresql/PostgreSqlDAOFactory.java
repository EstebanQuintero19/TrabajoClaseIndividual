package co.edu.uco.publiuco.data.dao.factory.relational.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.publiuco.crosscutting.exception.PubliucoCrossCuttingException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoDataException;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.UtilSqlMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilSql;
import co.edu.uco.publiuco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CalificacionDAO;
import co.edu.uco.publiuco.data.dao.CategoriaAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.CategoriaDAO;
import co.edu.uco.publiuco.data.dao.ComentarioLectorDAO;
import co.edu.uco.publiuco.data.dao.ComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.EscritorDAO;
import co.edu.uco.publiuco.data.dao.EscritorPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoAdministradorCategoriaDAO;
import co.edu.uco.publiuco.data.dao.EstadoCategoriaDAO;
import co.edu.uco.publiuco.data.dao.EstadoComentarioLectorDAO;
import co.edu.uco.publiuco.data.dao.EstadoEscritorDAO;
import co.edu.uco.publiuco.data.dao.EstadoLectorDAO;
import co.edu.uco.publiuco.data.dao.EstadoObservacionRevisorDAO;
import co.edu.uco.publiuco.data.dao.EstadoPlanDAO;
import co.edu.uco.publiuco.data.dao.EstadoPreferenciaDAO;
import co.edu.uco.publiuco.data.dao.EstadoPublicacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoRevisionDAO;
import co.edu.uco.publiuco.data.dao.EstadoRevisorDAO;
import co.edu.uco.publiuco.data.dao.EstadoSuscripcionDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoAccesoDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoEscritorDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoIdentificacionDAO;
import co.edu.uco.publiuco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.EstadoVersionDAO;
import co.edu.uco.publiuco.data.dao.HistorialAccesoPublicacionDAO;
import co.edu.uco.publiuco.data.dao.LectorDAO;
import co.edu.uco.publiuco.data.dao.ObservacionRevisionDAO;
import co.edu.uco.publiuco.data.dao.PalabraClavePublicacionDAO;
import co.edu.uco.publiuco.data.dao.PerfilDAO;
import co.edu.uco.publiuco.data.dao.PlanCategoriaDAO;
import co.edu.uco.publiuco.data.dao.PlanPublicacionDAO;
import co.edu.uco.publiuco.data.dao.PreferenciaCategoriaDAO;
import co.edu.uco.publiuco.data.dao.PreferenciaEscritorDAO;
import co.edu.uco.publiuco.data.dao.PublicacionDAO;
import co.edu.uco.publiuco.data.dao.ReporteDAO;
import co.edu.uco.publiuco.data.dao.RespuestaDAO;
import co.edu.uco.publiuco.data.dao.RevisionDAO;
import co.edu.uco.publiuco.data.dao.RevisorDAO;
import co.edu.uco.publiuco.data.dao.RevisorRevisionDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionCategoriaDAO;
import co.edu.uco.publiuco.data.dao.SuscripcionPublicacionDAO;
import co.edu.uco.publiuco.data.dao.TipoAccesoDAO;
import co.edu.uco.publiuco.data.dao.TipoComentarioRevisorDAO;
import co.edu.uco.publiuco.data.dao.TipoEscritorDAO;
import co.edu.uco.publiuco.data.dao.TipoIdentificacionDAO;
import co.edu.uco.publiuco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.publiuco.data.dao.TipoReporteDAO;
import co.edu.uco.publiuco.data.dao.TipoRevisionDAO;
import co.edu.uco.publiuco.data.dao.VersionDAO;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.AdministradorCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.CalificacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.CategoriaAdministradorCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.CategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.ComentarioLectorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.ComentarioRevisorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EscritorPublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EscritorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoAdministradorCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoComentarioLectorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoEscritorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoLectorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoObservacionRevisorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoPlanSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoPreferenciaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoPublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoRevisionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoRevisorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoSuscripcionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoTipoAccesoSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoTipoEscritorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoTipoIdentificacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoTipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.EstadoVersionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.HistorialAccesoPublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.LectorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.ObservacionRevisionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PalabraClavePublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PerfilSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PlanCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PlanPublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PreferenciaCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PreferenciaEscritorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.PublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.ReporteSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.RespuestaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.RevisionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.RevisorRevisionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.RevisorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.SuscripcionCategoriaSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.SuscripcionPublicacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoAccesoSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoComentarioRevisorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoEscritorSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoIdentificacionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoReporteSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.TipoRevisionSqlServerDAO;
import co.edu.uco.publiuco.data.dao.relational.sqlserver.VersionSqlServerDAO;

public final class PostgreSqlDAOFactory extends DAOFactory {

	private Connection connection;

	public PostgreSqlDAOFactory() {
		openConection();
	}

	@Override
	protected void openConection() {
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/publiuco", "postgres",
					"admin123");
			UtilSql.connectionIsOpen(connection);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (IllegalArgumentException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION;

			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		} catch (final NullPointerException exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;

			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		} catch (final Exception exception) {
			var userMessage = UtilSqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;

			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}

	}

	@Override
	public void closeConection() {
		try {
			UtilSql.closeConnection(connection);
		} catch (final PubliucoException exception) {
			throw exception;
		}

	}

	@Override
	public void initTransaction() {
		try {
			UtilSql.connectionIsOpen(connection);
			connection.setAutoCommit(false);
		} catch (final PubliucoException exception) {
			throw exception;
		} catch (final SQLException exception) {
			var userMessage = UtilSqlMessages.COMMIT_IS_STARTING_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}

	}

	@Override
	public void commitTransaction() {
		try {
			UtilSql.initCommitIsReady(connection);
			connection.commit();
		} catch (PubliucoException exception) {
			throw exception;
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.CONFIRM_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}

	}

	@Override
	public void cancelTransaction() {
		try {
			UtilSql.initCommitIsReady(connection);
			connection.rollback();
		} catch (PubliucoException exception) {
			throw exception;
		} catch (SQLException exception) {
			var userMessage = UtilSqlMessages.CANCEL_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilSqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;

			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}

	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return new EstadoTipoRelacionInstitucionSqlServerDAO(connection);
	}

	@Override
	public EstadoAdministradorCategoriaDAO getEstadoAdministradorCategoriaDAO() {
		return new EstadoAdministradorCategoriaSqlServerDAO(connection);
	}

	@Override
	public EstadoCategoriaDAO getEstadoCategoriaDAO() {
		return new EstadoCategoriaSqlServerDAO(connection);
	}

	@Override
	public EstadoComentarioLectorDAO getEstadoComentarioLectorDAO() {
		return new EstadoComentarioLectorSqlServerDAO(connection);
	}

	@Override
	public EstadoEscritorDAO getEstadoEscritorDAO() {
		return new EstadoEscritorSqlServerDAO(connection);
	}

	@Override
	public EstadoLectorDAO getEstadoLectorDAO() {
		return new EstadoLectorSqlServerDAO(connection);
	}

	@Override
	public EstadoObservacionRevisorDAO getEstadoObservacionRevisorDAO() {
		return new EstadoObservacionRevisorSqlServerDAO(connection);
	}

	@Override
	public EstadoPlanDAO getEstadoPlanDAO() {
		return new EstadoPlanSqlServerDAO(connection);
	}

	@Override
	public EstadoPreferenciaDAO getEstadoPreferenciaDAO() {
		return new EstadoPreferenciaSqlServerDAO(connection);
	}

	@Override
	public EstadoPublicacionDAO getEstadoPublicacionDAO() {
		return new EstadoPublicacionSqlServerDAO(connection);
	}

	@Override
	public EstadoRevisionDAO getEstadoRevisionDAO() {
		return new EstadoRevisionSqlServerDAO(connection);
	}

	@Override
	public EstadoRevisorDAO getEstadoRevisorDAO() {
		return new EstadoRevisorSqlServerDAO(connection);
	}

	@Override
	public EstadoSuscripcionDAO getEstadoSuscripcionDAO() {
		return new EstadoSuscripcionSqlServerDAO(connection);
	}

	@Override
	public EstadoTipoAccesoDAO getEstadoTipoAccesoDAO() {
		return new EstadoTipoAccesoSqlServerDAO(connection);
	}

	@Override
	public EstadoTipoEscritorDAO getEstadoTipoEscritorDAO() {
		return new EstadoTipoEscritorSqlServerDAO(connection);
	}

	@Override
	public EstadoTipoIdentificacionDAO getEstadoTipoIdentificacionDAO() {
		return new EstadoTipoIdentificacionSqlServerDAO(connection);
	}

	@Override
	public EstadoVersionDAO getEstadoVersionDAO() {
		return new EstadoVersionSqlServerDAO(connection);
	}

	@Override
	public RespuestaDAO getRespuestaDAO() {
		return new RespuestaSqlServerDAO(connection);
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentarioRevisorDAO() {
		return new TipoComentarioRevisorSqlServerDAO(connection);
	}

	@Override
	public TipoReporteDAO getTipoReporteDAO() {
		return new TipoReporteSqlServerDAO(connection);
	}

	@Override
	public TipoRevisionDAO getTipoRevisionDAO() {
		return new TipoRevisionSqlServerDAO(connection);
	}

	@Override
	public TipoAccesoDAO getTipoAccesoDAO() {
		return new TipoAccesoSqlServerDAO(connection);
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		return new TipoEscritorSqlServerDAO(connection);
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return new TipoIdentificacionSqlServerDAO(connection);
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
		return new AdministradorCategoriaSqlServerDAO(connection);
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		return new CategoriaSqlServerDAO(connection);
	}

	@Override
	public EscritorDAO getEscritorDAO() {
		return new EscritorSqlServerDAO(connection);
	}

	@Override
	public LectorDAO getLectorDAO() {
		return new LectorSqlServerDAO(connection);
	}

	@Override
	public RevisorDAO getRevisorDAO() {
		return new RevisorSqlServerDAO(connection);
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO() {
		return new CategoriaAdministradorCategoriaSqlServerDAO(connection);
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		return new PerfilSqlServerDAO(connection);
	}

	@Override
	public PlanCategoriaDAO getPlanCategoriaDAO() {
		return new PlanCategoriaSqlServerDAO(connection);
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		return new PublicacionSqlServerDAO(connection);
	}

	@Override
	public CalificacionDAO getCalificacionDAO() {
		return new CalificacionSqlServerDAO(connection);
	}

	@Override
	public ComentarioLectorDAO getComentarioLectorDAO() {
		return new ComentarioLectorSqlServerDAO(connection);
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacionDAO() {
		return new EscritorPublicacionSqlServerDAO(connection);
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO() {
		return new HistorialAccesoPublicacionSqlServerDAO(connection);
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacionDAO() {
		return new PalabraClavePublicacionSqlServerDAO(connection);
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacionDAO() {
		return new PlanPublicacionSqlServerDAO(connection);
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		return new PreferenciaCategoriaSqlServerDAO(connection);
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		return new PreferenciaEscritorSqlServerDAO(connection);
	}

	@Override
	public SuscripcionCategoriaDAO getSuscripcionCategoriaDAO() {
		return new SuscripcionCategoriaSqlServerDAO(connection);
	}

	@Override
	public VersionDAO getVersionDAO() {
		return new VersionSqlServerDAO(connection);
	}

	@Override
	public ReporteDAO getReporteDAO() {
		return new ReporteSqlServerDAO(connection);
	}

	@Override
	public RevisionDAO getRevisionDAO() {
		return new RevisionSqlServerDAO(connection);
	}

	@Override
	public SuscripcionPublicacionDAO getSuscripcionPublicacionDAO() {
		return new SuscripcionPublicacionSqlServerDAO(connection);
	}

	@Override
	public RevisorRevisionDAO getRevisorRevisionDAO() {
		return new RevisorRevisionSqlServerDAO(connection);
	}

	@Override
	public ComentarioRevisorDAO getComentarioRevisorDAO() {
		return new ComentarioRevisorSqlServerDAO(connection);
	}

	@Override
	public ObservacionRevisionDAO getObservacionRevisionDAO() {
		return new ObservacionRevisionSqlServerDAO(connection);
	}

}
