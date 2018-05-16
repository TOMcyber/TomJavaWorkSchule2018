package exceptionsBasics;

public class TryCatchFinalKontrollkonstroktion {

	public static void main(String[] args) {
		// try, catch, finally
		
		String x = null;
		
		try {
			x.equals("irgenwas");
			System.out.println("wichtige Operation");
		} catch (NullPointerException npe)  {
			
		
		}
	}

}
