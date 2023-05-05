package co.edu.uco.publiuco.bussiness.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class LectorDomain {

	private static final LectorDomain DEFAULT_OBJECT = new LectorDomain();
	private UUID identificador;
	private TipoIdentificacionDomain tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private String indicadorPais;
	private String numeroTelefono;
	private TipoRelacionInstitucionDomain tipoRelacion;
	private RespuestaDomain confirmacionCorreo;
	private RespuestaDomain confirmacionTelefono;
	private EstadoLectorDomain estado;

	private LectorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionDomain.getDefaultObject());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(UtilText.EMPTY);
		setIndicadorPais(UtilText.EMPTY);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacion(TipoRelacionInstitucionDomain.getDefaultObject());
		setConfirmacionCorreo(RespuestaDomain.getDefaultObject());
		setConfirmacionTelefono(RespuestaDomain.getDefaultObject());
		setEstado(EstadoLectorDomain.getDefaultObject());
	}

	public LectorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String numeroIdentificacion,
			String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String correo,
			String indicadorPais, String numeroTelefono, TipoRelacionInstitucionDomain tipoRelacion,
			RespuestaDomain confirmacionCorreo, RespuestaDomain confirmacionTelefono, EstadoLectorDomain estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		;
		setNumeroIdentificacion(numeroIdentificacion);
		;
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

	public static LectorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	private final void setTipoIdentificacion(final TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion,
				TipoIdentificacionDomain.getDefaultObject());
	}

	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	private final void setNumeroIdentificacion(final String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
	}

	public final String getPrimerNombre() {
		return primerNombre;
	}

	private final void setPrimerNombre(final String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
	}

	public final String getSegundoNombre() {
		return segundoNombre;
	}

	private final void setSegundoNombre(final String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
	}

	public final String getPrimerApellido() {
		return primerApellido;
	}

	private final void setPrimerApellido(final String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
	}

	public final String getSegundoApellido() {
		return segundoApellido;
	}

	private final void setSegundoApellido(final String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
	}

	public final String getCorreo() {
		return correo;
	}

	private final void setCorreo(final String correo) {
		this.correo = UtilText.getDefaultEmail(correo);
	}

	public final String getIndicadorPais() {
		return indicadorPais;
	}

	private final void setIndicadorPais(final String indicadorPais) {
		this.indicadorPais = UtilText.getUtilText().applyTrim(indicadorPais);
	}

	public final String getNumeroTelefono() {
		return numeroTelefono;
	}

	private final void setNumeroTelefono(final String numeroTelefono) {
		this.numeroTelefono = UtilText.getUtilText().applyTrim(numeroTelefono);
	}

	public final TipoRelacionInstitucionDomain getTipoRelacion() {
		return tipoRelacion;
	}

	private final void setTipoRelacion(final TipoRelacionInstitucionDomain tipoRelacion) {
		this.tipoRelacion = UtilObject.getDefault(tipoRelacion, TipoRelacionInstitucionDomain.getDefaultObject());
	}

	public final RespuestaDomain getConfirmacionCorreo() {
		return confirmacionCorreo;
	}

	private final void setConfirmacionCorreo(final RespuestaDomain confirmacionCorreo) {
		this.confirmacionCorreo = UtilObject.getDefault(confirmacionCorreo, RespuestaDomain.getDefaultObject());
	}

	public final RespuestaDomain getConfirmacionTelefono() {
		return confirmacionTelefono;
	}

	private final void setConfirmacionTelefono(final RespuestaDomain confirmacionTelefono) {
		this.confirmacionTelefono = UtilObject.getDefault(confirmacionTelefono, RespuestaDomain.getDefaultObject());
	}

	public final EstadoLectorDomain getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoLectorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoLectorDomain.getDefaultObject());
	}
}