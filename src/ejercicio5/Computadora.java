/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author migue
 */
class Computadora implements ConexionRed {

    @Override
    public void conectar() {
        System.out.println("La computadora se conecto a la red");
    }

    @Override
    public void desconectar() {
        System.out.println("La computadora se desconecto de la red");
    }
}

