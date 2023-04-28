package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PerfilDomain {

	private static final PerfilDomain DEFAULT_OBJECT = new PerfilDomain();
	private UUID identificador;
	private LectorDomain lector;
	private RespuestaDomain recomendacionCategoria;
	private RespuestaDomain recomendacionAutor;

	private PerfilDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setRecomendacionCategoria(RespuestaDomain.getDefaultObject());
		setRecomendacionAutor(RespuestaDomain.getDefaultObject());
	}

	public PerfilDomain(UUID identificador, LectorDomain lector, RespuestaDomain recomendacionCategoria,
			RespuestaDomain recomendacionAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionCategoria(recomendacionCategoria);
		setRecomendacionAutor(recomendacionAutor);
	}

	public static PerfilDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorDomain getLector() {
		return lector;
	}

	private final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}

	public final RespuestaDomain getRecomendacionCategoria() {
		return recomendacionCategoria;
	}

	private final void setRecomendacionCategoria(final RespuestaDomain recomendacionCategoria) {
		this.recomendacionCategoria = UtilObject.getDefault(recomendacionCategoria, RespuestaDomain.getDefaultObject());
	}

	public final RespuestaDomain getRecomendacionAutor() {
		return recomendacionAutor;
	}

	private final void setRecomendacionAutor(final RespuestaDomain recomendacionAutor) {
		this.recomendacionAutor = UtilObject.getDefault(recomendacionAutor, RespuestaDomain.getDefaultObject());
	}

}