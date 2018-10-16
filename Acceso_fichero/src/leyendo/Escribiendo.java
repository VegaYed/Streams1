package leyendo;

import java.io.*;


public class Escribiendo {

	public void Escribir() {
		
		String frase="Esto es una frase de ejemplo";
		
		try {
			FileWriter escritura=new FileWriter("C:/Users/VEGA/Desktop/libro.txt");
			
			for(int i=0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
