package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CalificacionEntity {
	
	private static final CalificacionEntity DEFAULT_OBJECT = new CalificacionEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private LocalDate fechaCalificacion;
	private int calificacion;
	
	private CalificacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setCalificacion(UtilNumber.ZERO);
	}

	public CalificacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion, LocalDate fechaCalificacion, int calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	
	public static CalificacionEntity getDefaultObject() {
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

	public final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}

	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	public final LocalDate getFechaCalificacion() {
		return fechaCalificacion;
	}

	private final void setFechaCalificacion(final LocalDate fechaCalificacion) {
		this.fechaCalificacion = UtilDate.getDefault(fechaCalificacion);
	}

	public final int getCalificacion() {
		return calificacion;
	}

	private final void setCalificacion(final int calificacion) {
		this.calificacion = UtilNumber.getUtilNumber().getDefault(calificacion);
	}

}
