package co.edu.uco.publiuco.api.validator.lector;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.lector.common.CorreoValidation;
import co.edu.uco.publiuco.api.validator.lector.common.IndicadorPaisValidation;
import co.edu.uco.publiuco.api.validator.lector.common.NumeroIdentificacionValidation;
import co.edu.uco.publiuco.api.validator.lector.common.NumeroTelefonoValidation;
import co.edu.uco.publiuco.api.validator.lector.common.PrimerApellidoValidation;
import co.edu.uco.publiuco.api.validator.lector.common.PrimerNombreValidation;
import co.edu.uco.publiuco.api.validator.lector.common.SegundoApellidoValidation;
import co.edu.uco.publiuco.api.validator.lector.common.SegundoNombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.LectorDTO;

public final class RegistrarLectorValidation implements Validation<LectorDTO> {

	private RegistrarLectorValidation() {
		super();
	}

	public static final Result validate(final LectorDTO data) {
		return new RegistrarLectorValidation().execute(data);
	}

	@Override
	public final Result execute(LectorDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(LectorValidationMessages.GENERAL);
		} else {

			result.addMessages(PrimerNombreValidation.validate(data.getPrimerNombre()).getMessages());
			result.addMessages(SegundoNombreValidation.validate(data.getSegundoNombre()).getMessages());
			result.addMessages(PrimerApellidoValidation.validate(data.getPrimerApellido()).getMessages());
			result.addMessages(SegundoApellidoValidation.validate(data.getSegundoApellido()).getMessages());
			result.addMessages(NumeroIdentificacionValidation.validate(data.getNumeroIdentificacion()).getMessages());
			result.addMessages(NumeroTelefonoValidation.validate(data.getNumeroTelefono()).getMessages());
			result.addMessages(CorreoValidation.validate(data.getCorreo()).getMessages());
			result.addMessages(IndicadorPaisValidation.validate(data.getIndicadorPais()).getMessages());

		}
		return result;
	}

}
