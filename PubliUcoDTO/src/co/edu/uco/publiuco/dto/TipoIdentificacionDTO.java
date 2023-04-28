package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoIdentificacionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDTO estado;
	
	
	public TipoIdentificacionDTO(UUID identificador, String nombre, String descripcion,
			EstadoTipoIdentificacionDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
		
	}
	
	public TipoIdentificacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoIdentificacionDTO.create());
	}
	
	public static TipoIdentificacionDTO create() {
		return new TipoIdentificacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoIdentificacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoIdentificacionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoIdentificacionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	public final EstadoTipoIdentificacionDTO getEstado() {
		return estado;
	}
	
	public final TipoIdentificacionDTO setEstado(final EstadoTipoIdentificacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDTO.create());
		return this;
	}
}
