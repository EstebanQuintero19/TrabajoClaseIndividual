package co.edu.uco.publiuco.api.validator.comentariolector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;

public final class FechaCalificacionValidation implements Validation<String> {

	private FechaCalificacionValidation() {
		super();
	}

	public static final Result validate(final String data) {
		return new FechaCalificacionValidation().execute(data);
	}

	@Override
	public final Result execute(String data) {
		return null;

	}

}
