package personnages;

public enum Armure {
	CASQUE("casque"),
	PLASTRON("plastron"),
	BOUCLIER("bouclier");
	
	private String chaine;
	
	private Armure(String string) {
		this.chaine = string;
	}
	
	@Override
	public String toString() {
		return chaine;
	}

}
