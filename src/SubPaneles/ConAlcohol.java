/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SubPaneles;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.EtiquetasClass;
import ClassAngels.InsertarProducto;
import Inicio.Menu;
import Inicio.MenuSeguimiento;
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

/**
 *
 * @author jluis
 */
public class ConAlcohol extends javax.swing.JPanel {
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
 String descripcion17;	String descripcion2_17;	 String Precio17; int codigo17;
 int noorden;
 int codigooreden;
 int existe = 0;
 int tipomenu = 0;
// String descripcion18;	String descripcion2_18;	 String Precio18; int codigo18;
// String descripcion19;	String descripcion2_19;	 String Precio19; int codigo19;
// String descripcion20;	String descripcion2_20;	 String Precio20; int codigo20;
    /**
     * Creates new form ConAlcohol
     */
    public ConAlcohol(int a,int b) {
        initComponents();
        nombres();
        Etiquetas();
        this.noorden = a;
        this.tipomenu = b;
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
       P6.setBackground(Original);
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
       P18.setBackground(Original);
       P19.setBackground(Original);
       P20.setBackground(Original);
       
      
     }
    });
    
    private void InsertarProductoPedido() {
       
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setNoOrden(noorden);
            p1.setId_producto(codigooreden);
            BDOrdenes.InsertarProducto_Pedido(p1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "QUE MIERDA PASA= "+e);
        }
     switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
             break;
         default:
             break;
     }
         existe = 0;
    }
    
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
        
         switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
             break;
         default:
             break;
     }
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
        
        switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
             break;
         default:
             break;
     }
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
        Menu.ListarProductosPedidos();
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
        CER1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        CER2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        CER3 = new javax.swing.JLabel();
        P4 = new ClassAngels.PanelRound();
        CER4 = new javax.swing.JLabel();
        P5 = new ClassAngels.PanelRound();
        CER5 = new javax.swing.JLabel();
        P6 = new ClassAngels.PanelRound();
        CER6 = new javax.swing.JLabel();
        P7 = new ClassAngels.PanelRound();
        CER7 = new javax.swing.JLabel();
        P8 = new ClassAngels.PanelRound();
        CER8 = new javax.swing.JLabel();
        P9 = new ClassAngels.PanelRound();
        CER9 = new javax.swing.JLabel();
        P10 = new ClassAngels.PanelRound();
        CER10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        P11 = new ClassAngels.PanelRound();
        DRIN1 = new javax.swing.JLabel();
        P12 = new ClassAngels.PanelRound();
        DRIN2 = new javax.swing.JLabel();
        P13 = new ClassAngels.PanelRound();
        DRIN3 = new javax.swing.JLabel();
        P14 = new ClassAngels.PanelRound();
        DRIN4 = new javax.swing.JLabel();
        P15 = new ClassAngels.PanelRound();
        DRIN5 = new javax.swing.JLabel();
        P16 = new ClassAngels.PanelRound();
        DRIN6 = new javax.swing.JLabel();
        P17 = new ClassAngels.PanelRound();
        DRIN7 = new javax.swing.JLabel();
        P18 = new ClassAngels.PanelRound();
        DRIN8 = new javax.swing.JLabel();
        P19 = new ClassAngels.PanelRound();
        DRIN9 = new javax.swing.JLabel();
        P20 = new ClassAngels.PanelRound();
        DRIN10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CERVEZAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setPreferredSize(new java.awt.Dimension(100, 65));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        CER1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER1.setText("jLabel1");
        CER1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 102));
        P2.setPreferredSize(new java.awt.Dimension(100, 65));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        CER2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER2.setText("jLabel2");
        CER2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 102));
        P3.setPreferredSize(new java.awt.Dimension(100, 65));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        CER3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER3.setText("jLabel3");
        CER3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 102));
        P4.setPreferredSize(new java.awt.Dimension(100, 65));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        CER4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER4.setText("jLabel4");
        CER4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 102));
        P5.setPreferredSize(new java.awt.Dimension(100, 65));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        CER5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER5.setText("jLabel5");
        CER5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(204, 255, 102));
        P6.setPreferredSize(new java.awt.Dimension(100, 65));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        CER6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER6.setText("jLabel6");
        CER6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P7.setBackground(new java.awt.Color(204, 255, 102));
        P7.setPreferredSize(new java.awt.Dimension(100, 65));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        CER7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER7.setText("jLabel7");
        CER7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P8.setBackground(new java.awt.Color(204, 255, 102));
        P8.setPreferredSize(new java.awt.Dimension(100, 65));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        CER8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER8.setText("jLabel8");
        CER8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(204, 255, 102));
        P9.setPreferredSize(new java.awt.Dimension(100, 65));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        CER9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER9.setText("jLabel9");
        CER9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(204, 255, 102));
        P10.setPreferredSize(new java.awt.Dimension(100, 65));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        CER10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CER10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CER10.setText("jLabel10");
        CER10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CER10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CER10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DRINKS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P11.setBackground(new java.awt.Color(204, 255, 102));
        P11.setPreferredSize(new java.awt.Dimension(100, 65));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        DRIN1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN1.setText("jLabel11");
        DRIN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P12.setBackground(new java.awt.Color(204, 255, 102));
        P12.setPreferredSize(new java.awt.Dimension(100, 65));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        DRIN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN2.setText("jLabel12");
        DRIN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 255, 102));
        P13.setPreferredSize(new java.awt.Dimension(100, 65));
        P13.setRoundBottomLeft(20);
        P13.setRoundBottomRight(20);
        P13.setRoundTopLeft(20);
        P13.setRoundTopRight(20);

        DRIN3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN3.setText("jLabel13");
        DRIN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 255, 102));
        P14.setPreferredSize(new java.awt.Dimension(100, 65));
        P14.setRoundBottomLeft(20);
        P14.setRoundBottomRight(20);
        P14.setRoundTopLeft(20);
        P14.setRoundTopRight(20);

        DRIN4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN4.setText("jLabel14");
        DRIN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P15.setBackground(new java.awt.Color(204, 255, 102));
        P15.setPreferredSize(new java.awt.Dimension(100, 65));
        P15.setRoundBottomLeft(20);
        P15.setRoundBottomRight(20);
        P15.setRoundTopLeft(20);
        P15.setRoundTopRight(20);

        DRIN5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN5.setText("jLabel15");
        DRIN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P16.setBackground(new java.awt.Color(204, 255, 102));
        P16.setPreferredSize(new java.awt.Dimension(100, 65));
        P16.setRoundBottomLeft(20);
        P16.setRoundBottomRight(20);
        P16.setRoundTopLeft(20);
        P16.setRoundTopRight(20);

        DRIN6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN6.setText("jLabel16");
        DRIN6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P17.setBackground(new java.awt.Color(204, 255, 102));
        P17.setPreferredSize(new java.awt.Dimension(100, 65));
        P17.setRoundBottomLeft(20);
        P17.setRoundBottomRight(20);
        P17.setRoundTopLeft(20);
        P17.setRoundTopRight(20);

        DRIN7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DRIN7.setText("jLabel17");
        DRIN7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DRIN7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P18.setBackground(new java.awt.Color(204, 255, 102));
        P18.setPreferredSize(new java.awt.Dimension(100, 65));
        P18.setRoundBottomLeft(20);
        P18.setRoundBottomRight(20);
        P18.setRoundTopLeft(20);
        P18.setRoundTopRight(20);

        DRIN8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P19.setBackground(new java.awt.Color(204, 255, 102));
        P19.setPreferredSize(new java.awt.Dimension(100, 65));
        P19.setRoundBottomLeft(20);
        P19.setRoundBottomRight(20);
        P19.setRoundTopLeft(20);
        P19.setRoundTopRight(20);

        DRIN9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        P20.setBackground(new java.awt.Color(204, 255, 102));
        P20.setPreferredSize(new java.awt.Dimension(100, 65));
        P20.setRoundBottomLeft(20);
        P20.setRoundBottomRight(20);
        P20.setRoundTopLeft(20);
        P20.setRoundTopRight(20);

        DRIN10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DRIN10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DRIN10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CER1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER1MouseClicked
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
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P1.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER1MouseClicked

    private void CER2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER2MouseClicked
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
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P2.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER2MouseClicked

    private void CER3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER3MouseClicked
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
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P3.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER3MouseClicked

    private void CER4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER4MouseClicked
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
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER4MouseClicked

    private void CER5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER5MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo5;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo5;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P5.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER5MouseClicked

    private void CER6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER6MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo6;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo6;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P6.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER6MouseClicked

    private void CER7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo7;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo7;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P7.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER7MouseClicked

    private void CER8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER8MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo8;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo8;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P8.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER8MouseClicked

    private void CER9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER9MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo9;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo9;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P9.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER9MouseClicked

    private void CER10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CER10MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo10;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo10;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P10.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_CER10MouseClicked

    private void DRIN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN1MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo11;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo11;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P11.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN1MouseClicked

    private void DRIN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN2MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo12;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo12;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P12.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN2MouseClicked

    private void DRIN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN3MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo13;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo13;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P13.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN3MouseClicked

    private void DRIN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN4MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo14;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo14;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P14.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN4MouseClicked

    private void DRIN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN5MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo15;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo15;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P15.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN5MouseClicked

    private void DRIN6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN6MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo16;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo16;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P16.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN6MouseClicked

    private void DRIN7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DRIN7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo17;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo17;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P17.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_DRIN7MouseClicked
