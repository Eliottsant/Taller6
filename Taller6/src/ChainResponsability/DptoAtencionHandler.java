/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainResponsability;

import Modelo.Garantia;
import Modelo.Producto;

/**
 *
 * @author eli
 */
public class DptoAtencionHandler extends HandlerCliente {

    @Override
    public void handle(Producto producto, String falla){
        Garantia g = producto.getGarantia();
        
        if(g.calcularGarantia()){
            next.handle(producto, falla);
            
        }else{
            System.out.println("El producto supero su tiempo de garantia");
        }
    }
}