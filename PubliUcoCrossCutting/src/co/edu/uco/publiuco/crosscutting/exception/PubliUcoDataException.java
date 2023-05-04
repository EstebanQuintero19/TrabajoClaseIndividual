package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoDataException extends PubliUcoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliUcoDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DATA);
	}

	public static PubliUcoDataException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliUcoDataException(technicalMessage, userMessage, rootCause);
	}

	public static PubliUcoDataException create(final String userMessage) {
		return new PubliUcoDataException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoDataException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoDataException(technicalMessage, userMessage, new Exception());
	}
}