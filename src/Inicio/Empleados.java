/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import BDclass.BDConexion;

/**
 *
 * @author it
 */
public class Empleados extends JFrame {

    private JPanel panelBotones;
    private final int noOrden;

    public Empleados(int noOrden) {
        this.noOrden = noOrden;

        setTitle("Empleados");

        // No permitir cerrar, minimizar ni maximizar
        setUndecorated(true);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);

        // Evita que se cierre con Alt+F4 o clic fuera
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Configura el tamaño y diseño
        setSize(500, 400);
        setLayout(new BorderLayout());

        configurarEncabezado();
        setLocationRelativeTo(null);

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(0, 3, 10, 10));
        add(new JScrollPane(panelBotones), BorderLayout.CENTER);

        cargarEmpleados();

        setVisible(true);
    }

    private void configurarEncabezado() {
        JLabel lblNoOrden = new JLabel("Número de orden: " + noOrden);
        lblNoOrden.setFont(new Font("Segoe UI", Font.BOLD, 16));
        lblNoOrden.setHorizontalAlignment(SwingConstants.CENTER);

        // Lo agregamos arriba de la ventana
        this.setLayout(new BorderLayout());
        this.add(lblNoOrden, BorderLayout.NORTH);
    }

    class BotonRedondo extends JButton {

        public BotonRedondo(String texto) {
            super(texto);
            setFocusPainted(false);
            setContentAreaFilled(false);
            setBorderPainted(false);
            setRolloverEnabled(true);
            setFont(new Font("Segoe UI", Font.BOLD, 14));
            setForeground(Color.WHITE);
            setBackground(new Color(0, 123, 255));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            if (getModel().isPressed()) {
                g2.setColor(new Color(20, 120, 220)); // Color cuando se presiona
            } else if (getModel().isRollover()) {
                g2.setColor(new Color(30, 144, 255)); // Hover
            } else {
                g2.setColor(getBackground()); // Normal
            }

            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

            g2.dispose();
            super.paintComponent(g);
        }

        @Override
        protected void paintBorder(Graphics g) {
            // No pintamos borde
        }
    }

    private void cargarEmpleados() {
        try {
            BDConexion conecta = new BDConexion();
            Connection cn = conecta.getConexion();
            Statement stmt = cn.createStatement();

            panelBotones.removeAll();
            panelBotones.setLayout(new GridLayout(0, 3, 10, 10));

            ResultSet rs = stmt.executeQuery(
                    "SELECT codigo, nombre_corto FROM empleados WHERE estado = 1");

            while (rs.next()) {
                int codigoEmpleado = rs.getInt("codigo");
                String nombreEmpleado = rs.getString("nombre_corto");

                JButton boton = new BotonRedondo(nombreEmpleado);
                boton.setPreferredSize(new Dimension(150, 60));

                boton.addActionListener(e -> {
                    asignarEmpleadoAOrden(codigoEmpleado, noOrden);
                });

                panelBotones.add(boton);
            }

            panelBotones.revalidate();
            panelBotones.repaint();

            rs.close();
            stmt.close();
            cn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Error al cargar empleados: " + e.getMessage());
        }
    }

    private void asignarEmpleadoAOrden(int codigoEmpleado, int noOrden) {
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();

            String sql = "UPDATE ordenes SET codigoempleado = ? WHERE noorden = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigoEmpleado);
            ps.setInt(2, noOrden);

            ps.executeUpdate();

            ps.close();
            con.close();

            //JOptionPane.showMessageDialog(null, "Empleado asignado correctamente a la orden.");
            // Volver a la ventana de órdenes
            Mesas F = new Mesas(noOrden);
            F.setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar orden: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Empleados(0));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
