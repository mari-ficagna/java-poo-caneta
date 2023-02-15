/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula02;

//import java.util.Scanner;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class POOAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
             
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.marca = "BIC";
        c1.carga = 100;
        c1.destampar();
        c1.status(); //chamou o método
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.tampada = true;
        c2.marca = "Stabilo";
        c2.carga = 50;
        System.out.println(" ");
        c2.status();
        c2.rabiscar();
                
    }
    
}
