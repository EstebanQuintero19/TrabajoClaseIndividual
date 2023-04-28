package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PlanCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	
	public PlanCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);;
		setCategoria(CategoriaDTO.create());
		setPrecio(UtilNumber.ZERO);
		setFechaDesde(UtilDate.DEFAULT_DATE);
		setFechaHasta(UtilDate.DEFAULT_DATE);
	}

	public PlanCategoriaDTO(UUID identificador, CategoriaDTO categoria, int precio, LocalDate fechaDesde,
			LocalDate fechaHasta) {
		super();
		setIdentificador(identificador);;
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaHasta(fechaHasta);
	}
	
	public static PlanCategoriaDTO create() {
		return new PlanCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PlanCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaDTO getCategoria() {
		return categoria;
	}

	public final PlanCategoriaDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}

	public final int getPrecio() {
		return precio;
	}

	public final PlanCategoriaDTO setPrecio(final int precio) {
		this.precio = UtilNumber.getUtilNumber().getDefault(precio);
		return this;
	}

	public final LocalDate getFechaDesde() {
		return fechaDesde;
	}

	public final PlanCategoriaDTO setFechaDesde(final LocalDate fechaDesde) {
		this.fechaDesde = UtilDate.getDefault(fechaDesde);
		return this;
	}

	public final LocalDate getFechaHasta() {
		return fechaHasta;
	}

	public final PlanCategoriaDTO setFechaHasta(final LocalDate fechaHasta) {
		this.fechaHasta = UtilDate.getDefault(fechaHasta);
		return this;
	}

}