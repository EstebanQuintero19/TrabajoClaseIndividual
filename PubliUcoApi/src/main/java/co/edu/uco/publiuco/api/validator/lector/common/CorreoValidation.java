package co.edu.uco.publiuco.api.validator.lector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorValidationMessages;

public final class CorreoValidation implements Validation<String>{

	private CorreoValidation(){
		super();
	}
	
	public static final Result validate(final String data) {
		return new CorreoValidation().execute(data);
	}
	
	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(LectorValidationMessages.CORREO_IS_NULL);
		} else if (true) {
			result.addMessage(
					LectorValidationMessages.CORREO_IS_DEFAULT);
		}

		return result;
	}

}
