package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class AdministradorCategoriaDTO {

	private UUID identificador;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private String indicadorPais;
	private String numeroTelefono;
	private TipoRelacionInstitucionDTO tipoRelacion;
	private RespuestaDTO confirmacionCorreo;
	private RespuestaDTO confirmacionTelefono;
	private EstadoAdministradorCategoriaDTO estado;
	
	public AdministradorCategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionDTO.create());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(UtilText.EMPTY);
		setIndicadorPais(UtilText.EMPTY);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacion(TipoRelacionInstitucionDTO.create());
		setConfirmacionCorreo(RespuestaDTO.create());
		setConfirmacionTelefono(RespuestaDTO.create());
		setEstado(EstadoAdministradorCategoriaDTO.create());
	}

	public AdministradorCategoriaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String indicadorPais, String numeroTelefono,
			TipoRelacionInstitucionDTO tipoRelacion, RespuestaDTO confirmacionCorreo, RespuestaDTO confirmacionTelefono,
			EstadoAdministradorCategoriaDTO estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreo(correo);
		setIndicadorPais(indicadorPais);
		setNumeroTelefono(numeroTelefono);
		setTipoRelacion(tipoRelacion);
		setConfirmacionCorreo(confirmacionCorreo);
		setConfirmacionTelefono(confirmacionTelefono);
		setEstado(estado);
	}
	
	public static AdministradorCategoriaDTO create() {
		return new AdministradorCategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final AdministradorCategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public final AdministradorCategoriaDTO setTipoIdentificacion(final TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDTO.create());
		return this;
	}

	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public final AdministradorCategoriaDTO setNumeroIdentificacion(final String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		return this;
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}

	public final AdministradorCategoriaDTO setPrimerNombre(final String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
		return this;
	}

	public final String getSegundoNombre() {
		return segundoNombre;
	}

	public final AdministradorCategoriaDTO setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		return this;
	}

	public final String getPrimerApellido() {
		return primerApellido;
	}

	public final AdministradorCategoriaDTO setPrimerApellido(final String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		return this;
	}

	public final String getSegundoApellido() {
		return segundoApellido;
	}

	public final AdministradorCategoriaDTO setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		return this;
	}

	public final String getCorreo() {
		return correo;
	}

	public final AdministradorCategoriaDTO setCorreo(final String correo) {
		this.correo = UtilText.getDefaultEmail(correo);
		return this;
	}

	public final String getIndicadorPais() {
		return indicadorPais;
	}

	public final AdministradorCategoriaDTO setIndicadorPais(final String indicadorPais) {
		this.indicadorPais = UtilText.getUtilText().applyTrim(indicadorPais);
		return this;
	}

	public final String getNumeroTelefono() {
		return numeroTelefono;
	}

	public final AdministradorCategoriaDTO setNumeroTelefono(final String numeroTelefono) {
		this.numeroTelefono = UtilText.getUtilText().applyTrim(numeroTelefono);
		return this;
	}

	public final TipoRelacionInstitucionDTO getTipoRelacion() {
		return tipoRelacion;
	}

	public final AdministradorCategoriaDTO setTipoRelacion(final TipoRelacionInstitucionDTO tipoRelacion) {
		this.tipoRelacion = UtilObject.getDefault(tipoRelacion, TipoRelacionInstitucionDTO.create());
		return this;
	}

	public final RespuestaDTO getConfirmacionCorreo() {
		return confirmacionCorreo;
	}

	public final AdministradorCategoriaDTO setConfirmacionCorreo(final RespuestaDTO confirmacionCorreo) {
		this.confirmacionCorreo = UtilObject.getDefault(confirmacionCorreo, RespuestaDTO.create());
		return this;
	}

	public final RespuestaDTO getConfirmacionTelefono() {
		return confirmacionTelefono;
	}

	public final AdministradorCategoriaDTO setConfirmacionTelefono(final RespuestaDTO confirmacionTelefono) {
		this.confirmacionTelefono = UtilObject.getDefault(confirmacionTelefono, RespuestaDTO.create());
		return this;
	}

	public final EstadoAdministradorCategoriaDTO getEstado() {
		return estado;
	}

	public final AdministradorCategoriaDTO setEstado(final EstadoAdministradorCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoAdministradorCategoriaDTO.create());
		return this;
	}
}
