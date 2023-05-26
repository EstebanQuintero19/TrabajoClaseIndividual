package co.edu.uco.publiuco.api.validator.estadocomentariolector.common;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;

public final class DescripcionValidation implements Validation<String> {

	private DescripcionValidation() {
		super();
	}

	public static final Result validate(final String data) {
		return new DescripcionValidation().execute(data);
	}

	@Override
	public final Result execute(String data) {
		// TODO Auto-generated method stub
		return null;
	}

}