private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasBebidasAlcohol();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (75 == codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (76 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (77 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (78== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            }
             else if (79== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (80== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (81== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (82== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (83== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (84== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
             else if (85== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }
             else if (86== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (87== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (88== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (89== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
             else if (90== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
            else if (91== codigo){
             descripcion17 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_17 = result.get(i).getDescripcion2().toUpperCase(); Precio17 = result.get(i).getPrecio();codigo17 = result.get(i).getCodigo();
            }
           /* else if (92== codigo){
             descripcion18 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_18 = result.get(i).getDescripcion2().toUpperCase(); Precio18 = result.get(i).getPrecio();codigo18 = result.get(i).getCodigo();
            }
            else if (93== codigo){
             descripcion19 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_19 = result.get(i).getDescripcion2().toUpperCase(); Precio19 = result.get(i).getPrecio();codigo19 = result.get(i).getCodigo();
            }
            else if (94== codigo){
             descripcion20 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_20 = result.get(i).getDescripcion2().toUpperCase(); Precio20 = result.get(i).getPrecio();codigo20 = result.get(i).getCodigo();
            }*/
        }
  }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CER1;
    private javax.swing.JLabel CER10;
    private javax.swing.JLabel CER2;
    private javax.swing.JLabel CER3;
    private javax.swing.JLabel CER4;
    private javax.swing.JLabel CER5;
    private javax.swing.JLabel CER6;
    private javax.swing.JLabel CER7;
    private javax.swing.JLabel CER8;
    private javax.swing.JLabel CER9;
    private javax.swing.JLabel DRIN1;
    private javax.swing.JLabel DRIN10;
    private javax.swing.JLabel DRIN2;
    private javax.swing.JLabel DRIN3;
    private javax.swing.JLabel DRIN4;
    private javax.swing.JLabel DRIN5;
    private javax.swing.JLabel DRIN6;
    private javax.swing.JLabel DRIN7;
    private javax.swing.JLabel DRIN8;
    private javax.swing.JLabel DRIN9;
    private ClassAngels.PanelRound P1;
    private ClassAngels.PanelRound P10;
    private ClassAngels.PanelRound P11;
    private ClassAngels.PanelRound P12;
    private ClassAngels.PanelRound P13;
    private ClassAngels.PanelRound P14;
    private ClassAngels.PanelRound P15;
    private ClassAngels.PanelRound P16;
    private ClassAngels.PanelRound P17;
    private ClassAngels.PanelRound P18;
    private ClassAngels.PanelRound P19;
    private ClassAngels.PanelRound P2;
    private ClassAngels.PanelRound P20;
    private ClassAngels.PanelRound P3;
    private ClassAngels.PanelRound P4;
    private ClassAngels.PanelRound P5;
    private ClassAngels.PanelRound P6;
    private ClassAngels.PanelRound P7;
    private ClassAngels.PanelRound P8;
    private ClassAngels.PanelRound P9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
private void Etiquetas() {

        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        CER1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        CER2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        CER3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        CER4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        CER5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        CER6.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        CER7.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        CER8.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        CER9.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        CER10.setText(texto10);
        String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        DRIN1.setText(texto11);
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        DRIN2.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        DRIN3.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        DRIN4.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        DRIN5.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        DRIN6.setText(texto16);
         String texto17 ="<html><center><body>"+descripcion17+"<br>"+descripcion2_17+"<br><font color='RED'>Q"+Precio17+"</font></body></center></html>";
        DRIN7.setText(texto17);
        /* String texto18 ="<html><center><body>"+descripcion18+"<br>"+descripcion2_18+"<br><font color='RED'>Q"+Precio18+"</font></body></center></html>";
        DRIN8.setText(texto18);
         String texto19 ="<html><center><body>"+descripcion19+"<br>"+descripcion2_19+"<br><font color='RED'>Q"+Precio19+"</font></body></center></html>";
        DRIN9.setText(texto19);
         String texto20 ="<html><center><body>"+descripcion20+"<br>"+descripcion2_20+"<br><font color='RED'>Q"+Precio20+"</font></body></center></html>";
        DRIN10.setText(texto20);*/
         
    }

}
