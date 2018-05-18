
public class Rectangle {
  public int w, h;
  public Rectangle(int w, int h) {
    this.w = w;
    this.h = h; 
  }

  @Override
  public boolean equals(Object obj) {
    // ein paar elementare Tests
    if(this == obj)                  return true;
    if(obj == null)                  return false;
    if(getClass() != obj.getClass()) return false;
    // this und other sind gleich, 
    // wenn w und h übereinstimmen
    Rectangle other = (Rectangle)obj;
    if(other.w == w && other.h == h)
      return true;
    else
      return false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + h;
    result = prime * result + w;
    return result;
  }
}
