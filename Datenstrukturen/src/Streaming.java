import java.util.ArrayList;
import java.util.List;

public class Streaming {
	public static void main(String[] args) {
		List<Integer> zahlen = new ArrayList<>(); 
		zahlen.add(23);
		zahlen.add(2);
		zahlen.add(15);
		zahlen.add(9);
		zahlen.add(12); 
		
		
		List<Integer> dreiStellig = new ArrayList<>(); 
		
		// mit diesem stream auf zahlen wird erst nach größe gefiltert, 
		// dann die anzahl der elemente zurückgegeben. 
		int zweiStellig = (int) zahlen.stream()
		.filter(zahl -> zahl >= 10).count(); 
		
		System.out.println(zweiStellig);
			
		System.out.println("----------------------------");
		
		for(Integer zahl : zahlen ) {
			System.out.println(zahl);
		}
		
	}
}
