package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PreferenciaEscritorDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private EscritorDTO escritor;
	
	public PreferenciaEscritorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDTO.create());
		setEscritor(EscritorDTO.create());
	}

	public PreferenciaEscritorDTO(UUID identificador, PerfilDTO perfil, EscritorDTO escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}
	
	public static PreferenciaEscritorDTO create() {
		return new PreferenciaEscritorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PreferenciaEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PerfilDTO getPerfil() {
		return perfil;
	}

	public final PreferenciaEscritorDTO setPerfil(final PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}

	public final EscritorDTO getEscritor() {
		return escritor;
	}

	public final PreferenciaEscritorDTO setEscritor(final EscritorDTO escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDTO.create());
		return this;
	}

}
