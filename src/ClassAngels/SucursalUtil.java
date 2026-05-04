/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAngels;

/**
 *
 * @author it
 */
public class SucursalUtil {
    
     public static String obtenerSucursal() {
        String sede = System.getProperty("user.name");
        String sucursal;

        switch (sede) {
            case "it" -> sucursal = "santaines";
            case "AngelsSantaInes" -> sucursal = "santaines";
            case "AngelsSanLuis" -> sucursal = "puertanegra";
            case "AngelsResidenciales" -> sucursal = "residenciales";
            default -> sucursal = "desconocida"; // puedes usar null o lanzar excepción si prefieres
        }

        return sucursal;
    }
    
}
