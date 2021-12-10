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
public class HandlerCliente implements Handler{

    protected Handler next;
    
    /**
     *
     * @param handler
     */
    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handle(Producto producto, String falla) {
        
        if(producto!=null){
            next.handle(producto, falla);
        }
    }

}
