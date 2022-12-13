

package com.mycompany.santiagoperezdni;

import java.util.Scanner;

public class SantiagoPerezDNI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declaramos variable 
        int numeroDNI;
        char letra;
        char resto;
        boolean bandera = false;
        //Array de un conjunta de letras
     char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
     while(bandera == false){ // Creamos una bandera para saber que el proceso del programa esta bien y recorre bien la lista de datos. 
        System.out.println("Introduce el numero de tu DNI menos la letra:");
        numeroDNI = entrada.nextInt();
        //En el caso que el usuario no pango un nuemero entero no podrá seguir usando el programa. 
          while (!entrada.hasNextInt()){
               System.out.println("Esto no es un  numero, introduce el valor de nuevo.");
               entrada.nextLine();
        }
       //Aqui especificamos que en el caso que el usuario ponga un numero mayor 
       //que 0 y menor que 99999999 no se podrá hacer la operación de la validación de la letra del DNI. 
      if(numeroDNI < 0 || numeroDNI > 99999999) {
           System.out.println("El número del DNI no es válido.");
      }else {
          System.out.println("Escribe la letra de tu dni:");
          letra = entrada.next().charAt(0);
       resto = letras[numeroDNI % 23]; //En esta linea se hace la divisón del calculo de la letra del DNI. 
       
      if(resto!= Character.toUpperCase(letra)) {     //Character.toUpperCase nos permite que si el usuario pone una letra en minuscula 
                                                    //automaticamente la detecta como mayuscula. 
      System.out.println("La letra o el número no son correctos.");
      }else {
      System.out.println("El número del DNI y su letra son correctos.");
      bandera = true;
  
    } 
        
     }     
  }

  }

  
}
