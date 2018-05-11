package konsolenEingabeMitScanner;

public class ShapeFactory {
	
	Shape shape;
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		}
	}
	

}
