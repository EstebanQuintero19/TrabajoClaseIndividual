package co.edu.uco.publiuco.api.validator.estadocomentariolector;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadocomentariolector.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.estadocomentariolector.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoComentarioLectorValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.EstadoComentarioLectorDTO;

public final class RegistrarEstadoComentarioLectorValidation implements Validation<EstadoComentarioLectorDTO> {

	private RegistrarEstadoComentarioLectorValidation() {
		super();
	}

	public static final Result validate(final EstadoComentarioLectorDTO data) {
		return new RegistrarEstadoComentarioLectorValidation().execute(data);
	}

	@Override
	public final Result execute(EstadoComentarioLectorDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoComentarioLectorValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
