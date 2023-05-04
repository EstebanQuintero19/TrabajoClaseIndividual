package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoCrossCuttingException extends PubliUcoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliUcoCrossCuttingException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.CROSSCUTTING);
	}

	public static PubliUcoCrossCuttingException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliUcoCrossCuttingException(technicalMessage, userMessage, rootCause);
	}

	public static PubliUcoCrossCuttingException create(final String userMessage) {
		return new PubliUcoCrossCuttingException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoCrossCuttingException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoCrossCuttingException(technicalMessage, userMessage, new Exception());
	}
}