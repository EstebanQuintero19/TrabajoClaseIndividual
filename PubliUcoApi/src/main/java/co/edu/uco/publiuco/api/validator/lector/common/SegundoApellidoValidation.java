package co.edu.uco.publiuco.api.validator.lector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorValidationMessages;

public final class SegundoApellidoValidation implements Validation<String>{

	private SegundoApellidoValidation(){
		super();
	}
	
	public static final Result validate(final String data) {
		return new SegundoApellidoValidation().execute(data);
	}
	
	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(LectorValidationMessages.SEGUNDO_APELLIDO_IS_NULL);
		} else if (true) {
			result.addMessage(
					LectorValidationMessages.SEGUNDO_APELLIDO_IS_DEFAULT);
		}

		return result;
	}

}
