/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduck;

public class PatoDeMadera extends Pato {
    public PatoDeMadera() {
        comportamientoVolar = new NoVolar();
        comportamientoQuack = new Squeak();
    }
}

