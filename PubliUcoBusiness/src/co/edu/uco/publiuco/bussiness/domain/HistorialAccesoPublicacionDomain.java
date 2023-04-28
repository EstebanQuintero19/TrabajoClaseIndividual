package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class HistorialAccesoPublicacionDomain {

	private static final HistorialAccesoPublicacionDomain DEFAULT_OBJECT = new HistorialAccesoPublicacionDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private LocalDate fechaAcceso;

	private HistorialAccesoPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setFechaAcceso(UtilDate.DEFAULT_DATE);
	}

	public HistorialAccesoPublicacionDomain(UUID identificador, LectorDomain lector, PublicacionDomain publicacion,
			LocalDate fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}

	public static HistorialAccesoPublicacionDomain getDefaultObject() {
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

	public final LocalDate getFechaAcceso() {
		return fechaAcceso;
	}

	private final void setFechaAcceso(final LocalDate fechaAcceso) {
		this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
	}

}