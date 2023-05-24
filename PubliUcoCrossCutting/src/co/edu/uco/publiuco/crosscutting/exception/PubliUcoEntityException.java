package co.edu.uco.publiuco.crosscutting.exception;

public final class PubliucoEntityException extends PubliucoException {

	private static final long serialVersionUID = 238134976795568116L;

	private PubliucoEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.ENTITY);
	}

	public static PubliucoEntityException create(final String technicalMessage, final String userMessage,
			final Throwable rootCause) {
		return new PubliucoEntityException(technicalMessage, userMessage, rootCause);
	}

	public static PubliucoEntityException create(final String userMessage) {
		return new PubliucoEntityException(userMessage, userMessage, new Exception());
	}

	public static PubliucoEntityException create(final String technicalMessage, final String userMessage) {
		return new PubliucoEntityException(technicalMessage, userMessage, new Exception());
	}
}
