package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaEscritorEntity {
	
	private static final PreferenciaEscritorEntity DEFAULT_OBJECT = new PreferenciaEscritorEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private EscritorEntity escritor;
	
	private PreferenciaEscritorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntity.getDefaultObject());
		setEscritor(EscritorEntity.getDefaultObject());
	}

	public PreferenciaEscritorEntity(UUID identificador, PerfilEntity perfil, EscritorEntity escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}
	
	public static PreferenciaEscritorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilEntity getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilEntity perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilEntity.getDefaultObject());
	}

	public final EscritorEntity getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorEntity escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorEntity.getDefaultObject());
	}
}
