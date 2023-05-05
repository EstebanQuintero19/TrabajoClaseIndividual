package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ReporteDomain {

	private static final ReporteDomain DEFAULT_OBJECT = new ReporteDomain();
	private UUID identificador;
	private LectorDomain lector;
	private ComentarioLectorDomain comentario;
	private TipoReporteDomain tipoReporte;
	private String razon;
	private LocalDate fechaReporte;

	private ReporteDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorDomain.getDefaultObject());
		setComentario(ComentarioLectorDomain.getDefaultObject());
		setTipoReporte(TipoReporteDomain.getDefaultObject());
		setRazon(UtilText.EMPTY);
		setFechaReporte(UtilDate.DEFAULT_DATE);
	}

	public ReporteDomain(UUID identificador, LectorDomain lector, ComentarioLectorDomain comentario,
			TipoReporteDomain tipoReporte, String razon, LocalDate fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}

	public static ReporteDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorDomain getLector() {
		return lector;
	}

	private final void setLector(final LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}

	public final ComentarioLectorDomain getComentario() {
		return comentario;
	}

	private final void setComentario(final ComentarioLectorDomain comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDomain.getDefaultObject());
	}

	public final TipoReporteDomain getTipoReporte() {
		return tipoReporte;
	}

	private final void setTipoReporte(final TipoReporteDomain tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDomain.getDefaultObject());
	}

	public final String getRazon() {
		return razon;
	}

	private final void setRazon(final String razon) {
		this.razon = UtilText.getUtilText().applyTrim(razon);
	}

	public final LocalDate getFechaReporte() {
		return fechaReporte;
	}

	private final void setFechaReporte(final LocalDate fechaReporte) {
		this.fechaReporte = UtilDate.getDefault(fechaReporte);
	}
}