package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class PerfilDTO {

	private UUID identificador;
	private LectorDTO lector;
	private RespuestaDTO recomendacionCategoria;
	private RespuestaDTO recomendacionAutor;
	
	public PerfilDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setRecomendacionCategoria(RespuestaDTO.create());
		setRecomendacionAutor(RespuestaDTO.create());
	}

	public PerfilDTO(UUID identificador, LectorDTO lector, RespuestaDTO recomendacionCategoria,
			RespuestaDTO recomendacionAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setRecomendacionCategoria(recomendacionCategoria);
		setRecomendacionAutor(recomendacionAutor);
	}
	
	public static PerfilDTO create() {
		return new PerfilDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final PerfilDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final LectorDTO getLector() {
		return lector;
	}

	public final PerfilDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public final RespuestaDTO getRecomendacionCategoria() {
		return recomendacionCategoria;
	}

	public final PerfilDTO setRecomendacionCategoria(final RespuestaDTO recomendacionCategoria) {
		this.recomendacionCategoria = UtilObject.getDefault(recomendacionCategoria, RespuestaDTO.create());
		return this;
	}

	public final RespuestaDTO getRecomendacionAutor() {
		return recomendacionAutor;
	}

	public final PerfilDTO setRecomendacionAutor(final RespuestaDTO recomendacionAutor) {
		this.recomendacionAutor = UtilObject.getDefault(recomendacionAutor, RespuestaDTO.create());
		return this;
	}

}