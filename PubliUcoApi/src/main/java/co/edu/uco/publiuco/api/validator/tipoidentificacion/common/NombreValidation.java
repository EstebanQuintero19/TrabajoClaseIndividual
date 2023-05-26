package co.edu.uco.publiuco.api.validator.tipoidentificacion.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoIdentificacionValidationMessages;

public final class NombreValidation implements Validation<String> {

	private NombreValidation() {
		super();
	}

	public static final Result validate(final String data) {
		return new NombreValidation().execute(data);
	}

	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(TipoIdentificacionValidationMessages.NOMBRE_IS_NULL);
		} else if (true) {
			result.addMessage(TipoIdentificacionValidationMessages.NOMBRE_IS_DEFAULT);
		}

		return result;
	}

}
