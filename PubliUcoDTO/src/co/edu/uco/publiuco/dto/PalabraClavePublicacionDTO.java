package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PalabraClavePublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private String palabraClave;
	
	public PalabraClavePublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setPalabraClave(UtilText.EMPTY);
	}

	public PalabraClavePublicacionDTO(UUID identificador, PublicacionDTO publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}
	
	public static PalabraClavePublicacionDTO create() {
		return new PalabraClavePublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PalabraClavePublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final PalabraClavePublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final String getPalabraClave() {
		return palabraClave;
	}

	public final PalabraClavePublicacionDTO setPalabraClave(final String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
		return this;
	}
}
