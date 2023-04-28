package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoRelacionInstitucionEntity {
	
	private static final TipoRelacionInstitucionEntity DEFAULT_OBJECT = new TipoRelacionInstitucionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionEntity estado;
	
	private TipoRelacionInstitucionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}
	
	public TipoRelacionInstitucionEntity(UUID identificador, String nombre, String descripcion, EstadoTipoRelacionInstitucionEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);	
	}
	
	public static TipoRelacionInstitucionEntity getDefaultObject() {
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
	
	public final EstadoTipoRelacionInstitucionEntity getEstado() {
		return estado;
	}
	
	private final void setEstado(final EstadoTipoRelacionInstitucionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoRelacionInstitucionEntity.getDefaultObject());
	}
}
