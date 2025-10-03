/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

import java.util.Scanner;

/**
 *
 * @author Aymara
 */
public class EVA2_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String cade = captu.nextLine();
        switch (cade){
        case "Lunes":
        System.out.println(1);
        break;
        case "Martes":
        System.out.println(2);
        break;
            default:
        System.out.println("Día no existente");
        }
       // No permite double 
       // No permite boolean
       
    }
    
}
