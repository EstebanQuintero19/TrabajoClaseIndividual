package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class SuscripcionCategoriaDTO {

	private UUID identificador;
	private PerfilDTO perfil;
	private PlanCategoriaDTO planCategoria;

	public SuscripcionCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDTO.create());
		setPlanCategoria(PlanCategoriaDTO.create());
	}

	public SuscripcionCategoriaDTO(UUID identificador, PerfilDTO perfil, PlanCategoriaDTO planCategoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanCategoria(planCategoria);
	}

	public static SuscripcionCategoriaDTO create() {
		return new SuscripcionCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final SuscripcionCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PerfilDTO getPerfil() {
		return perfil;
	}

	public final SuscripcionCategoriaDTO setPerfil(final PerfilDTO perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDTO.create());
		return this;
	}

	public final PlanCategoriaDTO getPlanCategoria() {
		return planCategoria;
	}

	public final SuscripcionCategoriaDTO setPlanCategoria(final PlanCategoriaDTO planCategoria) {
		this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaDTO.create());
		return this;
	}

}
