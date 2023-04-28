package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoEscritorEntity {
	
	private static final TipoEscritorEntity DEFAULT_OBJECT = new TipoEscritorEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorEntity estado;
	
	private TipoEscritorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoEscritorEntity.getDefaultObject());
	}
	
	
	public TipoEscritorEntity(UUID identificador, String nombre, String descripcion, EstadoTipoEscritorEntity estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoEscritorEntity getDefaultObject() {
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
	
	public final EstadoTipoEscritorEntity getEstado() {
		return estado;
	}
	
	private final void setEstado(final EstadoTipoEscritorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorEntity.getDefaultObject());
	}
}
