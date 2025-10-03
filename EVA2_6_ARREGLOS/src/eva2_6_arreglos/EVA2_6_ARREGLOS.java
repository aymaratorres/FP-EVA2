/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_6_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);  
        int día; 
        String díasSemana[] = {"Domingo", "Lunes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        System.out.println("Introduce el día en número del 0 al 5: ");
        día = captu.nextInt();
        System.out.println("El día es: " + díasSemana[día]);
    }
}
