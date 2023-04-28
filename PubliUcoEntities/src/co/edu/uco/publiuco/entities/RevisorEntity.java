package co.edu.uco.publiuco.entities;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class RevisorEntity {
	
	private static final RevisorEntity DEFAULT_OBJECT = new RevisorEntity();
	private UUID identificador;
	private TipoIdentificacionEntity tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correo;
	private String indicadorPais;
	private String numeroTelefono;
	private TipoRelacionInstitucionEntity tipoRelacion;
	private RespuestaEntity confirmacionCorreo;
	private RespuestaEntity confirmacionTelefono;
	private EstadoRevisorEntity estado;
	
	private RevisorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setNumeroIdentificacion(UtilText.EMPTY);
		setPrimerNombre(UtilText.EMPTY);
		setSegundoNombre(UtilText.EMPTY);
		setPrimerApellido(UtilText.EMPTY);
		setSegundoApellido(UtilText.EMPTY);
		setCorreo(UtilText.EMPTY);
		setIndicadorPais(UtilText.EMPTY);
		setNumeroTelefono(UtilText.EMPTY);
		setTipoRelacion(TipoRelacionInstitucionEntity.getDefaultObject());
		setConfirmacionCorreo(RespuestaEntity.getDefaultObject());
		setConfirmacionTelefono(RespuestaEntity.getDefaultObject());
		setEstado(EstadoRevisorEntity.getDefaultObject());
	}
	
	public RevisorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion,
			String numeroIdentificacion, String primerNombre, String segundoNombre, String primerApellido,
			String segundoApellido, String correo, String indicadorPais, String numeroTelefono,
			TipoRelacionInstitucionEntity tipoRelacion, RespuestaEntity confirmacionCorreo, RespuestaEntity confirmacionTelefono,
			EstadoRevisorEntity estado) {
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
	
	public static RevisorEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	private final void setTipoIdentificacion(final TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
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

	public final TipoRelacionInstitucionEntity getTipoRelacion() {
		return tipoRelacion;
	}

	private final void setTipoRelacion(final TipoRelacionInstitucionEntity tipoRelacion) {
		this.tipoRelacion = UtilObject.getDefault(tipoRelacion, TipoRelacionInstitucionEntity.getDefaultObject());
	}

	public final RespuestaEntity getConfirmacionCorreo() {
		return confirmacionCorreo;
	}

	private final void setConfirmacionCorreo(final RespuestaEntity confirmacionCorreo) {
		this.confirmacionCorreo = UtilObject.getDefault(confirmacionCorreo, RespuestaEntity.getDefaultObject());
	}

	public final RespuestaEntity getConfirmacionTelefono() {
		return confirmacionTelefono;
	}

	private final void setConfirmacionTelefono(final RespuestaEntity confirmacionTelefono) {
		this.confirmacionTelefono = UtilObject.getDefault(confirmacionTelefono, RespuestaEntity.getDefaultObject());
	}

	public final EstadoRevisorEntity getEstado() {
		return estado;
	}

	private final void setEstado(final EstadoRevisorEntity estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisorEntity.getDefaultObject());
	}
}
