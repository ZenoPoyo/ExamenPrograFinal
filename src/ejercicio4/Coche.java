/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author migue
 */
    class Coche extends Vehiculo {

    @Override
    void acelerar() {
        System.out.println("El coche está acelerando");
    }
    @Override
    void frenar() {
        System.out.println("El coche está frenando");
    }
}
