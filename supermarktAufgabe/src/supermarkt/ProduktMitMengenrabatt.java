package supermarkt;

public class ProduktMitMengenrabatt extends Produkt {
	// ruft einfach den konstruktor der oberklasse auf 
	public ProduktMitMengenrabatt(String name, int id, double nettopreis) {
		super(name, id, nettopreis);
	}
	
	@Override
	public double getPreis(int anzahl) {
		double normalpreis = super.getPreis(anzahl); 
		
		if(anzahl > 5) {
			System.out.println("Eigentlich: " + normalpreis);
			normalpreis -= normalpreis * 0.05; 
			System.out.println("Jetzt nur noch: " + normalpreis);
		}
		return normalpreis; 
	}
	
}
