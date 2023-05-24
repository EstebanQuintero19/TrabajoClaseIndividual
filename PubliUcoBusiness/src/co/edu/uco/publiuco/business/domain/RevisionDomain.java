package co.edu.uco.publiuco.business.domain;

import java.time.LocalDate;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class RevisionDomain {

	private static final RevisionDomain DEFAULT_OBJECT = new RevisionDomain();
	private UUID identificador;
	private VersionDomain version;
	private TipoRevisionDomain tipoRevision;
	private LocalDate fechaSolicitudRevision;
	private LocalDate fechaLimiteRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionDomain estado;

	private RevisionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setVersion(VersionDomain.getDefaultObject());
		setTipoRevision(TipoRevisionDomain.getDefaultObject());
		setFechaSolicitudRevision(UtilDate.DEFAULT_DATE);
		setFechaLimiteRevision(UtilDate.DEFAULT_DATE);
		setFechaCompletitudRevision(UtilDate.DEFAULT_DATE);
		setEstado(EstadoRevisionDomain.getDefaultObject());
	}

	public RevisionDomain(UUID identificador, VersionDomain version, TipoRevisionDomain tipoRevision,
			LocalDate fechaSolicitudRevision, LocalDate fechaLimiteRevision, LocalDate fechaCompletitudRevision,
			EstadoRevisionDomain estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipoRevision(tipoRevision);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}

	public static RevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final VersionDomain getVersion() {
		return version;
	}

	private final void setVersion(final VersionDomain version) {
		this.version = UtilObject.getDefault(version, VersionDomain.getDefaultObject());
	}

	public final TipoRevisionDomain getTipoRevision() {
		return tipoRevision;
	}

	private final void setTipoRevision(final TipoRevisionDomain tipoRevision) {
		this.tipoRevision = UtilObject.getDefault(tipoRevision, TipoRevisionDomain.getDefaultObject());
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

	public final EstadoRevisionDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoRevisionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDomain.getDefaultObject());
	}
}
