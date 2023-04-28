package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class SuscripcionCategoriaEntity {

	private static final SuscripcionCategoriaEntity DEFAULT_OBJECT = new SuscripcionCategoriaEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private PlanCategoriaEntity planCategoria;

	private SuscripcionCategoriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntity.getDefaultObject());
		setPlanCategoria(PlanCategoriaEntity.getDefaultObject());
	}

	public SuscripcionCategoriaEntity(UUID identificador, PerfilEntity perfil, PlanCategoriaEntity planCategoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanCategoria(planCategoria);
	}

	public static SuscripcionCategoriaEntity getDefaultObject() {
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

	public final PlanCategoriaEntity getPlanCategoria() {
		return planCategoria;
	}

	private final void setPlanCategoria(final PlanCategoriaEntity planCategoria) {
		this.planCategoria = UtilObject.getDefault(planCategoria, PlanCategoriaEntity.getDefaultObject());
	}
}
