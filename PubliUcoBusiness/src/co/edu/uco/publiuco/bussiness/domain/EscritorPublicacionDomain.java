package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;


public class EscritorPublicacionDomain {
	
	private static final EscritorPublicacionDomain DEFAULT_OBJECT = new EscritorPublicacionDomain();
	private UUID identificador;
	private EscritorDomain escritor;
	private PublicacionDomain publicacion;
	private TipoEscritorDomain tipoEscritor;
	
	
	private EscritorPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritor(EscritorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setTipoEscritor(TipoEscritorDomain.getDefaultObject());
	}

	public EscritorPublicacionDomain(UUID identificador, EscritorDomain escritor, PublicacionDomain publicacion,
			TipoEscritorDomain tipoEscritor) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setPublicacion(publicacion);
		setTipoEscritor(tipoEscritor);
	}
	
	public static EscritorPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorDomain getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDomain.getDefaultObject());
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}

	public final TipoEscritorDomain getTipoEscritor() {
		return tipoEscritor;
	}

	private final void setTipoEscritor(final TipoEscritorDomain tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDomain.getDefaultObject());
	}

}