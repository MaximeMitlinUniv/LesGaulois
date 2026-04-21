package personnages;

import objets.Equipement;

public class Romains {
	private String nom;
	private int force;
	
	
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
		if (force < 0) {
		    throw new IllegalArgumentException("Invalid force: " + force);
	  }
	}
	
	private boolean isPreCoditionVerified(int forceCoup) {
		assert(forceCoup > 0);
		return forceCoup > 0;
	}
	
	private boolean isPostCoditionVerified(int ancienneForce, int nouvelleForce) {
		assert(ancienneForce > nouvelleForce);
		return ancienneForce > nouvelleForce;
	}
	

	public int getForce() {
		return force;
	}
	
	public void sEquiper(Equipement equipement) {
		String lerom = "Le romain ";
		switch(nbEquipement) {
		case 0:
			System.out.println( lerom + nom + " s'équipe avec un " + equipement);
			this.equipements[nbEquipement] = equipement;
			nbEquipement++;
			break;
		case 1:
			if (this.equipements[0] == equipement) {
				System.out.println(lerom + nom + " posséde déjà un " + equipement);
			}
			else {
				System.out.println(lerom + nom + " s'équipe avec un " + equipement);
				this.equipements[nbEquipement] = equipement;
				nbEquipement++;
			}
			break;
		case 2:
			System.out.println(lerom + nom + " est déjà bien protégé");
			break;
		default:
			break;
		}
		
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = calculResistanceEquipement(forceCoup);
		force += forceCoup;
		if (force == 0) {

			parler("Aïe");
		}
		else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		return equipementEjecte;
		}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte;
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
		
		for (int i = 0; i < nbEquipement;) {
		if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
		resistanceEquipement += 8;
		} else {
		System.out.println("Equipement casque");
		resistanceEquipement += 5;
		}
		i++;
		}
		texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup += resistanceEquipement;
		return forceCoup;
		}
	
		private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + toString() + " s'envole sous la force du coup.");

		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
		if (equipements[i] == null) {

		} else {
		equipementEjecte[nbEquipementEjecte] = equipements[i];
		nbEquipementEjecte++;
			equipements[i] = null;
		}
		}
			return equipementEjecte;
		}
	
	public static void main(String[] args) {
		Romains minus = new Romains("Minus", 6);
		Equipement casque = Equipement.CASQUE;
		Equipement bouclier = Equipement.BOUCLIER;

		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		
		minus.sEquiper(casque);
		minus.sEquiper(casque);
		minus.sEquiper(bouclier);
		minus.sEquiper(casque);
	}
}