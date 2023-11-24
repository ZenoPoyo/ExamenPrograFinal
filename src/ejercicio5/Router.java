/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author migue
 */
class Router implements ConexionRed {
    @Override
    public void conectar() {
        System.out.println("El router se conecto a la red");
    }
    @Override
    public void desconectar() {
        System.out.println("El router se desconecto de la red");
    }
    public void configurarRed() {
        System.out.println("Configurando la red");
    }
}

