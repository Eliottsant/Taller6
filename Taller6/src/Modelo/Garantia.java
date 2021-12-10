/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Eliot
 */
public class Garantia {
    private Date fechaAdquisicion;
    private int duracion;
    private ArrayList fallas;
    
    public boolean calcularGarantia(){
        return true;
    }
    public ArrayList getFallas(){
        return fallas;
    }
}
