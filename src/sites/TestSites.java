package sites;

import personnages.Grade;
import personnages.Gaulois;
import personnages.Soldat;

public class TestSites {
	public static void main(String[] args) {
		// Question b
		Gaulois vercingetorix = new Gaulois("Versingétorix",5);
		Soldat minus = new Soldat("Minus", Grade.CENTURION,2);
		
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);
		
		
		// Question d
		Gaulois agecanonix = new Gaulois("Agecanonix",1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix",2);
		Gaulois asterix = new Gaulois("Astérix",5);
		Gaulois obelix = new Gaulois("Obelix",15);
		Gaulois prolix = new Gaulois("Prolix",2);
		
		Soldat brutus = new Soldat("Brutus",Grade.CENTURION,5);
		Soldat milexcus = new Soldat("Milexcus",Grade.SOLDAT,2);
		Soldat tullius = new Soldat("Tullius Octopus",Grade.TESSERARIUS,2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus",Grade.OPTIO,3);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		
		// Question e
		village.afficherVillageois();
		camp.afficherCamp();
		
		
		// Question f
		Gaulois abraracourcix = new Gaulois("Abraracourcix",5);
		village.changerChef(abraracourcix);
		
		Soldat briseradius = new Soldat("Briseradius",Grade.SOLDAT,4);
		Soldat chorus = new Soldat("Chorus",Grade.CENTURION,5);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
