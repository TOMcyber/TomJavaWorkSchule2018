package equalsCompareCompareToTV07;

public class EqualsBasic {

	public static void main(String[] args) {
		// ============
		
		Kunde k1 = new Kunde();
		k1.kid=123;
		k1.vorname="Lisa";
		k1.nachname="Haller";
		Kunde k2 = new Kunde();
		
		
		k2.kid=123;
		k2.vorname="Lisa";
		k2.nachname="Haller";
		
		Kunde k3 = k1;
		
		System.out.println("Vergleich k1, k2 mit == " + (k1==k2));
		System.out.println("Vergleich k1, k3 mit == " + (k1==k3));
		System.out.println("Vergleich k1, k2 mit equals " + (k1.equals(k2)));
		System.out.println("Vergleich k1, k3 mit equals " + (k1.equals(k3)));

		String s1 = new String("Kunde 1");
		k1.equals(s1);
		
	}

}

class Kunde {
	
	long kid;
	String vorname;
	String nachname;
	
	@Override
	public boolean equals(Object o2) {
		// Vergleich durchführen
		// (1) Prüfen, ob übergebenes Objekt von der gleichen Klasse wie this Objekt ist.
		if( o2 instanceof Kunde) {
			//n (2) Casting des übergebenen Objekts als Kunden-Klasse durchführen
			Kunde otherKunde = (Kunde)o2;
			// (3) Vergleich zwischen den beiden Kunden Objekten durchführen
			if (this.kid == otherKunde.kid) {
				return true;
			}
		}
	
		
		return false;
	}
	
}