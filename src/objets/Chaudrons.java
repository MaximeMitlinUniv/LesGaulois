package objets;

public class Chaudrons {

	private int quantitePotion;
	private int forcePotion;
	
	public void remplirChaudron(int quantite, int forcePotion){
		quantite = this.quantitePotion;
		forcePotion = this.forcePotion;
	}
	
	public boolean resterPotion(){
		if(quantitePotion > 0) {
			return true;
		}
		else return false;
	}
	
	public int prendreLouche() {
		
		if(quantitePotion == 0) {
			forcePotion = 0;
		}
		else {
			quantitePotion = quantitePotion - 1;
		}
		return forcePotion;
	}
	
}
