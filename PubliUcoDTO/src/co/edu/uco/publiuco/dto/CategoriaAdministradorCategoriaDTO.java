package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CategoriaAdministradorCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private AdministradorCategoriaDTO administradorCategoria;

	public CategoriaAdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoria(CategoriaDTO.create());
		setAdministradorCategoria(AdministradorCategoriaDTO.create());
	}

	public CategoriaAdministradorCategoriaDTO(UUID identificador, CategoriaDTO categoria,
			AdministradorCategoriaDTO administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}
	
	public static CategoriaAdministradorCategoriaDTO create() {
		return new CategoriaAdministradorCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final CategoriaAdministradorCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaDTO getCategoria() {
		return categoria;
	}

	public final CategoriaAdministradorCategoriaDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}

	public final AdministradorCategoriaDTO getAdministradorCategoria() {
		return administradorCategoria;
	}

	public final CategoriaAdministradorCategoriaDTO setAdministradorCategoria(final AdministradorCategoriaDTO administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria, AdministradorCategoriaDTO.create());
		return this;
	}
}