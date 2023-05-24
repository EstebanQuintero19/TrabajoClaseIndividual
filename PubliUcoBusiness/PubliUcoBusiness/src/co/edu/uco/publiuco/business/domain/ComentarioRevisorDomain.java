package co.edu.uco.publiuco.business.domain;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorDomain {
	
	private static final ComentarioRevisorDomain DEFAULT_OBJECT = new ComentarioRevisorDomain();
	private UUID identificador;
	private RevisorRevisionDomain revisorRevision;
	private TipoComentarioRevisorDomain tipoComentarioRevisor;
	private String comentario;
	
	private ComentarioRevisorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setRevisorRevision(RevisorRevisionDomain.getDefaultObject());
		setTipoComentarioRevisor(TipoComentarioRevisorDomain.getDefaultObject());
		setComentario(UtilText.EMPTY);
	}

	public ComentarioRevisorDomain(UUID identificador, RevisorRevisionDomain revisorRevision,
			TipoComentarioRevisorDomain tipoComentarioRevisor, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisorRevision(revisorRevision);
		setTipoComentarioRevisor(tipoComentarioRevisor);
		setComentario(comentario);
	}
	
	public static ComentarioRevisorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}

	public final RevisorRevisionDomain getRevisorRevision() {
		return revisorRevision;
	}

	private final void setRevisorRevision(RevisorRevisionDomain revisorRevision) {
		this.revisorRevision = UtilObject.getDefault(revisorRevision, RevisorRevisionDomain.getDefaultObject());
	}

	public final TipoComentarioRevisorDomain getTipoComentarioRevisor() {
		return tipoComentarioRevisor;
	}

	private final void setTipoComentarioRevisor(TipoComentarioRevisorDomain tipoComentarioRevisor) {
		this.tipoComentarioRevisor = UtilObject.getDefault(tipoComentarioRevisor, TipoComentarioRevisorDomain.getDefaultObject());
	}

	public final String getComentario() {
		return comentario;
	}

	private final void setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
	}

}
