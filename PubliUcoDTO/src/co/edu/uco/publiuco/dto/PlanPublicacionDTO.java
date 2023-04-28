package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PlanPublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	
	public PlanPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setPrecio(UtilNumber.ZERO);
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
	}

	public PlanPublicacionDTO(UUID identificador, PublicacionDTO publicacion, int precio, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
	}
	
	public static PlanPublicacionDTO create() {
		return new PlanPublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PlanPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final PlanPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final int getPrecio() {
		return precio;
	}

	public final PlanPublicacionDTO setPrecio(final int precio) {
		this.precio = UtilNumber.getUtilNumber().getDefault(precio);
		return this;
	}

	public final LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public final PlanPublicacionDTO setFechaDesde(final LocalDate fechaDesde) {
		this.fechaDesde = UtilDate.getDefault(fechaDesde);
		return this;
	}

	public final LocalDate getFechaHasta() {
		return fechaHasta;
	}

	public final PlanPublicacionDTO setFechaHasta(final LocalDate fechaHasta) {
		this.fechaHasta = UtilDate.getDefault(fechaHasta);
		return this;
	}
}