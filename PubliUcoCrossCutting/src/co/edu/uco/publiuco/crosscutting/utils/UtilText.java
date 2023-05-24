package co.edu.uco.publiuco.crosscutting.utils;

public final class UtilText {

	private static final UtilText INSTANCE = new UtilText();
	public static final String EMPTY = "";
	public static final String DEFAULT_EMAIL = EMPTY;
	private static final String EMAIL_RE = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private UtilText() {
		super();
	}

	public static final UtilText getUtilText() {
		return INSTANCE;
	}

	public final boolean isNull(final String text) {
		return UtilObject.isNull(text);
	}

	public final String getDefault(final String text, final String defaultValue) {

		String result = text;

		if (isNull(text)) {
			result = isNull(defaultValue) ? EMPTY : defaultValue;
		}

		return result;
	}

	public final String getDefault(final String text) {
		return getDefault(text, EMPTY);
	}

	public final boolean isEmpty(final String text) {
		return applyTrim(text).equals(EMPTY);
	}

	public final String getDefaultIfEmpty(final String text, final String defaultValue) {
		return (isEmpty(text)) ? getDefault(defaultValue) : text;
	}

	public final String getDefaultValue() {
		return EMPTY;
	}

	public final String applyTrim(final String text) {
		return getDefault(text).trim();
	}

	public final boolean matchPattern(final String text, final String pattern) {
		return getDefault(text).matches(getDefault(pattern));
	}

	// Para el correo
	public static final boolean emailStringIsValid(final String emailValue) {
		return (UtilText.getUtilText().matchPattern(emailValue, EMAIL_RE));
	}

	public static final String generateEmailFromString(final String emailValue) {
		return (emailStringIsValid(emailValue)) ? emailValue : DEFAULT_EMAIL;
	}

	public static final String getDefaultEmail(final String emailValue) {
		return UtilObject.isNull(emailValue) ? DEFAULT_EMAIL : emailValue;
	}

}
