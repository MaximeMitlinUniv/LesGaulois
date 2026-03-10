package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
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
	
}






