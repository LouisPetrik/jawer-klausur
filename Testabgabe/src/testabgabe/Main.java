package testabgabe;

/**
 * Die Haupt-klasse für das Programm. 
 * @author Louis Petrik
 */
public class Main {
    /**
	 * Der Name der Person.
	 */
    private String name; 
	
	/**
	 * Die main-methode. 
	 */
    public static void main() {
    	System.out.println(verdoppeln(2)); 
    }
	
    /**
     * Eine methode zum verdoppeln der zahl.
     * @param zahl Die zahl
     * @return verdoppelter Wert. 
     */
    public static int verdoppeln(int zahl) {
    	return zahl * 2; 
    }
    
    /**
     * Just a function. 
     */
    public void doubleIt() {
    	System.out.println("Hello");
    }
}
