package personnages;

import objets.Equipement;

public class Romains {
	private String nom;
	private int force;
	
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified(force);
	}
	
	private boolean isInvariantVerified(int force) {
		assert(force > 0);
		return force > 0;
	}
	
	private boolean isPreCoditionVerified(int forceCoup) {
		assert(forceCoup > 0);
		return forceCoup > 0;
	}
	
	private boolean isPostCoditionVerified(int ancienneForce, int nouvelleForce) {
		assert(ancienneForce > nouvelleForce);
		return ancienneForce > nouvelleForce;
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 0:
			System.out.println("Le romain " + nom + " s'équipe avec un " + equipement);
			this.equipement[nbEquipement] = equipement;
			nbEquipement++;
			break;
		case 1:
			if (this.equipement[0] == equipement) {
				System.out.println("Le romain " + nom + " posséde déjà un " + equipement);
			}
			else {
				System.out.println("Le romain " + nom + " s'équipe avec un " + equipement);
				this.equipement[nbEquipement] = equipement;
				nbEquipement++;
			}
			break;
		case 2:
			System.out.println("Le romain " + nom + " est déjà bien protégé");
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
	
	public void recevoirCoup(int forceCoup) {
		isPreCoditionVerified(forceCoup);
		int ancienneForce = this.force;
		this.force = this.force - forceCoup;
		int nouvelleForce = this.force;
		if(this.force < 1) {
			parler("J'abondonne !");
		}
		else {
			parler("Aie");
		}
		isInvariantVerified(force);
		isPostCoditionVerified(ancienneForce, nouvelleForce);
	}
	
	public static void main(String args[]) {
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