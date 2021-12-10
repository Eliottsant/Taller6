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
public class Producto {
    private String nombre;
    private int stock;
    private String descripcion;
    private Garantia garantia;
    private float precio;
    
    public Garantia getGarantia(){
        return garantia;
    }
    public String getNombre(){
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    
}
