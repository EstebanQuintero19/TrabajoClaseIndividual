package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionDTO {

	private UUID identificador;
	private VersionDTO version;
	private TipoRevisionDTO tipoRevision;
	private LocalDate fechaSolicitudRevision;
	private LocalDate fechaLimiteRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionDTO estado;
	
	public RevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionDTO.create());
		setTipoRevision(TipoRevisionDTO.create());
		setFechaSolicitudRevision(UtilDate.DEFAULT_DATE);
		setFechaLimiteRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstado(EstadoRevisionDTO.create());
	}

	public RevisionDTO(UUID identificador, VersionDTO version, TipoRevisionDTO tipoRevision,
			LocalDate fechaSolicitudRevision, LocalDate fechaLimiteRevision, LocalDate fechaCompletitudRevision,
			EstadoRevisionDTO estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}
	
	public static RevisionDTO create() {
		return new RevisionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final RevisionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final VersionDTO getVersion() {
		return version;
	}

	public final RevisionDTO setVersion(final VersionDTO version) {
		this.version = UtilObject.getDefault(version, VersionDTO.create());
		return this;
	}

	public final TipoRevisionDTO getTipoRevision() {
		return tipoRevision;
	}

	public final RevisionDTO setTipoRevision(final TipoRevisionDTO tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionDTO.create());
		return this;
	}

	public final LocalDate getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}

	public final RevisionDTO setFechaSolicitudRevision(final LocalDate fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDate.getDefault(fechaSolicitudRevision);
		return this;
	}

	public final LocalDate getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}

	public final RevisionDTO setFechaLimiteRevision(final LocalDate fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDate.getDefault(fechaLimiteRevision);
		return this;
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	public final RevisionDTO setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
		return this;
	}

	public final EstadoRevisionDTO getEstado() {
		return estado;
	}

	public final RevisionDTO setEstado(final EstadoRevisionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDTO.create());
		return this;
	}

}
