package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class ReporteEntity {

	private static final ReporteEntity DEFAULT_OBJECT = new ReporteEntity();
	private UUID identificador;
	private LectorEntity lector;
	private ComentarioLectorEntity comentario;
	private TipoReporteEntity tipoReporte;
	private String razon;
	private LocalDate fechaReporte;

	private ReporteEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setLector(LectorEntity.getDefaultObject());
		setComentario(ComentarioLectorEntity.getDefaultObject());
		setTipoReporte(TipoReporteEntity.getDefaultObject());
		setRazon(UtilText.EMPTY);
		setFechaReporte(UtilDate.DEFAULT_DATE);
	}

	public ReporteEntity(UUID identificador, LectorEntity lector, ComentarioLectorEntity comentario,
			TipoReporteEntity tipoReporte, String razon, LocalDate fechaReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
		setRazon(razon);
		setFechaReporte(fechaReporte);
	}

	public static ReporteEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final LectorEntity getLector() {
		return lector;
	}

	private final void setLector(final LectorEntity lector) {
		this.lector = UtilObject.getDefault(lector, LectorEntity.getDefaultObject());
	}

	public final ComentarioLectorEntity getComentario() {
		return comentario;
	}

	private final void setComentario(final ComentarioLectorEntity comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorEntity.getDefaultObject());
	}

	public final TipoReporteEntity getTipoReporte() {
		return tipoReporte;
	}

	private final void setTipoReporte(final TipoReporteEntity tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteEntity.getDefaultObject());
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
