package co.edu.uco.publiuco.entities;

import java.time.LocalDate;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionEntity {

	private static final RevisionEntity DEFAULT_OBJECT = new RevisionEntity();
	private UUID identificador;
	private VersionEntity version;
	private TipoRevisionEntity tipoRevision;
	private LocalDate fechaSolicitudRevision;
	private LocalDate fechaLimiteRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionEntity estado;

	private RevisionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionEntity.getDefaultObject());
		setTipoRevision(TipoRevisionEntity.getDefaultObject());
		setFechaSolicitudRevision(UtilDate.DEFAULT_DATE);
		setFechaLimiteRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstado(EstadoRevisionEntity.getDefaultObject());
	}

	public RevisionEntity(UUID identificador, VersionEntity version, TipoRevisionEntity tipoRevision,
			LocalDate fechaSolicitudRevision, LocalDate fechaLimiteRevision, LocalDate fechaCompletitudRevision,
			EstadoRevisionEntity estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}

	public static RevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final VersionEntity getVersion() {
		return version;
	}

	private final void setVersion(final VersionEntity version) {
		this.version = UtilObject.getDefault(version, VersionEntity.getDefaultObject());
	}

	public final TipoRevisionEntity getTipoRevision() {
		return tipoRevision;
	}

	private final void setTipoRevision(final TipoRevisionEntity tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionEntity.getDefaultObject());
	}

	public final LocalDate getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}

	private final void setFechaSolicitudRevision(final LocalDate fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDate.getDefault(fechaSolicitudRevision);
	}

	public final LocalDate getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}

	private final void setFechaLimiteRevision(final LocalDate fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDate.getDefault(fechaLimiteRevision);
	}

	public final LocalDate getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}

	private final void setFechaCompletitudRevision(final LocalDate fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDate.getDefault(fechaCompletitudRevision);
	}

	public final EstadoRevisionEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoRevisionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionEntity.getDefaultObject());
	}
}
