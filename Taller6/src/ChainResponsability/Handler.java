/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainResponsability;
import Modelo.*;
/**
 *
 * @author eli
 */
public interface Handler {
    
    public void setNext(Handler handler);
    public void handle(Producto producto, String falla);
    
}
