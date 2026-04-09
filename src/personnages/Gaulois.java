package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	public Gaulois(String nom, int force) {
		this.force = force;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Les gaulois " + nom + " : ";
	}
	
	
	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romains romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + "envoie un grand coup dans la machoire de " + nomRomain);
		int forceCoup = force/3;
		romain.recevoirCoup(forceCoup);
	}
	
	public int boirePotion(int forcePotion) {
		forcePotion = this.effetPotion;
		return forcePotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		Gaulois chef = village.getChef();
		String nomVillage = village.getNom();
		if (this == chef) {
			prendreParole();
			System.out.println("\"Bonjour, je m'appelle " + nom + ". Je suis le chef le village: " + nomVillage + "\"");
		}
		else {
			int i = 0;
			boolean DansVillage = true;
			while(village.trouverVillageois(i) != null) {
				if(village.trouverVillageois(i) == this) {
					prendreParole();
					System.out.println("\"Bonjour, je m'appelle " + nom + ". J'habite le village: " + nomVillage + "\"");
					DansVillage = false;
				}
				i++;
			}
		if(!DansVillage) {
			prendreParole();
			System.out.println("\"Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages");
		}
		}
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix);	
	}

	
}