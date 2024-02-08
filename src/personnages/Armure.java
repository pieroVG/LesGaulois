package personnages;

public enum Armure {
	CASQUE("casque",2),
	PLASTRON("plastron",3),
	BOUCLIER("bouclier",3);
	
	private String chaine;
	private int force;
	
	private Armure(String string, int force) {
		this.chaine = string;
		this.force = force;
	}
	
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return chaine;
	}
	
}
