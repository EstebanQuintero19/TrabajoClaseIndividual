package co.edu.uco.publiuco.crosscutting.utils;

public interface UtilObject {
	
	static <O> boolean isNull(final O object) {
		return object == null;
	}

}//singleton interfaz con métodos estáticos.
