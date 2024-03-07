package SubPaneles;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.EtiquetasClass;
import ClassAngels.InsertarProducto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
/**
 *
 * @author jluis
 */
public class CaldosAntojos extends javax.swing.JPanel {
 String descripcion1;	String descripcion2_1;	 String Precio1;  int codigo1;
 String descripcion2;	String descripcion2_2;	 String Precio2;  int codigo2;
 String descripcion3;	String descripcion2_3;	 String Precio3;  int codigo3;
 String descripcion4;	String descripcion2_4;	 String Precio4;  int codigo4;
 String descripcion5;	String descripcion2_5;	 String Precio5;  int codigo5;
 String descripcion6;	String descripcion2_6;	 String Precio6;  int codigo6;
 String descripcion7;	String descripcion2_7;	 String Precio7;  int codigo7;
 String descripcion8;	String descripcion2_8;	 String Precio8;  int codigo8;
 String descripcion9;	String descripcion2_9;	 String Precio9;  int codigo9;
 String descripcion10;	String descripcion2_10;	 String Precio10; int codigo10;
 String descripcion11;	String descripcion2_11;	 String Precio11; int codigo11;
 String descripcion12;	String descripcion2_12;	 String Precio12; int codigo12;
 String descripcion13;	String descripcion2_13;	 String Precio13; int codigo13;
 String descripcion14;	String descripcion2_14;	 String Precio14; int codigo14;
 String descripcion15;	String descripcion2_15;	 String Precio15; int codigo15;
 String descripcion16;	String descripcion2_16;	 String Precio16; int codigo16;
 
 int noorden;
 int codigooreden;
 int existe = 0;
    /**
     * Creates new form CaldosAntojos
     */
    public CaldosAntojos(int a) {
        initComponents();
        nombres();
        Etiquetas();
        this.noorden = a;
    }
    
    
    
