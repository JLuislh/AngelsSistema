/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedidosApi;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author it
 */
public class BDApiRest {
    
    public static ArrayList<ClassProductosApi>ListarPedidos(int estado) throws Exception {
        URL url = new URL("http://140.84.178.126:3500/pedidos");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);
        
        String jsonInputString = "{\"estado\":" + estado + "}";
        
        try (OutputStream os = con.getOutputStream()) {
        byte[] input = jsonInputString.getBytes("utf-8");
        os.write(input, 0, input.length);
    }

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String linea;
        while ((linea = in.readLine()) != null) {
            respuesta.append(linea);
        }
        in.close();

        // Convertimos JSON a lista de productos
        Gson gson = new Gson();
         Type tipoLista = new TypeToken<ArrayList<ClassProductosApi>>() {}.getType();
        return gson.fromJson(respuesta.toString(), tipoLista);
    }
    
    

    public static ArrayList<ClassProductosApi>obtenerProductos(int idPedido) throws Exception {
       URL url = new URL("http://140.84.178.126:3500/productos");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("Content-Type", "application/json");
    con.setDoOutput(true);

    // Cuerpo JSON
    String jsonInputString = "{\"idpedido\":" + idPedido + "}";

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
    Type tipoLista = new TypeToken<ArrayList<ClassProductosApi>>() {}.getType();
    return gson.fromJson(respuesta.toString(), tipoLista);
}
    
    
   public static ArrayList<ClassProductosApi> ProductosSolicitados(int idPedido, int sucursal) throws Exception {
    URL url = new URL("http://140.84.178.126:3500/productossolicitados");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("Content-Type", "application/json");
    con.setDoOutput(true);

    // Cuerpo JSON
    String jsonInputString = "{\"idpedido\":" + idPedido + ",\"sucursal\":\"" + sucursal + "\"}";

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
    Type tipoLista = new TypeToken<ArrayList<ClassProductosApi>>() {}.getType();
    return gson.fromJson(respuesta.toString(), tipoLista);
}
   
   
   
   
public static boolean agregarProductoAlPedido(int idPedido, int idProducto) {
    try {
        URL url = new URL("http://140.84.178.126:3500/agregar-producto-pedido"); // Ajusta si usas otro puerto
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String jsonInputString = String.format(
            "{\"id_pedido\": %d, \"id_producto\": %d}",
            idPedido, idProducto
        );

        try (OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_CREATED) {
            System.out.println("Producto agregado con éxito.");
            return true;
        } else {
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();
            System.err.println("Error al agregar producto: " + response.toString());
            return false;
        }
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

public static void actualizarCantidad(int idPedido, int idProducto,int sucursal, double cantidad) {
    try {
        URL url = new URL("http://140.84.178.126:3500/actualizar-cantidades");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String json = String.format(
            "{\"id_pedido\": %d, \"id_producto\": %d, \"sucursal\": \"%d\", \"cantidad\": %.2f}",
            idPedido, idProducto,sucursal,cantidad
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

//////////////////////////////////CANTIDADES RECIBIDAS////////////////////////////////////////


  public static ArrayList<ClassProductosApi> ProductosRecibidos(int idPedido, int sucursal) throws Exception {
    URL url = new URL("http://140.84.178.126:3500/productosrecibido");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("POST");
    con.setRequestProperty("Content-Type", "application/json");
    con.setDoOutput(true);

    // Cuerpo JSON
    String jsonInputString = "{\"idpedido\":" + idPedido + ",\"sucursal\":\"" + sucursal + "\"}";

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
    Type tipoLista = new TypeToken<ArrayList<ClassProductosApi>>() {}.getType();
    return gson.fromJson(respuesta.toString(), tipoLista);
}
  
  public static void actualizarCantidadRecibida(int idPedido, int idProducto,int sucursal, double cantidad) {
    try {
        URL url = new URL("http://140.84.178.126:3500/actualizar-cantidades-recibidas");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String json = String.format(
            "{\"id_pedido\": %d, \"id_producto\": %d, \"sucursal\": \"%d\", \"cantidad\": %.2f}",
            idPedido, idProducto,sucursal,cantidad
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
