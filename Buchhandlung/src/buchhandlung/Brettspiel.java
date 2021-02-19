package buchhandlung;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Brettspiel extends Medium {
	int genreID; 
	
	
	final Set<String> genre = new HashSet<>(
			Arrays.asList("Partyspiel", "Deckbuilding", "Strategiespiel")
	);


	public Brettspiel(int jahr, int tag, int monat, double preis, String hrgbVorname, String hrgbNachname, int genreID,
			Set<String> genre) {
		super(jahr, tag, monat, preis, hrgbVorname, hrgbNachname);
		this.genreID = genreID;
	}
	
	
	
	

}
