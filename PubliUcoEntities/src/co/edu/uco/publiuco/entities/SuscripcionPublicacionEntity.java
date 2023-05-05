package co.edu.uco.publiuco.entities;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class SuscripcionPublicacionEntity {
	
	private static final SuscripcionPublicacionEntity DEFAULT_OBJECT = new SuscripcionPublicacionEntity();
	private UUID identificador;
	private PerfilEntity perfil;
	private PlanPublicacionEntity planPublicacion;

	private SuscripcionPublicacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilEntity.getDefaultObject());
		setPlanPublicacion(PlanPublicacionEntity.getDefaultObject());
	}

	public SuscripcionPublicacionEntity(UUID identificador, PerfilEntity perfil, PlanPublicacionEntity publicacion) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanPublicacion(publicacion);
	}

	public static SuscripcionPublicacionEntity getDefaultObject() {
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

	public final PlanPublicacionEntity getPlanPublicacion() {
		return planPublicacion;
	}

	private final void setPlanPublicacion(final PlanPublicacionEntity planPublicacion) {
		this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionEntity.getDefaultObject());
	}
	
}