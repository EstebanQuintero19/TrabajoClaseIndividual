package co.edu.uco.publiuco.api.validator.tipoidentificacion;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.tipoidentificacion.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.tipoidentificacion.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoIdentificacionValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.TipoIdentificacionDTO;

public final class RegistrarTipoIdentificacionValidation implements Validation<TipoIdentificacionDTO> {

	private RegistrarTipoIdentificacionValidation() {
		super();
	}

	public static final Result validate(final TipoIdentificacionDTO data) {
		return new RegistrarTipoIdentificacionValidation().execute(data);
	}

	@Override
	public final Result execute(TipoIdentificacionDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(TipoIdentificacionValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
