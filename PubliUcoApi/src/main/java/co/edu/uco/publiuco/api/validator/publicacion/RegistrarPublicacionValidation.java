package co.edu.uco.publiuco.api.validator.publicacion;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PublicacionValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.PublicacionDTO;

public final class RegistrarPublicacionValidation implements Validation<PublicacionDTO> {

	private RegistrarPublicacionValidation() {
		super();
	}

	public static final Result validate(final PublicacionDTO data) {
		return new RegistrarPublicacionValidation().execute(data);
	}

	@Override
	public final Result execute(PublicacionDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(PublicacionValidationMessages.GENERAL);

		}
		return result;

	}
}
