package personnages;

abstract class Personnage {
	protected String nom;
	protected int force;
	
	protected Personnage(String nom, int force){
		this.nom = nom;
		this.force = force;
	}
	
	
	 public String getNom () {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + texte +"\"" );
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		if (force>0 && !estMort(adversaire)) {
			System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup de force " + force + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom() );
			adversaire.recevoirCoup(force);
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
	
	public boolean estMort(Personnage adversaire) {
		boolean enVie;
		if (adversaire.force<=0) {
			enVie = true;
		}
		else {
			enVie=false;
		}
		return enVie;
	}


}
