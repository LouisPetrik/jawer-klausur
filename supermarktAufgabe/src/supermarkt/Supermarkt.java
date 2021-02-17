package supermarkt;
import java.util.Scanner;

public class Supermarkt {
	
	private Produkt[] produkte; 
	private Kasse[] kassen;
	
	// achtung, wird per referenz übergeben. Von außen könnten also noch die 
	// produkte und kassen verändert. 
	public Supermarkt(Produkt[] produkte, int anzahlKassen) {
		this.produkte = produkte; 
		
		this.kassen = new Kasse[anzahlKassen]; 
		
		// in einem loop die kassen erstellen, "this" als supermarkt
		// damit die jeweililge kasse auch eine referenz auf den supermarkt hat
		for(int i = 0; i < this.kassen.length; i++ ) {
			this.kassen[i] = new Kasse(this); 
		}
	}
	
	public Produkt sucheProdukt(int gesuchteId) {
		Produkt ergebnis = null; 
		
		// das produkt aus dem array raussuchen, 
		for (Produkt produkt : produkte) {
			if(produkt.getID() == gesuchteId) {
				ergebnis = produkt; 
			}
		}
		return ergebnis; 
	}
	
	
	public static void main(String[] args) {
		
		Produkt[] produkte = {
				new Produkt("Käse", 123, 0.53),
				new ProduktMitMengenrabatt("Wurst", 321, 1.39), 
				new Produkt("Brot", 231, 1.40)
		};
		
		produkte[0].anlieferung(15); 
		produkte[1].anlieferung(23); 
		produkte[2].anlieferung(4); 
		
		
		Supermarkt supermarkt = new Supermarkt(produkte, 3); 
		
		// erste kasse einfach nehmen: 
		double preis = supermarkt.kassen[0].verkaufsvorgang(new Scanner(System.in));
		
		System.out.println("Gesamtpreis " + preis);

		
		
	}
}
