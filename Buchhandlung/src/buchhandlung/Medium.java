package buchhandlung;
import java.util.Random; 


public abstract class Medium {
	int jahr; 
	int tag; 
	int monat; 
	double preis; 
	String hrgbVorname; 
	String hrgbNachname; 
	char bezeichner = 'M'; 

	
	int menge = 0; 
	
	
	public Medium(int jahr, int tag, int monat, double preis, String hrgbVorname, String hrgbNachname) {
		this.jahr = jahr;
		this.tag = tag;
		this.monat = monat;
		this.preis = preis;
		this.hrgbVorname = hrgbVorname;
		this.hrgbNachname = hrgbNachname;
	}
	

	
	public String getEAN() {
		String kuerzel = hrgbVorname.substring(0, 1) + hrgbNachname.substring(0, 1); 
		String EAN = bezeichner + "-" + jahr + "-" + kuerzel + "-" + monat + "-" + randomBuchstaben();
		return EAN; 
	}
	
	public void setBezeichner(char bezeichner) {
		this.bezeichner = bezeichner; 
	}
	
	// setter methode für die anzahl 
	public void anliefern(int anzahl) {
		menge = menge + anzahl; 
	}
	
	// entfernen von elementen aus dem bestand
	public void entferne(int anzahl) {
		menge = menge - anzahl; 
	}
	
	public int getMenge() {
		return menge; 
	}
	
	public double getPreis() {
		return preis; 
	}
	
	public void setPreis(double neuerPreis) {
		preis = neuerPreis; 
	}
	
	
	public static String randomBuchstaben() {
		Random r = new Random();
		StringBuilder sb = new StringBuilder(); 

		for(int i = 0; i < 3; i++) {
			sb.append((char)(r.nextInt(26) + 'A'));
		}
		String zahl = sb.toString();
		return zahl; 
	}
	
	
}
