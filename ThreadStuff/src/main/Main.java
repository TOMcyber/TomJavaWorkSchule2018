package main;

public class Main {

	public static void main(String[] args) {
		testThreadSleep();
		testThreadAndAnonymRunnable();
		testThreadWithMyOwnRunnable();
	}

	private static void testThreadSleep() {
		System.out.println("Hier läuft das Haupthread, dieses wird jetzt für 5 Sekunden pausiert");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MySingleton.getInstance().makeAOutput("\nHauptthread\n");
		
		System.out.println("Pause ist zu ende,dieser Teil der Applikation wird in 3 Sekunden beendet...........................");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	private static void testThreadAndAnonymRunnable() {
		Runnable declaredRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\nVordefiniertes Runnable\n");
				MySingleton.getInstance().makeAOutput("\nVordefiniertes Runnable\n");
				
			}
		};
		Thread threadDeclaredRunnable = new Thread(declaredRunnable);
		threadDeclaredRunnable.run();
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\nEigener Prozess: Definiert durch anonym überschriebens Runnable im Thread Konstruktor\n");
				
				System.out.println("\nEs folgt ein 3 sekündige pause und dann ein Ausgabe\n");
				
				MySingleton.getInstance().makeAOutput("\nAnonym überschriebens Runnable\n");
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for(int i =0; i< 10; i++) {
					System.out.println("Ausgabe im eigen Thread >t< mit Runnable: " + String.valueOf(i));
				}
				
								
			}
		});
		t.run();
	}
	
	private static void testThreadWithMyOwnRunnable() {
		MyOwnRunnable myOwnRunnable = new MyOwnRunnable();
		Thread myOwnThread = new Thread(myOwnRunnable);
		
		myOwnThread.run();
		
	}

}
