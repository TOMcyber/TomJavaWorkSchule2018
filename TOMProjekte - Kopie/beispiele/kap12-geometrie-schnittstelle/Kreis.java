
public class Kreis implements Geometrie {
  private double radius;

  public Kreis(Double radius) {
    setRadius(radius);
  }
  
  // getter/setter für radius
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    if(radius<=0)
      throw new IllegalArgumentException(
          "Der Radius muss größer 0 sein!");
    this.radius = radius;
  }

  @Override
  public double berechneUmfang() {
    return 2 * radius * Math.PI;
  }

  @Override
  public double berechneFlaeche() {
    return radius * radius * Math.PI ;
  }
}
