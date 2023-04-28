package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PalabraClavePublicacionDomain {

	private static final PalabraClavePublicacionDomain DEFAULT_OBJECT = new PalabraClavePublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private String palabraClave;

	private PalabraClavePublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setPalabraClave(UtilText.EMPTY);
	}

	public PalabraClavePublicacionDomain(UUID identificador, PublicacionDomain publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}

	public static PalabraClavePublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}

	public final String getPalabraClave() {
		return palabraClave;
	}

	private final void setPalabraClave(final String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
	}
}