package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CalificacionDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private LocalDate fechaCalificacion;
	private int calificacion;
	
	public CalificacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setCalificacion(UtilNumber.ZERO);
	}

	public CalificacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion,
			LocalDate fechaCalificacion, int calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	
	public static CalificacionDTO create() {
		return new CalificacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final CalificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final LectorDTO getLector() {
		return lector;
	}

	public final CalificacionDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final CalificacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	public final CalificacionDTO setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
		return this;
	}

	public final int getCalificacion() {
		return calificacion;
	}

	public final CalificacionDTO setCalificacion(final int calificacion) {
		this.calificacion = UtilNumber.getUtilNumber().getDefault(calificacion);
		return this;
	}

}