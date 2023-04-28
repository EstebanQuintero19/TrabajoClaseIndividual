package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoAdministradorCategoriaDTO {

	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
		

	public EstadoAdministradorCategoriaDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoAdministradorCategoriaDTO create() {
		return new EstadoAdministradorCategoriaDTO();
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	public final EstadoAdministradorCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}


	public final String getNombre() {
		return nombre;
	}


	public final EstadoAdministradorCategoriaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}


	public final String getDescripcion() {
		return descripcion;
	}


	public final EstadoAdministradorCategoriaDTO setDescripcion(final String descripcion) {
		this.nombre = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	
}