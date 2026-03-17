package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;
import objets.Chaudrons;


public class TestGaulois1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);

		Romains minus = new Romains("Minus", 6);
		
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bnojour Astérix. Ca te dirai d'aller chasser les sangliers ?)");
		asterix.parler("Oui, très bonne idée");
		System.out.println("Dans la forêt les gaulois " + asterix + " et " + obelix.getNom() + " tombent nez à nez avec le romain " + minus.getNom());
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		
	}

}
