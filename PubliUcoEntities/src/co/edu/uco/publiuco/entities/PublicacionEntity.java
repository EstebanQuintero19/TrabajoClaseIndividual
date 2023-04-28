package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PublicacionEntity {

	private static final PublicacionEntity DEFAULT_OBJECT = new PublicacionEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private TipoAccesoEntity tipoAcceso;
	private LocalDate fechaPublicacion;
	private EstadoPublicacionEntity estado;

	private PublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntity.getDefaultObject());
		setTipoAcceso(TipoAccesoEntity.getDefaultObject());
		setFechaPublicacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoPublicacionEntity.getDefaultObject());
	}

	public PublicacionEntity(UUID identificador, CategoriaEntity categoria, TipoAccesoEntity tipoAcceso,
			LocalDate fechaPublicacion, EstadoPublicacionEntity estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechaPublicacion(fechaPublicacion);
		setEstado(estado);
	}

	public static PublicacionEntity getDefaultObject() {
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

	public final TipoAccesoEntity getTipoAcceso() {
		return tipoAcceso;
	}

	private final void setTipoAcceso(final TipoAccesoEntity tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoEntity.getDefaultObject());
	}

	public final LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	private final void setFechaPublicacion(final LocalDate fechaPublicacion) {
		this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
	}

	public final EstadoPublicacionEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionEntity.getDefaultObject());
	}

}
