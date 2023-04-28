package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoSuscripcionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;

	public EstadoSuscripcionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public EstadoSuscripcionDTO(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static EstadoSuscripcionDTO create() {
		return new EstadoSuscripcionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoSuscripcionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;

	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoSuscripcionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoSuscripcionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
}