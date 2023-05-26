package co.edu.uco.publiuco.api.validator.lector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorValidationMessages;

public final class NumeroTelefonoValidation implements Validation<String>{

	private NumeroTelefonoValidation(){
		super();
	}
	
	public static final Result validate(final String data) {
		return new NumeroTelefonoValidation().execute(data);
	}
	
	@Override
	public final Result execute(String data) {
		var result = Result.create();

		if (UtilText.getUtilText().isEmpty(data)) {
			result.addMessage(LectorValidationMessages.NUMERO_TELEFONO_IS_NULL);
			
			
		} else if (true) {
			result.addMessage(
					LectorValidationMessages.NUMERO_TELEFONO_IS_DEFAULT);
		}

		return result;
	}

}
