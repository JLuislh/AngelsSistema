/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedidosApi;

import Pedidos.*;

/**
 *
 * @author it
 */
public class ClassProductosApi {
    
    private int id_producto;
    private String Unidad;
    private int id_pedido;
    private String Fechain;
    private String Fecha;
    private String Csantaines;
    private String Cpuertanegra;
    private String Cparaiso;
    private String Cpalencia;
    private String CResi;
    private String Cantidad;
    private String descripcion; 
    private String medida; 

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getCsantaines() {
        return Csantaines;
    }

    public void setCsantaines(String Csantaines) {
        this.Csantaines = Csantaines;
    }

    public String getCpuertanegra() {
        return Cpuertanegra;
    }

    public void setCpuertanegra(String Cpuertanegra) {
        this.Cpuertanegra = Cpuertanegra;
    }

    public String getCparaiso() {
        return Cparaiso;
    }

    public void setCparaiso(String Cparaiso) {
        this.Cparaiso = Cparaiso;
    }

    public String getCpalencia() {
        return Cpalencia;
    }

    public void setCpalencia(String Cpalencia) {
        this.Cpalencia = Cpalencia;
    }

    public String getCResi() {
        return CResi;
    }

    public void setCResi(String CResi) {
        this.CResi = CResi;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFechain() {
        return Fechain;
    }

    public void setFechain(String Fechain) {
        this.Fechain = Fechain;
    }
   
    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }
    
    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
