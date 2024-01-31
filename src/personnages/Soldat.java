package personnages;

public class Soldat extends Romain {
	public Grade grade;
	public Armure[] armure = new Armure[3];
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	

}
