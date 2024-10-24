/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuduck;

abstract class Pato {
    ComportamientoVolar comportamientoVolar;
    ComportamientoQuack comportamientoQuack;

    public void realizarVuelo() {
        comportamientoVolar.volar();
    }

    public void realizarQuack() {
        comportamientoQuack.quack();
    }

    public void establecerComportamientoVolar(ComportamientoVolar cb) {
        comportamientoVolar = cb;
    }

    public void establecerComportamientoQuack(ComportamientoQuack cq) {
        comportamientoQuack = cq;
    }
}