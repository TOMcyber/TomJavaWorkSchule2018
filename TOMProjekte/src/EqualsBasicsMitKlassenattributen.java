
public class EqualsBasicsMitKlassenattributen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	}

}

class Person {
	
	String vorname;
	String nachname;
	Adresse adresse;

	Person (String vorname, String nachname) {
		this.vorname=vorname;
		this.nachname=nachname;
	}
	
	public boolean equals(Objekt obj2) {
		if(obj2 instanceof Person ) {
			person
			return true;
		}
		if (anObjekt)
	}
	
}

class Adresse {
	String plz;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Adresse) {
			Adresse ad2 = (Adresse)obj;
			if(this.plz.equals(ad2.plz)) {
				return true;
				
			}
		}
	}
}