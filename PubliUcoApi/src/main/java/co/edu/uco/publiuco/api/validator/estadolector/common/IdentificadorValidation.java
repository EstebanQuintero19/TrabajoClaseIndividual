package co.edu.uco.publiuco.api.validator.estadolector.common;

import java.util.UUID;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoLectorValidationMessages;

public final class IdentificadorValidation implements Validation<UUID> {

	private IdentificadorValidation() {
		super();
	}

	public static final Result validate(final UUID data) {
		return new IdentificadorValidation().execute(data);
	}

	@Override
	public Result execute(UUID data) {

		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoLectorValidationMessages.IDENTIFICADOR_IS_NULL);
		} else if (UtilUUID.isDefault(data)) {
			result.addMessage(EstadoLectorValidationMessages.IDENTIFICADOR_IS_DEFAULT);
		}

		return result;
	}

}
