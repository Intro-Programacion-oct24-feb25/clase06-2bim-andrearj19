/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;
import java.util.Scanner;


/**
 *
 * @author utpl
 */
public class Ejemplo12 {
    


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar:");
        int valor = entrada.nextInt();
        double[] resultados = new double[valor];
        boolean bandera = true;
         while (bandera) {
        for (int i = 0; i < valor; i++) {
            try {
                System.out.println("Ingrese el dividendo para la operación: ");
                double dividendo = entrada.nextDouble();
                System.out.println("Ingrese el divisor para la operación: " );
                double divisor = entrada.nextDouble();

                resultados[i] = dividendo / divisor;
                 bandera = false;
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero no es permitida.");
                resultados[i] = entrada.nextDouble();
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida.");
                resultados[i] = entrada.nextDouble();
            }
        }

        System.out.println("Resultados de las divisiones:");
        for (int i = 0; i < valor; i++) {
            System.out.printf("Resultado de la operación:" + resultados[i]);
        }
    }
}
}
    

