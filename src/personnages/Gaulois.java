package personnages;

import village_gaulois.Village;
import objets.Equipement;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private Village village;
	private int force;
	private int nbTrophees;
	
	
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
		return "Le gaulois " + nom + " : ";
		}
	
	
	public void frapper(Romains romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		Equipement[] tropheesBataille = romain.recevoirCoup((force / 3) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
		effetPotion = 1;
		}
		for (int i = 0; tropheesBataille != null && i < tropheesBataille.length; i++,
		nbTrophees++) {
			tropheesBataille[nbTrophees] = tropheesBataille[i];
		}

		}

	
	public int boirePotion() {
		return this.effetPotion;
	}
	
	public void setVillage(Village village) {
		this.village = village;
	}
	
	public void sePresenter() {
		Gaulois chef = village.getChef();
		String nomVillage = village.getNom();
		String bonjour = "\"Bonjour, je m'appelle ";
		if (this == chef) {
			prendreParole();
			System.out.println(bonjour + nom + ". Je suis le chef le village: " + nomVillage + "\"");
		}
		else {
			int i = 1;
			boolean dansvillage = false;
			while(village.trouverVillageois(i) != null) {
				if(village.trouverVillageois(i) == this) {
					prendreParole();
					System.out.println(bonjour + nom + ". J'habite le village: " + nomVillage + "\"");
					dansvillage = true;
					break;
				}
				i++;
			}
		if(!dansvillage) {
			prendreParole();
			System.out.println(bonjour + nom + ". Je voyage de villages en villages");
		}
		}
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix);	
	}

	
}