package co.edu.uco.publiuco.crosscutting.utils;

import java.util.UUID;

public final class UtillUUID {
	
	public static final String DEFAULT_UUID_AS_STRING = "00000000-0000-0000-000000000000";
	public static final UUID DEFAULT_UUID = generateUUIDFromString(DEFAULT_UUID_AS_STRING);
	private static final String UUID_RE = "[a-f0-9]{8}([-][a-)" 
	
	private UtillUUID() {
		super();
	}
	
	public static final UUID generateNewUUID() {
		return UUID.randomUUID();
	}

	public static final UUID generateUUIDFromString(final String uuidValue) {
		return UUID.fromString(uuidValue);
	}
	
	public static final UUID getDefault(final UUID uuidValue) {
		return UtilObject.isNull(uuidValue) ? DEFAULT_UUID : uuidValue;
	}
}
