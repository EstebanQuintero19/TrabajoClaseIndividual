package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoAccesoDomain {

	private static final TipoAccesoDomain DEFAULT_OBJECT = new TipoAccesoDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoDomain estado;

	private TipoAccesoDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoAccesoDomain.getDefaultObject());
	}

	public TipoAccesoDomain(UUID identificador, String nombre, String descripcion, EstadoTipoAccesoDomain estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);

	}

	public static TipoAccesoDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	// Setter y Getter
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final String getNombre() {
		return nombre;
	}

	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}

	public final String getDescripcion() {
		return descripcion;
	}

	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}

	public final EstadoTipoAccesoDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoTipoAccesoDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoDomain.getDefaultObject());
	}
}
