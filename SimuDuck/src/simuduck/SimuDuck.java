/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simuduck;

/**
 *
 * @author saidj
 */
public class SimuDuck {

   
    public static void main(String[] args) {
       
        Pato pato1 = new PatoDeCiudad();
        pato1.realizarVuelo();
        pato1.realizarQuack();

        Pato pato2 = new PatoDeMadera();
        pato2.realizarVuelo();
        pato2.realizarQuack();
    
    }
    
}
