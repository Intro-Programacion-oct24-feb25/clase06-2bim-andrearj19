/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//  GENERA UNA EXEPCION AL COLOCAR NUMEROS NEGATIVOS.
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) throws Exception {
      
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.println("Ingrese un pais: ");
                String valor1 = entrada.next();
                char letra = valor1.charAt(0);

                valor1 = valor1.toUpperCase();
                String primeraletra = String.valueOf(letra).toLowerCase();
                if (primeraletra.equals("A") || 
                    primeraletra.equals("E") || 
                    primeraletra.equals("I") || 
                    primeraletra.equals("O") || 
                    primeraletra.equals("U")) {
                    throw new Exception("Pais debe iniciar con consonante");
                }
                String resultado = "";
                resultado = String.format("%s%s\n", resultado, valor1);
                System.out.printf("Resultado: %s\n", resultado);
                bandera = false;
            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrio una"
                        + "excepcion%s\n",e);
            } catch (InputMismatchException e){
                 System.out.printf("(InputMismatchException) Ocurrio una"
                         + "excepcion %s\n",e);
            }catch(Exception e){
                System.out.printf("Ocurrió una excepción %s\n",e);
            }
        }
       
    }
}
                
                
             
            
            
               
              
                  
              
                   
              
                
              
        

    

