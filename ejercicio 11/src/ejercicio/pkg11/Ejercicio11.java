/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;
import java.util.Scanner;
/**
 *Escribe una aplicación con un String que contenga una contraseña
cualquiera. Después se te pedirá que introduzcas la contraseña, con 3
intentos. Cuando aciertes ya no pedirá más la contraseña y mostrará un
mensaje diciendo “Enhorabuena”. Piensa bien en la condición de
salida (3 intentos y si acierta sale, aunque le queden intentos).
 * @author LABMOVIL
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      String contra = "hola";
      String contra_usuario = "";
      int intentos = 1;
      int maximo = 3;
       while ((contra != contra_usuario) && (intentos <= maximo )){
           System.out.println("introduzca su contraseña");
           contra_usuario = teclado.nextLine();
           if(intentos ==3){
               System.out.println("incorrecta");
            }  
                
           intentos++;      
    }
       
       
    }
}
