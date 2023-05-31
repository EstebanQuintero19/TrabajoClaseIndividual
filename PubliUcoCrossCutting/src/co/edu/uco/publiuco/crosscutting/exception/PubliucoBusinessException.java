package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoBusinessException extends PubliucoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliucoBusinessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.BUSINESS);
	}

	public static PubliucoBusinessException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliucoBusinessException(technicalMessage, userMessage, rootCause);
	}

	public static PubliucoBusinessException create(final String userMessage) {
		return new PubliucoBusinessException(userMessage, userMessage, new Exception());
	}

	public static PubliucoBusinessException create(final String technicalMessage, final String userMessage) {
		return new PubliucoBusinessException(technicalMessage, userMessage, new Exception());
	}
}
