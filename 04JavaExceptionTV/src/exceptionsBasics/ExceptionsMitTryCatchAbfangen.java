package exceptionsBasics;

public class ExceptionsMitTryCatchAbfangen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = null;
		
		// NullPointerException abfangen
		
		String[] stringA;
		
		try {
		boolean b = x.equals("Banane");
//		stringA;
		// --> hier wird NullPointerException geworfen
		} catch(Exception npe) {
			System.out.println("Exception wurde geworfen");
		}
		
		
	}

}
