package supermarkt;

import java.util.Scanner; 

public class Kasse {
	
	private static final double MEHRWERTSTEUER = 0.19; 
	
	// damit wir auf das sortiment zugreifen können
	private Supermarkt supermarkt; 
	
	public Kasse(Supermarkt supermarkt) {
		this.supermarkt = supermarkt; 
	}
	
	// soll ja den e
	public double verkaufsvorgang(Scanner benutzereingabe) {
		// initialisiere gesamtpreis mit 0 
		double gesamtpreis = 0; 
		
		int id; 
		int anzahl;
			
		do {
			System.out.println("Bitte ID eingeben (-1 für beenden): ");
			id = benutzereingabe.nextInt(); 
			
			// produkt mit der vom nutzer eingegeben ID suchen
			Produkt produkt = supermarkt.sucheProdukt(id); 
			
			// testen, ob das produkt existiert 
			if(produkt != null) {
				System.out.println("Produkt: " + produkt.getName());
				System.out.println("Bitte die Anzahl eingeben: ");
				anzahl = benutzereingabe.nextInt();
				
				gesamtpreis += verkaufeProdukt(produkt, anzahl);

			} else if (id != -1){
				System.out.println("Produkt existiert nicht");
			}
			
			
		} while (id != -1); 
		// es wird aus der schleife ausgebrochen, wenn -1 
		
		
		
		return gesamtpreis; 
	}
	
	// private, da es nur zum auslagern ist, wird nicht von außen aufgerufen
	private double verkaufeProdukt(Produkt produkt, int anzahl) {
		
		produkt.entferne(anzahl);
		
		
		System.out.println("Anzahl: " + produkt.getAnzahl() + " " + produkt.getName());
		
		
		double bruttopreis = produkt.getPreis(anzahl) * (MEHRWERTSTEUER + 1);
		
		return bruttopreis; 
	}
	

	

}
