/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package separ_numeros;

import java.util.Scanner;

//Leer 10 numero en un vector 
//guardar en otro vector los numeros pares y los impares en otro vector

/**
 *
 * @author Felix Castro
 */
public class separNume {
    public static void main(String[] args) {
        //leer por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables
        int [] numeros;
        int elem;
        int contPar = 0;
        int contImpar = 0;
        int [] numPares;
        int [] numImpares;
        
        //titulo
        System.out.println("DESPLAZAR UNA POSICION");
        System.out.println("-----------------------------------------");
        
        //ingresamos cuantos numeros vamos a guardar
        System.out.println("Digite cuantos numeros va guardar");
        elem = entrada.nextInt();
        
        //tamaño del vector
        numeros = new int[elem];
        
        System.out.println("-----------------------------------------");
        
        //llenamos el vector
        System.out.println("Registro de numeros");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((i+1)+".Digite un numero");
            numeros[i] = entrada.nextInt();
            
            if (numeros[i] % 2 == 0) {//si numero es par
                contPar++;
            } else {//si numero es impar
                contImpar++;
            }
        }
        
        //damos tamaño a los vectores pares y impares
        numPares = new int[contPar];
        numImpares = new int[contImpar];
        
        //reutilizamos los contadores
        contPar = 0;
        contImpar = 0;
        
        //guardamos los pares e impares en sus 
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {//si es par
                numPares[contPar] = numeros[i];
                contPar++;
            }else{//si es impar
                numImpares[contImpar] = numeros[i];
                contImpar++;
            }
        }
        
        System.out.println("-----------------------------------------");
        
        //imprimir vector pares
        System.out.println("El vector par es: ");
        for (int i = 0; i < numPares.length; i++) {
            System.out.println(numPares[i]);
        }
        
        System.out.println("-----------------------------------------");
        
        //imprimir vector impares
        System.out.println("El vector impar es: ");
        for (int i = 0; i < numImpares.length; i++) {
            System.out.println(numImpares[i]);
        }
        
        System.out.println("-----------------------------------------");
        
        //imprimir vector completo
        System.out.println("El vector completo es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
