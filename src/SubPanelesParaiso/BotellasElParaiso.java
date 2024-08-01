/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SubPanelesParaiso;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.EtiquetasClass;
import ClassAngels.InsertarProducto;
import Inicio.Menu;
import Inicio.MenuParaLlevar;
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
public class BotellasElParaiso extends javax.swing.JPanel {
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
 String descripcion18;	String descripcion2_18;	 String Precio18; int codigo18;
 String descripcion19;	String descripcion2_19;	 String Precio19; int codigo19;
 String descripcion20;	String descripcion2_20;	 String Precio20; int codigo20;
 String descripcion21;	String descripcion2_21;	 String Precio21; int codigo21;
 String descripcion22;	String descripcion2_22;	 String Precio22; int codigo22;
 String descripcion23;	String descripcion2_23;	 String Precio23; int codigo23;
 String descripcion24;	String descripcion2_24;	 String Precio24; int codigo24;
 String descripcion25;	String descripcion2_25;	 String Precio25; int codigo25;
 String descripcion26;	String descripcion2_26;	 String Precio26; int codigo26;
 String descripcion27;	String descripcion2_27;	 String Precio27; int codigo27;
 String descripcion28;	String descripcion2_28;	 String Precio28; int codigo28;
 String descripcion29;	String descripcion2_29;	 String Precio29; int codigo29;
 String descripcion30;	String descripcion2_30;	 String Precio30; int codigo30;
 String descripcion31;	String descripcion2_31;	 String Precio31; int codigo31;
 String descripcion32;	String descripcion2_32;	 String Precio32; int codigo32;
 String descripcion33;	String descripcion2_33;	 String Precio33; int codigo33;
 String descripcion34;	String descripcion2_34;	 String Precio34; int codigo34;
 String descripcion35;	String descripcion2_35;	 String Precio35; int codigo35;
 String descripcion36;	String descripcion2_36;	 String Precio36; int codigo36;
 String descripcion37;	String descripcion2_37;	 String Precio37; int codigo37;
 String descripcion38;	String descripcion2_38;	 String Precio38; int codigo38;
 String descripcion39;	String descripcion2_39;	 String Precio39; int codigo39;
 String descripcion40;	String descripcion2_40;	 String Precio40; int codigo40;
 String descripcion41;	String descripcion2_41;	 String Precio41; int codigo41;
 String descripcion42;	String descripcion2_42;	 String Precio42; int codigo42;
 String descripcion43;	String descripcion2_43;	 String Precio43; int codigo43;
 int noorden;
 int codigooreden;
 int existe = 0;
 int tipomenu = 0;
    /**
     * Creates new form Botellas
     */
    public BotellasElParaiso(int a,int b) {
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
       P21.setBackground(Original);
       P22.setBackground(Original);
       P23.setBackground(Original);
       P24.setBackground(Original);
       P25.setBackground(Original);
       P26.setBackground(Original);
       P27.setBackground(Original);
       P28.setBackground(Original);
       P29.setBackground(Original);
       P30.setBackground(Original);
       P31.setBackground(Original);
       P32.setBackground(Original);
       P33.setBackground(Original);
       P34.setBackground(Original);
       P35.setBackground(Original);
       P36.setBackground(Original);
       P37.setBackground(Original);
       P38.setBackground(Original);
       P39.setBackground(Original);
       P40.setBackground(Original);
       P41.setBackground(Original);
       P42.setBackground(Original);
       P43.setBackground(Original);
      
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
             MenuParaLlevar.ListarProductosPedidos();
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
              MenuParaLlevar.ListarProductosPedidos();
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
              MenuParaLlevar.ListarProductosPedidos();
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
         switch (tipomenu) {
         case 0:
             Menu.ListarProductosPedidos();
             break;
         case 1:
             MenuSeguimiento.ListarProductosPedidos();
             break;
         case 2:
              MenuParaLlevar.ListarProductosPedidos();
             break;
         default:
             break;
     }
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
        BO1 = new javax.swing.JLabel();
        P2 = new ClassAngels.PanelRound();
        BO2 = new javax.swing.JLabel();
        P3 = new ClassAngels.PanelRound();
        BO3 = new javax.swing.JLabel();
        P4 = new ClassAngels.PanelRound();
        BO4 = new javax.swing.JLabel();
        P5 = new ClassAngels.PanelRound();
        BO5 = new javax.swing.JLabel();
        P6 = new ClassAngels.PanelRound();
        BO6 = new javax.swing.JLabel();
        P7 = new ClassAngels.PanelRound();
        BO7 = new javax.swing.JLabel();
        P8 = new ClassAngels.PanelRound();
        BO8 = new javax.swing.JLabel();
        P9 = new ClassAngels.PanelRound();
        BO9 = new javax.swing.JLabel();
        P10 = new ClassAngels.PanelRound();
        BO10 = new javax.swing.JLabel();
        P11 = new ClassAngels.PanelRound();
        BO11 = new javax.swing.JLabel();
        P12 = new ClassAngels.PanelRound();
        BO12 = new javax.swing.JLabel();
        P13 = new ClassAngels.PanelRound();
        BO13 = new javax.swing.JLabel();
        P14 = new ClassAngels.PanelRound();
        BO14 = new javax.swing.JLabel();
        P15 = new ClassAngels.PanelRound();
        BO15 = new javax.swing.JLabel();
        P16 = new ClassAngels.PanelRound();
        BO16 = new javax.swing.JLabel();
        P17 = new ClassAngels.PanelRound();
        BO17 = new javax.swing.JLabel();
        P18 = new ClassAngels.PanelRound();
        BO18 = new javax.swing.JLabel();
        P19 = new ClassAngels.PanelRound();
        BO19 = new javax.swing.JLabel();
        P20 = new ClassAngels.PanelRound();
        BO20 = new javax.swing.JLabel();
        P21 = new ClassAngels.PanelRound();
        BO21 = new javax.swing.JLabel();
        P22 = new ClassAngels.PanelRound();
        BO22 = new javax.swing.JLabel();
        P23 = new ClassAngels.PanelRound();
        BO23 = new javax.swing.JLabel();
        P24 = new ClassAngels.PanelRound();
        BO24 = new javax.swing.JLabel();
        P25 = new ClassAngels.PanelRound();
        BO25 = new javax.swing.JLabel();
        P26 = new ClassAngels.PanelRound();
        BO26 = new javax.swing.JLabel();
        P27 = new ClassAngels.PanelRound();
        BO27 = new javax.swing.JLabel();
        P28 = new ClassAngels.PanelRound();
        BO28 = new javax.swing.JLabel();
        P29 = new ClassAngels.PanelRound();
        BO29 = new javax.swing.JLabel();
        P30 = new ClassAngels.PanelRound();
        BO30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        P31 = new ClassAngels.PanelRound();
        BO31 = new javax.swing.JLabel();
        P32 = new ClassAngels.PanelRound();
        BO32 = new javax.swing.JLabel();
        P33 = new ClassAngels.PanelRound();
        BO33 = new javax.swing.JLabel();
        P34 = new ClassAngels.PanelRound();
        BO34 = new javax.swing.JLabel();
        P35 = new ClassAngels.PanelRound();
        BO35 = new javax.swing.JLabel();
        P36 = new ClassAngels.PanelRound();
        BO36 = new javax.swing.JLabel();
        P37 = new ClassAngels.PanelRound();
        BO37 = new javax.swing.JLabel();
        P38 = new ClassAngels.PanelRound();
        BO38 = new javax.swing.JLabel();
        P39 = new ClassAngels.PanelRound();
        BO39 = new javax.swing.JLabel();
        P40 = new ClassAngels.PanelRound();
        BO40 = new javax.swing.JLabel();
        P41 = new ClassAngels.PanelRound();
        BO41 = new javax.swing.JLabel();
        P42 = new ClassAngels.PanelRound();
        BO42 = new javax.swing.JLabel();
        P43 = new ClassAngels.PanelRound();
        BO43 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(1170, 380));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BOTELLAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P1.setBackground(new java.awt.Color(204, 255, 102));
        P1.setMinimumSize(new java.awt.Dimension(100, 75));
        P1.setPreferredSize(new java.awt.Dimension(100, 65));
        P1.setRoundBottomLeft(20);
        P1.setRoundBottomRight(20);
        P1.setRoundTopLeft(20);
        P1.setRoundTopRight(20);

