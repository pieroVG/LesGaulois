package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		
		Gaulois asterix = new Gaulois("Astérix",8);
		Romain minus = new Romain ("Minus",6);
		
		System.out.println(asterix.getNom());
		asterix.parler("Bonsoir");
		minus.parler("Un Gau .. Gaugole");
		
		/*for (int i = 0; i<2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		for (int i = 0; i<3; i++) {
			asterix.frapper(minus);
		}
	}
}
