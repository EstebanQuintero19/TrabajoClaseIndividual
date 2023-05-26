package co.edu.uco.publiuco.api.validator.estadotipoacceso;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadotipoacceso.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.estadotipoacceso.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoAccesoValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.EstadoTipoAccesoDTO;

public final class RegistrarEstadoTipoAccesoValidation implements Validation<EstadoTipoAccesoDTO> {

	private RegistrarEstadoTipoAccesoValidation() {
		super();
	}

	public static final Result validate(final EstadoTipoAccesoDTO data) {
		return new RegistrarEstadoTipoAccesoValidation().execute(data);
	}

	@Override
	public final Result execute(EstadoTipoAccesoDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoTipoAccesoValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
