package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class EscritorPublicacionEntity {
	
	private static final EscritorPublicacionEntity DEFAULT_OBJECT = new EscritorPublicacionEntity();
	private UUID identificador;
	private EscritorEntity escritor;
	private PublicacionEntity publicacion;
	private TipoEscritorEntity tipoEscritor;
	
	
	private EscritorPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritor(EscritorEntity.getDefaultObject());
		setPublicacion(PublicacionEntity.getDefaultObject());
		setTipoEscritor(TipoEscritorEntity.getDefaultObject());
	}

	public EscritorPublicacionEntity(UUID identificador, EscritorEntity escritor, PublicacionEntity publicacion,
			TipoEscritorEntity tipoEscritor) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setPublicacion(publicacion);
		setTipoEscritor(tipoEscritor);
	}
	
	public static EscritorPublicacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorEntity getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
	}

	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	public final TipoEscritorEntity getTipoEscritor() {
		return tipoEscritor;
	}

	private final void setTipoEscritor(final TipoEscritorEntity tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorEntity.getDefaultObject());
	}

}
