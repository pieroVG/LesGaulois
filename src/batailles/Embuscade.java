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
		
		sb.append("Il s'agit de ");
		afficherGaulois();
		
		selectionSoldats(camp);
		sb.append("\n Mais cachés derrière des bosquets se cachent " + soldats[1].getNom() + " " + soldats[2].getNom() + ".");
		
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
		for (int i=0; i< gaulois.length; i++) {
			Gaulois g = village.randomVillageois();
			if ( gaulois[i] != g ) {
				gaulois[i] = g ;
			}
			else {
				i--;
			}
		}
	}
	
	private void selectionSoldats(Camp camp) {
		for (int i=0; i< gaulois.length; i++) {
			Soldat s = camp.randomSoldat();
			if ( soldats[i] != s ) {
				soldats[i] = s ;
			}
			else {
				i--;
			}
		}
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
