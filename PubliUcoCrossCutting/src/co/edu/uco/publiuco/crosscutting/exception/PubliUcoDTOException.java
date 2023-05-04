package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliUcoDTOException extends PubliUcoException {

	private static final long serialVersionUID = -4636066115510646740L;

	private PubliUcoDTOException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.DTO);
	}

	public static PubliUcoDTOException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliUcoDTOException(technicalMessage, userMessage, rootCause);
	}

	public static PubliUcoDTOException create(final String userMessage) {
		return new PubliUcoDTOException(userMessage, userMessage, new Exception());
	}

	public static PubliUcoDTOException create(final String technicalMessage, final String userMessage) {
		return new PubliUcoDTOException(technicalMessage, userMessage, new Exception());
	}
}