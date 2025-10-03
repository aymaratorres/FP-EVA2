/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);  
        int día; 
        String díasSemana[] = new String[7];
        díasSemana[0] = "Domingo.";
        díasSemana[1] = "Lunes.";
        díasSemana[2] = "Martes.";
        díasSemana[3] = "Miércoles.";
        díasSemana[4] = "Jueves.";
        díasSemana[5] = "Viernes.";
        díasSemana[6] = "Sábado.";
        System.out.println("Introduce el día en número del 0 a 6: ");
        día = captu.nextInt();
        System.out.println("El día es: " + díasSemana[día]);
    }
}
