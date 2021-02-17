package supermarkt;

public class Produkt {
	
	private String name; 
	private int ID; 
	protected double preis; 
	private int anzahl; 
	
	public Produkt(String name, int ID, double preis) {
		this.name = name;
		this.ID = ID;
		this.preis = preis;
	}
	
	
	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}
	



	public double getPreis(int anzahl) {
		return preis * anzahl; 
	}
	
	
	public int getAnzahl() {
		return anzahl;
	}
	
	/**
	 * 
	 * @param entferneAnzahl die anzahl, die entfernt werden 
	 * soll. 
	 */
	public void entferne(int entferneAnzahl) {
		anzahl -= entferneAnzahl; 
	}
	
	// setter funktion für die anzahl 
	public void anlieferung(int lieferAnzahl) {
		anzahl += lieferAnzahl; 
	}



	

	
	
	
}
