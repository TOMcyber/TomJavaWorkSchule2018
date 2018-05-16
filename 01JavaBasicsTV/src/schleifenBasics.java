
public class schleifenBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// === Verschachtelte For-Schleife mit markers/labels
		// aeußereSchleife:
		
		int j;
		for (int i = 0; i < 10; i++) {
			System.out.println("j =" + i);
			
	//		innere Schleife;
			for (int j =0; i < 5; j++); {
				
				if (j==1) {
					continue;
				}
				System.out.println("j = " + i + "." + j);
				
				if (j==2)  {
					break aeußereSchleife;
				}
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
