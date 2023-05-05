package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PublicacionDomain {

	private static final PublicacionDomain DEFAULT_OBJECT = new PublicacionDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private TipoAccesoDomain tipoAcceso;
	private LocalDate fechaPublicacion;
	private EstadoPublicacionDomain estado;

	private PublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDomain.getDefaultObject());
		setTipoAcceso(TipoAccesoDomain.getDefaultObject());
		setFechaPublicacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoPublicacionDomain.getDefaultObject());
	}

	public PublicacionDomain(UUID identificador, CategoriaDomain categoria, TipoAccesoDomain tipoAcceso,
			LocalDate fechaPublicacion, EstadoPublicacionDomain estado) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAcceso(tipoAcceso);
		setFechaPublicacion(fechaPublicacion);
		setEstado(estado);
	}

	public static PublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaDomain getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
	}

	public final TipoAccesoDomain getTipoAcceso() {
		return tipoAcceso;
	}

	private final void setTipoAcceso(final TipoAccesoDomain tipoAcceso) {
		this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDomain.getDefaultObject());
	}

	public final LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	private final void setFechaPublicacion(final LocalDate fechaPublicacion) {
		this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
	}

	public final EstadoPublicacionDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDomain.getDefaultObject());
	}

}