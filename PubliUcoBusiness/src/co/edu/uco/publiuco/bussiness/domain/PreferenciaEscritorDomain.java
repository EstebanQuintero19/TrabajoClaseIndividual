package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaEscritorDomain {

	private static final PreferenciaEscritorDomain DEFAULT_OBJECT = new PreferenciaEscritorDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private EscritorDomain escritor;

	private PreferenciaEscritorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDomain.getDefaultObject());
		setEscritor(EscritorDomain.getDefaultObject());
	}

	public PreferenciaEscritorDomain(UUID identificador, PerfilDomain perfil, EscritorDomain escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}

	public static PreferenciaEscritorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilDomain getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilDomain perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDomain.getDefaultObject());
	}

	public final EscritorDomain getEscritor() {
		return escritor;
	}

	private final void setEscritor(final EscritorDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDomain.getDefaultObject());
	}
}
