package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoAccesoEntity {

	private static final TipoAccesoEntity DEFAULT_OBJECT = new TipoAccesoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoEntity estado;

	private TipoAccesoEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoAccesoEntity.getDefaultObject());
	}

	public TipoAccesoEntity(UUID identificador, String nombre, String descripcion, EstadoTipoAccesoEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);

	}

	public static TipoAccesoEntity getDefaultObject() {
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

	public final EstadoTipoAccesoEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoTipoAccesoEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoEntity.getDefaultObject());
	}
}
