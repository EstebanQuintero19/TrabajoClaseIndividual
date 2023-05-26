package co.edu.uco.publiuco.api.validator.estadotipoidentificacion;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadotipoidentificacion.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.estadotipoidentificacion.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoIdentificacionValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;

public final class RegistrarEstadoTipoIdentificacionValidation implements Validation<EstadoTipoIdentificacionDTO> {

	private RegistrarEstadoTipoIdentificacionValidation() {
		super();
	}

	public static final Result validate(final EstadoTipoIdentificacionDTO data) {
		return new RegistrarEstadoTipoIdentificacionValidation().execute(data);
	}

	@Override
	public final Result execute(EstadoTipoIdentificacionDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(EstadoTipoIdentificacionValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
