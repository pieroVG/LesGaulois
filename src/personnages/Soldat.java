package personnages;

public class Soldat extends Romain {
	public GRADE grade;
	
	public Soldat(String nom,  GRADE grade, int force) {
		super(nom, force);
		this.grade = grade;
	}

}
