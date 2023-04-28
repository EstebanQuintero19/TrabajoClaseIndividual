package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ComentarioLectorDomain {
	
	private static final ComentarioLectorDomain DEFAULT_OBJECT = new ComentarioLectorDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private ComentarioLectorDomain comentarioPadre;
	private String comentario;
	private LocalDate fechaCalificacion;
	private EstadoComentarioLectorDomain estado;
	
	private ComentarioLectorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setComentarioPadre(ComentarioLectorDomain.getDefaultObject());
		setComentario(UtilText.EMPTY);
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoComentarioLectorDomain.getDefaultObject());
	}
	

	public ComentarioLectorDomain(UUID identificador, LectorDomain lector, PublicacionDomain publicacion,
			ComentarioLectorDomain comentarioPadre, String comentario, LocalDate fechaCalificacion,
			EstadoComentarioLectorDomain estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}
	
	public static ComentarioLectorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorDomain getLector() {
		return lector;
	}

	private final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}

	public final ComentarioLectorDomain getComentarioPadre() {
		return comentarioPadre;
	}

	private final void setComentarioPadre(final ComentarioLectorDomain comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDomain.getDefaultObject());
	}

	public final String getComentario() {
		return comentario;
	}

	private final void setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	private final void setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
	}

	public final EstadoComentarioLectorDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoComentarioLectorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorDomain.getDefaultObject());
	}
}