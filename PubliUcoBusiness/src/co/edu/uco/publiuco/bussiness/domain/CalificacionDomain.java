package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CalificacionDomain {
	
	private static final CalificacionDomain DEFAULT_OBJECT = new CalificacionDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private LocalDate fechaCalificacion;
	private int calificacion;
	
	private CalificacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setFechaCalificacion(UtilDate.DEFAULT_DATE);
		setCalificacion(UtilNumber.ZERO);
	}

	public CalificacionDomain(UUID identificador, LectorDomain lector, PublicacionDomain publicacion,
			LocalDate fechaCalificacion, int calificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
		setCalificacion(calificacion);
	}
	
	public static CalificacionDomain getDefaultObject() {
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

	public final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
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
