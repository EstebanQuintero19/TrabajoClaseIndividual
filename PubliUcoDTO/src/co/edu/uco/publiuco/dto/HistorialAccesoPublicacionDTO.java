package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class HistorialAccesoPublicacionDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private LocalDate fechaAcceso;
	
	public HistorialAccesoPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setFechaAcceso(UtilDate.DEFAULT_DATE);
	}

	public HistorialAccesoPublicacionDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion,
			LocalDate fechaAcceso) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaAcceso(fechaAcceso);
	}
	
	public static HistorialAccesoPublicacionDTO create() {
		return new HistorialAccesoPublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final HistorialAccesoPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final LectorDTO getLector() {
		return lector;
	}

	public final HistorialAccesoPublicacionDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final HistorialAccesoPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final LocalDate getFechaAcceso() {
		return fechaAcceso;
	}

	public final HistorialAccesoPublicacionDTO setFechaAcceso(final LocalDate fechaAcceso) {
		this.fechaAcceso = UtilDate.getDefault(fechaAcceso);
		return this;
	}

}