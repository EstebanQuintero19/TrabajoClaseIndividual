package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilNumber;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class VersionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private VersionDTO versionAnterior;
	private int numeroVersion;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoPublicacionDTO estado;

	public VersionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setPublicacion(PublicacionDTO.create());
		setVersionAnterior(VersionDTO.create());
		setNumeroVersion(UtilNumber.ZERO);
		setFechaCreacion(UtilDate.DEFAULT_DATE);
		setFechaUltimaModificacion(UtilDate.DEFAULT_DATE);
		setTitulo(UtilText.EMPTY);
		setResumen(UtilText.EMPTY);
		setCuerpo(UtilText.EMPTY);
		setEstado(EstadoPublicacionDTO.create());
	}

	public VersionDTO(UUID identificador, PublicacionDTO publicacion, VersionDTO versionAnterior, int numeroVersion,
			LocalDate fechaCreacion, LocalDate fechaUltimaModificacion, String titulo, String resumen, String cuerpo,
			EstadoPublicacionDTO estado) {
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

	public static VersionDTO create() {
		return new VersionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final VersionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public final VersionDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public final VersionDTO getVersionAnterior() {
		return versionAnterior;
	}

	public final VersionDTO setVersionAnterior(final VersionDTO versionAnterior) {
		this.versionAnterior = UtilObject.getDefault(versionAnterior, VersionDTO.create());
		return this;
	}

	public final int getNumeroVersion() {
		return numeroVersion;
	}

	public final VersionDTO setNumeroVersion(final int numeroVersion) {
		this.numeroVersion = UtilNumber.getUtilNumber().getDefault(numeroVersion);
		return this;
	}

	public final LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public final VersionDTO setFechaCreacion(final LocalDate fechaCreacion) {
		this.fechaCreacion = UtilDate.getDefault(fechaCreacion);
		return this;
	}

	public final LocalDate getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}

	public final VersionDTO setFechaUltimaModificacion(final LocalDate fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDate.getDefault(fechaUltimaModificacion);
		return this;
	}

	public final String getTitulo() {
		return titulo;
	}

	public final VersionDTO setTitulo(final String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
		return this;
	}

	public final String getResumen() {
		return resumen;
	}

	public final VersionDTO setResumen(final String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
		return this;
	}

	public final String getCuerpo() {
		return cuerpo;
	}

	public final VersionDTO setCuerpo(final String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
		return this;
	}

	public final EstadoPublicacionDTO getEstado() {
		return estado;
	}

	public final VersionDTO setEstado(final EstadoPublicacionDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoPublicacionDTO.create());
		return this;
	}

}