        BO1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO1.setText("1");
        BO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P2.setBackground(new java.awt.Color(204, 255, 102));
        P2.setMinimumSize(new java.awt.Dimension(100, 75));
        P2.setPreferredSize(new java.awt.Dimension(100, 65));
        P2.setRoundBottomLeft(20);
        P2.setRoundBottomRight(20);
        P2.setRoundTopLeft(20);
        P2.setRoundTopRight(20);

        BO2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO2.setText("2");
        BO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(204, 255, 102));
        P3.setMinimumSize(new java.awt.Dimension(100, 75));
        P3.setPreferredSize(new java.awt.Dimension(100, 65));
        P3.setRoundBottomLeft(20);
        P3.setRoundBottomRight(20);
        P3.setRoundTopLeft(20);
        P3.setRoundTopRight(20);

        BO3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO3.setText("3");
        BO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(204, 255, 102));
        P4.setMinimumSize(new java.awt.Dimension(100, 75));
        P4.setPreferredSize(new java.awt.Dimension(100, 65));
        P4.setRoundBottomLeft(20);
        P4.setRoundBottomRight(20);
        P4.setRoundTopLeft(20);
        P4.setRoundTopRight(20);

        BO4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO4.setText("4");
        BO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(204, 255, 102));
        P5.setMinimumSize(new java.awt.Dimension(100, 75));
        P5.setPreferredSize(new java.awt.Dimension(100, 65));
        P5.setRoundBottomLeft(20);
        P5.setRoundBottomRight(20);
        P5.setRoundTopLeft(20);
        P5.setRoundTopRight(20);

        BO5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO5.setText("5");
        BO5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(204, 255, 102));
        P6.setMinimumSize(new java.awt.Dimension(100, 75));
        P6.setPreferredSize(new java.awt.Dimension(100, 65));
        P6.setRoundBottomLeft(20);
        P6.setRoundBottomRight(20);
        P6.setRoundTopLeft(20);
        P6.setRoundTopRight(20);

        BO6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO6.setText("6");
        BO6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P7.setBackground(new java.awt.Color(204, 255, 102));
        P7.setMinimumSize(new java.awt.Dimension(100, 75));
        P7.setPreferredSize(new java.awt.Dimension(100, 65));
        P7.setRoundBottomLeft(20);
        P7.setRoundBottomRight(20);
        P7.setRoundTopLeft(20);
        P7.setRoundTopRight(20);

        BO7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO7.setText("7");
        BO7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P8.setBackground(new java.awt.Color(204, 255, 102));
        P8.setMinimumSize(new java.awt.Dimension(100, 75));
        P8.setPreferredSize(new java.awt.Dimension(100, 65));
        P8.setRoundBottomLeft(20);
        P8.setRoundBottomRight(20);
        P8.setRoundTopLeft(20);
        P8.setRoundTopRight(20);

        BO8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO8.setText("8");
        BO8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P9.setBackground(new java.awt.Color(204, 255, 102));
        P9.setMinimumSize(new java.awt.Dimension(100, 75));
        P9.setPreferredSize(new java.awt.Dimension(100, 65));
        P9.setRoundBottomLeft(20);
        P9.setRoundBottomRight(20);
        P9.setRoundTopLeft(20);
        P9.setRoundTopRight(20);

        BO9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO9.setText("9");
        BO9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P10.setBackground(new java.awt.Color(204, 255, 102));
        P10.setMinimumSize(new java.awt.Dimension(100, 75));
        P10.setPreferredSize(new java.awt.Dimension(100, 65));
        P10.setRoundBottomLeft(20);
        P10.setRoundBottomRight(20);
        P10.setRoundTopLeft(20);
        P10.setRoundTopRight(20);

        BO10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO10.setText("10");
        BO10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P10Layout = new javax.swing.GroupLayout(P10);
        P10.setLayout(P10Layout);
        P10Layout.setHorizontalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P10Layout.setVerticalGroup(
            P10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P11.setBackground(new java.awt.Color(204, 255, 102));
        P11.setMinimumSize(new java.awt.Dimension(100, 75));
        P11.setPreferredSize(new java.awt.Dimension(100, 65));
        P11.setRoundBottomLeft(20);
        P11.setRoundBottomRight(20);
        P11.setRoundTopLeft(20);
        P11.setRoundTopRight(20);

        BO11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO11.setText("11");
        BO11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P11Layout = new javax.swing.GroupLayout(P11);
        P11.setLayout(P11Layout);
        P11Layout.setHorizontalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P11Layout.setVerticalGroup(
            P11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P12.setBackground(new java.awt.Color(204, 255, 102));
        P12.setMinimumSize(new java.awt.Dimension(100, 75));
        P12.setPreferredSize(new java.awt.Dimension(100, 65));
        P12.setRoundBottomLeft(20);
        P12.setRoundBottomRight(20);
        P12.setRoundTopLeft(20);
        P12.setRoundTopRight(20);

        BO12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO12.setText("12");
        BO12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P12Layout = new javax.swing.GroupLayout(P12);
        P12.setLayout(P12Layout);
        P12Layout.setHorizontalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P12Layout.setVerticalGroup(
            P12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P13.setBackground(new java.awt.Color(204, 255, 102));
        P13.setMinimumSize(new java.awt.Dimension(100, 75));
        P13.setPreferredSize(new java.awt.Dimension(100, 65));
        P13.setRoundBottomLeft(20);
        P13.setRoundBottomRight(20);
        P13.setRoundTopLeft(20);
        P13.setRoundTopRight(20);

        BO13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO13.setText("13");
        BO13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P13Layout = new javax.swing.GroupLayout(P13);
        P13.setLayout(P13Layout);
        P13Layout.setHorizontalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P13Layout.setVerticalGroup(
            P13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P14.setBackground(new java.awt.Color(204, 255, 102));
        P14.setMinimumSize(new java.awt.Dimension(100, 75));
        P14.setPreferredSize(new java.awt.Dimension(100, 65));
        P14.setRoundBottomLeft(20);
        P14.setRoundBottomRight(20);
        P14.setRoundTopLeft(20);
        P14.setRoundTopRight(20);

        BO14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO14.setText("14");
        BO14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P14Layout = new javax.swing.GroupLayout(P14);
        P14.setLayout(P14Layout);
        P14Layout.setHorizontalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P14Layout.setVerticalGroup(
            P14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P15.setBackground(new java.awt.Color(204, 255, 102));
        P15.setMinimumSize(new java.awt.Dimension(100, 75));
        P15.setPreferredSize(new java.awt.Dimension(100, 65));
        P15.setRoundBottomLeft(20);
        P15.setRoundBottomRight(20);
        P15.setRoundTopLeft(20);
        P15.setRoundTopRight(20);

        BO15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO15.setText("15");
        BO15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P15Layout = new javax.swing.GroupLayout(P15);
        P15.setLayout(P15Layout);
        P15Layout.setHorizontalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P15Layout.setVerticalGroup(
            P15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P16.setBackground(new java.awt.Color(204, 255, 102));
        P16.setMinimumSize(new java.awt.Dimension(100, 75));
        P16.setPreferredSize(new java.awt.Dimension(100, 65));
        P16.setRoundBottomLeft(20);
        P16.setRoundBottomRight(20);
        P16.setRoundTopLeft(20);
        P16.setRoundTopRight(20);

        BO16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO16.setText("16");
        BO16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P16Layout = new javax.swing.GroupLayout(P16);
        P16.setLayout(P16Layout);
        P16Layout.setHorizontalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P16Layout.setVerticalGroup(
            P16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P17.setBackground(new java.awt.Color(204, 255, 102));
        P17.setMinimumSize(new java.awt.Dimension(100, 75));
        P17.setPreferredSize(new java.awt.Dimension(100, 65));
        P17.setRoundBottomLeft(20);
        P17.setRoundBottomRight(20);
        P17.setRoundTopLeft(20);
        P17.setRoundTopRight(20);

        BO17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO17.setText("17");
        BO17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P17Layout = new javax.swing.GroupLayout(P17);
        P17.setLayout(P17Layout);
        P17Layout.setHorizontalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P17Layout.setVerticalGroup(
            P17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P18.setBackground(new java.awt.Color(204, 255, 102));
        P18.setMinimumSize(new java.awt.Dimension(100, 75));
        P18.setPreferredSize(new java.awt.Dimension(100, 65));
        P18.setRoundBottomLeft(20);
        P18.setRoundBottomRight(20);
        P18.setRoundTopLeft(20);
        P18.setRoundTopRight(20);

        BO18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO18.setText("18");
        BO18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P18Layout = new javax.swing.GroupLayout(P18);
        P18.setLayout(P18Layout);
        P18Layout.setHorizontalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P18Layout.setVerticalGroup(
            P18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P19.setBackground(new java.awt.Color(204, 255, 102));
        P19.setMinimumSize(new java.awt.Dimension(100, 75));
        P19.setPreferredSize(new java.awt.Dimension(100, 65));
        P19.setRoundBottomLeft(20);
        P19.setRoundBottomRight(20);
        P19.setRoundTopLeft(20);
        P19.setRoundTopRight(20);

        BO19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO19.setText("19");
        BO19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P19Layout = new javax.swing.GroupLayout(P19);
        P19.setLayout(P19Layout);
        P19Layout.setHorizontalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P19Layout.setVerticalGroup(
            P19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P20.setBackground(new java.awt.Color(204, 255, 102));
        P20.setMinimumSize(new java.awt.Dimension(100, 75));
        P20.setPreferredSize(new java.awt.Dimension(100, 65));
        P20.setRoundBottomLeft(20);
        P20.setRoundBottomRight(20);
        P20.setRoundTopLeft(20);
        P20.setRoundTopRight(20);

        BO20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO20.setText("20");
        BO20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P20Layout = new javax.swing.GroupLayout(P20);
        P20.setLayout(P20Layout);
        P20Layout.setHorizontalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P20Layout.setVerticalGroup(
            P20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P21.setBackground(new java.awt.Color(204, 255, 102));
        P21.setMinimumSize(new java.awt.Dimension(100, 75));
        P21.setPreferredSize(new java.awt.Dimension(100, 65));
        P21.setRoundBottomLeft(20);
        P21.setRoundBottomRight(20);
        P21.setRoundTopLeft(20);
        P21.setRoundTopRight(20);

        BO21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO21.setText("21");
        BO21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P21Layout = new javax.swing.GroupLayout(P21);
        P21.setLayout(P21Layout);
        P21Layout.setHorizontalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P21Layout.setVerticalGroup(
            P21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P22.setBackground(new java.awt.Color(204, 255, 102));
        P22.setMinimumSize(new java.awt.Dimension(100, 75));
        P22.setPreferredSize(new java.awt.Dimension(100, 65));
        P22.setRoundBottomLeft(20);
        P22.setRoundBottomRight(20);
        P22.setRoundTopLeft(20);
        P22.setRoundTopRight(20);

        BO22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO22.setText("22");
        BO22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P22Layout = new javax.swing.GroupLayout(P22);
        P22.setLayout(P22Layout);
        P22Layout.setHorizontalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P22Layout.setVerticalGroup(
            P22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P23.setBackground(new java.awt.Color(204, 255, 102));
        P23.setMinimumSize(new java.awt.Dimension(100, 75));
        P23.setPreferredSize(new java.awt.Dimension(100, 65));
        P23.setRoundBottomLeft(20);
        P23.setRoundBottomRight(20);
        P23.setRoundTopLeft(20);
        P23.setRoundTopRight(20);

        BO23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO23.setText("23");
        BO23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P23Layout = new javax.swing.GroupLayout(P23);
        P23.setLayout(P23Layout);
        P23Layout.setHorizontalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P23Layout.setVerticalGroup(
            P23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P24.setBackground(new java.awt.Color(204, 255, 102));
        P24.setMinimumSize(new java.awt.Dimension(100, 75));
        P24.setPreferredSize(new java.awt.Dimension(100, 65));
        P24.setRoundBottomLeft(20);
        P24.setRoundBottomRight(20);
        P24.setRoundTopLeft(20);
        P24.setRoundTopRight(20);

        BO24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO24.setText("24");
        BO24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P24Layout = new javax.swing.GroupLayout(P24);
        P24.setLayout(P24Layout);
        P24Layout.setHorizontalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P24Layout.setVerticalGroup(
            P24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P25.setBackground(new java.awt.Color(204, 255, 102));
        P25.setMinimumSize(new java.awt.Dimension(100, 75));
        P25.setPreferredSize(new java.awt.Dimension(100, 65));
        P25.setRoundBottomLeft(20);
        P25.setRoundBottomRight(20);
        P25.setRoundTopLeft(20);
        P25.setRoundTopRight(20);

        BO25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO25.setText("25");
        BO25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P25Layout = new javax.swing.GroupLayout(P25);
        P25.setLayout(P25Layout);
        P25Layout.setHorizontalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P25Layout.setVerticalGroup(
            P25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P26.setBackground(new java.awt.Color(204, 255, 102));
        P26.setMinimumSize(new java.awt.Dimension(100, 75));
        P26.setPreferredSize(new java.awt.Dimension(100, 65));
        P26.setRoundBottomLeft(20);
        P26.setRoundBottomRight(20);
        P26.setRoundTopLeft(20);
        P26.setRoundTopRight(20);

        BO26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO26.setText("26");
        BO26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P26Layout = new javax.swing.GroupLayout(P26);
        P26.setLayout(P26Layout);
        P26Layout.setHorizontalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P26Layout.setVerticalGroup(
            P26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P27.setBackground(new java.awt.Color(204, 255, 102));
        P27.setMinimumSize(new java.awt.Dimension(100, 75));
        P27.setPreferredSize(new java.awt.Dimension(100, 65));
        P27.setRoundBottomLeft(20);
        P27.setRoundBottomRight(20);
        P27.setRoundTopLeft(20);
        P27.setRoundTopRight(20);

        BO27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO27.setText("27");
        BO27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P27Layout = new javax.swing.GroupLayout(P27);
        P27.setLayout(P27Layout);
        P27Layout.setHorizontalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P27Layout.setVerticalGroup(
            P27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P28.setBackground(new java.awt.Color(204, 255, 102));
        P28.setMinimumSize(new java.awt.Dimension(100, 75));
        P28.setPreferredSize(new java.awt.Dimension(100, 65));
        P28.setRoundBottomLeft(20);
        P28.setRoundBottomRight(20);
        P28.setRoundTopLeft(20);
        P28.setRoundTopRight(20);

        BO28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO28.setText("28");
        BO28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P28Layout = new javax.swing.GroupLayout(P28);
        P28.setLayout(P28Layout);
        P28Layout.setHorizontalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P28Layout.setVerticalGroup(
            P28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P29.setBackground(new java.awt.Color(204, 255, 102));
        P29.setMinimumSize(new java.awt.Dimension(100, 75));
        P29.setPreferredSize(new java.awt.Dimension(100, 65));
        P29.setRoundBottomLeft(20);
        P29.setRoundBottomRight(20);
        P29.setRoundTopLeft(20);
        P29.setRoundTopRight(20);

        BO29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P29Layout = new javax.swing.GroupLayout(P29);
        P29.setLayout(P29Layout);
        P29Layout.setHorizontalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P29Layout.setVerticalGroup(
            P29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P30.setBackground(new java.awt.Color(204, 255, 102));
        P30.setMinimumSize(new java.awt.Dimension(100, 75));
        P30.setPreferredSize(new java.awt.Dimension(100, 65));
        P30.setRoundBottomLeft(20);
        P30.setRoundBottomRight(20);
        P30.setRoundTopLeft(20);
        P30.setRoundTopRight(20);

        BO30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BO30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P30Layout = new javax.swing.GroupLayout(P30);
        P30.setLayout(P30Layout);
        P30Layout.setHorizontalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        P30Layout.setVerticalGroup(
            P30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(P9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addGap(12, 12, 12)
                        .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(P15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(P16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(P17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SHOTS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        P31.setBackground(new java.awt.Color(204, 255, 102));
        P31.setMinimumSize(new java.awt.Dimension(100, 75));
        P31.setPreferredSize(new java.awt.Dimension(75, 70));
        P31.setRoundBottomLeft(20);
        P31.setRoundBottomRight(20);
        P31.setRoundTopLeft(20);
        P31.setRoundTopRight(20);

        BO31.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO31.setText("31");
        BO31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P31Layout = new javax.swing.GroupLayout(P31);
        P31.setLayout(P31Layout);
        P31Layout.setHorizontalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P31Layout.setVerticalGroup(
            P31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P32.setBackground(new java.awt.Color(204, 255, 102));
        P32.setMinimumSize(new java.awt.Dimension(100, 75));
        P32.setPreferredSize(new java.awt.Dimension(75, 70));
        P32.setRoundBottomLeft(20);
        P32.setRoundBottomRight(20);
        P32.setRoundTopLeft(20);
        P32.setRoundTopRight(20);

        BO32.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO32.setText("32");
        BO32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P32Layout = new javax.swing.GroupLayout(P32);
        P32.setLayout(P32Layout);
        P32Layout.setHorizontalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P32Layout.setVerticalGroup(
            P32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P33.setBackground(new java.awt.Color(204, 255, 102));
        P33.setMinimumSize(new java.awt.Dimension(100, 75));
        P33.setPreferredSize(new java.awt.Dimension(75, 70));
        P33.setRoundBottomLeft(20);
        P33.setRoundBottomRight(20);
        P33.setRoundTopLeft(20);
        P33.setRoundTopRight(20);

        BO33.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO33.setText("33");
        BO33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P33Layout = new javax.swing.GroupLayout(P33);
        P33.setLayout(P33Layout);
        P33Layout.setHorizontalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P33Layout.setVerticalGroup(
            P33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P34.setBackground(new java.awt.Color(204, 255, 102));
        P34.setMinimumSize(new java.awt.Dimension(100, 75));
        P34.setPreferredSize(new java.awt.Dimension(75, 70));
        P34.setRoundBottomLeft(20);
        P34.setRoundBottomRight(20);
        P34.setRoundTopLeft(20);
        P34.setRoundTopRight(20);

        BO34.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO34.setText("34");
        BO34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P34Layout = new javax.swing.GroupLayout(P34);
        P34.setLayout(P34Layout);
        P34Layout.setHorizontalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P34Layout.setVerticalGroup(
            P34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P35.setBackground(new java.awt.Color(204, 255, 102));
        P35.setMinimumSize(new java.awt.Dimension(100, 75));
        P35.setPreferredSize(new java.awt.Dimension(75, 70));
        P35.setRoundBottomLeft(20);
        P35.setRoundBottomRight(20);
        P35.setRoundTopLeft(20);
        P35.setRoundTopRight(20);

        BO35.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO35.setText("35");
        BO35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P35Layout = new javax.swing.GroupLayout(P35);
        P35.setLayout(P35Layout);
        P35Layout.setHorizontalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P35Layout.setVerticalGroup(
            P35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P36.setBackground(new java.awt.Color(204, 255, 102));
        P36.setMinimumSize(new java.awt.Dimension(100, 75));
        P36.setPreferredSize(new java.awt.Dimension(75, 70));
        P36.setRoundBottomLeft(20);
        P36.setRoundBottomRight(20);
        P36.setRoundTopLeft(20);
        P36.setRoundTopRight(20);

        BO36.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO36.setText("36");
        BO36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P36Layout = new javax.swing.GroupLayout(P36);
        P36.setLayout(P36Layout);
        P36Layout.setHorizontalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P36Layout.setVerticalGroup(
            P36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P37.setBackground(new java.awt.Color(204, 255, 102));
        P37.setMinimumSize(new java.awt.Dimension(100, 75));
        P37.setPreferredSize(new java.awt.Dimension(75, 70));
        P37.setRoundBottomLeft(20);
        P37.setRoundBottomRight(20);
        P37.setRoundTopLeft(20);
        P37.setRoundTopRight(20);

        BO37.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO37.setText("37");
        BO37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P37Layout = new javax.swing.GroupLayout(P37);
        P37.setLayout(P37Layout);
        P37Layout.setHorizontalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P37Layout.setVerticalGroup(
            P37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P38.setBackground(new java.awt.Color(204, 255, 102));
        P38.setMinimumSize(new java.awt.Dimension(100, 75));
        P38.setPreferredSize(new java.awt.Dimension(75, 70));
        P38.setRoundBottomLeft(20);
        P38.setRoundBottomRight(20);
        P38.setRoundTopLeft(20);
        P38.setRoundTopRight(20);

        BO38.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO38.setText("38");
        BO38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P38Layout = new javax.swing.GroupLayout(P38);
        P38.setLayout(P38Layout);
        P38Layout.setHorizontalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P38Layout.setVerticalGroup(
            P38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P39.setBackground(new java.awt.Color(204, 255, 102));
        P39.setMinimumSize(new java.awt.Dimension(100, 75));
        P39.setPreferredSize(new java.awt.Dimension(75, 70));
        P39.setRoundBottomLeft(20);
        P39.setRoundBottomRight(20);
        P39.setRoundTopLeft(20);
        P39.setRoundTopRight(20);

        BO39.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO39.setText("39");
        BO39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P39Layout = new javax.swing.GroupLayout(P39);
        P39.setLayout(P39Layout);
        P39Layout.setHorizontalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P39Layout.setVerticalGroup(
            P39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P40.setBackground(new java.awt.Color(204, 255, 102));
        P40.setMinimumSize(new java.awt.Dimension(100, 75));
        P40.setPreferredSize(new java.awt.Dimension(75, 70));
        P40.setRoundBottomLeft(20);
        P40.setRoundBottomRight(20);
        P40.setRoundTopLeft(20);
        P40.setRoundTopRight(20);

        BO40.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO40.setText("40");
        BO40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO40MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P40Layout = new javax.swing.GroupLayout(P40);
        P40.setLayout(P40Layout);
        P40Layout.setHorizontalGroup(
            P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P40Layout.setVerticalGroup(
            P40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P41.setBackground(new java.awt.Color(204, 255, 102));
        P41.setMinimumSize(new java.awt.Dimension(100, 75));
        P41.setPreferredSize(new java.awt.Dimension(75, 70));
        P41.setRoundBottomLeft(20);
        P41.setRoundBottomRight(20);
        P41.setRoundTopLeft(20);
        P41.setRoundTopRight(20);

        BO41.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO41.setText("41");
        BO41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P41Layout = new javax.swing.GroupLayout(P41);
        P41.setLayout(P41Layout);
        P41Layout.setHorizontalGroup(
            P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P41Layout.setVerticalGroup(
            P41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P42.setBackground(new java.awt.Color(204, 255, 102));
        P42.setMinimumSize(new java.awt.Dimension(100, 75));
        P42.setPreferredSize(new java.awt.Dimension(75, 70));
        P42.setRoundBottomLeft(20);
        P42.setRoundBottomRight(20);
        P42.setRoundTopLeft(20);
        P42.setRoundTopRight(20);

        BO42.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO42.setText("42");
        BO42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P42Layout = new javax.swing.GroupLayout(P42);
        P42.setLayout(P42Layout);
        P42Layout.setHorizontalGroup(
            P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P42Layout.setVerticalGroup(
            P42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P43.setBackground(new java.awt.Color(204, 255, 102));
        P43.setMinimumSize(new java.awt.Dimension(100, 75));
        P43.setPreferredSize(new java.awt.Dimension(75, 70));
        P43.setRoundBottomLeft(20);
        P43.setRoundBottomRight(20);
        P43.setRoundTopLeft(20);
        P43.setRoundTopRight(20);

        BO43.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        BO43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BO43.setText("43");
        BO43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BO43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout P43Layout = new javax.swing.GroupLayout(P43);
        P43.setLayout(P43Layout);
        P43Layout.setHorizontalGroup(
            P43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P43Layout.setVerticalGroup(
            P43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BO43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void BO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO1MouseClicked
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
    }//GEN-LAST:event_BO1MouseClicked

    private void BO2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO2MouseClicked
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
    }//GEN-LAST:event_BO2MouseClicked

    private void BO3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO3MouseClicked
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
    }//GEN-LAST:event_BO3MouseClicked

    private void BO4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO4MouseClicked
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
    }//GEN-LAST:event_BO4MouseClicked

    private void BO5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO5MouseClicked
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
    }//GEN-LAST:event_BO5MouseClicked

    private void BO6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO6MouseClicked
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
    }//GEN-LAST:event_BO6MouseClicked

    private void BO7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO7MouseClicked
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
    }//GEN-LAST:event_BO7MouseClicked

    private void BO8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO8MouseClicked
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
    }//GEN-LAST:event_BO8MouseClicked

    private void BO9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO9MouseClicked
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
    }//GEN-LAST:event_BO9MouseClicked

    private void BO10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO10MouseClicked
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
    }//GEN-LAST:event_BO10MouseClicked

    private void BO11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO11MouseClicked
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
    }//GEN-LAST:event_BO11MouseClicked

    private void BO12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO12MouseClicked
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
    }//GEN-LAST:event_BO12MouseClicked

    private void BO13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO13MouseClicked
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
    }//GEN-LAST:event_BO13MouseClicked

    private void BO14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO14MouseClicked
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
    }//GEN-LAST:event_BO14MouseClicked

    private void BO15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO15MouseClicked
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
    }//GEN-LAST:event_BO15MouseClicked

    private void BO16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO16MouseClicked
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
    }//GEN-LAST:event_BO16MouseClicked

    private void BO17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO17MouseClicked
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
    }//GEN-LAST:event_BO17MouseClicked

    private void BO18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO18MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo18;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo18;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P18.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO18MouseClicked

    private void BO19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO19MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo19;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo19;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P19.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO19MouseClicked

    private void BO20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO20MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo20;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P20.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo20;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P20.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO20MouseClicked

    private void BO21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO21MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo21;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo21;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P21.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO21MouseClicked

    private void BO22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO22MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo22;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo22;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P22.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO22MouseClicked

    private void BO23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO23MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo23;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo23;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P23.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO23MouseClicked

    private void BO24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO24MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo24;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo24;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P24.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO24MouseClicked

    private void BO25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO25MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo25;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P25.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo25;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P25.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO25MouseClicked

    private void BO26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO26MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo26;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P26.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo26;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P26.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO26MouseClicked

    private void BO27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO27MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo27;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P27.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo27;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P27.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO27MouseClicked

    private void BO28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO28MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo28;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P28.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo28;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P28.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO28MouseClicked

    private void BO29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO29MouseClicked
        // LIBRE
    }//GEN-LAST:event_BO29MouseClicked

    private void BO30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO30MouseClicked
        // LIBRE
    }//GEN-LAST:event_BO30MouseClicked

    private void BO31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO31MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo31;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P31.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo31;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P31.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO31MouseClicked

    private void BO32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO32MouseClicked
       if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo32;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P32.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo32;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P32.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO32MouseClicked

    private void BO33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO33MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo33;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P33.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo33;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P33.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO33MouseClicked

    private void BO34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO34MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo34;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P34.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo34;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P34.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO34MouseClicked

    private void BO35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO35MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo35;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P35.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo35;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P35.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO35MouseClicked

    private void BO36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO36MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo36;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P36.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo36;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P36.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO36MouseClicked

    private void BO37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO37MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo37;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P37.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo37;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P37.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO37MouseClicked

    private void BO38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO38MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo38;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P38.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo38;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P38.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO38MouseClicked

    private void BO39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO39MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo39;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P39.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo39;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P39.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO39MouseClicked

    private void BO40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO40MouseClicked
         if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo40;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P40.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo40;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P40.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO40MouseClicked

    private void BO41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO41MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo41;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P41.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo41;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P41.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO41MouseClicked

    private void BO42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO42MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo42;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P42.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo42;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P42.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO42MouseClicked

    private void BO43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BO43MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo43;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            P43.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo43;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            P43.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }
    }//GEN-LAST:event_BO43MouseClicked
private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasBotellas();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (95 == codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (96 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (97 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (98== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            }
             else if (99== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (100== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (101== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (102== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (103== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (104== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
             else if (105== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }
             else if (106== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (107== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (108== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (109== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
            else if (110== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
            else if (207== codigo){
             descripcion17 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_17 = result.get(i).getDescripcion2().toUpperCase(); Precio17 = result.get(i).getPrecio();codigo17 = result.get(i).getCodigo();
            }
            else if (208== codigo){
             descripcion18 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_18 = result.get(i).getDescripcion2().toUpperCase(); Precio18 = result.get(i).getPrecio();codigo18 = result.get(i).getCodigo();
            }
            else if (209== codigo){
             descripcion19 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_19 = result.get(i).getDescripcion2().toUpperCase(); Precio19 = result.get(i).getPrecio();codigo19 = result.get(i).getCodigo();
            }
            else if (210== codigo){
             descripcion20 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_20 = result.get(i).getDescripcion2().toUpperCase(); Precio20 = result.get(i).getPrecio();codigo20 = result.get(i).getCodigo();
            }
            else if (211== codigo){
             descripcion21 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_21 = result.get(i).getDescripcion2().toUpperCase(); Precio21 = result.get(i).getPrecio();codigo21 = result.get(i).getCodigo();
            }
            else if (212== codigo){
             descripcion22 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_22 = result.get(i).getDescripcion2().toUpperCase(); Precio22 = result.get(i).getPrecio();codigo22 = result.get(i).getCodigo();
            }
            else if (213== codigo){
             descripcion23 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_23 = result.get(i).getDescripcion2().toUpperCase(); Precio23 = result.get(i).getPrecio();codigo23 = result.get(i).getCodigo();
            }
            else if (214== codigo){
             descripcion24 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_24 = result.get(i).getDescripcion2().toUpperCase(); Precio24 = result.get(i).getPrecio();codigo24 = result.get(i).getCodigo();
            }
            else if (215== codigo){
             descripcion25 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_25 = result.get(i).getDescripcion2().toUpperCase(); Precio25 = result.get(i).getPrecio();codigo25 = result.get(i).getCodigo();
            }
            else if (216== codigo){
             descripcion26 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_26 = result.get(i).getDescripcion2().toUpperCase(); Precio26 = result.get(i).getPrecio();codigo26 = result.get(i).getCodigo();
            }
            else if (217== codigo){
             descripcion27 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_27 = result.get(i).getDescripcion2().toUpperCase(); Precio27 = result.get(i).getPrecio();codigo27 = result.get(i).getCodigo();
            }
            else if (218== codigo){
             descripcion28 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }
           /* else if (218== codigo){
             descripcion29 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }
            else if (218== codigo){
             descripcion30 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }*/
            else if (233== codigo){
             descripcion31 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_31 = result.get(i).getDescripcion2().toUpperCase(); Precio31 = result.get(i).getPrecio();codigo31 = result.get(i).getCodigo();
            }
            else if (234== codigo){
             descripcion32 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_32 = result.get(i).getDescripcion2().toUpperCase(); Precio32 = result.get(i).getPrecio();codigo32 = result.get(i).getCodigo();
            }
            else if (85== codigo){
             descripcion33 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_33 = result.get(i).getDescripcion2().toUpperCase(); Precio33 = result.get(i).getPrecio();codigo33 = result.get(i).getCodigo();
            }
            else if (86== codigo){
             descripcion34 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_34 = result.get(i).getDescripcion2().toUpperCase(); Precio34 = result.get(i).getPrecio();codigo34 = result.get(i).getCodigo();
            }
            else if (194== codigo){
             descripcion35 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_35 = result.get(i).getDescripcion2().toUpperCase(); Precio35 = result.get(i).getPrecio();codigo35 = result.get(i).getCodigo();
            }
            else if (195== codigo){
             descripcion36 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_36 = result.get(i).getDescripcion2().toUpperCase(); Precio36 = result.get(i).getPrecio();codigo36 = result.get(i).getCodigo();
            }
            else if (224== codigo){
             descripcion37 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_37 = result.get(i).getDescripcion2().toUpperCase(); Precio37 = result.get(i).getPrecio();codigo37 = result.get(i).getCodigo();
            }
            else if (225== codigo){
             descripcion38 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_38 = result.get(i).getDescripcion2().toUpperCase(); Precio38 = result.get(i).getPrecio();codigo38 = result.get(i).getCodigo();
            }
            else if (226== codigo){
             descripcion39 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_39 = result.get(i).getDescripcion2().toUpperCase(); Precio39 = result.get(i).getPrecio();codigo39 = result.get(i).getCodigo();
            }
            else if (227== codigo){
             descripcion40 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_40 = result.get(i).getDescripcion2().toUpperCase(); Precio40 = result.get(i).getPrecio();codigo40 = result.get(i).getCodigo();
            }
            else if (228== codigo){
             descripcion41 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_41 = result.get(i).getDescripcion2().toUpperCase(); Precio41 = result.get(i).getPrecio();codigo41 = result.get(i).getCodigo();
            }
            else if (229== codigo){
             descripcion42 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_42 = result.get(i).getDescripcion2().toUpperCase(); Precio42 = result.get(i).getPrecio();codigo42 = result.get(i).getCodigo();
            }
            else if (230== codigo){
             descripcion43 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_43 = result.get(i).getDescripcion2().toUpperCase(); Precio43 = result.get(i).getPrecio();codigo43 = result.get(i).getCodigo();
            }
        }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BO1;
    private javax.swing.JLabel BO10;
    private javax.swing.JLabel BO11;
    private javax.swing.JLabel BO12;
    private javax.swing.JLabel BO13;
    private javax.swing.JLabel BO14;
    private javax.swing.JLabel BO15;
    private javax.swing.JLabel BO16;
    private javax.swing.JLabel BO17;
    private javax.swing.JLabel BO18;
    private javax.swing.JLabel BO19;
    private javax.swing.JLabel BO2;
    private javax.swing.JLabel BO20;
    private javax.swing.JLabel BO21;
    private javax.swing.JLabel BO22;
    private javax.swing.JLabel BO23;
    private javax.swing.JLabel BO24;
    private javax.swing.JLabel BO25;
    private javax.swing.JLabel BO26;
    private javax.swing.JLabel BO27;
    private javax.swing.JLabel BO28;
    private javax.swing.JLabel BO29;
    private javax.swing.JLabel BO3;
    private javax.swing.JLabel BO30;
    private javax.swing.JLabel BO31;
    private javax.swing.JLabel BO32;
    private javax.swing.JLabel BO33;
    private javax.swing.JLabel BO34;
    private javax.swing.JLabel BO35;
    private javax.swing.JLabel BO36;
    private javax.swing.JLabel BO37;
    private javax.swing.JLabel BO38;
    private javax.swing.JLabel BO39;
    private javax.swing.JLabel BO4;
    private javax.swing.JLabel BO40;
    private javax.swing.JLabel BO41;
    private javax.swing.JLabel BO42;
    private javax.swing.JLabel BO43;
    private javax.swing.JLabel BO5;
    private javax.swing.JLabel BO6;
    private javax.swing.JLabel BO7;
    private javax.swing.JLabel BO8;
    private javax.swing.JLabel BO9;
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
    private ClassAngels.PanelRound P21;
    private ClassAngels.PanelRound P22;
    private ClassAngels.PanelRound P23;
    private ClassAngels.PanelRound P24;
    private ClassAngels.PanelRound P25;
    private ClassAngels.PanelRound P26;
    private ClassAngels.PanelRound P27;
    private ClassAngels.PanelRound P28;
    private ClassAngels.PanelRound P29;
    private ClassAngels.PanelRound P3;
    private ClassAngels.PanelRound P30;
    private ClassAngels.PanelRound P31;
    private ClassAngels.PanelRound P32;
    private ClassAngels.PanelRound P33;
    private ClassAngels.PanelRound P34;
    private ClassAngels.PanelRound P35;
    private ClassAngels.PanelRound P36;
    private ClassAngels.PanelRound P37;
    private ClassAngels.PanelRound P38;
    private ClassAngels.PanelRound P39;
    private ClassAngels.PanelRound P4;
    private ClassAngels.PanelRound P40;
    private ClassAngels.PanelRound P41;
    private ClassAngels.PanelRound P42;
    private ClassAngels.PanelRound P43;
    private ClassAngels.PanelRound P5;
    private ClassAngels.PanelRound P6;
    private ClassAngels.PanelRound P7;
    private ClassAngels.PanelRound P8;
    private ClassAngels.PanelRound P9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
     private void Etiquetas() {   
        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        BO1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        BO2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        BO3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        BO4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        BO5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        BO6.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        BO7.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        BO8.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        BO9.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        BO10.setText(texto10);
        String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        BO11.setText(texto11);
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        BO12.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        BO13.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        BO14.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        BO15.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        BO16.setText(texto16);
        String texto17 ="<html><center><body>"+descripcion17+"<br>"+descripcion2_17+"<br><font color='RED'>Q"+Precio17+"</font></body></center></html>";
        BO17.setText(texto17);
        String texto18 ="<html><center><body>"+descripcion18+"<br>"+descripcion2_18+"<br><font color='RED'>Q"+Precio18+"</font></body></center></html>";
        BO18.setText(texto18);
        String texto19 ="<html><center><body>"+descripcion19+"<br>"+descripcion2_19+"<br><font color='RED'>Q"+Precio19+"</font></body></center></html>";
        BO19.setText(texto19);
        String texto20 ="<html><center><body>"+descripcion20+"<br>"+descripcion2_20+"<br><font color='RED'>Q"+Precio20+"</font></body></center></html>";
        BO20.setText(texto20);
        String texto21 ="<html><center><body>"+descripcion21+"<br>"+descripcion2_21+"<br><font color='RED'>Q"+Precio21+"</font></body></center></html>";
        BO21.setText(texto21);
        String texto22 ="<html><center><body>"+descripcion22+"<br>"+descripcion2_22+"<br><font color='RED'>Q"+Precio22+"</font></body></center></html>";
        BO22.setText(texto22);
        String texto23 ="<html><center><body>"+descripcion23+"<br>"+descripcion2_23+"<br><font color='RED'>Q"+Precio23+"</font></body></center></html>";
        BO23.setText(texto23);
        String texto24 ="<html><center><body>"+descripcion24+"<br>"+descripcion2_24+"<br><font color='RED'>Q"+Precio24+"</font></body></center></html>";
        BO24.setText(texto24);
        String texto25 ="<html><center><body>"+descripcion25+"<br>"+descripcion2_25+"<br><font color='RED'>Q"+Precio25+"</font></body></center></html>";
        BO25.setText(texto25);
        String texto26 ="<html><center><body>"+descripcion26+"<br>"+descripcion2_26+"<br><font color='RED'>Q"+Precio26+"</font></body></center></html>";
        BO26.setText(texto26);
        String texto27 ="<html><center><body>"+descripcion27+"<br>"+descripcion2_27+"<br><font color='RED'>Q"+Precio27+"</font></body></center></html>";
        BO27.setText(texto27);
        String texto28 ="<html><center><body>"+descripcion28+"<br>"+descripcion2_28+"<br><font color='RED'>Q"+Precio28+"</font></body></center></html>";
        BO28.setText(texto28);
        /*String texto29 ="<html><center><body>"+descripcion29+"<br>"+descripcion2_29+"<br><font color='RED'>Q"+Precio29+"</font></body></center></html>";
        BO29.setText(texto29);
        String texto30 ="<html><center><body>"+descripcion30+"<br>"+descripcion2_30+"<br><font color='RED'>Q"+Precio30+"</font></body></center></html>";
        BO30.setText(texto30);*/
        String texto31 ="<html><center><body>"+descripcion31+"<br>"+descripcion2_31+"<br><font color='RED'>Q"+Precio31+"</font></body></center></html>";
        BO31.setText(texto31);
        String texto32 ="<html><center><body>"+descripcion32+"<br>"+descripcion2_32+"<br><font color='RED'>Q"+Precio32+"</font></body></center></html>";
        BO32.setText(texto32);
        String texto33 ="<html><center><body>"+descripcion33+"<br>"+descripcion2_33+"<br><font color='RED'>Q"+Precio33+"</font></body></center></html>";
        BO33.setText(texto33);
        String texto34 ="<html><center><body>"+descripcion34+"<br>"+descripcion2_34+"<br><font color='RED'>Q"+Precio34+"</font></body></center></html>";
        BO34.setText(texto34);
        String texto35 ="<html><center><body>"+descripcion35+"<br>"+descripcion2_35+"<br><font color='RED'>Q"+Precio35+"</font></body></center></html>";
        BO35.setText(texto35);
        String texto36 ="<html><center><body>"+descripcion36+"<br>"+descripcion2_36+"<br><font color='RED'>Q"+Precio36+"</font></body></center></html>";
        BO36.setText(texto36);
        String texto37 ="<html><center><body>"+descripcion37+"<br>"+descripcion2_37+"<br><font color='RED'>Q"+Precio37+"</font></body></center></html>";
        BO37.setText(texto37);
        String texto38 ="<html><center><body>"+descripcion38+"<br>"+descripcion2_38+"<br><font color='RED'>Q"+Precio38+"</font></body></center></html>";
        BO38.setText(texto38);
        String texto39 ="<html><center><body>"+descripcion39+"<br>"+descripcion2_39+"<br><font color='RED'>Q"+Precio39+"</font></body></center></html>";
        BO39.setText(texto39);
        String texto40 ="<html><center><body>"+descripcion40+"<br>"+descripcion2_40+"<br><font color='RED'>Q"+Precio40+"</font></body></center></html>";
        BO40.setText(texto40);
        String texto41 ="<html><center><body>"+descripcion41+"<br>"+descripcion2_41+"<br><font color='RED'>Q"+Precio41+"</font></body></center></html>";
        BO41.setText(texto41);
        String texto42 ="<html><center><body>"+descripcion42+"<br>"+descripcion2_42+"<br><font color='RED'>Q"+Precio42+"</font></body></center></html>";
        BO42.setText(texto42);
        String texto43 ="<html><center><body>"+descripcion43+"<br>"+descripcion2_43+"<br><font color='RED'>Q"+Precio43+"</font></body></center></html>";
        BO43.setText(texto43);
}
}
