package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoDataException extends PubliucoException {

	private static final long serialVersionUID = 3675881527420809859L;

	private PubliucoDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}

	public static PubliucoDataException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliucoDataException(technicalMessage, userMessage, rootCause);
	}

	public static PubliucoDataException create(final String userMessage) {
		return new PubliucoDataException(userMessage, userMessage, new Exception());
	}

	public static PubliucoDataException create(final String technicalMessage, final String userMessage) {
		return new PubliucoDataException(technicalMessage, userMessage, new Exception());
	}
}
