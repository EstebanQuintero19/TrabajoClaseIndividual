package co.edu.uco.publiuco.entities;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class VersionEntity {

	private static final VersionEntity DEFAULT_OBJECT = new VersionEntity();
	private UUID identificador;
	private PublicacionEntity publicacion;
	private VersionEntity versionAnterior;
	private int numeroVersion;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoPublicacionEntity estado;

	private VersionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionEntity.getDefaultObject());
		setVersionAnterior(VersionEntity.getDefaultObject());
		setNumeroVersion(UtilNumber.ZERO);
		setFechaCreacion(UtilDate.DEFAULT_DATE);
		setFechaUltimaModificacion(UtilDate.DEFAULT_DATE);
		setTitulo(UtilText.EMPTY);
		setResumen(UtilText.EMPTY);
		setCuerpo(UtilText.EMPTY);
		setEstado(EstadoPublicacionEntity.getDefaultObject());
	}

	public VersionEntity(UUID identificador, PublicacionEntity publicacion, VersionEntity versionAnterior,
			int numeroVersion, LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, String titulo,
			String resumen, String cuerpo, EstadoPublicacionEntity estado) {
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

	public static VersionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final PublicacionEntity getPublicacion() {
		return publicacion;
	}

	private final void setPublicacion(final PublicacionEntity publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionEntity.getDefaultObject());
	}

	public final VersionEntity getVersionAnterior() {
		return versionAnterior;
	}

	private final void setVersionAnterior(final VersionEntity versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionEntity.getDefaultObject());
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

	public final EstadoPublicacionEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoPublicacionEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionEntity.getDefaultObject());
	}

}
