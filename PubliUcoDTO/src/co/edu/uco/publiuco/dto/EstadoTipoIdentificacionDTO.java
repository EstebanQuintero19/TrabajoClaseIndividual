package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoTipoIdentificacionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;

	public EstadoTipoIdentificacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public EstadoTipoIdentificacionDTO(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static EstadoTipoIdentificacionDTO create() {
		return new EstadoTipoIdentificacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoTipoIdentificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;

	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoTipoIdentificacionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoTipoIdentificacionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
}