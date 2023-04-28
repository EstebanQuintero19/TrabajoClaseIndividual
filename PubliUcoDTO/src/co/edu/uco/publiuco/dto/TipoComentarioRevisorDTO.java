package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoComentarioRevisorDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;

	public TipoComentarioRevisorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public TipoComentarioRevisorDTO(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static TipoComentarioRevisorDTO create() {
		return new TipoComentarioRevisorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final TipoComentarioRevisorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;

	}

	public final String getNombre() {
		return nombre;
	}

	public final TipoComentarioRevisorDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final TipoComentarioRevisorDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

}
