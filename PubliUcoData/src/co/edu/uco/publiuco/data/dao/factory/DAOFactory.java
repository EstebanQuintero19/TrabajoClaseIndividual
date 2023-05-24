package co.edu.uco.publiuco.data.dao.factory;

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
import co.edu.uco.publiuco.data.dao.factory.relational.postgresql.PostgreSqlDAOFactory;
import co.edu.uco.publiuco.data.dao.factory.relational.sqlserver.SqlServerDAOFactory;

public abstract class DAOFactory {

	public static DAOFactory getFactory(final Factory factory) {

		DAOFactory daoFactory;

		switch (factory) {
		case SQLSERVER: {
			daoFactory = new SqlServerDAOFactory();
			break;
		}
		case POSTGRESQL: {
			daoFactory = new PostgreSqlDAOFactory();
			break;
		}
		default:
			throw new IllegalArgumentException("Not implemented yet");
		}

		return daoFactory;
	}

	protected abstract void openConection();

	public abstract void closeConection();

	public abstract void initTransaction();

	public abstract void commitTransaction();

	public abstract void cancelTransaction();

	public abstract EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO();

	public abstract EstadoAdministradorCategoriaDAO getEstadoAdministradorCategoriaDAO();

	public abstract EstadoCategoriaDAO getEstadoCategoriaDAO();

	public abstract EstadoComentarioLectorDAO getEstadoComentarioLectorDAO();

	public abstract EstadoEscritorDAO getEstadoEscritorDAO();

	public abstract EstadoLectorDAO getEstadoLectorDAO();

	public abstract EstadoObservacionRevisorDAO getEstadoObservacionRevisorDAO();

	public abstract EstadoPlanDAO getEstadoPlanDAO();

	public abstract EstadoPreferenciaDAO getEstadoPreferenciaDAO();

	public abstract EstadoPublicacionDAO getEstadoPublicacionDAO();

	public abstract EstadoRevisionDAO getEstadoRevisionDAO();

	public abstract EstadoRevisorDAO getEstadoRevisorDAO();

	public abstract EstadoSuscripcionDAO getEstadoSuscripcionDAO();

	public abstract EstadoTipoAccesoDAO getEstadoTipoAccesoDAO();

	public abstract EstadoTipoEscritorDAO getEstadoTipoEscritorDAO();

	public abstract EstadoTipoIdentificacionDAO getEstadoTipoIdentificacionDAO();

	public abstract EstadoVersionDAO getEstadoVersionDAO();

	public abstract RespuestaDAO getRespuestaDAO();

	public abstract TipoComentarioRevisorDAO getTipoComentarioRevisorDAO();

	public abstract TipoReporteDAO getTipoReporteDAO();

	public abstract TipoRevisionDAO getTipoRevisionDAO();

	public abstract TipoAccesoDAO getTipoAccesoDAO();

	public abstract TipoEscritorDAO getTipoEscritorDAO();

	public abstract TipoIdentificacionDAO getTipoIdentificacionDAO();

	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();

	public abstract AdministradorCategoriaDAO getAdministradorCategoriaDAO();

	public abstract CategoriaDAO getCategoriaDAO();

	public abstract EscritorDAO getEscritorDAO();

	public abstract LectorDAO getLectorDAO();

	public abstract RevisorDAO getRevisorDAO();

	public abstract CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO();

	public abstract PerfilDAO getPerfilDAO();

	public abstract PlanCategoriaDAO getPlanCategoriaDAO();

	public abstract PublicacionDAO getPublicacionDAO();

	public abstract CalificacionDAO getCalificacionDAO();

	public abstract ComentarioLectorDAO getComentarioLectorDAO();

	public abstract EscritorPublicacionDAO getEscritorPublicacionDAO();

	public abstract HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO();

	public abstract PalabraClavePublicacionDAO getPalabraClavePublicacionDAO();

	public abstract PlanPublicacionDAO getPlanPublicacionDAO();

	public abstract PreferenciaCategoriaDAO getPreferenciaCategoriaDAO();

	public abstract PreferenciaEscritorDAO getPreferenciaEscritorDAO();

	public abstract SuscripcionCategoriaDAO getSuscripcionCategoriaDAO();

	public abstract VersionDAO getVersionDAO();

	public abstract ReporteDAO getReporteDAO();

	public abstract RevisionDAO getRevisionDAO();

	public abstract SuscripcionPublicacionDAO getSuscripcionPublicacionDAO();

	public abstract RevisorRevisionDAO getRevisorRevisionDAO();

	public abstract ComentarioRevisorDAO getComentarioRevisorDAO();

	public abstract ObservacionRevisionDAO getObservacionRevisionDAO();

}
