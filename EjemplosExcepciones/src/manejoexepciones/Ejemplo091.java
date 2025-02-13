/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//una cadena de supermercados desea analizar sus ventas de los primeros seis meses del año en distintas categorías de productos.Se han registrado las siguientes cifras de ventas mensuales(en miles de dolares)
//        alimentos {320, 340, 360, 400, 450, 480};
//        electrodomesticos{150,160,170,180,200,220};
//        ropa[ {200,210,250,270,300,350};
//        jugetes {100,120,130,140,150,180};


//  GENERA UNA EXEPCION AL COLOCAR NUMEROS NEGATIVOS.
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo091 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Ingrese valor 1 a operar: ");
            int valor1 = entrada.nextInt();
            System.out.println("Ingrese valor 2 a operar: ");
            int valor2 = entrada.nextInt();
            if (valor1 < 0 || valor2 < 0){
               throw new Exception("Número negativos");
            }
            int resultado = valor1 / valor2;
            System.out.printf("Resultado %s\n", resultado);
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
    }
}
