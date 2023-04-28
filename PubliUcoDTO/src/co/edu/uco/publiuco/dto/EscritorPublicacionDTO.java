package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EscritorPublicacionDTO {

	private UUID identificador;
	private EscritorDTO escritor;
	private PublicacionDTO publicacion;
	private TipoEscritorDTO tipoEscritor;
	
	
	public EscritorPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritor(EscritorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setTipoEscritor(TipoEscritorDTO.create());
	}

	public EscritorPublicacionDTO(UUID identificador, EscritorDTO escritor, PublicacionDTO publicacion,
			TipoEscritorDTO tipoEscritor) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setPublicacion(publicacion);
		setTipoEscritor(tipoEscritor);
	}
	
	public static EscritorPublicacionDTO create() {
		return new EscritorPublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EscritorPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final EscritorDTO getEscritor() {
		return escritor;
	}

	public final EscritorPublicacionDTO setEscritor(final EscritorDTO escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final EscritorPublicacionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final TipoEscritorDTO getTipoEscritor() {
		return tipoEscritor;
	}

	public final EscritorPublicacionDTO setTipoEscritor(final TipoEscritorDTO tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDTO.create());
		return this;
	}

}
