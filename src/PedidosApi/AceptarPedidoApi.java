/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PedidosApi;

import Pedidos.*;
import ClassAngels.TextAreaRenderer;
import Inicio.Ordenes;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author it
 */
public class AceptarPedidoApi extends javax.swing.JFrame {
  String sede;
  int id_producto;
  int Sucursal = 0;
  int bloqueo = 0;
    /**
     * Creates new form InicioPedido
     */
    public AceptarPedidoApi() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        sede = System.getProperty("user.name");
        buscasucursal();
        ListarPedidos();
        
        /////////////toda esta parte es para cerrar y abrir ordenes/////////////////    
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ////////////////////////////////////////
         addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // Mostrar el segundo JFrame
                Ordenes F = new Ordenes();
                F.setVisible(true);
            }
        });
        ////////////////////////////////////////
    }
    
    
     private void buscasucursal(){
        switch (sede) {
            case "it" ->
                Sucursal = 5;
            case "AngelsParaiso" ->
                Sucursal = 1;//ok
            case "AngelsSanLuis" ->
                Sucursal = 2;//ok
            case "AngelsResidenciales" ->
                Sucursal = 3;
            case "AngelsSantaInes" ->
                Sucursal = 4;
            case "angelspalencia" ->
                Sucursal = 5;//ok  
            default -> {
            }
        }
    }

  
    
    
    private void ListarPedidos() throws Exception {
        System.out.println("entra");
        ArrayList<ClassProductosApi> result = BDApiRest.ListarPedidos(2);
        RecargarTablaPedidos(result);
    }

    private void RecargarTablaPedidos(ArrayList<ClassProductosApi> list) {
        Object[][] datos = new Object[list.size()][2];
        int i = 0;
        for (ClassProductosApi t : list) {
            datos[i][0] = t.getId_pedido();
            datos[i][1] = t.getFecha();
            i++;
        }
        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "No.", "FECHA"
                }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        TablePedidos.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        TableColumn columna1 = TablePedidos.getColumn("No.");
        columna1.setPreferredWidth(-20);
        TableColumn columna2 = TablePedidos.getColumn("FECHA");
        columna2.setPreferredWidth(255);
    }
    
     private void ListarProductosRecibidos() throws Exception {
        ArrayList<ClassProductosApi> result = BDApiRest.ProductosRecibidos(Integer.parseInt(NoPedido.getText()), Sucursal );
        RecargarTablaReci(result);
    }

    private void RecargarTablaReci(ArrayList<ClassProductosApi> list) {
        Object[][] datos = new Object[list.size()][4];
        int i = 0;
        for (ClassProductosApi t : list) {
            datos[i][0] = t.getId_producto();
            datos[i][1] = t.getDescripcion();
            datos[i][2] = t.getMedida();
            datos[i][3] = t.getCantidad();
            i++;
        }

        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{"CODIGO", "DESCRIPCION", "MEDIDA", "CANTIDAD"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 3; // Solo se puede editar CANTIDAD
            }
        };

        Solicitado.setModel(model);
        Solicitado.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
        Solicitado.getColumnModel().getColumn(0).setPreferredWidth(-20);
        Solicitado.getColumnModel().getColumn(1).setPreferredWidth(255);
        Solicitado.getColumnModel().getColumn(2).setPreferredWidth(55);

        // Aquí se agrega el listener para detectar edición
        model.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 3) {
                    int row = e.getFirstRow();
                    int modelRow = Solicitado.convertRowIndexToModel(row);
                    int id_producto = Integer.parseInt(
                            String.valueOf(model.getValueAt(modelRow, 0))
                    );
                    double cantidadRaw = Double.parseDouble(
                            String.valueOf(model.getValueAt(modelRow, 3))
                    );
                    double cantidad = Math.round(cantidadRaw * 100.0) / 100.0;
                    
                    int id_pedido = Integer.parseInt(NoPedido.getText());

                    BDApiRest.actualizarCantidadRecibida(id_pedido, id_producto, Sucursal, cantidad);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Solicitado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NoPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Solicitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "CANTIDAD"
            }
        ));
        Solicitado.setColumnSelectionAllowed(true);
        Solicitado.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Solicitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SolicitadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Solicitado);

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pedido", "Fecha"
            }
        ));
        TablePedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePedidosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablePedidos);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("No. PEDIDO");

        jLabel2.setText("FECHA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NoPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(TxtFecha))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablePedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePedidosMouseClicked
      try {
          NoPedido.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 0))));
          TxtFecha.setText((String.valueOf(TablePedidos.getModel().getValueAt(TablePedidos.getSelectedRow(), 1))));
          ListarProductosRecibidos();
      } catch (Exception ex) {
          Logger.getLogger(AceptarPedidoApi.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_TablePedidosMouseClicked

    private void SolicitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolicitadoMouseClicked
       bloqueo=1;
    }//GEN-LAST:event_SolicitadoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AceptarPedidoApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AceptarPedidoApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AceptarPedidoApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AceptarPedidoApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AceptarPedidoApi().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(AceptarPedidoApi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoPedido;
    private javax.swing.JTable Solicitado;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
