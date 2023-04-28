package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaCategoriaDomain {

	private static final PreferenciaCategoriaDomain DEFAULT_OBJECT = new PreferenciaCategoriaDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private CategoriaDomain categoria;

	private PreferenciaCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDomain.getDefaultObject());
		setCategoria(CategoriaDomain.getDefaultObject());
	}

	public PreferenciaCategoriaDomain(UUID identificador, PerfilDomain perfil, CategoriaDomain categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}

	public static PreferenciaCategoriaDomain getDefaultObject() {
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

	public final CategoriaDomain getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
	}
}