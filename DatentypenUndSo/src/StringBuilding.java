
public class StringBuilding {
	// damit kann man einen string zusammensetzen. 
	// ist nicht immutable 
	 public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder(); 
			sb.append("Hello");
			sb.append(" World");
			String fertig = sb.toString();
			System.out.println(fertig);
	}
}
