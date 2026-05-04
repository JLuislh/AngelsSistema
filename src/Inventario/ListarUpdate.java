/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.lang.reflect.Type;

/**
 *
 * @author it
 */
public class ListarUpdate {
    
    public static ArrayList<ConsultaProductos> ListarProductos(String fecha,String sucursal,int tipo) throws Exception {
    //URL url = new URL("http://192.168.196.228:3000/api/listar");
    URL url = new URL("http://40.233.19.196/inventariospinula/listar");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("Content-Type", "application/json");
    con.setDoOutput(true);

    // Cuerpo JSON
   String jsonInputString = "{\"fecha\":\"" + fecha + "\", \"sucursal\":\"" + sucursal + "\", \"tipo\":\"" + tipo + "\"}";

    try (OutputStream os = con.getOutputStream()) {
        byte[] input = jsonInputString.getBytes("utf-8");
        os.write(input, 0, input.length);
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
    StringBuilder respuesta = new StringBuilder();
    String linea;
    while ((linea = in.readLine()) != null) {
        respuesta.append(linea);
    }
    in.close();

    Gson gson = new Gson();
    Type tipoLista = new TypeToken<ArrayList<ConsultaProductos>>() {}.getType();
    return gson.fromJson(respuesta.toString(), tipoLista);
}
    
public static void actualizarCantidad(int codigo,double cantidad,String fecha,String sucursal) {
    try {
        //URL url = new URL("http://192.168.196.228:3000/api/actualizar");//cantidad,codio,fecha
        URL url = new URL("http://40.233.19.196/inventariospinula/actualizar");//cantidad,codio,fecha
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String json = String.format(
             "{\"codigo\": %d, \"cantidad\": %.2f, \"fecha\": \"%s\", \"sucursal\": \"%s\"}",
        codigo, cantidad, fecha, sucursal
        );

        try (OutputStream os = con.getOutputStream()) {
            os.write(json.getBytes("utf-8"));
        }
 int code = con.getResponseCode();
        InputStream is = (code >= 400) ? con.getErrorStream() : con.getInputStream();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line.trim());
            }
            System.out.println("Respuesta del servidor: " + response);
        }

        if (code == 200) {
            System.out.println("Cantidad actualizada con éxito.");
        } else {
            System.err.println("Error actualizando cantidad: HTTP " + code);
        }
    } catch (Exception e) {
        System.out.println("ERROR = " + e);
        e.printStackTrace();
    }
}    
   
   
    
}
