/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassAngels;

import java.util.Map;

/**
 *
 * @author it
 */
public class Buscasucursal {
    
   public static int obtenerSucursal() {

        String sede = System.getProperty("user.name");

        return switch (sede) {
            case "it" -> 4;
            case "AngelsParaiso" -> 1;
            case "AngelsSanLuis" -> 2;
            case "AngelsResidenciales" -> 3;
            case "AngelsSantaInes" -> 4;
            case "angelspalencia" -> 5;
            default -> 0;
        };
    }
    
}
