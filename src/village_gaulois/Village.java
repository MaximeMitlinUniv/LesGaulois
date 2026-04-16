package village_gaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	
	private Gaulois[] villageois;
	
			
	private Village(String nom, Gaulois chef, final int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[NB_VILLAGEOIS_MAX];
	}
	
	public String getNom() {
		return nom;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if(numVillageois <= 0 || numVillageois > nbVillageois) {
			System.out.print("Il n'y a pas autant d'habitants dans notre village! \n");
			return null;
		}
		else {
			return villageois[numVillageois-1];
		}
	}
	
	public void afficherVillageois() {

		System.out.println("Dans le village \"" + nom + "\" du chef " + chef + " vivent les légendaires gaulois :");
		for(int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i] + "\n");
		}
		
		
	}
	
	public static void main(String[] args) {
			Gaulois abraracoucrix = new Gaulois("Abraracoucrix", 6);
			Village village = new Village("Village des Irréductibles", abraracoucrix, 30);
			
			Gaulois asterix = new Gaulois("Astérix", 8);
			Gaulois obelix = new Gaulois("Obelix", 25);
			Gaulois doublepolémix  = new Gaulois("Doublepolémix", 4);
			village.ajouterVillageois(asterix);
			village.ajouterVillageois(obelix);
			village.ajouterVillageois(doublepolémix);
			village.trouverVillageois(30);
			
			Gaulois gaulois = village.trouverVillageois(1);
			System.out.println(gaulois);
			
			village.afficherVillageois();
			gaulois.sePresenter();
	}
	
}
