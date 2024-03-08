/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDclass;

import ClassAngels.InsertarProducto;
import ClassAngels.OrdenesClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */
public class BDOrdenes {
    
    
     public static OrdenesClass InsertarPedido(OrdenesClass t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into Ordenes (FECHA,ESTADO) values(CURRENT_TIMESTAMP,1)",Statement.RETURN_GENERATED_KEYS);
        try {
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);}
        
        ResultSet rs = smtp.getGeneratedKeys();
        if(rs.next()){int id = rs.getInt(1);
          t.setIdregresoPedido(id);
        }
       con.close();
       smtp.close(); 
        return t;
       
    }
     
    
     public static InsertarProducto InsertarProducto_Pedido(InsertarProducto t) throws SQLException{
        BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement smtp = null;
        smtp =con.prepareStatement("insert into ventas (noorden,codigo,cantidad,total,estado) values(?,?,1,(select precio from productos where codigo =  "+t.getId_producto()+" ),1) ");
        try {
         smtp.setInt(1,t.getNoOrden());
         smtp.setInt(2,t.getId_producto());
         smtp.executeUpdate();
     } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA ADENTRO =  "+e);}
       con.close();
       smtp.close(); 
        return t;
       
    }
     
     
     public static ArrayList<InsertarProducto> ListarProductosPedidos (int a ) {
        return SQL3(" SELECT cantidad,concat(p.DESCRIPCION1 ,' ', p.DESCRIPCION2) as Descripcion,precio,precio*CANTIDAD as total FROM ventas v inner join productos p on v.CODIGO = p.CODIGO where NOORDEN = "+a+";");    
 }  

private static ArrayList<InsertarProducto> SQL3(String sql){
    ArrayList<InsertarProducto> list = new ArrayList<InsertarProducto>();
    BDConexion conecta = new BDConexion();
    Connection cn = conecta.getConexion();
    
        try {
            InsertarProducto t;
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                 t = new InsertarProducto();
                 t.setCantidad(rs.getInt("cantidad"));
                 t.setDescripcion(rs.getString("DESCRIPCION").toUpperCase());
                 t.setPrecio(rs.getDouble("Precio"));
                 t.setTotal(rs.getDouble("total"));
                 list.add(t);
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("error consulta DE LA TABLA "+e);
            return null;
        } 
        return list;
}  
    
    
    
    
    
}
