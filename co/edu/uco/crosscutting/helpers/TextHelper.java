package co.edu.uco.crosscutting.helpers;

public class TextHelper {
	
	private TextHelper() {
		
	}
	
	public static boolean isNull(final String string) {
		return ObjectHelper.isNull(string);
	}
	
	public static boolean isEmpty(final String string) {
		return string.intern() == "";
	}
	
	public static void main(String[] args) {
		
		String b = null;
		System.out.println(isEmpty(b));
	}
	
	//public static void main(String[] args) {
	//	String a = "";
	//	String b = new String("");
	//	System.out.println(isEmpty(b));
	//}
	

}
					