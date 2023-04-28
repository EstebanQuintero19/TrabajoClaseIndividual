package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PublicacionDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private TipoAccesoDTO tipoAcceso;
	private LocalDate fechaPublicacion;
	private EstadoPublicacionDTO estado;
	
	public PublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDTO.create());
		setTipoAcceso(TipoAccesoDTO.create());
		setFechaPublicacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoPublicacionDTO.create());
	}
	
	public PublicacionDTO(UUID identificador, CategoriaDTO categoria, TipoAccesoDTO tipoAcceso,
			LocalDate fechaPublicacion, EstadoPublicacionDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechaPublicacion(fechaPublicacion);
		setEstado(estado);
	}
	
	public static PublicacionDTO create() {
		return new PublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaDTO getCategoria() {
		return categoria;
	}

	public final PublicacionDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}

	public final TipoAccesoDTO getTipoAcceso() {
		return tipoAcceso;
	}

	public final PublicacionDTO setTipoAcceso(final TipoAccesoDTO tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDTO.create());
		return this;
	}

	public final LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public final PublicacionDTO setFechaPublicacion(final LocalDate fechaPublicacion) {
		this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
		return this;
	}

	public final EstadoPublicacionDTO getEstado() {
		return estado;
	}

	public final PublicacionDTO setEstado(final EstadoPublicacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDTO.create());
		return this;
	}

}