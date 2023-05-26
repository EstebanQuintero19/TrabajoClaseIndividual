package co.edu.uco.publiuco.api.validator.respuesta;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.respuesta.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.respuesta.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.RespuestaValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.RespuestaDTO;

public final class RegistrarRespuestaValidation implements Validation<RespuestaDTO> {

	private RegistrarRespuestaValidation() {
		super();
	}

	public static final Result validate(final RespuestaDTO data) {
		return new RegistrarRespuestaValidation().execute(data);
	}

	@Override
	public final Result execute(RespuestaDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(RespuestaValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
