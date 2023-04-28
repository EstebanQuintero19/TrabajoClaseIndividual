package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ComentarioLectorEntity {

	private static final ComentarioLectorEntity DEFAULT_OBJECT = new ComentarioLectorEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private ComentarioLectorEntity comentarioPadre;
	private String comentario;
	private LocalDate fechaCalificacion;
	private EstadoComentarioLectorEntity estado;

	private ComentarioLectorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setComentarioPadre(ComentarioLectorEntity.getDefaultObject());
		setComentario(UtilText.EMPTY);
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoComentarioLectorEntity.getDefaultObject());
	}

	public ComentarioLectorEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion,
			ComentarioLectorEntity comentarioPadre, String comentario, LocalDate fechaCalificacion,
			EstadoComentarioLectorEntity estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public static ComentarioLectorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorEntity getLector() {
		return lector;
	}

	private final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}

	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	public final ComentarioLectorEntity getComentarioPadre() {
		return comentarioPadre;
	}

	private final void setComentarioPadre(final ComentarioLectorEntity comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorEntity.getDefaultObject());
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

	public final EstadoComentarioLectorEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoComentarioLectorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorEntity.getDefaultObject());
	}
}
