package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PlanPublicacionDomain {

	private static final PlanPublicacionDomain DEFAULT_OBJECT = new PlanPublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;

	private PlanPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setPrecio(UtilNumber.ZERO);
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
	}

	public PlanPublicacionDomain(UUID identificador, PublicacionDomain publicacion, int precio, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
	}

	public static PlanPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}

	public final int getPrecio() {
		return precio;
	}

	private final void setPrecio(final int precio) {
		this.precio = UtilNumber.getUtilNumber().getDefault(precio);
	}

	public final LocalDate getFechaDesde() {
		return fechaDesde;
	}

	private final void setFechaDesde(final LocalDate fechaDesde) {
		this.fechaDesde = UtilDate.getDefault(fechaDesde);
	}

	public final LocalDate getFechaHasta() {
		return fechaHasta;
	}

	private final void setFechaHasta(final LocalDate fechaHasta) {
		this.fechaHasta = UtilDate.getDefault(fechaHasta);
	}
}