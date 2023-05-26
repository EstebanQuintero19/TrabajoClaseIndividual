package co.edu.uco.publiuco.api.validator.estadolector;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadolector.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.estadolector.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoLectorValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.EstadoLectorDTO;

public final class RegistrarEstadoLectorValidation implements Validation<EstadoLectorDTO> {

	private RegistrarEstadoLectorValidation() {
		super();
	}

	public static final Result validate(final EstadoLectorDTO data) {
		return new RegistrarEstadoLectorValidation().execute(data);
	}

	@Override
	public final Result execute(EstadoLectorDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoLectorValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
