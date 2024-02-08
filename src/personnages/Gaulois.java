package personnages;

public class Gaulois extends Personnage{
	private double puissancePotion = 1;
	private int forceOrigine;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
		forceOrigine = force;
	}
	
	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		if (force>0 && !estMort(adversaire)) {
			System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup de force " + force + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() );
			adversaire.recevoirCoup(force);
			if(puissancePotion > 1) {
				puissancePotion = puissancePotion - 0.5;
				this.force = forceOrigine * (int)puissancePotion;
			}
		}
	}
	
	public void recevoirPotion(double potion) {
		this.puissancePotion = potion;
		this.force = forceOrigine * (int)puissancePotion;	
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
}
