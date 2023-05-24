package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionEntity {
	
	private static final ObservacionRevisionEntity DEFAULT_OBJECT = new ObservacionRevisionEntity();
	private UUID identificador;
	private EscritorPublicacionEntity escritorPublicacion;
	private ComentarioRevisorEntity comentarioRevisor;
	private LocalDate fechaReporteObservacion;
	private LocalDate fechaRevisionObservacion;
	private EstadoObservacionRevisorEntity estado;
	private String observacion;

	private ObservacionRevisionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritorPublicacion(EscritorPublicacionEntity.getDefaultObject());
		setComentarioRevisor(ComentarioRevisorEntity.getDefaultObject());
		setFechaReporteObservacion(UtilDate.DEFAULT_DATE);
		setFechaRevisionObservacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoObservacionRevisorEntity.getDefaultObject());
		setObservacion(UtilText.EMPTY);
	}

	public ObservacionRevisionEntity(UUID identificador, EscritorPublicacionEntity escritorPublicacion,
			ComentarioRevisorEntity comentarioRevisor, LocalDate fechaReporteObservacion,
			LocalDate fechaRevisionObservacion, EstadoObservacionRevisorEntity estado, String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}

	public static ObservacionRevisionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorPublicacionEntity getEscritorPublicacion() {
		return escritorPublicacion;
	}

	private final void setEscritorPublicacion(EscritorPublicacionEntity escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionEntity.getDefaultObject());
	}

	public final ComentarioRevisorEntity getComentarioRevisor() {
		return comentarioRevisor;
	}

	private final void setComentarioRevisor(ComentarioRevisorEntity comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorEntity.getDefaultObject());
	}

	public final LocalDate getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}

	private final void setFechaReporteObservacion(LocalDate fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDate.getDefault(fechaReporteObservacion);
	}

	public final LocalDate getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}

	private final void setFechaRevisionObservacion(LocalDate fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
	}

	public final EstadoObservacionRevisorEntity getEstado() {
		return estado;
	}

	private final void setEstado(EstadoObservacionRevisorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorEntity.getDefaultObject());
	}

	public final String getObservacion() {
		return observacion;
	}

	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}

}
