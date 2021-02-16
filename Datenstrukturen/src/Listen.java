import java.util.List; 
import java.util.ArrayList;
import java.util.LinkedList; 


public class Listen {
	public static void main(String[] args) {
		
		// eine array liste erstellen: (geht auch mit dem ArrayList statt "List")
		List<Integer> list1 = new ArrayList<>(); 
		list1.add(1); 
		list1.add(3); 
		
		for (Integer zahl : list1) {
			System.out.println(zahl);
		}
		
		
		
		
	}
}
