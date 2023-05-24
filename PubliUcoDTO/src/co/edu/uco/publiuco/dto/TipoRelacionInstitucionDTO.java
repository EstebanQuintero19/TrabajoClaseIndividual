package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionDTO estado;
	
	
	public TipoRelacionInstitucionDTO(UUID identificador, String nombre, String descripcion,
			EstadoTipoRelacionInstitucionDTO estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
		
	}
	
	public TipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoRelacionInstitucionDTO.create());
	}
	
	public static TipoRelacionInstitucionDTO create() {
		return new TipoRelacionInstitucionDTO();
	}
	
	//Setter y Getter
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final TipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final TipoRelacionInstitucionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final TipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	
	public final EstadoTipoRelacionInstitucionDTO getEstado() {
		return estado;
	}
	
	public final TipoRelacionInstitucionDTO setEstado(final EstadoTipoRelacionInstitucionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoRelacionInstitucionDTO.create());
		return this;
	}
}
