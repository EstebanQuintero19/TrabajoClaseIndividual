package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaCategoriaDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private CategoriaDTO categoria;
	
	public PreferenciaCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDTO.create());
		setCategoria(CategoriaDTO.create());
	}

	public PreferenciaCategoriaDTO(UUID identificador, PerfilDTO perfil, CategoriaDTO categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}
	
	public static PreferenciaCategoriaDTO create() {
		return new PreferenciaCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PreferenciaCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PerfilDTO getPerfil() {
		return perfil;
	}

	public final PreferenciaCategoriaDTO setPerfil(final PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}

	public final CategoriaDTO getCategoria() {
		return categoria;
	}

	public final PreferenciaCategoriaDTO setCategoria(final CategoriaDTO categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
		return this;
	}
}
