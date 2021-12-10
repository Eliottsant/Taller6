/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainResponsability;

import Iterator.*;
import Modelo.Producto;


/**
 *
 * @author eli
 */
public class JefeInventario extends HandlerCliente{

    @Override
    public void handle(Producto producto, String falla){
        if(verificarInventario(producto)){
            if(producto.getPrecio()>1000){
                next.handle(producto, falla);
            }
            
        }else{
            System.out.println("Producto agotado");
        }
    }

    static boolean verificarInventario(Producto producto){
        ListaProductosDisponibles lista = new ListaProductosDisponibles();
        Iterador iterator = lista.iterador();
        boolean bool = false;
        
        while(iterator.hasNext() || bool!=false){
            Producto p = (Producto) iterator.next();
            if(p.getNombre().equals(producto.getNombre())){
                return true;
            }
        }
        return false;
    }
}


