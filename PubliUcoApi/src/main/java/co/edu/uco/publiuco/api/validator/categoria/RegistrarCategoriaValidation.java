package co.edu.uco.publiuco.api.validator.categoria;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.categoria.common.DescripcionValidation;
import co.edu.uco.publiuco.api.validator.categoria.common.NombreValidation;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CategoriaValidationMessages;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.dto.CategoriaDTO;

public final class RegistrarCategoriaValidation implements Validation<CategoriaDTO> {

	private RegistrarCategoriaValidation() {
		super();
	}

	public static final Result validate(final CategoriaDTO data) {
		return new RegistrarCategoriaValidation().execute(data);
	}

	@Override
	public final Result execute(CategoriaDTO data) {
		var result = Result.create();

		if (UtilObject.isNull(data)) {
			result.addMessage(CategoriaValidationMessages.GENERAL);
		} else {

			result.addMessages(NombreValidation.validate(data.getNombre()).getMessages());
			result.addMessages(DescripcionValidation.validate(data.getDescripcion()).getMessages());

		}
		return result;
	}

}
