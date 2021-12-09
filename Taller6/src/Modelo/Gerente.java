/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Eliot
 */
public class Gerente extends Usuario{

    public Gerente(String usuario, String contraseña) {
        super(usuario, contraseña);
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menu gerente");
    }
    
}
