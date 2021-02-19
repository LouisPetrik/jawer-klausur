package innerClass;
import java.util.ArrayList;

public class Person {


	
	public static void main(String[] args) {
		ArrayList<Integer> zahlen = new ArrayList<>(); 
		zahlen.add(3); 
		zahlen.add(1); 
		zahlen.add(2); 
		
		
		int[] zahlenNeu = zahlen.stream().sorted();
	}

}
