package schuleAufgaben;
import java.util.Arrays;

public class Rezept {

// Attribute
private String name;
private String[] zutaten;

// Getter 
public String getName() {
return name;
} 
public String[] getZutaten() {
return zutaten;
}

// Setter
public void setName(String name) {
this.name = name;
}
public void setZutaten(String[] zutaten) {
this.zutaten = zutaten;
}

// toString
@Override
public String toString() {
return "Name: " + getName() + " \n" 
+ "Zutaten: " + Arrays.toString(getZutaten());
}

}