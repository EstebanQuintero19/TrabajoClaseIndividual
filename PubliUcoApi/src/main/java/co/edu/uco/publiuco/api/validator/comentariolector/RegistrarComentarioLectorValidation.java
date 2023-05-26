package co.edu.uco.publiuco.api.validator.comentariolector;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.comentariolector.common.ComentarioValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ComentarioLectorValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.ComentarioLectorDTO;

public final class RegistrarComentarioLectorValidation implements Validation<ComentarioLectorDTO> {

	private RegistrarComentarioLectorValidation() {
		super();
	}

	public static final Result validate(final ComentarioLectorDTO data) {
		return new RegistrarComentarioLectorValidation().execute(data);
	}

	@Override
	public final Result execute(ComentarioLectorDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(ComentarioLectorValidationMessages.GENERAL);
		} else {

			result.addMessages(ComentarioValidation.validate(data.getComentario()).getMessages());

		}
		return result;
	}

}
