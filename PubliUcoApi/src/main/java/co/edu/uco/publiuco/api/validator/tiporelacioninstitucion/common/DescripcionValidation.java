package co.edu.uco.publiuco.api.validator.tiporelacioninstitucion.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoRelacionInstitucionValidationMessages;

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
			result.addMessage(TipoRelacionInstitucionValidationMessages.DESCRIPCION_IS_NULL);
		} else if (true) {
			result.addMessage(TipoRelacionInstitucionValidationMessages.DESCRIPCION_IS_DEFAULT);
		}

		return result;
	}

}
