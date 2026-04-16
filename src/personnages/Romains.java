package personnages;

public class Romains {
	private String nom;
	private int force;
	
	public Romains(String nom, int force) {
		this.nom = nom;
		this.force = force;
		isInvariantVerified(force);
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
	}
}