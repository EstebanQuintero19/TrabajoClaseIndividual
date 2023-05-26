package co.edu.uco.publiuco.api.validator.comentariolector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ComentarioLectorValidationMessages;

public final class ComentarioValidation implements Validation<String> {

	private ComentarioValidation() {
		super();
	}

	public static final Result validate(final String data) {
		return new ComentarioValidation().execute(data);
	}

	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(ComentarioLectorValidationMessages.COMENTARIO_IS_NULL);
		} else if (true) {
			result.addMessage(ComentarioLectorValidationMessages.COMENTARIO_IS_DEFAULT);
		}

		return result;
	}

}
