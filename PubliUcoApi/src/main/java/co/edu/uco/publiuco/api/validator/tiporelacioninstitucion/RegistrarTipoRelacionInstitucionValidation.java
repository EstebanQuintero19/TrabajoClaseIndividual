package co.edu.uco.publiuco.api.validator.tiporelacioninstitucion;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.tipoidentificacion.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.tipoidentificacion.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoRelacionInstitucionValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;

public final class RegistrarTipoRelacionInstitucionValidation implements Validation<TipoRelacionInstitucionDTO> {

	private RegistrarTipoRelacionInstitucionValidation() {
		super();
	}

	public static final Result validate(final TipoRelacionInstitucionDTO data) {
		return new RegistrarTipoRelacionInstitucionValidation().execute(data);
	}

	@Override
	public final Result execute(TipoRelacionInstitucionDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(TipoRelacionInstitucionValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
