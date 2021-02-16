// cooler name, oder? 
public class LoopingLouis {
	public static void main(String[] args) {
		int zahlen[] = {1, 2, 3, 4}; 
		 
		// wie man sieht, ist das ein for-loop
		for(int zahl : zahlen) {
			//System.out.println(zahl);
		}
		
		// den array von hinten an ausgeben: 
		for (int i = zahlen.length - 1; i >= 0; i--) {	
			System.out.println(zahlen[i]);
		}
		

	}
}
