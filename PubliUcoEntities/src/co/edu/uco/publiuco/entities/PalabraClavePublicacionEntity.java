package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PalabraClavePublicacionEntity {
	
	private static final PalabraClavePublicacionEntity DEFAULT_OBJECT = new PalabraClavePublicacionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private String palabraClave;
	
	private PalabraClavePublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntity.getDefaultObject());
		setPalabraClave(UtilText.EMPTY);
	}

	public PalabraClavePublicacionEntity(UUID identificador, PublicacionEntity publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}
	
	public static PalabraClavePublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	public final String getPalabraClave() {
		return palabraClave;
	}

	private final void setPalabraClave(final String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
	}
}
