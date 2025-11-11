/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int valor;
    int cuenta = 1000000;
    do{
        System.out.println("¿Cuánto desea retirar?");
        valor = captu.nextInt();
        cuenta = cuenta - valor;
        // También se puede escribir cómo: " cuenta -= valor; ".
            System.out.println("Tu saldo es = " + cuenta);
    }while(cuenta > 0);  
    }
}
