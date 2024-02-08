package personnages;

public class Soldat extends Romain {
	public Grade grade;
	public Armure[] armure = new Armure[3];
	
	@Override
	protected String donnerAuteur() {
		return grade.getNom();
	}
	
	@Override
	public void recevoirCoup(int forceCoup) {
	    int forceAbsorbee = 0;
	    
	    for (int i = 0; i< armure.length;i++) {
	        if (armure[i] != null) {
	            forceAbsorbee = forceAbsorbee + armure[i].getForce();
	            forceCoup = forceCoup - forceAbsorbee;
	            if (forceCoup > 0) {
	            	System.out.println("Le " + armure[i].getNom() + " absorbe " + armure[i].getForce() + " du coup");
	            	armure[i] = null;
	            }
	        }
	    }
	    
	    if (forceCoup > 0) {
	        force = force - forceCoup;
	        if (force > 0) {
	            parler("Aïe");
	        } else {
	            force = 0;
	            parler("J'abandonne");
	        }
	    } 
	}
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	
	public void equiperArmure(Armure equipement) {
		for (int i = 0; i < armure.length; i++) {
	        if (armure[i] == equipement) {
	        	this.parler("J'ai déjà un " + equipement.getNom());
	            return;
	        }
	    }

	    for (int i = 0; i < armure.length; i++) {
	        if (armure[i] == null) {
	            armure[i] = equipement;   
	            System.out.println("Le " + donnerAuteur() + " " + nom + " s'équipe avec un " + equipement.getNom() + ".");
	            return;
	        }
	    }
	}

}
