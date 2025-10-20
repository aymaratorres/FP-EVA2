/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_for;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_12_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner captu = new Scanner(System.in);
    int num, tabla;
    System.out.println("Ingresa un número: ");
    num = captu.nextInt();
    System.out.println("Tabla: ");
    tabla = captu.nextInt();
    for(int i = num; i <=10; i ++){
    int mult = num * i;
    System.out.println(num + " x " + i + " - " + mult);}
    }
}
