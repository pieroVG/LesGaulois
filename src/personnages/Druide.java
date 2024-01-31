package personnages;

public class Druide extends Gaulois {

	int dosesPotion;
	int forcePotion;
	
	public Druide(String nom, int force) {
		super(nom, force);
	}
	
	public void fabriquerPotion(int doses) {
		dosesPotion = doses;
		forcePotion = 1 + (int)(Math.random() * 5);
		this.parler("J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + forcePotion );
	}

}
