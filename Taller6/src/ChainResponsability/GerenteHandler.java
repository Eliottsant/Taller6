/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainResponsability;

import Modelo.Producto;

/**
 *
 * @author eli
 */
public class GerenteHandler extends HandlerCliente{

    private boolean aprobacion;

    @Override
    public void handle(Producto producto, String falla){
        if(aprobacion){
            System.out.println("Solicitud aprobada");
        }else{
            next.handle(producto, falla);
        }
    }
}
