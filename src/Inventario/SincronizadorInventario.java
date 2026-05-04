/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

import BDclass.BDConexion;
import java.sql.*;
import java.util.*;
import java.net.*;
import java.io.*;
import com.google.gson.Gson;

public class SincronizadorInventario {

    public static void sincronizar(String sucursal) {
        BDConexion conLocal = null;
        Connection conexion = null;

        try {
            conLocal = new BDConexion();
            conexion = conLocal.getConexion();

            String sqlLocal = "SELECT IDPRODUCTOSINVE, cantidad FROM angels.productosinventario";
            Statement stmtLocal = conexion.createStatement();
            ResultSet rs = stmtLocal.executeQuery(sqlLocal);

            List<Producto> productos = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("IDPRODUCTOSINVE");
                double cantidad = rs.getDouble("cantidad");
                productos.add(new Producto(id, cantidad));
            }
            System.out.println("sucursalapi"+sucursal);
            enviarAApi(productos,sucursal);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null && !conexion.isClosed()) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void enviarAApi(List<Producto> productos, String sucursal) {
    try {
        // URL url = new URL("http://192.168.196.228:3000/api/copiarinventario");
        URL url = new URL("http://40.233.19.196/inventariospinula/copiarinventario");
        // URL url = new URL("http://192.168.0.104:3000/inventariospinula/copiarinventario");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        // Creamos un objeto contenedor con productos y sucursal
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("productos", productos);
        requestBody.put("sucursal", sucursal);
         
        Gson gson = new Gson();
        String jsonInput = gson.toJson(requestBody); // JSON con productos y sucursal
        System.out.println("📤 JSON enviado: " + jsonInput);
        try (OutputStream os = conn.getOutputStream()) {
            byte[] input = jsonInput.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = conn.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8"))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    response.append(line.trim());
                }
                System.out.println("✅ Respuesta de la API: " + response.toString());
            }
        } else {
            System.out.println("❌ Error al enviar a API. Código: " + responseCode);
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Inventarios.SincronizadorInventario.enviarAApi()"+e);
    }
}

}
