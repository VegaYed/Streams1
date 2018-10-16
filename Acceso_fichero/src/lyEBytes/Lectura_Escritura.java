package lyEBytes;

import java.io.*;

public class Lectura_Escritura {
	
	public static void main(String args[]) {
		
		int contador=0;
		
		int[] ni=new int[11031];
		
		try {
			
			FileInputStream archivoLectura=new FileInputStream("C:/Users/VEGA/PICTURES/judio.png"); //abre conexion o canal
			
			boolean final_ar=false;
			
			while(!final_ar) {
				
				int byte_entrada=archivoLectura.read();
				
				if(byte_entrada!=-1)
					ni[contador]=byte_entrada;
				
				else 
					final_ar=true;
				
				System.out.println(ni[contador]);
				
				contador++;
				
				
				
			}
			
			archivoLectura.close();
			
		}catch(IOException e) {
			System.out.println("Imagen no encontrada");
			e.printStackTrace();
		}
		
		crear_fichero(ni);
		
	}
	
	static void crear_fichero(int datos_ficheros[]) {
		
		try {
			
			FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/VEGA/PICTURES/copia.png");
			
			for(int i=0;i<datos_ficheros.length;i++) {
				fichero_nuevo.write(datos_ficheros[i]);
			}
			
			fichero_nuevo.close();
			
		}catch(IOException e) {
			System.out.println("Imagen no encontrada");
			e.printStackTrace();	
		}
		
		
	}

}
