
public class ZeugsCasten {
	public static void main(String[] args) {
		double age = 23.5; 
		String name = "Hans"; 
		// in diesem fall braucht man gar nicht casten 
		System.out.println(name + " ist " + age);
		
		double age2 = 20; 
		
		String alterAlsText = Double.toString(age2);
		System.out.println(alterAlsText);
		// für int: Integer.toString()
		
	}
}
