package co.edu.uco.publiuco.entities;

import java.util.UUID;


import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PerfilEntity {

	private static final PerfilEntity DEFAULT_OBJECT = new PerfilEntity();
	private UUID identificador;
	private LectorEntity lector;
	private RespuestaEntity recomendacionCategoria;
	private RespuestaEntity recomendacionAutor;

	private PerfilEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setRecomendacionCategoria(RespuestaEntity.getDefaultObject());
		setRecomendacionAutor(RespuestaEntity.getDefaultObject());
	}

	public PerfilEntity(UUID identificador, LectorEntity lector, RespuestaEntity recomendacionCategoria,
			RespuestaEntity recomendacionAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionCategoria(recomendacionCategoria);
		setRecomendacionAutor(recomendacionAutor);
	}

	public static PerfilEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorEntity getLector() {
		return lector;
	}

	private final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}

	public final RespuestaEntity getRecomendacionCategoria() {
		return recomendacionCategoria;
	}

	private final void setRecomendacionCategoria(final RespuestaEntity recomendacionCategoria) {
		this.recomendacionCategoria = UtilObject.getDefault(recomendacionCategoria, RespuestaEntity.getDefaultObject());
	}

	public final RespuestaEntity getRecomendacionAutor() {
		return recomendacionAutor;
	}

	private final void setRecomendacionAutor(final RespuestaEntity recomendacionAutor) {
		this.recomendacionAutor = UtilObject.getDefault(recomendacionAutor, RespuestaEntity.getDefaultObject());
	}

}
