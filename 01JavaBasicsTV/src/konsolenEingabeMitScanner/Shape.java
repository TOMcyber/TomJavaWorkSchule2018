package konsolenEingabeMitScanner;

public interface Shape {

	public abstract void draw();
	
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle wird gezeichnet");
	}
}

class SubRectangle extends Rectangle {
	
	public void draw(String x);
	
}