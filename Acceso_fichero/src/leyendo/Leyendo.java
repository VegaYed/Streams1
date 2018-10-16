package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leyendo {
	
	public void lee(){
		
		try {
			FileReader entrada=new FileReader("C:/Users/VEGA/Desktop/Bolsas.txt");
			
			BufferedReader miBuf=new BufferedReader(entrada);
			
			String linea="";
	
			do{
				
				linea=miBuf.readLine();
				
				System.out.print(linea);
				
			}while(linea!=null);
			
		} catch (IOException e ) {
			System.out.println("Archivo no encontrado");
		} 
	}

}
