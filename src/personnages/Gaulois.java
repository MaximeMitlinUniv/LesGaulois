package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
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
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		
		System.out.println(asterix);	
	}

	
}