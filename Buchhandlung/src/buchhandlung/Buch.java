package buchhandlung;

public class Buch extends Medium {
	int seitenzahl;

	public Buch(int jahr, int tag, int monat, double preis, String hrgbVorname, String hrgbNachname, int seitenzahl) {
		super(jahr, tag, monat, preis, hrgbVorname, hrgbNachname);
		this.seitenzahl = seitenzahl;
		this.setBezeichner('B');
	} 
	
	@Override
	public String getEAN() {
		String kuerzel = hrgbVorname.substring(0, 1) + hrgbNachname.substring(0, 1); 
		String EAN = "B-" + jahr + "-" + kuerzel + "-" + monat + "-" + randomBuchstaben();
		return EAN; 
	}
	
	
}
