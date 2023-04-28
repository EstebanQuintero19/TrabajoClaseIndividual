package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class TipoEscritorDomain {

	private static final TipoEscritorDomain DEFAULT_OBJECT = new TipoEscritorDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoEscritorDomain estado;

	private TipoEscritorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoTipoEscritorDomain.getDefaultObject());
	}

	public TipoEscritorDomain(UUID identificador, String nombre, String descripcion, EstadoTipoEscritorDomain estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);

	}

	public static TipoEscritorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	// Setter y Getter
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

	public final EstadoTipoEscritorDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoTipoEscritorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoEscritorDomain.getDefaultObject());
	}
}