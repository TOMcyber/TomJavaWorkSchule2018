package konsolenEingabeMitScanner;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// Neue Shape anfragen
		
		ShapeFactory sf1 = new ShapeFactory();
		Shape myShape = sf1.getShape("Circle");
		myShape.draw();
		
		Shape myShape2 = sf1.getShape("Square");
		myShape2.draw();
				
		//Square sq = new Square();
		
				
	}
}
