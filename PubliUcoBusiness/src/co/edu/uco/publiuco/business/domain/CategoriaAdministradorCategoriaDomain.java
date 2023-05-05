package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CategoriaAdministradorCategoriaDomain {
	
	private static final CategoriaAdministradorCategoriaDomain DEFAULT_OBJECT = new CategoriaAdministradorCategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private AdministradorCategoriaDomain administradorCategoria;

	private CategoriaAdministradorCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDomain.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaDomain.getDefaultObject());	
	}

	public CategoriaAdministradorCategoriaDomain(UUID identificador, CategoriaDomain categoria,
			AdministradorCategoriaDomain administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}
	
	public static CategoriaAdministradorCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaDomain getCategoria() {
		return categoria;
	}

	private final void setCategoria(CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
	}

	public final AdministradorCategoriaDomain getAdministradorCategoria() {
		return administradorCategoria;
	}

	private final void setAdministradorCategoria(AdministradorCategoriaDomain administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaDomain.getDefaultObject());
	}
}