/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_examen1;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_1_EXAMEN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int saldo = 5000;
        int pin, opc, monto;

        System.out.println("INTRODUCE EL PIN:");
        pin = sc.nextInt();

        if (pin == 1234) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar dinero");
            System.out.println("Selecciona la operación:");
            opc = sc.nextInt();   // Lee la opción del usuario

            if (opc == 1) {
                // Consultar saldo
                System.out.println("Tu saldo es: " + saldo);

            } else if (opc == 2) {
                // Retirar dinero
                System.out.println("¿Cuánto vas a retirar?");
                monto = sc.nextInt();

                if (monto <= saldo) {
                    saldo = saldo - monto;
                    System.out.println("Retiro exitoso.");
                    System.out.println("Tu saldo actual es: " + saldo);
                } else {
                    System.out.println("Monto mayor al saldo disponible.");
                }

            } else if (opc == 3) {
                // Depositar dinero
                System.out.println("¿Cuánto vas a depositar?");
                monto = sc.nextInt();

                if (monto >= 0) {
                    saldo = saldo + monto;
                    System.out.println("Depósito exitoso.");
                    System.out.println("Tu saldo actual es: " + saldo);
                } else {
                    System.out.println("Monto no válido (negativo).");
                }

            } else {
                System.out.println("Opción no válida.");
            }

        } else {
            System.out.println("PIN incorrecto.");
        }
    }
    
}
