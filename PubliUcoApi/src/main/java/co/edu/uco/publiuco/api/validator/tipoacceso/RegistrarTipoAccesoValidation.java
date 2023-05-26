package co.edu.uco.publiuco.api.validator.tipoacceso;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.tipoacceso.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.tipoacceso.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoAccesoValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.TipoAccesoDTO;

public final class RegistrarTipoAccesoValidation implements Validation<TipoAccesoDTO> {

	private RegistrarTipoAccesoValidation() {
		super();
	}

	public static final Result validate(final TipoAccesoDTO data) {
		return new RegistrarTipoAccesoValidation().execute(data);
	}

	@Override
	public final Result execute(TipoAccesoDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(TipoAccesoValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
