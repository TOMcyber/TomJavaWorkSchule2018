package main;

public class MySingleton {
	private static MySingleton instance;
	
	private MySingleton() {
		System.out.println(MySingleton.class.getSimpleName() + "wurde gestartet.");
	}
	
	public static synchronized MySingleton getInstance() {
		if(instance == null) {
			instance = new MySingleton();
		}
		
		return instance;
	}
	
	public void makeAOutput(String threadName) {
		System.out.println("Ausgabe per MySingleton im Thread: " + threadName);
	}
}
