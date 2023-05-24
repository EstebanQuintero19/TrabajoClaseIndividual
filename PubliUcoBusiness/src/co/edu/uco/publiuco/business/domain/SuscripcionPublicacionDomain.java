package co.edu.uco.publiuco.business.domain;

import java.util.UUID;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class SuscripcionPublicacionDomain {

	private static final SuscripcionPublicacionDomain DEFAULT_OBJECT = new SuscripcionPublicacionDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private PlanPublicacionDomain planPublicacion;

	private SuscripcionPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPerfil(PerfilDomain.getDefaultObject());
		setPlanPublicacion(PlanPublicacionDomain.getDefaultObject());
	}

	public SuscripcionPublicacionDomain(UUID identificador, PerfilDomain perfil, PlanPublicacionDomain publicacion) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setPlanPublicacion(planPublicacion);
	}

	public static SuscripcionPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PerfilDomain getPerfil() {
		return perfil;
	}

	private final void setPerfil(final PerfilDomain perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDomain.getDefaultObject());
	}

	public final PlanPublicacionDomain getPlanPublicacion() {
		return planPublicacion;
	}

	private final void setPlanPublicacion(final PlanPublicacionDomain planPublicacion) {
		this.planPublicacion = UtilObject.getDefault(planPublicacion, PlanPublicacionDomain.getDefaultObject());
	}
}
