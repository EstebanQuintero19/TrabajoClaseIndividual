package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ReporteDTO {

	private UUID identificador;
	private LectorDTO lector;
	private ComentarioLectorDTO comentario;
	private TipoReporteDTO tipoReporte;
	private String razon;
	private LocalDate fechaReporte;
	
	public ReporteDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDTO.create());
		setComentario(ComentarioLectorDTO.create());
		setTipoReporte(TipoReporteDTO.create());
		setRazon(UtilText.EMPTY);
		setFechaReporte(UtilDate.DEFAULT_DATE);
	}

	public ReporteDTO(UUID identificador, LectorDTO lector, ComentarioLectorDTO comentario, TipoReporteDTO tipoReporte,
			String razon, LocalDate fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}
	
	public static ReporteDTO create() {
		return new ReporteDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final ReporteDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final LectorDTO getLector() {
		return lector;
	}

	public final ReporteDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public final ComentarioLectorDTO getComentario() {
		return comentario;
	}

	public final ReporteDTO setComentario(final ComentarioLectorDTO comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDTO.create());
		return this;
	}

	public final TipoReporteDTO getTipoReporte() {
		return tipoReporte;
	}

	public final ReporteDTO setTipoReporte(final TipoReporteDTO tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDTO.create());
		return this;
	}

	public final String getRazon() {
		return razon;
	}

	public final ReporteDTO setRazon(final String razon) {
		this.razon = UtilText.getUtilText().applyTrim(razon);
		return this;
	}

	public final LocalDate getFechaReporte() {
		return fechaReporte;
	}

	public final ReporteDTO setFechaReporte(final LocalDate fechaReporte) {
		this.fechaReporte = UtilDate.getDefault(fechaReporte);
		return this;
	}
}