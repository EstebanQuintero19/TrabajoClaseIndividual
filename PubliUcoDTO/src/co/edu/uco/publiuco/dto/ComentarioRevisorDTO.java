package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorDTO {

	private UUID identificador;
	private RevisorRevisionDTO revisorRevision;
	private TipoComentarioRevisorDTO tipoComentarioRevisor;
	private String comentario;
	
	public ComentarioRevisorDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevisorRevision(RevisorRevisionDTO.create());
		setTipoComentarioRevisor(TipoComentarioRevisorDTO.create());
		setComentario(UtilText.EMPTY);
	}

	public ComentarioRevisorDTO(UUID identificador, RevisorRevisionDTO revisorRevision,
			TipoComentarioRevisorDTO tipoComentarioRevisor, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisorRevision(revisorRevision);
		setTipoComentarioRevisor(tipoComentarioRevisor);
		setComentario(comentario);
	}
	
	public static ComentarioRevisorDTO create() {
		return new ComentarioRevisorDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final ComentarioRevisorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final RevisorRevisionDTO getRevisorRevision() {
		return revisorRevision;
	}

	public final ComentarioRevisorDTO setRevisorRevision(RevisorRevisionDTO revisorRevision) {
		this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionDTO.create());
		return this;
	}

	public final TipoComentarioRevisorDTO getTipoComentarioRevisor() {
		return tipoComentarioRevisor;
	}

	public final ComentarioRevisorDTO setTipoComentarioRevisor(TipoComentarioRevisorDTO tipoComentarioRevisor) {
		this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorDTO.create());
		return this;
	}

	public final String getComentario() {
		return comentario;
	}

	public final ComentarioRevisorDTO setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		return this;
	}

}
