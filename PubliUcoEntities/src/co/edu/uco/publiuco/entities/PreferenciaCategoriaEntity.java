package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaCategoriaEntity {
	
	private static final PreferenciaCategoriaEntity DEFAULT_OBJECT = new PreferenciaCategoriaEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private CategoriaEntity categoria;
	
	private PreferenciaCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntity.getDefaultObject());
		setCategoria(CategoriaEntity.getDefaultObject());
	}

	public PreferenciaCategoriaEntity(UUID identificador, PerfilEntity perfil, CategoriaEntity categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}
	
	public static PreferenciaCategoriaEntity getDefaultObject() {
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

	public final CategoriaEntity getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
	}
}