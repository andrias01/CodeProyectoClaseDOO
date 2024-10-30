package co.edu.uco.crosscutting.helpers;

import java.util.UUID;

public final class UUIDHelper {

	//Valor por defecto
	private static final String DEFAULT_UUID_STRING = "00000000-0000-0000-0000-000000000000";

	private UUIDHelper() {
		super();
	}

	//convierte un string uuid correcto en un UUID original
	public static final UUID convertToUUID(final String uuidAsString) {
		return UUID.fromString(uuidAsString);
	}

	//ya con el Original UUID atrapro un valor por defecto si es nulo el Value
	public static final UUID getDefault(final UUID value, final UUID defaultValue) {
		return ObjectHelper.getDefault(value, defaultValue);
	}

	//valor por defecto del UUID un valor original como el de la variable estatica FInal
	public static final UUID getDefault() {
		return convertToUUID(DEFAULT_UUID_STRING);
	}
	//valor por defecto de un UUID pero no como original sino como un String
	public static final String getDefaultAsString() {
		return DEFAULT_UUID_STRING;
	}

	//me genera un uuid random de 32 digitos
	public static final UUID generate() {
		return UUID.randomUUID();
	}

	//
	public static final boolean isDefault(final UUID value) {
		//dice si el valor por defecto esta aplicado
		return getDefault(value, getDefault()).equals(getDefault());
	}

	//dice si el valor por defecto esta aplicado como un string
	public static final boolean isDefault(final String uuidAsString) {
		return getDefault(convertToUUID(uuidAsString), getDefault()).equals(getDefault());
	}
}