package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CategoriaAdministradorCategoriaEntity {
	
	private static final CategoriaAdministradorCategoriaEntity DEFAULT_OBJECT = new CategoriaAdministradorCategoriaEntity();
	private UUID identificador;
	private CategoriaEntity categoria;
	private AdministradorCategoriaEntity administradorCategoria;

	private CategoriaAdministradorCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaEntity.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaEntity.getDefaultObject());
	}

	public CategoriaAdministradorCategoriaEntity(UUID identificador, CategoriaEntity categoria, AdministradorCategoriaEntity administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}
	
	public static CategoriaAdministradorCategoriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final CategoriaEntity getCategoria() {
		return categoria;
	}

	private final void setCategoria(CategoriaEntity categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaEntity.getDefaultObject());
	}

	public final AdministradorCategoriaEntity getAdministradorCategoria() {
		return administradorCategoria;
	}

	private final void setAdministradorCategoria(AdministradorCategoriaEntity administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaEntity.getDefaultObject());
	}
}
