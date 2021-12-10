/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainResponsability;

import Modelo.Garantia;
import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author eli
 */
public class DptoTecnicoHandler extends HandlerCliente{

    @Override
    public void handle(Producto producto, String falla){
        if(verificarFalla(producto, falla)){
            next.handle(producto, falla);
        }else{
            System.out.println("Producto no cuenta "
                    + "con garantia para falla "+falla);
        }
    }

    public boolean verificarFalla(Producto producto, String falla){
        Garantia g = producto.getGarantia();
        ArrayList fallas = g.getFallas();
        return fallas.contains(falla);
    }
}
