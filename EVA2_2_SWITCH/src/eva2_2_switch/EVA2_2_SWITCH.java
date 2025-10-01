/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opc;
     System.out.println("1. Consultar saldo");
          System.out.println("1. Consultar saldo");
          System.out.println("2. Retirar monto");
          System.out.println("3. Depositar monto");
          System.out.println("Selecciona una opción del menú: ");
          opc = captu.nextInt();
        switch(opc){//Usar unicamente para opciones sencillas
        case 1:
            System.out.println("Elegiste imprimir saldo!!");
            break;//Romper o detiene la instrucción y es OBLIGATORIO en este caso
        case 2:
            System.out.println("Elegiste retirar saldo!!");
            break;//Fin del SWITCH
        case 3:
            System.out.println("Elegiste depositar saldo!!");
            break;//Fin del SWITCH
        default://Opcional
            System.out.println("Opción incorrecta!");
    }
    }
}
