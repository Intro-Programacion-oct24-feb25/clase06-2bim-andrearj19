/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes﻿​_
 */
public class Ejemplo07 {
    
    public static void main(String[] args) {
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese valor 1:");
            int valor1 = entrada.nextInt(); // se espera un valor entero
            System.out.println("Ingrese valor 2:");
            int valor2 = entrada.nextInt(); // se espera un valor entero
            int resultado = valor1 / valor2;
            double resultado2 = (double)resultado;
            System.out.printf("Resultado %d", resultado2);
        }
        catch (InputMismatchException inputMismatchException) {
            // enviar un correo adminstrador
            System.out.printf("Existe un error de tipo %s\n", 
                    inputMismatchException);
        }
        catch(ArithmeticException arithmeticException){
            // enviar un correo programa
            System.out.println("Lo sentimos hay un error");
            System.out.printf("De tipo %s\n", arithmeticException);
        
        }
        catch(Exception e){
            //el exception es para poder capturar la excepcion
            System.out.printf(" Lo sentimos hay un error de tipo %s\n", e);
        
        }
               
    }
}
