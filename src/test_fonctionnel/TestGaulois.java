package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	
	public static void main() {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		
		asterix.parler("Bonjour Obélix");
	}
	
	
	
}
