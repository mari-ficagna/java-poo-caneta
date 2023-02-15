/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaula02;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class Caneta {
    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Tampada? "+this.tampada);
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar, a caneta está tampada!");
        } else {
            System.out.println("Estou rabiscando...");
        }
        
    }
    void tampar (){
        this.tampada = true;
        
    }
    void destampar(){
        this.tampada = false;
    }
    
}
