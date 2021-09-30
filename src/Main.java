import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
			
		String fichero = "C:\\PRUEBAS\\Alumnos.txt";
		 FileReader fr = new FileReader(fichero);
		 BufferedReader br = new BufferedReader(fr);			
		 
		 FileWriter fw = new FileWriter ("C:\\PRUEBAS\\DAM1.txt",true);  //FIJARSE BIEN EN LAS RUTAS y ACORDARSE DE PONER TRUE PARA QUE 
		 																// NO SOBRRESCRIBA.
		 BufferedWriter bw1 = new BufferedWriter(fw);
		 
		 FileWriter fw2 = new FileWriter("C:\\PRUEBAS\\DAM2.txt", true);
		 BufferedWriter bw2 = new BufferedWriter(fw2);
		 
		 
		 String linea; // ="Marta 981111111 DAM1"
		 while((linea = br.readLine()) != null) {
			 
			 String[] lineaDivisoria =linea.split(" ") ;// CON EL MÉTODO SPLIT, DIVIDIMOS EL OBJETO STRING linea, EN UN ARRAY DE STRINGS,
			 											//SEGÚN EL CARACTER QUE LE PASEMOS POR PARÁMETRO, EN ESTE CASO (" ").
			 											// lineaDivisoria[0]= "Marta", lineaDivisoria[1]= "981111111", lineaDivisoria[2]= "DAM1"
			 
			 if(lineaDivisoria[2].equals("DAM1")){  // CON UN IF LE DECIMOS LOS 2 TIPOS DE CASOS POSIBLES,SI EL ARRAY QUE HEMOS CREADO,
				 									// EN SU POSCION 3[2], ES IGUAL A "DAM1"
				
				 
				 bw1.write(lineaDivisoria[0] +lineaDivisoria[1]+ "\r");  // NOS ESCRIBIRÁ EN LA VARIABLE bw1, LA POSICION 1 Y 2 [0] Y [1]
			 }															// UNA VEZ CRADO EL BUFFERED CON LA VARIABLE bw1 , Y EL MÉTODO .write
			 															//NOS CREA EL FICHERO.
			 	else {													// SI NO...
			 			
			 	bw2.write(lineaDivisoria[0] +lineaDivisoria[1]+ "\r");  // ESCRIBIRÁ IGUALMENTE EN LA VARIABLE bw2, LA POSICION 1 Y 2 [0] Y [1]
			 	}
		 }
		 		
		 		//REFRESCAMOS
			 	bw1.flush();
		 		bw2.flush();
		 		
		 		//CERRAMOS
		 		fr.close();
		 		bw1.close();
		 		bw2.close();

	}

}
