/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int tama;
    System.out.println("¿Cuántas calificaciones va a capturar?");
    tama = captu.nextInt();
    int califas[] = new int[tama];
    //Capturar
    for(int i = 0; i < califas.length; i++){
    //FOR: En JAVA la posición inicial siempre es (cero). Ej; i = 0
    System.out.println("Calificación " + (i + 1) + ":");
    califas[i] = captu.nextInt();
    }
    //Leer
    for(int i = 0; i < califas.length; i++){
    System.out.println("[" + califas[i] + "]");
    }
    // Acumulador +- 0, */ 
    int suma = 0;
    // Sumar todas las calificaciones
     for(int i = 0; i < califas.length; i++){
    System.out.println("[" + califas[i] + "]");
    suma = suma + califas [i];
    // Suma += califas [i]
    }
    // CASTING convertir un tipo de dato a otro
    double promedio = suma / (double)tama; 
    System.out.println("Promedio = " + promedio);
    }
}
