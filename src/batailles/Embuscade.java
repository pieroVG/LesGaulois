package batailles;

import personnages.Gaulois;
import personnages.Soldat;

public class Embuscade implements Bataille {
	private Gaulois[] gaulois = new Gaulois[4];
	private Soldat[] soldats = new Soldat[2];
	
	
	@Override
	public String decrireContexte() {
		
		return "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.";
	}

	@Override
	public String choisirCombattants() {
		
		return "choisirCombattants";
	}

	@Override
	public String preparerCombat() {
		
		return "preparerCombat";
	}

	@Override
	public String decrireCombat() {
		
		return "decrireCombat";
	}

	@Override
	public String donnerResultat() {
		
		return "donnerResultat";
	}

}
