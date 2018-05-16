package schuleAufgaben;

public class SeltsamesVerhaltenWrapper {

	public static void main(String[] args) {
		// =====
		// Wrapper Cache
		Integer iw1 = Integer.valueOf(5);
		Integer iw2 = Integer.valueOf(5);
		
		System.out.println("iw1 == iw2 " + (iw1==iw2));
		
		// Kein Cache-Pool mehr
		Integer iw3 = Integer.valueOf(128);
		Integer iw4 = Integer.valueOf(128);
		System.out.println("iw3 == iw4 " + (iw3==iw4));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
	

	}

}
