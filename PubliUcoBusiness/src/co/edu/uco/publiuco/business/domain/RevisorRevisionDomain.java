package co.edu.uco.publiuco.business.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionDomain {
	
	private static final RevisorRevisionDomain DEFAULT_OBJECT = new RevisorRevisionDomain();
	private UUID identificador;
	private RevisionDomain revision;
	private RevisorDomain revisor;
	private LocalDate fechaAsignacionRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionDomain estadoRevision;
	
	private RevisorRevisionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionDomain.getDefaultObject());
		setRevisor(RevisorDomain.getDefaultObject());
		setFechaAsignacionRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstadoRevision(EstadoRevisionDomain.getDefaultObject());
	}

	public RevisorRevisionDomain(UUID identificador, RevisionDomain revision, RevisorDomain revisor,
			LocalDate fechaAsignacionRevision, LocalDate fechaCompletitudRevision, EstadoRevisionDomain estadoRevision) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacionRevision(fechaAsignacionRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstadoRevision(estadoRevision);
	}
	
	public static RevisorRevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisionDomain getRevision() {
		return revision;
	}

	private final void setRevision(final RevisionDomain revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDomain.getDefaultObject());
	}

	public final RevisorDomain getRevisor() {
		return revisor;
	}

	private final void setRevisor(final RevisorDomain revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDomain.getDefaultObject());
	}

	public final LocalDate getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}

	private final void setFechaAsignacionRevision(final LocalDate fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	private final void setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
	}

	public final EstadoRevisionDomain getEstadoRevision() {
		return estadoRevision;
	}

	private final void setEstadoRevision(final EstadoRevisionDomain estadoRevision) {
		this.estadoRevision = UtilObject.getDefault(estadoRevision, EstadoRevisionDomain.getDefaultObject());
	}

}
