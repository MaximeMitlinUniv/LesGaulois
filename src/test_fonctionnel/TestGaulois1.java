package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romains;
import personnages.Druide;
import objets.Chaudrons;


public class TestGaulois1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Druide panoramix = new Druide("Panoramix", 2);
        Romains brutus = new Romains("Brutus", 14);

        panoramix.fabriquerPotion(4, 3);
        panoramix.booster(obelix);
        panoramix.booster(asterix);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		asterix.frapper(brutus);
		
	}

}
