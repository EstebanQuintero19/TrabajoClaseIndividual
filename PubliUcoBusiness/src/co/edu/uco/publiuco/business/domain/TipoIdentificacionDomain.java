package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoIdentificacionDomain {
	
	private static final TipoIdentificacionDomain DEFAULT_OBJECT = new TipoIdentificacionDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDomain estado;
	
	private TipoIdentificacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoIdentificacionDomain.getDefaultObject());
	}
	
	public TipoIdentificacionDomain(UUID identificador, String nombre, String descripcion,
			EstadoTipoIdentificacionDomain estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static TipoIdentificacionDomain getDefaultObject() {
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
	
	public final EstadoTipoIdentificacionDomain getEstado() {
		return estado;
	}
	
	private final void setEstado(final EstadoTipoIdentificacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDomain.getDefaultObject());
	}
}