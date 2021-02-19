package vererbung;

public class Auto extends Fahrzeug {
	int PS; 
	int raeder;
	
	public Auto(String name, int PS, int raeder) {
		super(name);
		this.PS = PS;
		this.raeder = raeder;
	} 
	
	public String getName() {
		return name; 
	}
	
	public int getPS() {
		return PS; 
	}
	
	public int getRaeder() {
		return raeder; 
	}
	
}
