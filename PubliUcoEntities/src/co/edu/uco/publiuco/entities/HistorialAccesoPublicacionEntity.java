package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class HistorialAccesoPublicacionEntity {

	private static final HistorialAccesoPublicacionEntity DEFAULT_OBJECT = new HistorialAccesoPublicacionEntity();
	private UUID identificador;
	private LectorEntity lector;
	private PublicacionEntity publicacion;
	private LocalDate fechaAcceso;

	private HistorialAccesoPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setFechaAcceso(UtilDate.DEFAULT_DATE);
	}

	public HistorialAccesoPublicacionEntity(UUID identificador, LectorEntity lector, PublicacionEntity publicacion,
			LocalDate fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}

	public static HistorialAccesoPublicacionEntity getDefaultObject() {
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

	public final LocalDate getFechaAcceso() {
		return fechaAcceso;
	}

	private final void setFechaAcceso(final LocalDate fechaAcceso) {
		this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
	}

}
