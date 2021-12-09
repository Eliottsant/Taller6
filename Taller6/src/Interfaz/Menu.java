/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Gerente;
import Modelo.Proveedor;
import Modelo.Usuario;
import Modelo.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Eliot
 */
public class Menu {

    private static ArrayList<Usuario> usuarios;

    public static Usuario existeUsuario(String user, String password) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(user) && u.getContraseña().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarAtributos();
        int elec;
        do {
            System.out.println("1. Inicio de sesion");
            System.out.println("2. Salir");
            System.out.println("Elija una opcion:");
            elec = sc.nextInt();
            sc.nextLine();
            if (elec == 1) {
                System.out.println("Ingrese su ususario:");
                String usu = sc.nextLine();
                System.out.println("Ingrese su contraseña");
                String contr = sc.nextLine();
                Usuario u = existeUsuario(usu, contr);
                if (u != null) {
                    u.mostrarMenu();
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }

            }

        } while (elec != 2);
    }

    public static void inicializarAtributos() {
        usuarios = new ArrayList<>();
        Usuario gerente=new Gerente("gerente","gerente");
        Usuario proveedor=new Proveedor("Proveedor","Proveedor");
        Usuario vendedor= new Vendedor("Vendedor","vendedor");
        usuarios.add(gerente);
        usuarios.add(vendedor);
        usuarios.add(proveedor);
    }
}
