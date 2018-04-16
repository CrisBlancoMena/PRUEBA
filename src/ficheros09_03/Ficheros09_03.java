package ficheros09_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author F541
 */
public class Ficheros09_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner e=new Scanner(System.in);
        // ATRIBUTOS
        File archivo=new File("/C:/Users/F541/Documents/CLASE/DAW1/(PRG)PROGRAMACION/UD9-FICHEROS/TEORIA/hola.txt");
        try{            
             //EJERCICIO 1
             System.out.println("========EJERCICIO-1========");
             //atributos
             FileReader fr= new FileReader(archivo);
             BufferedReader br= new BufferedReader(fr);       
             //Leer 
             String linea=br.readLine();
             System.out.println("LEIDO CORRECTAMENTE"+"\n==========================");
             
             //EJERCICIO 2
             System.out.println("========EJERCICIO-2========");
             //atributos             
             FileWriter fw=new FileWriter("C:\\Users\\F541\\Documents\\CLASE\\DAW1\\(PRG)PROGRAMACION\\UD9-FICHEROS\\ACTIVIDADE\\Hoja09_Ficheros_03\\pruebas\\nuevo.txt");
             BufferedWriter bw=new BufferedWriter(fw);
             System.out.println("Escribe lo que quieres escribir en el fichero");
             String frase=e.nextLine();
             //escribiendo
             bw.write(frase);
             bw.close();
             System.out.println("REALIZADO CORRECTAMENTE"+"\n========================");
             
        }    
        
        
        catch(IOException o){
            System.out.println(e.toString());
        }
        
       
    }
    
}
