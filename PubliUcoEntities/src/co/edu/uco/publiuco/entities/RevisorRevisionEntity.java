package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionEntity {
	
	private static final RevisorRevisionEntity DEFAULT_OBJECT = new RevisorRevisionEntity();
	private UUID identificador;
	private RevisionEntity revision;
	private RevisorEntity revisor;
	private LocalDate fechaAsignacionRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionEntity estadoRevision;
	
	private RevisorRevisionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionEntity.getDefaultObject());
		setRevisor(RevisorEntity.getDefaultObject());
		setFechaAsignacionRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstadoRevision(EstadoRevisionEntity.getDefaultObject());
	}

	public RevisorRevisionEntity(UUID identificador, RevisionEntity revision, RevisorEntity revisor,
			LocalDate fechaAsignacionRevision, LocalDate fechaCompletitudRevision, EstadoRevisionEntity estadoRevision) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacionRevision(fechaAsignacionRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstadoRevision(estadoRevision);
	}
	
	public static RevisorRevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisionEntity getRevision() {
		return revision;
	}

	private final void setRevision(final RevisionEntity revision) {
		this.revision = UtilObject.getDefault(revision, RevisionEntity.getDefaultObject());
	}

	public final RevisorEntity getRevisor() {
		return revisor;
	}

	private final void setRevisor(final RevisorEntity revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorEntity.getDefaultObject());
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

	public final EstadoRevisionEntity getEstadoRevision() {
		return estadoRevision;
	}

	private final void setEstadoRevision(final EstadoRevisionEntity estadoRevision) {
		this.estadoRevision = UtilObject.getDefault(estadoRevision, EstadoRevisionEntity.getDefaultObject());
	}

}
