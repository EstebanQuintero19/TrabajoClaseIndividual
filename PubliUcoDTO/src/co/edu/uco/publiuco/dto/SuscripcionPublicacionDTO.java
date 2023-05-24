package co.edu.uco.publiuco.dto;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class SuscripcionPublicacionDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private PlanPublicacionDTO planPublicacion;

	public SuscripcionPublicacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDTO.create());
		setPlanPublicacion(PlanPublicacionDTO.create());
	}

	public SuscripcionPublicacionDTO(UUID identificador, PerfilDTO perfil, PlanPublicacionDTO publicacion) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanPublicacion(publicacion);
	}

	public static SuscripcionPublicacionDTO create() {
		return new SuscripcionPublicacionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final SuscripcionPublicacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PerfilDTO getPerfil() {
		return perfil;
	}

	public final SuscripcionPublicacionDTO setPerfil(final PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}

	public final PlanPublicacionDTO getPlanPublicacion() {
		return planPublicacion;
	}

	public final SuscripcionPublicacionDTO setPlanPublicacion(final PlanPublicacionDTO planPublicacion) {
		this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionDTO.create());
		return this;
	}

}
