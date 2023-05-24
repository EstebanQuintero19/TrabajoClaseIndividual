package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoTipoRelacionInstitucionEntity {

	private static final EstadoTipoRelacionInstitucionEntity DEFAULT_OBJECT = new EstadoTipoRelacionInstitucionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;

	private EstadoTipoRelacionInstitucionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public EstadoTipoRelacionInstitucionEntity(final UUID identificador, final String nombre,
			final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static final EstadoTipoRelacionInstitucionEntity createWithIdentificador(final UUID identificador) {
		return new EstadoTipoRelacionInstitucionEntity(identificador, UtilText.getUtilText().getDefaultValue(),
				UtilText.getUtilText().getDefaultValue());
	}

	public static final EstadoTipoRelacionInstitucionEntity createWithNombre(final String nombre) {
		return new EstadoTipoRelacionInstitucionEntity(UtilUUID.DEFAULT_UUID, nombre,
				UtilText.getUtilText().getDefaultValue());
	}

	public static final EstadoTipoRelacionInstitucionEntity createWithDescripcion(final String descripcion) {
		return new EstadoTipoRelacionInstitucionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(),
				descripcion);
	}

	public static EstadoTipoRelacionInstitucionEntity getDefaultObject() {
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
