package co.edu.uco.crosscutting.helpers;

public class NumericHelper {
	
	private NumericHelper() {
		
	}
	
	// <>= diferente mayor igual menor igual  rengos con limites
	// y si es positivo o negarivo    soportar cualquier tipo de numero
	
	public static boolean isFloat(final int number1) {
		return number1 == (float) number1;
	}
	public static boolean isFloat(final float number1) {
		return number1 == (float) number1;
	}
	public static float castNumber(final int number1) {
		return isFloat(number1) ? number1 : (float)number1;
	}
	public static float castNumber(final float number1) {
		return isFloat(number1) ? number1 : (float)number1;
	}
	public static String isPositiveOrNegative(final float number1) {
		if (number1 > 0) {
            return "El número es positivo";
        } else if (number1 < 0) {
            return "El número es negativo";
        } else {
            return "El número es cero";
        }
	}
	public static String relationNumber(final float number1,final float number2) {
		if (number1 > number2) {
            return "El número "+number1+" es mayor al numero "+number2+" (Son distintos)";
        } else if (number1 < number2) {
        	return "El número "+number1+" es menor al numero "+number2+" (Son distintos)";
        } else if (number1 == number2) {
        	return "El número "+number1+" es menor al numero "+number2;
        } else if (number1 != number2) {
        	return "El número "+number1+" es menor al numero "+number2;
        } else {
            return "El número es cero";
        }
	}
	public static boolean isNull(final float number1) {
		return ObjectHelper.isNull(number1);
		//utilizo el metodo de ObjectHelper cuando es null = TRUE
	}
	
	public static float getDefaultNumber(final float number1, final float numberDefault) {
		return isNull(number1) ? numberDefault : number1;
		// si es True=NUll da defaultObject y si es False=objeto da el objeto
	}
	
	public static Float getDefault(final float number1,final float numberDefault) {
		return ObjectHelper.getDefault(number1,numberDefault);
		//utilizo el metodo de ObjectHelper para dar valor por defecto si es NULL el objeto pasandolo por el parametro 
	}
	
	public static void main(String[] args) {
		float a = -1;
		float e = castNumber(a);
		float b = (float) 0.0;
		float c = getDefaultNumber(e,b);
		String d = isPositiveOrNegative(e);
		//boolean b = isInt(a);
		
	
		System.out.println(d);
		System.out.println(c+">dato");
		//probando el default #1
	}
}
