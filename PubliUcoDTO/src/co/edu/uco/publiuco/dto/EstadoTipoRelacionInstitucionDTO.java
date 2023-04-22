package co.edu.uco.publiuco.dto;

import java.util.UUID;

public final class EstadoTipoRelacionInstitucionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}
	
	public EstadoTipoRelacionInstitucionDTO(final UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre("");
		setDescripcion("");
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	
	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		
		return this;
		
	}
	
	public final String getNombre() {
		return nombre;
	}
	
	public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {
		
		this.nombre = "";
		
		if (nombre != null ) {
			this.nombre = nombre.trim();
		}
		return this;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		
		this.descripcion = "";
		
		if (descripcion != null ) {
			this.descripcion = descripcion.trim();
		}
		return this;
	}

	
}
