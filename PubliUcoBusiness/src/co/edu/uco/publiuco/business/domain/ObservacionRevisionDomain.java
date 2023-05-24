package co.edu.uco.publiuco.business.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDomain {
	
	private static final ObservacionRevisionDomain DEFAULT_OBJECT = new ObservacionRevisionDomain();
	private UUID identificador;
	private EscritorPublicacionDomain escritorPublicacion;
	private ComentarioRevisorDomain comentarioRevisor;
	private LocalDate fechaReporteObservacion;
	private LocalDate fechaRevisionObservacion;
	private EstadoObservacionRevisorDomain estado;
	private String observacion;

	private ObservacionRevisionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritorPublicacion(EscritorPublicacionDomain.getDefaultObject());
		setComentarioRevisor(ComentarioRevisorDomain.getDefaultObject());
		setFechaReporteObservacion(UtilDate.DEFAULT_DATE);
		setFechaRevisionObservacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoObservacionRevisorDomain.getDefaultObject());
		setObservacion(UtilText.EMPTY);
	}

	public ObservacionRevisionDomain(UUID identificador, EscritorPublicacionDomain escritorPublicacion,
			ComentarioRevisorDomain comentarioRevisor, LocalDate fechaReporteObservacion,
			LocalDate fechaRevisionObservacion, EstadoObservacionRevisorDomain estado, String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}

	public static ObservacionRevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final EscritorPublicacionDomain getEscritorPublicacion() {
		return escritorPublicacion;
	}

	private final void setEscritorPublicacion(EscritorPublicacionDomain escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionDomain.getDefaultObject());
	}

	public final ComentarioRevisorDomain getComentarioRevisor() {
		return comentarioRevisor;
	}

	private final void setComentarioRevisor(ComentarioRevisorDomain comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorDomain.getDefaultObject());
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

	public final EstadoObservacionRevisorDomain getEstado() {
		return estado;
	}

	private final void setEstado(EstadoObservacionRevisorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDomain.getDefaultObject());
	}

	public final String getObservacion() {
		return observacion;
	}

	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
	}

}
