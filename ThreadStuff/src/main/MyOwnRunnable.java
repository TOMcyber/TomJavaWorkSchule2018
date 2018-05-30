package main;

public class MyOwnRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Runnable in eigener Klasse >" + MyOwnRunnable.class.getSimpleName() 
				+ "< durch implementieren des Interfaces:" + Runnable.class.getSimpleName());
		
		MySingleton.getInstance().makeAOutput("\nRunnable in eigener Klasse\n");
	}

}
