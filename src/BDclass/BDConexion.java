/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BDclass;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jluis
 */

public class BDConexion {

    // public static final String URL = "jdbc:mysql://192.168.0.14:3306/angels?useTimezone=true&serverTimezone=UTC"; //LOCAL TRABAJO
    // public static final String URL = "jdbc:mysql://localhost:3306/angels?useTimezone=true&serverTimezone=UTC";//LocaLHOST
   //  public static final String URL = "jdbc:mysql://26.247.51.34:3306/angels?useTimezone=true&serverTimezone=UTC";//Maquina Angels San Luis
   public static final String URL = "jdbc:mysql://26.102.114.50:3306/angels?useTimezone=true&serverTimezone=UTC";//Maquina Angels Santa ines
   public static final String USER =   "angels";//"SuperElrey";
   public static final String CLAVE =  "Coast@cm";// 
     
   public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null,"ERROR CONTACTE CON EL ADMINISTRADOR DEL SISTEMA");
        }
        return con;
    }
}