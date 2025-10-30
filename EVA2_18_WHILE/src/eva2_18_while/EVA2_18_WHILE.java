/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_while;

/**
 *
 * @author Aymara
 */
public class EVA2_18_WHILE {

    public static void main(String[] args) {
       int i = 1;
       while(i<=10){//Se repite si la condición es verdad.
         System.out.println("Aymara Torres");  
         i++;
         //El "i++" indica cuantas veces se va a repetir.
        }
       //Simular un "for" en "do while"
       System.out.println("Ciclo Do While -------- ");
       i = 1;
       do{
           //Primero lo que vas a imprimir, después la condición.
           System.out.println("Aymara Torres");
           i++;
       }while(i<=10);
    }
}
