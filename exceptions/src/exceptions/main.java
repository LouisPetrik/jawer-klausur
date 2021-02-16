package exceptions;

import java.io.IOException;

// eine basic exeception throwen. 
// die default execptions stehen 
// https://www.uni-hildesheim.de/learnweb2020/pluginfile.php/191897/mod_resource/content/3/ch10-Ausnahmen.pdf
// auf seite 5
public class main {
	public static void main(String args[]) throws IOException {
		System.out.println("Hello world");
		
		if(2 > 1) {
			throw new IOException("Das stinkt");
		}
	}
}
