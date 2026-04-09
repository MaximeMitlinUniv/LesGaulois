package personnages;

import objets.Chaudrons;

public class Druide {
	
	private String nom;
	private int force;

	Chaudrons chaudron = new Chaudrons();
	
	public Druide(String nom, int force) {
		this.force = force;
		this.nom = nom;
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	private void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}
	
	private boolean contientPotion(Chaudrons chaudron) {
		return chaudron.resterPotion();
	}
	
	public void booster(Gaulois gauloi) {
		
		if(contientPotion(chaudron)) {
			if(gauloi.getNom().equals("Obélix")) {
				parler("Non," +  gauloi.getNom()+ "! Non, et tu le sais très bien!");
			}
			else {
				int forcePotion = chaudron.prendreLouche();
				gauloi.boirePotion(forcePotion);
				parler("Tiens " + gauloi.getNom() + " un peu de potion magique.");
			}
				
		}
		else {
			parler("Désolé " + gauloi.getNom() +" il n'y a plus une seule goutte de potion.");
		}
	}

}
