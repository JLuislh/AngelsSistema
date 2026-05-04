/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inicio;
import ClassAngels.SucursalUtil;
import Inventario.SincronizadorInventario;
import java.io.IOException;
import java.net.ServerSocket;

public class SingleInstanceApp {

    private static final int PORT = 1000; // Puerto único para tu aplicación

    public static void main(String[] args) {
        // Intentar abrir un socket en el puerto único
        try (ServerSocket socket = new ServerSocket(PORT)) {
            System.out.println("Aplicación iniciada. No hay otras instancias en ejecución.");

            // 🔹 Registrar shutdown hook UNA VEZ (solo al salir)
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    System.out.println("🔄 Sincronizando con API antes de salir...");
                    SincronizadorInventario.sincronizar(SucursalUtil.obtenerSucursal());
                } catch (Exception e) {
                    System.err.println("Error al sincronizar al salir: " + e.getMessage());
                }
            }));

            // 🔹 Lanza la ventana principal
            iniciarAplicacion();

            // 🔹 Sincronización al iniciar
            try {
                System.out.println("🔄 Sincronizando con API al iniciar...");
                SincronizadorInventario.sincronizar(SucursalUtil.obtenerSucursal());
            } catch (Exception e) {
                System.err.println("Error al sincronizar al iniciar: " + e.getMessage());
            }

            // Bloquea el hilo principal para mantener la aplicación viva
            synchronized (SingleInstanceApp.class) {
                try {
                    SingleInstanceApp.class.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        } catch (IOException e) {
            // Si no se puede abrir el socket, otra instancia ya está corriendo
            System.err.println("Ya hay una instancia de la aplicación en ejecución.");
            System.exit(1);
        }
    }

    private static void iniciarAplicacion() {
        Ordenes ventana = new Ordenes();
        // Esto asegura que al cerrar la ventana principal se termine el proceso
        ventana.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        System.out.println("Tu aplicación está en funcionamiento...");
    }
}
