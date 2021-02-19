package buchhandlung;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner; 
import java.io.File; 
import java.io.FileInputStream;
import java.io.InputStreamReader; 
import java.io.BufferedReader; 
import java.io.IOException;


public class Buchhandlung {
	
	
	private ArrayList<Medium> medien = new ArrayList<Medium>();
	
	
	public Buchhandlung() {

		
	}
	
// int jahr, int tag, int monat, double preis, String hrgbVorname, String hrgbNachname
	
	public static void main(String[] args) {
		
		Buch medium1 = new Buch(2001, 11, 11, 3.50, "Chris", "Columbus", 200);
		Buch medium2 = new Buch(1937, 11, 9, 4.50, "J. R. R.", "Tolkien", 250);
		
		
		medium1.anliefern(20);
		medium2.anliefern(10);
		
		Buchhandlung buchhandlung = new Buchhandlung(); 
		
		buchhandlung.medien.add(medium1); 
		buchhandlung.medien.add(medium2); 
		
		
		
	
		
		buchhandlung.abfrage(buchhandlung); 
		
		
	}
	// gibt alle medien aus 
	public void medienListen(Buchhandlung buchhandlung) {
		for(int i = 0; i < medien.size(); i++) {
			System.out.println("ID: " + i);
			System.out.println(medien.get(i).getEAN());
			System.out.println("Preis: " + medien.get(i).getPreis());
			System.out.println("Menge: "+ medien.get(i).getMenge());
			System.out.println("------------------------");
		}
		
		
	}
	
	public void bestellen(Buchhandlung buchhandlung, Scanner userInput) throws BestellungException{
		System.out.println("Gib bitte die ID ein, die bestellt werden soll");
		buchhandlung.medienListen(buchhandlung);
		int id = userInput.nextInt();
		
		System.out.println("Gib die Menge ein, die bestellt werden soll");
		int bestellMenge = userInput.nextInt(); 
		
	
	
		if(medien.get(id).getMenge() < bestellMenge) {
			throw new BestellungException(); 
		} else {
			medien.get(id).entferne(bestellMenge);
			System.out.println("Erfolgreich verkauft");
		}
	}
	
	public void preisAnpassen(Buchhandlung buchhandlung, Scanner userInput) {
		System.out.println("Wähle ein Produkt aus, dass du anpassen willst. (ID)");
		buchhandlung.medienListen(buchhandlung);
		int id = userInput.nextInt();
		System.out.println("Die ID: " + id);
		
		System.out.println("Gib einen neuen Preis ein: ");
		double neuerPreis = userInput.nextDouble();
		System.out.println("Neuer preis: " + neuerPreis);
		
		medien.get(id).setPreis(neuerPreis);
		System.out.println("Neuer preis wurde gesetzt!");
	}
	
	public void artikelAdden(Buchhandlung buchhandlung, Scanner userInput) {
		Medium neuesMedium = new Buch(2001, 11, 11, 3.50, "Haft", "Befehl", 200);
		neuesMedium.anliefern(69);
		buchhandlung.medien.add(neuesMedium); 
		
	}
	
	public void artikelNachbestellen(Buchhandlung buchhandlung, Scanner userInput) {
		System.out.println("Wähle ein Produkt aus, dessen Bestand du anpassen willst (ID)");
		buchhandlung.medienListen(buchhandlung);
		int id = userInput.nextInt();
		System.out.println("Die ID: " + id);
		
		System.out.println("Gib einen neuen Bestand ein: ");
		int neuerBestand = userInput.nextInt();
		System.out.println("Neuer bestand: " + neuerBestand);
		
		medien.get(id).anliefern(neuerBestand);
	}

	
	public void abfrage(Buchhandlung buchhandlung) {
		Scanner userInput = new Scanner(System.in); 
		
		System.out.println("Was möchtest du tun?");
		System.out.println("1) Einen neuen Preis vergeben");
		System.out.println("2) Ein neues Medium adden");
		System.out.println("3) Artikel nachbestellen");
		System.out.println("4) Etwas bestellen");
		System.out.println("5) Alle Medien ausgeben");
		
		int option = 0; 
		
		do {
			System.out.println("Gib deine Wahl ein: ");
			
			option = userInput.nextInt(); 
		} while (option == 0);
		if(option == 1) {
			preisAnpassen(buchhandlung, userInput); 
			buchhandlung.abfrage(buchhandlung); 
		}
		if(option == 2) {
			artikelAdden(buchhandlung, userInput); 
			buchhandlung.abfrage(buchhandlung);
		}
		if(option == 3) {
			buchhandlung.artikelNachbestellen(buchhandlung, userInput); 
			buchhandlung.abfrage(buchhandlung); 
		}
		if(option == 4) {
			try {
				buchhandlung.bestellen(buchhandlung, userInput); 
			} catch(BestellungException e) {
				System.out.println("Nicht genug du huso");
			}
			
			buchhandlung.abfrage(buchhandlung);
		}
		if(option == 5) {
			buchhandlung.medienListen(buchhandlung);
			// ruft sich selbst auf, um das menu nochmal zu öffnen
			buchhandlung.abfrage(buchhandlung);
		}
		
	}
	 

}
