/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author it
 */

public class Producto {
    private int idProducto;
    private Double cantidad;
    
     public Producto(int idProducto, Double cantidad) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public Double getCantidad() {
        return cantidad;
    }
    
}