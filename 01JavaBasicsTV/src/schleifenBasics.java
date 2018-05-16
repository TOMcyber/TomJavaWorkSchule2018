
public class schleifenBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// === Verschachtelte For-Schleife mit markers/labels
		// aeußereSchleife:
		
		int j;
		for (int i = 0; i < 10; i++) {
			System.out.println("j2 =" + i);
			
	//		innere Schleife;
			for (int j2 =0; i < 5; j2++); {
				
				if (j2==1) {
					continue;
				}
				System.out.println("j2 = " + i + "." + j2);
				
				if (j2==2)  {
					break aeußereSchleife;
				}
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
