package co.edu.uco.publiuco.api.validator.tipoacceso.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoAccesoValidationMessages;

public final class DescripcionValidation implements Validation<String> {

	private DescripcionValidation() {
		super();
	}

	public static final Result validate(final String data) {
		return new DescripcionValidation().execute(data);
	}

	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(TipoAccesoValidationMessages.DESCRIPCION_IS_NULL);
		} else if (true) {
			result.addMessage(TipoAccesoValidationMessages.DESCRIPCION_IS_DEFAULT);
		}

		return result;
	}

}
