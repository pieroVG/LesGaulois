package batailles;

public class Conteur {
	private String nom;
	
	public Conteur(String nom) {
		this.nom = nom;
	}
	
	public void conter(Embuscade bataille, String histoire) {
		System.out.println("Je suis " + nom + ". " + histoire + "\n");
		System.out.println( bataille.decrireContexte() );
		System.out.println( bataille.choisirCombattants() );
		System.out.println( bataille.preparerCombat() );
		System.out.println( bataille.decrireCombat() );
		System.out.println( bataille.donnerResultat() );
	}
}
