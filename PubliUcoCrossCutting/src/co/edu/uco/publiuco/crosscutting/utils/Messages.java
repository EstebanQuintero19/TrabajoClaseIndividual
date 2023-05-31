package co.edu.uco.publiuco.crosscutting.utils;

public final class Messages {

	private Messages() {
	}

	public static final class UtilSqlMessages {

		private UtilSqlMessages() {
		}

		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "No es posible validar si una conexion esta abierta cuando se encuentra nula";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION = "Se ha presentado un excepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SECURITY_EXCEPTION = "Se ha presentado un SecurityExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION = "Se ha presentado un NullPointerExcepcion de tipo IlegalArgumentException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_USER_MESSAGE = "Se ha presentado un problema tratando de cerrar la conexion con la fuente de informacion estaba o no activa";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String CONNECTION_IS_CLOSE_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la conexion estaba abierta. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_USER_MESSAGE = "Se ha presentado un problema tratando de validar si una transaccion esta activa o no";
		public static final String COMMIT_IS_STARTED_TECHNICAL_AUTOCOMMIT = "No es posible validar si se ha iniciado la transaccion, verificar si esta se encuentra en True";
		public static final String COMMIT_IS_STARTED_TECHNICAL_EXCEPTION = "Se ha presentado un excepcion de tipo Exception tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTED_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar si la transaccion esta activa. Por favor valida la traza de errores completa de la excepcion presentada...";
		public static final String COMMIT_IS_STARTING_USER_MESSAGE = "Se ha presentado un problema tratando de validar la transaccion inicial";
		public static final String CONFIRM_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la confirmacion de la transaccion";
		public static final String CANCEL_COMMIT_USER_MESSAGE = "Se ha presentado un problema tratando de validar la cancelacion de transaccion";
		public static final String COMMIT_TECHNICAL_SQL_EXCEPTION = "Se ha presentado un excepcion de tipo SQLException tratando de validar la transaccion. Por favor valida la traza de errores completa de la excepcion presentada...";
	}

	public static final class EstadoTipoRelacionInstitucionFacadeImplMessages {

		private EstadoTipoRelacionInstitucionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de relacion para una institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class AdministradorCategoriaFacadeImplMessages {

		private AdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del estado del administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un AdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CalificacionFacadeImplMessages {

		private CalificacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la calificacion de la publicación. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CalificacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CategoriaAdministradorCategoriaFacadeImplMessages {

		private CategoriaAdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la categoria de un administrador de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CategoriaAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CategoriaFacadeImplMessages {

		private CategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar una nueva CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar una CategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class ComentarioLectorFacadeImplMessages {

		private ComentarioLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del comentario del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un ComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class ComentarioRevisorFacadeImplMessages {

		private ComentarioRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del comentario del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un ComentarioRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EscritorFacadeImplMessages {

		private EscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un EscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EscritorPublicacionFacadeImplMessages {

		private EscritorPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del escritor de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un EscritorPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoAdministradorCategoriaFacadeImplMessages {

		private EstadoAdministradorCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un administrador de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoAdministradorCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoCategoriaFacadeImplMessages {

		private EstadoCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de una categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoComentarioLectorFacadeImplMessages {

		private EstadoComentarioLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un comentario de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un comentario de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoComentarioLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoEscritorFacadeImplMessages {

		private EstadoEscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoLectorFacadeImplMessages {

		private EstadoLectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoLectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de un lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoLectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoObservacionRevisorFacadeImplMessages {

		private EstadoObservacionRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la observacion del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoObservacionRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la observacion del revisor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoObservacionRevisorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPlanFacadeImplMessages {

		private EstadoPlanFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del plan. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPlanDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del plan. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPlanDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPreferenciaFacadeImplMessages {

		private EstadoPreferenciaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la preferencia. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPreferenciaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la preferencia. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPreferenciaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoPublicacionFacadeImplMessages {

		private EstadoPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoRevisionFacadeImplMessages {

		private EstadoRevisionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoRevisorFacadeImplMessages {

		private EstadoRevisorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoSuscripcionFacadeImplMessages {

		private EstadoSuscripcionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la suscripcion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoSuscripcionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la suscripcion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoSuscripcionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoTipoAccesoFacadeImplMessages {

		private EstadoTipoAccesoFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoTipoEscritorFacadeImplMessages {

		private EstadoTipoEscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoTipoIdentificacionFacadeImplMessages {

		private EstadoTipoIdentificacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado del tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoTipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado del tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoTipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class EstadoVersionFacadeImplMessages {

		private EstadoVersionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de la version. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo EstadoVersionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del estado de la version. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un EstadoVersionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class HistorialAccesoPublicacionFacadeImplMessages {

		private HistorialAccesoPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo historial de acceso a la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo HistorialAccesoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del nuevo historial de acceso a la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un HistorialAccesoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del historial de acceso a la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un HistorialAccesoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del historial de acceso a la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un HistorialAccesoPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class LectorFacadeImplMessages {

		private LectorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo LectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un LectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un LectorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del lector. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un LectorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class ObservacionRevisionFacadeImplMessages {

		private ObservacionRevisionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva observacion de revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo ObservacionRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la observacion de revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un ObservacionRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la observacion de revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un ObservacionRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la observacion de revision. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un ObservacionRevisionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PalabraClavePublicacionFacadeImplMessages {

		private PalabraClavePublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva palabra clave de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PalabraClavePublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la palabra clave de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PalabraClavePublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la palabra clave de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PalabraClavePublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la palabra clave de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PalabraClavePublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PerfilFacadeImplMessages {

		private PerfilFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo perfil. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PerfilDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del perfil. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PerfilDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del perfil. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PerfilDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del perfil. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PerfilDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PlanCategoriaFacadeImplMessages {

		private PlanCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo plan de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PlanCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del plan de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PlanCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del plan de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PlanCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del plan de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PlanCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PlanPublicacionFacadeImplMessages {

		private PlanPublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo plan de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PlanPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del plan de  la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PlanPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del plan de  la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PlanPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del plan de  la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PlanPublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PreferenciaCategoriaFacadeImplMessages {

		private PreferenciaCategoriaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva preferencia de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PreferenciaCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la preferencia de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PreferenciaCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la preferencia de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PreferenciaCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la preferencia de categoria. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PreferenciaCategoriaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PreferenciaEscritorFacadeImplMessages {

		private PreferenciaEscritorFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva preferencia de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PreferenciaEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la preferencia de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PreferenciaEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la preferencia de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PreferenciaEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la preferencia de escritor. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PreferenciaEscritorDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class TipoAccesoFacadeImplMessages {

		private TipoAccesoFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo TipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del tipo acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un TipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del tipo acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un TipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del tipo acceso. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un TipoAccesoDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class TipoRelacionInstitucionFacadeImplMessages {

		private TipoRelacionInstitucionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo de relacion con la institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo TipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del tipo de relacion con la institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un TipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del tipo de relacion con la institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un TipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del tipo de relacion con la institucion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un TipoRelacionInstitucionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class TipoIdentificacionFacadeImplMessages {

		private TipoIdentificacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo TipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un TipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un TipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del tipo de identificacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un TipoIdentificacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class PublicacionFacadeImplMessages {

		private PublicacionFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo PublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un PublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de modificar un PublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion de la publicacion. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de eliminar un PublicacionDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class RespuestaFacadeImplMessages {

		private RespuestaFacadeImplMessages() {
		}

		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva respuesta. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de registrar un nuevo RespuestaDTO. Por favor valide la traza completa de la excepcion presentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la respuesta. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepcion no conocido al momento de listar un RespuestaDTO. Por favor valide la traza completa de la excepcion presentada...";

	}

	public static final class CommonControllerMessages {

		private CommonControllerMessages() {
		}

		public static final String REGISTER_FAILED = "Sea presentado un problema inesperado. Por favor intente de nuevo y si el problema persiste comuniquese con el administrador de la aplicacion.";

	}

	public static final class EstadoTipoRelacionInstitucionControllerMessages {

		private EstadoTipoRelacionInstitucionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado tipo relacion institucion se ha regitrado de forma satisfactoria";

	}

	public static final class CategoriaControllerMessages {

		private CategoriaControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "La nueva categoria se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoComentarioLectorControllerMessages {

		private EstadoComentarioLectorControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado comentario lector se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoLectorControllerMessages {

		private EstadoLectorControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado lector se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoPublicacionControllerMessages {

		private EstadoPublicacionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado publicacion se ha regitrado de forma satisfactoria";

	}

	public static final class LectorControllerMessages {

		private LectorControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo lector se ha regitrado de forma satisfactoria";

	}

	public static final class PublicacionControllerMessages {

		private PublicacionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "La nueva publicacion se ha regitrado de forma satisfactoria";

	}

	public static final class RespuestaControllerMessages {

		private RespuestaControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "La nueva respuesta se ha regitrado de forma satisfactoria";

	}

	public static final class TipoAccesoControllerMessages {

		private TipoAccesoControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo tipo acceso se ha regitrado de forma satisfactoria";

	}

	public static final class TipoIdentificacionControllerMessages {

		private TipoIdentificacionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo tipo identificacion se ha regitrado de forma satisfactoria";

	}

	public static final class TipoRelacionInstitucionControllerMessages {

		private TipoRelacionInstitucionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo tipo relacion institucion se ha regitrado de forma satisfactoria";

	}

	public static final class ComentarioLectorControllerMessages {

		private ComentarioLectorControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo comentario lector se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoTipoAccesoControllerMessages {

		private EstadoTipoAccesoControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado de tipo de acceso se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoTipoIdentificacionControllerMessages {

		private EstadoTipoIdentificacionControllerMessages() {
		}

		public static final String REGISTER_NEW_SUCESS = "El nuevo estado de tipo de identificacion se ha regitrado de forma satisfactoria";

	}

	public static final class EstadoTipoRelacionInstitucionValidationMessages {

		private EstadoTipoRelacionInstitucionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado tipo relacion institucion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado tipo relacion institucion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado del tipo relacion institucion";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado tipo relacion institucion vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado del tipo relacion institucion";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado tipo relacion institucion vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado del tipo relacion institucion";

	}

	public static final class EstadoComentarioLectorValidationMessages {

		private EstadoComentarioLectorValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado comentario lector con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado comentario lector vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado comentario lector";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado comentario lector vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado comentario lector";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado comentario lector vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado comentario lector";

	}

	public static final class EstadoLectorValidationMessages {

		private EstadoLectorValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado lector con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado lector vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado lector";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado lector vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado lector";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado lector vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado lector";

	}

	public static final class EstadoPublicacionValidationMessages {

		private EstadoPublicacionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado publicacion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado publicacion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado publicacion";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado publicacion vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado publicacion";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado publicacion vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado publicacion";

	}

	public static final class EstadoTipoAccesoValidationMessages {

		private EstadoTipoAccesoValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado tipo acceso con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado tipo acceso vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado tipo acceso";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado tipo acceso vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado tipo acceso";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado tipo acceso vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado tipo acceso";

	}

	public static final class EstadoTipoIdentificacionValidationMessages {

		private EstadoTipoIdentificacionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo estado tipo identificacion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del estado tipo identificacion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del estado tipo identificacion";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del estado tipo identificacion vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del estado tipo identificacion";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del estado tipo identificacion vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del estado tipo identificacion";

	}

	public static final class LectorValidationMessages {

		private LectorValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo lector con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del lector vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del lector";
		public static final String PRIMER_NOMBRE_IS_NULL = "No es posible continuar con el primer nombre del lector vacio";
		public static final String PRIMER_NOMBRE_IS_DEFAULT = "No es posible tener el primer nombre por defecto del lector";
		public static final String SEGUNDO_NOMBRE_IS_NULL = "No es posible continuar con el segundo nombre del lector vacio";
		public static final String SEGUNDO_NOMBRE_IS_DEFAULT = "No es posible tener el segundo nombre por defecto del lector";
		public static final String PRIMER_APELLIDO_IS_NULL = "No es posible continuar con el primer apellido del lector vacio";
		public static final String PRIMER_APELLIDO_IS_DEFAULT = "No es posible tener el primer apellido por defecto del lector";
		public static final String SEGUNDO_APELLIDO_IS_NULL = "No es posible continuar con el segundo apellido del lector vacio";
		public static final String SEGUNDO_APELLIDO_IS_DEFAULT = "No es posible tener el segundo apellido por defecto del lector";
		public static final String NUMERO_IDENTIFICACION_IS_NULL = "No es posible continuar con el numero de identificacion del lector vacio";
		public static final String NUMERO_IDENTIFICACION_IS_DEFAULT = "No es posible tener el numero de identificacion por defecto del lector";
		public static final String CORREO_IS_NULL = "No es posible continuar con el correo del lector vacio";
		public static final String CORREO_IS_DEFAULT = "No es posible tener el correo por defecto del lector";
		public static final String INDICADOR_PAIS_IS_NULL = "No es posible continuar con el indicador del pais del lector vacio";
		public static final String INDICADOR_PAIS_IS_DEFAULT = "No es posible tener el indicador del pais por defecto del lector";
		public static final String NUMERO_TELEFONO_IS_NULL = "No es posible continuar con el numero de telefono del lector vacio";
		public static final String NUMERO_TELEFONO_IS_DEFAULT = "No es posible tener el numero de telefono< por defecto del lector";

	}

	public static final class PublicacionValidationMessages {

		private PublicacionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar una nueva publicacion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador de la publicacion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto de la publicacion";

	}

	public static final class CategoriaValidationMessages {

		private CategoriaValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar una nueva categoria con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador de la categoria vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto de la categoria";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre de la categoria vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto de la categoria";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion de la categoria vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto de la categoria";

	}

	public static final class ComentarioLectorValidationMessages {

		private ComentarioLectorValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo comentario del lector con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del comentario del lector vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del comentario del lector";
		public static final String COMENTARIO_IS_NULL = "No es posible continuar con el comentario del comentario del lector vacio";
		public static final String COMENTARIO_IS_DEFAULT = "No es posible tener el comentario por defecto del comentario del lector";
		public static final String FECHA_CALIFICACION_IS_NULL = "No es posible continuar con la fecha de calificacion del comentario del lector vacio";
		public static final String FECHA_CALIFICACION_IS_DEFAULT = "No es posible tener la fecha de la calificacion por defecto del comentario del lector";

	}

	public static final class RespuestaValidationMessages {

		private RespuestaValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar una nueva respuesta con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador de la respuesta vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto de la respuesta";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre de la respuesta vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto de la respuesta";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion de la respuesta vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto de la respuesta";

	}

	public static final class TipoAccesoValidationMessages {

		private TipoAccesoValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo tipo de acceso con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del tipo acceso vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del tipo acceso";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del tipo acceso vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del tipo acceso";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del tipo acceso vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del tipo acceso";

	}

	public static final class TipoIdentificacionValidationMessages {

		private TipoIdentificacionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo tipo de identificacion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del tipo de identificacion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del tipo de identificacion";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del tipo de identificacion vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del tipo de identificacion";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del tipo de identificacion vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del tipo de identificacion";

	}

	public static final class TipoRelacionInstitucionValidationMessages {

		private TipoRelacionInstitucionValidationMessages() {
		}

		public static final String GENERAL = "No es posible registrar un nuevo tipo de relacion de institucion con los datos ingresados";
		public static final String IDENTIFICADOR_IS_NULL = "No es posible continuar con el identificador del tipo de relacion de institucion vacio";
		public static final String IDENTIFICADOR_IS_DEFAULT = "No es posible tener el identificador por defecto del tipo de relacion de institucion";
		public static final String NOMBRE_IS_NULL = "No es posible continuar con el nombre del tipo de relacion de institucion vacio";
		public static final String NOMBRE_IS_DEFAULT = "No es posible tener el nombre por defecto del tipo de relacion de institucion";
		public static final String DESCRIPCION_IS_NULL = "No es posible continuar con la descrpcion del tipo de relacion de institucion vacio";
		public static final String DESCRIPCION_IS_DEFAULT = "No es posible tener la descripcion por defecto del tipo de relacion de institucion";

	}

	public static final class EstadoTipoRelacionInstitucionSqlServerDAOMessages {

		private EstadoTipoRelacionInstitucionSqlServerDAOMessages() {
		}

		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado de tipo relacion institucion";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo estado de tipo relacion institucion";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String READ_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del estado de tipo relacion institucion";
		public static final String READ_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo read de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String READ_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo estado de tipo relacion institucion";
		public static final String READ_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo executeQuery de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String SET_PARAMETERS_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del estado de tipo relacion institucion";
		public static final String SET_PARAMETERS_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo read de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String SET_PARAMETERS_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo estado de tipo relacion institucion";
		public static final String SET_PARAMETERS_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo read de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String EXECUTE_QUERY_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del estado de tipo relacion institucion";
		public static final String EXECUTE_QUERY_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo executeQuery de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String EXECUTE_QUERY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo estado de tipo relacion institucion";
		public static final String EXECUTE_QUERY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo executeQuery de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

	}

	public static final class TipoRelacionInstitucionSqlServerDAOMessages {

		private TipoRelacionInstitucionSqlServerDAOMessages() {
		}

		public static final String CREATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo relacion institucion";
		public static final String CREATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo create de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String CREATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo tipo relacion institucion";
		public static final String CREATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo create de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String READ_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del tipo relacion institucion";
		public static final String READ_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo read de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String READ_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo tipo relacion institucion";
		public static final String READ_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo executeQuery de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String UPDATE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de actualizar la informacion del tipo relacion institucion";
		public static final String UPDATE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo update de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String UPDATE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de actualizar la informacion del nuevo tipo relacion institucion";
		public static final String UPDATE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperado dentro del metodo actualizar de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String DELETE_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la informacion del tipo relacion institucion";
		public static final String DELETE_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo delete de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String DELETE_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de eliminar la informacion del nuevo tipo relacion institucion";
		public static final String DELETE_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperado dentro del metodo delete de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String SET_PARAMETERS_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del tipo relacion institucion";
		public static final String SET_PARAMETERS_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo read de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String SET_PARAMETERS_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo tipo relacion institucion";
		public static final String SET_PARAMETERS_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo read de la clase EstadoTipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String EXECUTE_QUERY_SQL_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de consultar la informacion del estado de tipo relacion institucion";
		public static final String EXECUTE_QUERY_SQL_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema de tipo SQLException dentro del metodo executeQuery de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";
		public static final String EXECUTE_QUERY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema inesperado tratando de consultar la informacion del nuevo tipo relacion institucion";
		public static final String EXECUTE_QUERY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado un problema inesperadp dentro del metodo executeQuery de la clase TipoRelacionInstitucionSqlServerDAO. Por favor revise la traza completa del error";

	}

}
