package co.edu.uco.publiuco.api.validator.estadopublicacion;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadopublicacion.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.estadopublicacion.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoPublicacionValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.EstadoPublicacionDTO;

public final class RegistrarEstadoPublicacionValidation implements Validation<EstadoPublicacionDTO> {

	private RegistrarEstadoPublicacionValidation() {
		super();
	}

	public static final Result validate(final EstadoPublicacionDTO data) {
		return new RegistrarEstadoPublicacionValidation().execute(data);
	}

	@Override
	public final Result execute(EstadoPublicacionDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoPublicacionValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
