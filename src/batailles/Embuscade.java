package batailles;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class Embuscade implements Bataille {
	private Gaulois[] gaulois = new Gaulois[4];
	private Soldat[] soldats = new Soldat[2];
	private Village village;
	private Camp camp;
	
	
	public Embuscade(Village village, Camp camp) {
        this.village = village;
        this.camp = camp;
    }
	
	@Override
	public String decrireContexte() {
		
		return "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.";
	}

	@Override
	public String choisirCombattants() {
		StringBuilder sb = new StringBuilder();

		selectionGaulois(village);
		
		sb.append("Il s'agit de " + afficherGaulois());
		sb.append("\n");
		
		selectionSoldats(camp);
		sb.append("Mais cachés derrière des bosquets se cachent " + soldats[0].getNom() + " et " + soldats[1].getNom() + ".");
		
		return sb.toString();
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
	
	private void selectionGaulois(Village village) {
	    for (int i = 0; i < gaulois.length; i++) {
	        Gaulois g;
	        do {
	            g = village.randomVillageois();
	        } while (estGauloisDejaSelectionne(g, i) || g == null); 
	        gaulois[i] = g;
	    }
	}

	private boolean estGauloisDejaSelectionne(Gaulois gaulois, int index) {
	    for (int j = 0; j < index; j++) {
	        if (this.gaulois[j] == gaulois) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	
	
	private void selectionSoldats(Camp camp) {
	    for (int i = 0; i < soldats.length; i++) {
	        Soldat s;
	        do {
	            s = camp.randomSoldat();
	        } while (estSoldatDejaSelectionne(s, i));
	        soldats[i] = s;
	    }
	}

	private boolean estSoldatDejaSelectionne(Soldat soldat, int index) {
	    for (int j = 0; j < index; j++) {
	        if (soldats[j] == soldat) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	
	
	private String afficherGaulois() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gaulois.length; i++) {
            sb.append(gaulois[i].getNom());
            if (i < gaulois.length - 2) {
                sb.append(", ");
            } else if (i == gaulois.length - 2) {
                sb.append(" et ");
            }
        }
        sb.append(".");
        return sb.toString();
    }
	
	
}
