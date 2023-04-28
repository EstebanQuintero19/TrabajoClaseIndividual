package co.edu.uco.publiuco.crosscutting.utils;

public class UtilNumber {
	
	private static final UtilNumber INSTANCE = new UtilNumber();
	public static final int ZERO = 0;
	
	private UtilNumber() {
		super();
	}
	
	public static final UtilNumber getUtilNumber() { 
		return INSTANCE;
	}

	public final boolean isNull(final int number) {
		return UtilObject.isNull(number);
	}
	
	public final int getDefault(final int number, final int defaultNumber) {
		
		int result = number;
		
		if(isNull(number)) {
			result = isNull(defaultNumber) ? ZERO : defaultNumber;
		}
		
		return result;
	}
	
	public final int getDefault(final int number) {
		return getDefault(number, ZERO);
	}
	
	public final int getDefaultValue() {
		return ZERO;
	}	
}
