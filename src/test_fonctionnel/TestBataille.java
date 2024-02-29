package test_fonctionnel;

import batailles.Conteur;
import batailles.Embuscade;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestBataille {

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Village village = new Village(abraracourcix);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obelix", 15);
		Gaulois cetautomatix = new Gaulois("Cétautomatix", 8);
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix", 8);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(cetautomatix);
		village.ajouterVillageois(ordralfabetix);
		
		Soldat chorus = new Soldat("Chorus", Grade.CENTURION, 4);
		Camp camp = new Camp(chorus);
		
		Soldat minus = new Soldat("Minus", Grade.SOLDAT, 2);
		Soldat brutus = new Soldat("Brutus", Grade.CENTURION, 5);
		Soldat milexcus = new Soldat("Milexcus", Grade.SOLDAT, 2);
		Soldat tullius = new Soldat("Tullius Octopus", Grade.TESSERARIUS, 2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", Grade.OPTIO, 3);
		Soldat quintilius = new Soldat("Quintilius", Grade.SOLDAT, 2);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		camp.ajouterSoldat(minus);
		camp.ajouterSoldat(quintilius);
		
		Conteur goscinny = new Conteur("Goscinny");
		Embuscade embuscade = new Embuscade();
		
		goscinny.conter(embuscade,"Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ, du temps où la Gaule est occupée par les Romains.");
		
	}

}
