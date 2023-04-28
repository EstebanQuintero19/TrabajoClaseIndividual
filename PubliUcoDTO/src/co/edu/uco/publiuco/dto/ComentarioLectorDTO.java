package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String comentario;
	private LocalDate fechaCalificacion;
	private EstadoComentarioLectorDTO estado;
	
	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(ComentarioLectorDTO.create());
		setComentario(UtilText.EMPTY);
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoComentarioLectorDTO.create());
	}
	

	public ComentarioLectorDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion,
			ComentarioLectorDTO comentarioPadre, String comentario, LocalDate fechaCalificacion,
			EstadoComentarioLectorDTO estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}
	
	public static ComentarioLectorDTO create() {
		return new ComentarioLectorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final ComentarioLectorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final LectorDTO getLector() {
		return lector;
	}

	public final ComentarioLectorDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final ComentarioLectorDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}

	public final ComentarioLectorDTO setComentarioPadre(final ComentarioLectorDTO comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		return this;
	}

	public final String getComentario() {
		return comentario;
	}

	public final ComentarioLectorDTO setComentario(final String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		return this;
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	public final ComentarioLectorDTO setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
		return this;
	}

	public final EstadoComentarioLectorDTO getEstado() {
		return estado;
	}

	public final ComentarioLectorDTO setEstado(final EstadoComentarioLectorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoComentarioLectorDTO.create());
		return this;
	}

}