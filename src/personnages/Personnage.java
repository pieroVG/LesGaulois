package personnages;

abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force){
		this.nom = nom;
		this.force = force;
	}
	
	
	 public String getNom () {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + nom + " :\"" + texte +"\"" );
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		if (force > 0) {
			System.out.println( nom + " envoie un grand coup dans la mâchoire de " + adversaire.getNom() );
			adversaire.recevoirCoup(force/3);
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force > 0) 
			parler("Aïe");
		else 
		{
			force = 0;
			parler("J'abandonne");
		}
		
	}
}