    private void InsertarProductoPedido() {
       
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setNoOrden(noorden);
            p1.setId_producto(codigooreden);
            BDOrdenes.InsertarProducto_Pedido(p1);
            //id_producto_pedido = p1.getIdregreso();
            //JOptionPane.showMessageDialog(null, "Producto Agregado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= "+e);
        }
        // INICIO.ListarProductosPedidos();
         existe = 0;
    }
    
    
    
    
    
    
    Timer timer = new Timer(300, new ActionListener()
    {
    public void actionPerformed(ActionEvent e)
    { 
       
       Color Original = new Color(204,255,102);
       P1.setBackground(Original);
       P2.setBackground(Original);
       P3.setBackground(Original);
       P4.setBackground(Original);
       P5.setBackground(Original);
       /*P6.setBackground(Original);
       P7.setBackground(Original);
       P8.setBackground(Original);
       P9.setBackground(Original);
       P10.setBackground(Original);
       P11.setBackground(Original);
       P12.setBackground(Original);
       P13.setBackground(Original);
       P14.setBackground(Original);
       P15.setBackground(Original);
       P16.setBackground(Original);
       P17.setBackground(Original);
       P18.setBackground(Original);*/
     }
    });
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
     private void UpdateCantidad() {
        try {
                 BDConexion conecta = new BDConexion();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" AND CODIGO = "+codigooreden);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
        //INICIO.ListarProductosPedidos();
        existe = 0;
    }
     
     public  void BuscarExistencia() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+noorden+" AND CODIGO ="+codigooreden );
                while (rs.next()) {
                    existe = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            
        }
     
     private void UpdateCantidadMenos() {
        try {
                 BDConexion conecta = new BDConexion();
                 Connection con = conecta.getConexion();
                 PreparedStatement smtp = null;
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" AND CODIGO = "+codigooreden);
                 smtp.executeUpdate();
                 con.close();
                 smtp.close();
               // JOptionPane.showMessageDialog(null, "Guardado...");
            } catch (SQLException ex) {
                JOptionPane.showConfirmDialog(null, ex);
            }
        
        //INICIO.ListarProductosPedidos();
        existe = 0;
    }
     
    private void eliminarProducto(){
        try {
            BDConexion conecta = new BDConexion();
            Connection con = conecta.getConexion();
            PreparedStatement ps = null;
            ps= con.prepareStatement("delete from Ventas where noorden="+noorden+" and codigo = "+codigooreden);
            ps.executeUpdate();
            con.close();
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"ERROr = "+ex);
        }
        //INICIO.ListarProductosPedidos();
        existe = 0;
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
        P1 = new ClassAngels.PanelRound();
        Caldos1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        Caldos2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        Caldos3 = new javax.swing.JLabel();
        P4 = new ClassAngels.PanelRound();
        Caldos4 = new javax.swing.JLabel();
        P5 = new ClassAngels.PanelRound();
        Caldos5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelRound6 = new ClassAngels.PanelRound();
        PAL1 = new javax.swing.JLabel();
        panelRound7 = new ClassAngels.PanelRound();
        PAL6 = new javax.swing.JLabel();
        panelRound8 = new ClassAngels.PanelRound();
        PAL8 = new javax.swing.JLabel();
        panelRound9 = new ClassAngels.PanelRound();
        PAL2 = new javax.swing.JLabel();
        panelRound10 = new ClassAngels.PanelRound();
        PAL3 = new javax.swing.JLabel();
        panelRound11 = new ClassAngels.PanelRound();
        PAL4 = new javax.swing.JLabel();
        panelRound12 = new ClassAngels.PanelRound();
        PAL9 = new javax.swing.JLabel();
        panelRound13 = new ClassAngels.PanelRound();
        PAL10 = new javax.swing.JLabel();
        panelRound14 = new ClassAngels.PanelRound();
        PAL5 = new javax.swing.JLabel();
        panelRound15 = new ClassAngels.PanelRound();
        PAL7 = new javax.swing.JLabel();
        panelRound16 = new ClassAngels.PanelRound();
        panelRound17 = new ClassAngels.PanelRound();
        panelRound18 = new ClassAngels.PanelRound();
        panelRound19 = new ClassAngels.PanelRound();
        panelRound20 = new ClassAngels.PanelRound();
        PAL11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setPreferredSize(new java.awt.Dimension(1025, 380));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CALDOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setPreferredSize(new java.awt.Dimension(100, 75));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        Caldos1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Caldos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caldos1.setText("caldo mariscos");
        Caldos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caldos1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 102));
        P2.setPreferredSize(new java.awt.Dimension(100, 75));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        Caldos2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Caldos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caldos2.setText("caldo de pescado");
        Caldos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caldos2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 102));
        P3.setPreferredSize(new java.awt.Dimension(100, 75));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        Caldos3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Caldos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caldos3.setText("caldo de camaron");
        Caldos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caldos3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 102));
        P4.setPreferredSize(new java.awt.Dimension(100, 75));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        Caldos4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Caldos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caldos4.setText("sopa korena");
        Caldos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caldos4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 102));
        P5.setPreferredSize(new java.awt.Dimension(100, 75));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        Caldos5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Caldos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Caldos5.setText("sopa de pollo ");
        Caldos5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caldos5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Caldos5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PAL ANTOJO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        panelRound6.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound6.setRoundBottomLeft(20);
        panelRound6.setRoundBottomRight(20);
        panelRound6.setRoundTopLeft(20);
        panelRound6.setRoundTopRight(20);

        PAL1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL1.setText("jLabel1");

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound7.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound7.setRoundBottomLeft(20);
        panelRound7.setRoundBottomRight(20);
        panelRound7.setRoundTopLeft(20);
        panelRound7.setRoundTopRight(20);

        PAL6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL6.setText("jLabel6");

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL6, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound8.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);

        PAL8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL8.setText("jLabel8");

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL8, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL8, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound9.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound9.setRoundBottomLeft(20);
        panelRound9.setRoundBottomRight(20);
        panelRound9.setRoundTopLeft(20);
        panelRound9.setRoundTopRight(20);

        PAL2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL2.setText("jLabel2");

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound10.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(20);
        panelRound10.setRoundTopRight(20);

        PAL3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL3.setText("jLabel3");

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound11.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound11.setRoundBottomLeft(20);
        panelRound11.setRoundBottomRight(20);
        panelRound11.setRoundTopLeft(20);
        panelRound11.setRoundTopRight(20);

        PAL4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL4.setText("jLabel4");

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound12.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound12.setRoundBottomLeft(20);
        panelRound12.setRoundBottomRight(20);
        panelRound12.setRoundTopLeft(20);
        panelRound12.setRoundTopRight(20);

        PAL9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL9.setText("jLabel9");

        javax.swing.GroupLayout panelRound12Layout = new javax.swing.GroupLayout(panelRound12);
        panelRound12.setLayout(panelRound12Layout);
        panelRound12Layout.setHorizontalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL9, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound12Layout.setVerticalGroup(
            panelRound12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL9, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound13.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound13.setRoundBottomLeft(20);
        panelRound13.setRoundBottomRight(20);
        panelRound13.setRoundTopLeft(20);
        panelRound13.setRoundTopRight(20);

        PAL10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL10.setText("jLabel10");

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL10, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound14.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound14.setRoundBottomLeft(20);
        panelRound14.setRoundBottomRight(20);
        panelRound14.setRoundTopLeft(20);
        panelRound14.setRoundTopRight(20);

        PAL5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL5.setText("jLabel5");

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound15.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound15.setRoundBottomLeft(20);
        panelRound15.setRoundBottomRight(20);
        panelRound15.setRoundTopLeft(20);
        panelRound15.setRoundTopRight(20);

        PAL7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL7.setText("jLabel7");

        javax.swing.GroupLayout panelRound15Layout = new javax.swing.GroupLayout(panelRound15);
        panelRound15.setLayout(panelRound15Layout);
        panelRound15Layout.setHorizontalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound15Layout.setVerticalGroup(
            panelRound15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL7, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        panelRound16.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound16.setRoundBottomLeft(20);
        panelRound16.setRoundBottomRight(20);
        panelRound16.setRoundTopLeft(20);
        panelRound16.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound16Layout = new javax.swing.GroupLayout(panelRound16);
        panelRound16.setLayout(panelRound16Layout);
        panelRound16Layout.setHorizontalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound16Layout.setVerticalGroup(
            panelRound16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        panelRound17.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound17.setRoundBottomLeft(20);
        panelRound17.setRoundBottomRight(20);
        panelRound17.setRoundTopLeft(20);
        panelRound17.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound17Layout = new javax.swing.GroupLayout(panelRound17);
        panelRound17.setLayout(panelRound17Layout);
        panelRound17Layout.setHorizontalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound17Layout.setVerticalGroup(
            panelRound17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        panelRound18.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound18.setRoundBottomLeft(20);
        panelRound18.setRoundBottomRight(20);
        panelRound18.setRoundTopLeft(20);
        panelRound18.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound18Layout = new javax.swing.GroupLayout(panelRound18);
        panelRound18.setLayout(panelRound18Layout);
        panelRound18Layout.setHorizontalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound18Layout.setVerticalGroup(
            panelRound18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        panelRound19.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound19.setRoundBottomLeft(20);
        panelRound19.setRoundBottomRight(20);
        panelRound19.setRoundTopLeft(20);
        panelRound19.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound19Layout = new javax.swing.GroupLayout(panelRound19);
        panelRound19.setLayout(panelRound19Layout);
        panelRound19Layout.setHorizontalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound19Layout.setVerticalGroup(
            panelRound19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        panelRound20.setPreferredSize(new java.awt.Dimension(100, 75));
        panelRound20.setRoundBottomLeft(20);
        panelRound20.setRoundBottomRight(20);
        panelRound20.setRoundTopLeft(20);
        panelRound20.setRoundTopRight(20);

        PAL11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PAL11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PAL11.setText("jLabel11");

        javax.swing.GroupLayout panelRound20Layout = new javax.swing.GroupLayout(panelRound20);
        panelRound20.setLayout(panelRound20Layout);
        panelRound20Layout.setHorizontalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelRound20Layout.setVerticalGroup(
            panelRound20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PAL11, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelRound20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRound17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(panelRound15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(panelRound17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRound16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(panelRound14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRound18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelRound12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelRound19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Caldos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caldos1MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo1;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo1;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();JOptionPane.showMessageDialog(null, "insertado "+codigooreden);}else{UpdateCantidad();}
            P1.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_Caldos1MouseClicked

    private void Caldos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caldos2MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo2;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo2;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();JOptionPane.showMessageDialog(null, "insertado "+codigooreden);}else{UpdateCantidad();}
            P2.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_Caldos2MouseClicked

    private void Caldos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caldos3MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo3;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo3;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();JOptionPane.showMessageDialog(null, "insertado "+codigooreden);}else{UpdateCantidad();}
            P3.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_Caldos3MouseClicked

    private void Caldos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caldos4MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo4;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo4;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();JOptionPane.showMessageDialog(null, "insertado "+codigooreden);}else{UpdateCantidad();}
            P4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_Caldos4MouseClicked

    private void Caldos5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caldos5MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo5;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo5;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();JOptionPane.showMessageDialog(null, "insertado "+codigooreden);}else{UpdateCantidad();}
            P4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_Caldos5MouseClicked
  private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasCaldos();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (1 == codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (2 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (3 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (4== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            }
             else if (5== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (6== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (7== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (8== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (9== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (10== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
             else if (11== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }
             else if (12== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (13== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (14== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (15== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
             else if (16== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
        }
  }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Caldos1;
    private javax.swing.JLabel Caldos2;
    private javax.swing.JLabel Caldos3;
    private javax.swing.JLabel Caldos4;
    private javax.swing.JLabel Caldos5;
    private ClassAngels.PanelRound P1;
    private ClassAngels.PanelRound P2;
    private ClassAngels.PanelRound P3;
    private ClassAngels.PanelRound P4;
    private ClassAngels.PanelRound P5;
    private javax.swing.JLabel PAL1;
    private javax.swing.JLabel PAL10;
    private javax.swing.JLabel PAL11;
    private javax.swing.JLabel PAL2;
    private javax.swing.JLabel PAL3;
    private javax.swing.JLabel PAL4;
    private javax.swing.JLabel PAL5;
    private javax.swing.JLabel PAL6;
    private javax.swing.JLabel PAL7;
    private javax.swing.JLabel PAL8;
    private javax.swing.JLabel PAL9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private ClassAngels.PanelRound panelRound10;
    private ClassAngels.PanelRound panelRound11;
    private ClassAngels.PanelRound panelRound12;
    private ClassAngels.PanelRound panelRound13;
    private ClassAngels.PanelRound panelRound14;
    private ClassAngels.PanelRound panelRound15;
    private ClassAngels.PanelRound panelRound16;
    private ClassAngels.PanelRound panelRound17;
    private ClassAngels.PanelRound panelRound18;
    private ClassAngels.PanelRound panelRound19;
    private ClassAngels.PanelRound panelRound20;
    private ClassAngels.PanelRound panelRound6;
    private ClassAngels.PanelRound panelRound7;
    private ClassAngels.PanelRound panelRound8;
    private ClassAngels.PanelRound panelRound9;
    // End of variables declaration//GEN-END:variables

    private void Etiquetas() {

        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        Caldos1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        Caldos2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        Caldos3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        Caldos4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        Caldos5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        PAL1.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        PAL2.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        PAL3.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        PAL4.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        PAL5.setText(texto10);
        String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        PAL6.setText(texto11);
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        PAL7.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        PAL8.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        PAL9.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        PAL10.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        PAL11.setText(texto16);
        
    }

}
