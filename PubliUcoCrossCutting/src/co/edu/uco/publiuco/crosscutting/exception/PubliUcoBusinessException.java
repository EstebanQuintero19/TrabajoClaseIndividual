package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoBusinessException extends PubliUcoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliUcoBusinessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSINESS);
	}

	public static PubliUcoBusinessException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliUcoBusinessException(technicalMessage, userMessage, rootCause);
	}

	public static PubliUcoBusinessException create(final String userMessage) {
		return new PubliUcoBusinessException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoBusinessException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoBusinessException(technicalMessage, userMessage, new Exception());
	}
}