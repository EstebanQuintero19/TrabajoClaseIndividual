package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PlanCategoriaEntity {
	
	private static final PlanCategoriaEntity DEFAULT_OBJECT = new PlanCategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	
	private PlanCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntity.getDefaultObject());
		setPrecio(UtilNumber.ZERO);
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
	}

	public PlanCategoriaEntity(UUID identificador, CategoriaEntity categoria, int precio, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
	}
	
	public static PlanCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntity getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
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
