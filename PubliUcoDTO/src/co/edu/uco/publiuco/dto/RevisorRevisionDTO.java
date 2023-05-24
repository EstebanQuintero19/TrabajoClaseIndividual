package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisorRevisionDTO {

	private UUID identificador;
	private RevisionDTO revision;
	private RevisorDTO revisor;
	private LocalDate fechaAsignacionRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionDTO estadoRevision;
	
	public RevisorRevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevision(RevisionDTO.create());
		setRevisor(RevisorDTO.create());
		setFechaAsignacionRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstadoRevision(EstadoRevisionDTO.create());
	}

	public RevisorRevisionDTO(UUID identificador, RevisionDTO revision, RevisorDTO revisor,
			LocalDate fechaAsignacionRevision, LocalDate fechaCompletitudRevision, EstadoRevisionDTO estadoRevision) {
		super();
		setIdentificador(identificador);
		setRevision(revision);
		setRevisor(revisor);
		setFechaAsignacionRevision(fechaAsignacionRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstadoRevision(estadoRevision);
	}
	
	public static RevisorRevisionDTO create() {
		return new RevisorRevisionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final RevisorRevisionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final RevisionDTO getRevision() {
		return revision;
	}

	public final RevisorRevisionDTO setRevision(final RevisionDTO revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDTO.create());
		return this;
	}

	public final RevisorDTO getRevisor() {
		return revisor;
	}

	public final RevisorRevisionDTO setRevisor(final RevisorDTO revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDTO.create());
		return this;
	}

	public final LocalDate getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}

	public final RevisorRevisionDTO setFechaAsignacionRevision(final LocalDate fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDate.getDefault(fechaAsignacionRevision);
		return this;
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	public final RevisorRevisionDTO setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
		return this;
	}

	public final EstadoRevisionDTO getEstadoRevision() {
		return estadoRevision;
	}

	public final RevisorRevisionDTO setEstadoRevision(final EstadoRevisionDTO estadoRevision) {
		this.estadoRevision = UtilObject.getDefault(estadoRevision, EstadoRevisionDTO.create());
		return this;
	}

}
