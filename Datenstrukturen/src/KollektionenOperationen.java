import java.util.List; 
import java.util.ArrayList; 

public class KollektionenOperationen {
	public static void main(String[] args) {
		List<String> namen = new ArrayList<>(); 
		namen.add("Max");
		namen.add("Anna");
		namen.add("Valle");
		
		List<String> namen2 = new ArrayList<>(); 
		namen2.add("Max");
		namen2.add("Anna");
		namen2.add("Valle");
		
		
	
		// contains ist case-sensitive! 
		System.out.println(namen.contains("max")); 
		
		// equals = true, wenn alle elemente darin equals sind
		System.out.println(namen.equals(namen2));
	}
}
