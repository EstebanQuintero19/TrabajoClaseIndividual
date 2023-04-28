package co.edu.uco.publiuco.crosscutting.utils;

public interface UtilObject {

	static <O> boolean isNull(final O object) {
		return object == null;
	}

	static <O> O getDefault(final O object, final O defaultValue) {
		return isNull(object) ? defaultValue : object;
	}
}

//singleton interfaz con métodos estáticos.
