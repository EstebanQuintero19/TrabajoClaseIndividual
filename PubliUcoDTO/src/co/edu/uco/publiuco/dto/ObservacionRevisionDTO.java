package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDTO {

	private UUID identificador;
	private EscritorPublicacionDTO escritorPublicacion;
	private ComentarioRevisorDTO comentarioRevisor;
	private LocalDate fechaReporteObservacion;
	private LocalDate fechaRevisionObservacion;
	private EstadoObservacionRevisorDTO estado;
	private String observacion;

	public ObservacionRevisionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setEscritorPublicacion(EscritorPublicacionDTO.create());
		setComentarioRevisor(ComentarioRevisorDTO.create());
		setFechaReporteObservacion(UtilDate.DEFAULT_DATE);
		setFechaRevisionObservacion(UtilDate.DEFAULT_DATE);
		setEstado(EstadoObservacionRevisorDTO.create());
		setObservacion(UtilText.EMPTY);
	}

	public ObservacionRevisionDTO(UUID identificador, EscritorPublicacionDTO escritorPublicacion,
			ComentarioRevisorDTO comentarioRevisor, LocalDate fechaReporteObservacion,
			LocalDate fechaRevisionObservacion, EstadoObservacionRevisorDTO estado, String observacion) {
		super();
		setIdentificador(identificador);
		setEscritorPublicacion(escritorPublicacion);
		setComentarioRevisor(comentarioRevisor);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}

	public static ObservacionRevisionDTO create() {
		return new ObservacionRevisionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final ObservacionRevisionDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final EscritorPublicacionDTO getEscritorPublicacion() {
		return escritorPublicacion;
	}

	public final ObservacionRevisionDTO setEscritorPublicacion(EscritorPublicacionDTO escritorPublicacion) {
		this.escritorPublicacion = UtilObject.getDefault(escritorPublicacion, EscritorPublicacionDTO.create());
		return this;
	}

	public final ComentarioRevisorDTO getComentarioRevisor() {
		return comentarioRevisor;
	}

	public final ObservacionRevisionDTO setComentarioRevisor(ComentarioRevisorDTO comentarioRevisor) {
		this.comentarioRevisor = UtilObject.getDefault(comentarioRevisor, ComentarioRevisorDTO.create());
		return this;
	}

	public final LocalDate getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}

	public final ObservacionRevisionDTO setFechaReporteObservacion(LocalDate fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDate.getDefault(fechaReporteObservacion);
		return this;
	}

	public final LocalDate getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}

	public final ObservacionRevisionDTO setFechaRevisionObservacion(LocalDate fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDate.getDefault(fechaRevisionObservacion);
		return this;
	}

	public final EstadoObservacionRevisorDTO getEstado() {
		return estado;
	}

	public final ObservacionRevisionDTO setEstado(EstadoObservacionRevisorDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDTO.create());
		return this;
	}

	public final String getObservacion() {
		return observacion;
	}

	public final ObservacionRevisionDTO setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
		return this;
	}

}
