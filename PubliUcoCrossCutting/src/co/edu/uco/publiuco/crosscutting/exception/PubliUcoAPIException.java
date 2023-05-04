package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoAPIException extends PubliUcoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliUcoAPIException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}

	public static PubliUcoAPIException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliUcoAPIException(technicalMessage, userMessage, rootCause);
	}

	public static PubliUcoAPIException create(final String userMessage) {
		return new PubliUcoAPIException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoAPIException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoAPIException(technicalMessage, userMessage, new Exception());
	}
}