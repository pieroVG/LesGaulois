package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
		
		Druide panoramix = new Druide("Panoramix",1);
		panoramix.fabriquerPotion(3);
		
	}
}
