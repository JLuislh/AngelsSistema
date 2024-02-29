/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAngels;

import BDclass.BDConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jluis
 */
public class MesasClass {
    
    
    private String mesa;
    private int estado;

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    
    public static ArrayList<MesasClass> ListaMesas () {
        return SQLP("SELECT nomesa,estado FROM mesas WHERE ESTADO = 2 order by ID_MESA");    
 }  

private static ArrayList<MesasClass> SQLP(String sql){
    ArrayList<MesasClass> list = new ArrayList<MesasClass>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            MesasClass t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new MesasClass();
                 t.setMesa(rs.getString("nomesa"));
                 t.setEstado(rs.getInt("estado"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA ATABLA "+e);
            return null;
        } 
        return list;
}  
    
    
}
