package vererbung;
import java.util.ArrayList;

import java.util.Scanner; 

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; 


public class Strecke {
	
	// Dieses Programm hat noch keine eigenen autos erstellt
	// erst aus dem speicher der textdatei lesen wir 
	
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	
	
	public static void main(String[] args) {
		Auto lambo = new Auto("Lambo", 550, 4);
		Auto benz = new Auto("Benz", 300, 5); 
		
		Strecke strecke = new Strecke(); 
		
		
		//strecke.autos.add(lambo); 
		//strecke.autos.add(benz); 
	
		
		/*
		for(int i = 0; i < strecke.autos.size(); i++) {
			System.out.println(strecke.autos.get(i).getName());
		}*/
		
		//strecke.speichern(strecke.autos); 
		
		//strecke.einlesen(strecke); 
		
		strecke.menu(strecke); 

	
	}
	
	public void autosListen(Strecke strecke) {
		System.out.println("Die liste der autos: ");
		for(int i = 0; i < strecke.autos.size(); i++) {
			System.out.println(strecke.autos.get(i).getName());
			System.out.println(strecke.autos.get(i).getPS());
			System.out.println(strecke.autos.get(i).getRaeder());
		}
		System.out.println("--------------------------------------");
	}
	
	
	public void menu(Strecke strecke) {
		System.out.println("Wähle etwas aus");
		System.out.println("1) Autos auflisten");
		System.out.println("2) Autos aus dem Speicher einlesen");
		System.out.println("3) Aktuellen state an autos abspeichern");
		
		int input = 0; 
		Scanner userInput = new Scanner(System.in); 
		do {
			input = userInput.nextInt(); 
			
		} while (input == 0); 
		
		if(input == 1) {
			autosListen(strecke); 
			menu(strecke); 
		}
		if(input == 2) {
			einlesen(strecke); 
			menu(strecke); 
		}
		if(input == 3) {
			speichern(strecke.autos); 
			menu(strecke); 
		}
	}
	
	public void speichern(ArrayList<Auto> autos) {
		// überprüfen ob datei existiert 
		/*
		try {
			File garage = new File("garage.txt");
			if(garage.createNewFile()) {
				System.out.println("new file created");
			} else {
				System.out.println("fie exists");
			} 
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		*/
		 try {
		      FileWriter myWriter = new FileWriter("garage.txt");
		      
		      for(Auto auto : autos) {
		    	  myWriter.write(auto.getName() + "," + auto.getPS() + "," + auto.getRaeder() + String.format("%n"));
		      }
		
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
	}
	

	
	public void einlesen(Strecke strecke) {
		ArrayList<Auto> autos = new ArrayList<Auto>();
		  try {
		      File myObj = new File("garage.txt");
		      Scanner myReader = new Scanner(myObj);
		      
		      // für jede zeile 
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] parts = data.split("\\,");
		        
		        String name = parts[0]; 
		        int PS = Integer.parseInt(parts[1]); 
		        int raeder = Integer.parseInt(parts[2]);
		        
		        strecke.autos.add(new Auto(name, PS, raeder)); 
		        
		        // jeden teil ausgeben, der mit "," getrennt wird
		        /*
		        for(String part : parts) {
		        	System.out.println(part);
		        }*/
		        
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	  
		 
	}
	


	
	
}
