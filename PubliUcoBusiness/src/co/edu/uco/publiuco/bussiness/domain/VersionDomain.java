package co.edu.uco.publiuco.bussiness.domain;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class VersionDomain {

	private static final VersionDomain DEFAULT_OBJECT = new VersionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private VersionDomain versionAnterior;
	private int numeroVersion;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoPublicacionDomain estado;

	private VersionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDomain.getDefaultObject());
		setVersionAnterior(VersionDomain.getDefaultObject());
		setNumeroVersion(UtilNumber.ZERO);
		setFechaCreacion(UtilDate.DEFAULT_DATE);
		setFechaUltimaModificacion(UtilDate.DEFAULT_DATE);
		setTitulo(UtilText.EMPTY);
		setResumen(UtilText.EMPTY);
		setCuerpo(UtilText.EMPTY);
		setEstado(EstadoPublicacionDomain.getDefaultObject());
	}

	public VersionDomain(UUID identificador, PublicacionDomain publicacion, VersionDomain versionAnterior,
			int numeroVersion, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, String titulo,
			String resumen, String cuerpo, EstadoPublicacionDomain estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersionAnterior(versionAnterior);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}

	public static VersionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}

	public final VersionDomain getVersionAnterior() {
		return versionAnterior;
	}

	private final void setVersionAnterior(final VersionDomain versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDomain.getDefaultObject());
	}

	public final int getNumeroVersion() {
		return numeroVersion;
	}

	private final void setNumeroVersion(final int numeroVersion) {
		this.numeroVersion = UtilNumber.getUtilNumber().getDefault(numeroVersion);
	}

	public final LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	private final void setFechaCreacion(final LocalDate fechaCreacion) {
		this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
	}

	public final LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	private final void setFechaUltimaModificacion(final LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDate.getDefault(fechaUltimaModificacion);
	}

	public final String getTitulo() {
		return titulo;
	}

	private final void setTitulo(final String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
	}

	public final String getResumen() {
		return resumen;
	}

	private final void setResumen(final String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
	}

	public final String getCuerpo() {
		return cuerpo;
	}

	private final void setCuerpo(final String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
	}

	public final EstadoPublicacionDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDomain.getDefaultObject());
	}

}