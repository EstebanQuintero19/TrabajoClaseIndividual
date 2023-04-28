package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EstadoRevisorEntity {
	
	private static final EstadoRevisorEntity DEFAULT_OBJECT = new EstadoRevisorEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;

	private EstadoRevisorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public EstadoRevisorEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static EstadoRevisorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

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
}
