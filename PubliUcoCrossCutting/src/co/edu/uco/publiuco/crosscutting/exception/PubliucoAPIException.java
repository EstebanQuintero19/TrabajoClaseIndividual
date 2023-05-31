package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoAPIException extends PubliucoException {

	private static final long serialVersionUID = 8953339972662659461L;

	private PubliucoAPIException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}

	public static PubliucoAPIException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliucoAPIException(technicalMessage, userMessage, rootCause);
	}

	public static PubliucoAPIException create(final String userMessage) {
		return new PubliucoAPIException(userMessage, userMessage, new Exception());
	}

	public static PubliucoAPIException create(final String technicalMessage, final String userMessage) {
		return new PubliucoAPIException(technicalMessage, userMessage, new Exception());
	}
}
