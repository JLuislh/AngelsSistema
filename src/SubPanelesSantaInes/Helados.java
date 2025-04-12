package SubPanelesSantaInes;

import BDclass.BDConexion;
import BDclass.BDOrdenes;
import ClassAngels.EtiquetasClass;
import ClassAngels.InsertarProducto;
import Inicio.Menu;
import static Inicio.Menu.noorden;
import Inicio.MenuParaLlevar;
import Inicio.MenuSeguimiento;
import java.awt.BorderLayout;
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
public class Helados extends javax.swing.JPanel {
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
 String descripcion23= "";	String descripcion2_23= "";	 String Precio23= ""; int codigo23;
 String descripcion24= "";	String descripcion2_24= "";	 String Precio24= ""; int codigo24;
 String descripcion25= "";	String descripcion2_25= "";	 String Precio25= ""; int codigo25;
 String descripcion26= "";	String descripcion2_26= "";	 String Precio26= ""; int codigo26;
 String descripcion27= "";	String descripcion2_27= "";	 String Precio27= ""; int codigo27;
 String descripcion28= "";	String descripcion2_28= "";	 String Precio28= ""; int codigo28;
 String descripcion29= "";	String descripcion2_29= "";	 String Precio29= ""; int codigo29;
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
 int noorden;
 int codigooreden;
 int existe = 0;
 int tipomenu = 0;
 int tipo;

    /**
     * Creates new form Hamburguesas
     * @param a
     * @param b
     */
    public Helados(int a,int b) {
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
       H1.setBackground(Original);
       H2.setBackground(Original);
       H3.setBackground(Original);
       H5.setBackground(Original);
       H5.setBackground(Original);
       H6.setBackground(Original);
       H7.setBackground(Original);
       H8.setBackground(Original);
       H9.setBackground(Original);
       H10.setBackground(Original);
       H11.setBackground(Original);
       H12.setBackground(Original);
       H13.setBackground(Original);
       H14.setBackground(Original);
       H15.setBackground(Original);
       H16.setBackground(Original);
       H17.setBackground(Original);
       H18.setBackground(Original);
       H19.setBackground(Original);
       H20.setBackground(Original);
       H21.setBackground(Original);
       H22.setBackground(Original);
       H23.setBackground(Original);
       H24.setBackground(Original);
       H25.setBackground(Original);
       H26.setBackground(Original);
       H27.setBackground(Original);
       H28.setBackground(Original);
       H29.setBackground(Original);
       H30.setBackground(Original);
       H31.setBackground(Original);
       H32.setBackground(Original);
       H33.setBackground(Original);
       H34.setBackground(Original);
       H35.setBackground(Original);
       H36.setBackground(Original);
       H37.setBackground(Original);
       H38.setBackground(Original);
       H39.setBackground(Original);
     }
    });
    
     public  void BuscarTipo() {
            try {
                BDConexion conecta = new BDConexion();
                Connection cn = conecta.getConexion();
                java.sql.Statement stmt = cn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT COMBEB  FROM PRODUCTOS  WHERE  CODIGO ="+codigooreden );
                while (rs.next()) {
                    tipo = rs.getInt(1);
                }
                rs.close();
                stmt.close();
                cn.close();
            } catch (Exception error) {
                System.out.print(error);
            }
            
        } 
    
    private void InsertarProductoPedido() {
        BuscarTipo();
        try {
            InsertarProducto p1 = new InsertarProducto();
            p1.setNoOrden(noorden);
            p1.setId_producto(codigooreden);
            p1.setTipo(tipo);
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
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD+1, TOTAL = CANTIDAD*(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" and estado = 1 AND CODIGO = "+codigooreden);
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
                ResultSet rs = stmt.executeQuery("SELECT cantidad as EXISTE FROM ventas  WHERE NOORDEN =  "+noorden+" and estado = 1 AND CODIGO ="+codigooreden );
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
                 smtp = con.prepareStatement("update VENTAS SET CANTIDAD = CANTIDAD-1,Total = TOTAL-(SELECT PRECIO FROM productos WHERE CODIGO = "+codigooreden+") WHERE NOORDEN = "+noorden+" and estado = 1 AND CODIGO = "+codigooreden);
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
            ps= con.prepareStatement("delete from Ventas where noorden="+noorden+" and estado = 1 and codigo = "+codigooreden);
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

        jPanel3 = new javax.swing.JPanel();
        H1 = new ClassAngels.PanelRound();
        LH1 = new javax.swing.JLabel();
        H2 = new ClassAngels.PanelRound();
        LH2 = new javax.swing.JLabel();
        H3 = new ClassAngels.PanelRound();
        LH3 = new javax.swing.JLabel();
        H4 = new ClassAngels.PanelRound();
        LH4 = new javax.swing.JLabel();
        H5 = new ClassAngels.PanelRound();
        LH5 = new javax.swing.JLabel();
        H6 = new ClassAngels.PanelRound();
        LH6 = new javax.swing.JLabel();
        H7 = new ClassAngels.PanelRound();
        LH7 = new javax.swing.JLabel();
        H8 = new ClassAngels.PanelRound();
        LH8 = new javax.swing.JLabel();
        H9 = new ClassAngels.PanelRound();
        LH9 = new javax.swing.JLabel();
        H10 = new ClassAngels.PanelRound();
        LH10 = new javax.swing.JLabel();
        H11 = new ClassAngels.PanelRound();
        LH11 = new javax.swing.JLabel();
        H12 = new ClassAngels.PanelRound();
        LH12 = new javax.swing.JLabel();
        H13 = new ClassAngels.PanelRound();
        LH13 = new javax.swing.JLabel();
        H14 = new ClassAngels.PanelRound();
        LH14 = new javax.swing.JLabel();
        H15 = new ClassAngels.PanelRound();
        LH15 = new javax.swing.JLabel();
        H16 = new ClassAngels.PanelRound();
        LH16 = new javax.swing.JLabel();
        H17 = new ClassAngels.PanelRound();
        LH17 = new javax.swing.JLabel();
        H18 = new ClassAngels.PanelRound();
        LH18 = new javax.swing.JLabel();
        H19 = new ClassAngels.PanelRound();
        LH19 = new javax.swing.JLabel();
        H20 = new ClassAngels.PanelRound();
        LH20 = new javax.swing.JLabel();
        H21 = new ClassAngels.PanelRound();
        LH21 = new javax.swing.JLabel();
        H22 = new ClassAngels.PanelRound();
        LH22 = new javax.swing.JLabel();
        H23 = new ClassAngels.PanelRound();
        LH23 = new javax.swing.JLabel();
        H24 = new ClassAngels.PanelRound();
        LH24 = new javax.swing.JLabel();
        H25 = new ClassAngels.PanelRound();
        LH25 = new javax.swing.JLabel();
        H26 = new ClassAngels.PanelRound();
        LH26 = new javax.swing.JLabel();
        H27 = new ClassAngels.PanelRound();
        LH27 = new javax.swing.JLabel();
        H28 = new ClassAngels.PanelRound();
        LH28 = new javax.swing.JLabel();
        H29 = new ClassAngels.PanelRound();
        LH29 = new javax.swing.JLabel();
        H30 = new ClassAngels.PanelRound();
        LH30 = new javax.swing.JLabel();
        H31 = new ClassAngels.PanelRound();
        LH31 = new javax.swing.JLabel();
        H32 = new ClassAngels.PanelRound();
        LH32 = new javax.swing.JLabel();
        H33 = new ClassAngels.PanelRound();
        LH33 = new javax.swing.JLabel();
        H34 = new ClassAngels.PanelRound();
        LH34 = new javax.swing.JLabel();
        H35 = new ClassAngels.PanelRound();
        LH35 = new javax.swing.JLabel();
        H36 = new ClassAngels.PanelRound();
        LH36 = new javax.swing.JLabel();
        H37 = new ClassAngels.PanelRound();
        LH37 = new javax.swing.JLabel();
        H38 = new ClassAngels.PanelRound();
        LH38 = new javax.swing.JLabel();
        H39 = new ClassAngels.PanelRound();
        LH39 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 255));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MICHELADAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        H1.setBackground(new java.awt.Color(204, 255, 102));
        H1.setPreferredSize(new java.awt.Dimension(80, 70));
        H1.setRoundBottomLeft(20);
        H1.setRoundBottomRight(20);
        H1.setRoundTopLeft(20);
        H1.setRoundTopRight(20);

        LH1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH1.setText("H1");
        LH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H1Layout = new javax.swing.GroupLayout(H1);
        H1.setLayout(H1Layout);
        H1Layout.setHorizontalGroup(
            H1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H1Layout.setVerticalGroup(
            H1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H2.setBackground(new java.awt.Color(204, 255, 102));
        H2.setPreferredSize(new java.awt.Dimension(80, 70));
        H2.setRoundBottomLeft(20);
        H2.setRoundBottomRight(20);
        H2.setRoundTopLeft(20);
        H2.setRoundTopRight(20);

        LH2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH2.setText("H2");
        LH2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H2Layout = new javax.swing.GroupLayout(H2);
        H2.setLayout(H2Layout);
        H2Layout.setHorizontalGroup(
            H2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H2Layout.setVerticalGroup(
            H2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H3.setBackground(new java.awt.Color(204, 255, 102));
        H3.setPreferredSize(new java.awt.Dimension(80, 70));
        H3.setRoundBottomLeft(20);
        H3.setRoundBottomRight(20);
        H3.setRoundTopLeft(20);
        H3.setRoundTopRight(20);

        LH3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH3.setText("H3");
        LH3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H3Layout = new javax.swing.GroupLayout(H3);
        H3.setLayout(H3Layout);
        H3Layout.setHorizontalGroup(
            H3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H3Layout.setVerticalGroup(
            H3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H4.setBackground(new java.awt.Color(204, 255, 102));
        H4.setPreferredSize(new java.awt.Dimension(80, 70));
        H4.setRoundBottomLeft(20);
        H4.setRoundBottomRight(20);
        H4.setRoundTopLeft(20);
        H4.setRoundTopRight(20);

        LH4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH4.setText("H4");
        LH4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H4Layout = new javax.swing.GroupLayout(H4);
        H4.setLayout(H4Layout);
        H4Layout.setHorizontalGroup(
            H4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H4Layout.setVerticalGroup(
            H4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H5.setBackground(new java.awt.Color(204, 255, 102));
        H5.setPreferredSize(new java.awt.Dimension(80, 70));
        H5.setRoundBottomLeft(20);
        H5.setRoundBottomRight(20);
        H5.setRoundTopLeft(20);
        H5.setRoundTopRight(20);

        LH5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH5.setText("H5");
        LH5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H5Layout = new javax.swing.GroupLayout(H5);
        H5.setLayout(H5Layout);
        H5Layout.setHorizontalGroup(
            H5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H5Layout.setVerticalGroup(
            H5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H6.setBackground(new java.awt.Color(204, 255, 102));
        H6.setPreferredSize(new java.awt.Dimension(80, 70));
        H6.setRoundBottomLeft(20);
        H6.setRoundBottomRight(20);
        H6.setRoundTopLeft(20);
        H6.setRoundTopRight(20);

        LH6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH6.setText("H6");
        LH6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H6Layout = new javax.swing.GroupLayout(H6);
        H6.setLayout(H6Layout);
        H6Layout.setHorizontalGroup(
            H6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H6Layout.setVerticalGroup(
            H6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H7.setBackground(new java.awt.Color(204, 255, 102));
        H7.setPreferredSize(new java.awt.Dimension(80, 70));
        H7.setRoundBottomLeft(20);
        H7.setRoundBottomRight(20);
        H7.setRoundTopLeft(20);
        H7.setRoundTopRight(20);

        LH7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH7.setText("H7");
        LH7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H7Layout = new javax.swing.GroupLayout(H7);
        H7.setLayout(H7Layout);
        H7Layout.setHorizontalGroup(
            H7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H7Layout.setVerticalGroup(
            H7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H8.setBackground(new java.awt.Color(204, 255, 102));
        H8.setPreferredSize(new java.awt.Dimension(80, 70));
        H8.setRoundBottomLeft(20);
        H8.setRoundBottomRight(20);
        H8.setRoundTopLeft(20);
        H8.setRoundTopRight(20);

        LH8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH8.setText("H8");
        LH8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H8Layout = new javax.swing.GroupLayout(H8);
        H8.setLayout(H8Layout);
        H8Layout.setHorizontalGroup(
            H8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H8Layout.setVerticalGroup(
            H8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H9.setBackground(new java.awt.Color(204, 255, 102));
        H9.setPreferredSize(new java.awt.Dimension(80, 70));
        H9.setRoundBottomLeft(20);
        H9.setRoundBottomRight(20);
        H9.setRoundTopLeft(20);
        H9.setRoundTopRight(20);

        LH9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH9.setText("H9");
        LH9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H9Layout = new javax.swing.GroupLayout(H9);
        H9.setLayout(H9Layout);
        H9Layout.setHorizontalGroup(
            H9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH9, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H9Layout.setVerticalGroup(
            H9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H10.setBackground(new java.awt.Color(204, 255, 102));
        H10.setPreferredSize(new java.awt.Dimension(80, 70));
        H10.setRoundBottomLeft(20);
        H10.setRoundBottomRight(20);
        H10.setRoundTopLeft(20);
        H10.setRoundTopRight(20);

        LH10.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH10.setText("H10");
        LH10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H10Layout = new javax.swing.GroupLayout(H10);
        H10.setLayout(H10Layout);
        H10Layout.setHorizontalGroup(
            H10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH10, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H10Layout.setVerticalGroup(
            H10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H11.setBackground(new java.awt.Color(204, 255, 102));
        H11.setPreferredSize(new java.awt.Dimension(80, 70));
        H11.setRoundBottomLeft(20);
        H11.setRoundBottomRight(20);
        H11.setRoundTopLeft(20);
        H11.setRoundTopRight(20);

        LH11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH11.setText("H11");
        LH11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H11Layout = new javax.swing.GroupLayout(H11);
        H11.setLayout(H11Layout);
        H11Layout.setHorizontalGroup(
            H11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH11, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H11Layout.setVerticalGroup(
            H11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H12.setBackground(new java.awt.Color(204, 255, 102));
        H12.setPreferredSize(new java.awt.Dimension(80, 70));
        H12.setRoundBottomLeft(20);
        H12.setRoundBottomRight(20);
        H12.setRoundTopLeft(20);
        H12.setRoundTopRight(20);

        LH12.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH12.setText("H12");
        LH12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H12Layout = new javax.swing.GroupLayout(H12);
        H12.setLayout(H12Layout);
        H12Layout.setHorizontalGroup(
            H12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH12, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H12Layout.setVerticalGroup(
            H12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H13.setBackground(new java.awt.Color(204, 255, 102));
        H13.setPreferredSize(new java.awt.Dimension(80, 70));
        H13.setRoundBottomLeft(20);
        H13.setRoundBottomRight(20);
        H13.setRoundTopLeft(20);
        H13.setRoundTopRight(20);

        LH13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH13.setText("H13");
        LH13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H13Layout = new javax.swing.GroupLayout(H13);
        H13.setLayout(H13Layout);
        H13Layout.setHorizontalGroup(
            H13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H13Layout.setVerticalGroup(
            H13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H14.setBackground(new java.awt.Color(204, 255, 102));
        H14.setPreferredSize(new java.awt.Dimension(80, 70));
        H14.setRoundBottomLeft(20);
        H14.setRoundBottomRight(20);
        H14.setRoundTopLeft(20);
        H14.setRoundTopRight(20);

        LH14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH14.setText("H14");
        LH14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H14Layout = new javax.swing.GroupLayout(H14);
        H14.setLayout(H14Layout);
        H14Layout.setHorizontalGroup(
            H14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH14, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H14Layout.setVerticalGroup(
            H14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H15.setBackground(new java.awt.Color(204, 255, 102));
        H15.setPreferredSize(new java.awt.Dimension(80, 70));
        H15.setRoundBottomLeft(20);
        H15.setRoundBottomRight(20);
        H15.setRoundTopLeft(20);
        H15.setRoundTopRight(20);

        LH15.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH15.setText("H15");
        LH15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H15Layout = new javax.swing.GroupLayout(H15);
        H15.setLayout(H15Layout);
        H15Layout.setHorizontalGroup(
            H15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH15, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H15Layout.setVerticalGroup(
            H15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H16.setBackground(new java.awt.Color(204, 255, 102));
        H16.setPreferredSize(new java.awt.Dimension(80, 70));
        H16.setRoundBottomLeft(20);
        H16.setRoundBottomRight(20);
        H16.setRoundTopLeft(20);
        H16.setRoundTopRight(20);

        LH16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH16.setText("H16");
        LH16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H16Layout = new javax.swing.GroupLayout(H16);
        H16.setLayout(H16Layout);
        H16Layout.setHorizontalGroup(
            H16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH16, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H16Layout.setVerticalGroup(
            H16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H17.setBackground(new java.awt.Color(204, 255, 102));
        H17.setPreferredSize(new java.awt.Dimension(80, 70));
        H17.setRoundBottomLeft(20);
        H17.setRoundBottomRight(20);
        H17.setRoundTopLeft(20);
        H17.setRoundTopRight(20);

        LH17.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH17.setText("H17");
        LH17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H17Layout = new javax.swing.GroupLayout(H17);
        H17.setLayout(H17Layout);
        H17Layout.setHorizontalGroup(
            H17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH17, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H17Layout.setVerticalGroup(
            H17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H18.setBackground(new java.awt.Color(204, 255, 102));
        H18.setPreferredSize(new java.awt.Dimension(80, 70));
        H18.setRoundBottomLeft(20);
        H18.setRoundBottomRight(20);
        H18.setRoundTopLeft(20);
        H18.setRoundTopRight(20);

        LH18.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH18.setText("H18");
        LH18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H18Layout = new javax.swing.GroupLayout(H18);
        H18.setLayout(H18Layout);
        H18Layout.setHorizontalGroup(
            H18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH18, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H18Layout.setVerticalGroup(
            H18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H19.setBackground(new java.awt.Color(204, 255, 102));
        H19.setPreferredSize(new java.awt.Dimension(80, 70));
        H19.setRoundBottomLeft(20);
        H19.setRoundBottomRight(20);
        H19.setRoundTopLeft(20);
        H19.setRoundTopRight(20);

        LH19.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH19.setText("H19");
        LH19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H19Layout = new javax.swing.GroupLayout(H19);
        H19.setLayout(H19Layout);
        H19Layout.setHorizontalGroup(
            H19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH19, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H19Layout.setVerticalGroup(
            H19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H20.setBackground(new java.awt.Color(204, 255, 102));
        H20.setPreferredSize(new java.awt.Dimension(80, 70));
        H20.setRoundBottomLeft(20);
        H20.setRoundBottomRight(20);
        H20.setRoundTopLeft(20);
        H20.setRoundTopRight(20);

        LH20.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH20.setText("H20");
        LH20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H20Layout = new javax.swing.GroupLayout(H20);
        H20.setLayout(H20Layout);
        H20Layout.setHorizontalGroup(
            H20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H20Layout.setVerticalGroup(
            H20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H21.setBackground(new java.awt.Color(204, 255, 102));
        H21.setPreferredSize(new java.awt.Dimension(80, 70));
        H21.setRoundBottomLeft(20);
        H21.setRoundBottomRight(20);
        H21.setRoundTopLeft(20);
        H21.setRoundTopRight(20);

        LH21.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH21.setText("H21");
        LH21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H21Layout = new javax.swing.GroupLayout(H21);
        H21.setLayout(H21Layout);
        H21Layout.setHorizontalGroup(
            H21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H21Layout.setVerticalGroup(
            H21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H22.setBackground(new java.awt.Color(204, 255, 102));
        H22.setPreferredSize(new java.awt.Dimension(80, 70));
        H22.setRoundBottomLeft(20);
        H22.setRoundBottomRight(20);
        H22.setRoundTopLeft(20);
        H22.setRoundTopRight(20);

        LH22.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH22.setText("H22");
        LH22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H22Layout = new javax.swing.GroupLayout(H22);
        H22.setLayout(H22Layout);
        H22Layout.setHorizontalGroup(
            H22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH22, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H22Layout.setVerticalGroup(
            H22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H23.setBackground(new java.awt.Color(204, 255, 102));
        H23.setPreferredSize(new java.awt.Dimension(80, 70));
        H23.setRoundBottomLeft(20);
        H23.setRoundBottomRight(20);
        H23.setRoundTopLeft(20);
        H23.setRoundTopRight(20);

        LH23.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H23Layout = new javax.swing.GroupLayout(H23);
        H23.setLayout(H23Layout);
        H23Layout.setHorizontalGroup(
            H23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH23, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H23Layout.setVerticalGroup(
            H23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H24.setBackground(new java.awt.Color(204, 255, 102));
        H24.setPreferredSize(new java.awt.Dimension(80, 70));
        H24.setRoundBottomLeft(20);
        H24.setRoundBottomRight(20);
        H24.setRoundTopLeft(20);
        H24.setRoundTopRight(20);

        LH24.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H24Layout = new javax.swing.GroupLayout(H24);
        H24.setLayout(H24Layout);
        H24Layout.setHorizontalGroup(
            H24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH24, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H24Layout.setVerticalGroup(
            H24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H25.setBackground(new java.awt.Color(204, 255, 102));
        H25.setPreferredSize(new java.awt.Dimension(80, 70));
        H25.setRoundBottomLeft(20);
        H25.setRoundBottomRight(20);
        H25.setRoundTopLeft(20);
        H25.setRoundTopRight(20);

        LH25.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H25Layout = new javax.swing.GroupLayout(H25);
        H25.setLayout(H25Layout);
        H25Layout.setHorizontalGroup(
            H25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH25, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H25Layout.setVerticalGroup(
            H25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H26.setBackground(new java.awt.Color(204, 255, 102));
        H26.setPreferredSize(new java.awt.Dimension(80, 70));
        H26.setRoundBottomLeft(20);
        H26.setRoundBottomRight(20);
        H26.setRoundTopLeft(20);
        H26.setRoundTopRight(20);

        LH26.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        LH26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H26Layout = new javax.swing.GroupLayout(H26);
        H26.setLayout(H26Layout);
        H26Layout.setHorizontalGroup(
            H26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH26, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H26Layout.setVerticalGroup(
            H26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H27.setBackground(new java.awt.Color(204, 255, 102));
        H27.setPreferredSize(new java.awt.Dimension(80, 70));
        H27.setRoundBottomLeft(20);
        H27.setRoundBottomRight(20);
        H27.setRoundTopLeft(20);
        H27.setRoundTopRight(20);

        LH27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H27Layout = new javax.swing.GroupLayout(H27);
        H27.setLayout(H27Layout);
        H27Layout.setHorizontalGroup(
            H27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH27, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H27Layout.setVerticalGroup(
            H27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH27, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H28.setBackground(new java.awt.Color(204, 255, 102));
        H28.setPreferredSize(new java.awt.Dimension(80, 70));
        H28.setRoundBottomLeft(20);
        H28.setRoundBottomRight(20);
        H28.setRoundTopLeft(20);
        H28.setRoundTopRight(20);

        LH28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H28Layout = new javax.swing.GroupLayout(H28);
        H28.setLayout(H28Layout);
        H28Layout.setHorizontalGroup(
            H28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH28, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H28Layout.setVerticalGroup(
            H28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH28, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H29.setBackground(new java.awt.Color(204, 255, 102));
        H29.setPreferredSize(new java.awt.Dimension(80, 70));
        H29.setRoundBottomLeft(20);
        H29.setRoundBottomRight(20);
        H29.setRoundTopLeft(20);
        H29.setRoundTopRight(20);

        LH29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H29Layout = new javax.swing.GroupLayout(H29);
        H29.setLayout(H29Layout);
        H29Layout.setHorizontalGroup(
            H29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH29, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H29Layout.setVerticalGroup(
            H29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH29, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H30.setBackground(new java.awt.Color(204, 255, 102));
        H30.setPreferredSize(new java.awt.Dimension(80, 70));
        H30.setRoundBottomLeft(20);
        H30.setRoundBottomRight(20);
        H30.setRoundTopLeft(20);
        H30.setRoundTopRight(20);

        LH30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH30MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H30Layout = new javax.swing.GroupLayout(H30);
        H30.setLayout(H30Layout);
        H30Layout.setHorizontalGroup(
            H30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH30, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H30Layout.setVerticalGroup(
            H30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH30, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H31.setBackground(new java.awt.Color(204, 255, 102));
        H31.setPreferredSize(new java.awt.Dimension(80, 70));
        H31.setRoundBottomLeft(20);
        H31.setRoundBottomRight(20);
        H31.setRoundTopLeft(20);
        H31.setRoundTopRight(20);

        LH31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H31Layout = new javax.swing.GroupLayout(H31);
        H31.setLayout(H31Layout);
        H31Layout.setHorizontalGroup(
            H31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH31, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H31Layout.setVerticalGroup(
            H31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH31, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H32.setBackground(new java.awt.Color(204, 255, 102));
        H32.setPreferredSize(new java.awt.Dimension(80, 70));
        H32.setRoundBottomLeft(20);
        H32.setRoundBottomRight(20);
        H32.setRoundTopLeft(20);
        H32.setRoundTopRight(20);

        LH32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H32Layout = new javax.swing.GroupLayout(H32);
        H32.setLayout(H32Layout);
        H32Layout.setHorizontalGroup(
            H32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH32, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H32Layout.setVerticalGroup(
            H32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH32, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H33.setBackground(new java.awt.Color(204, 255, 102));
        H33.setPreferredSize(new java.awt.Dimension(80, 70));
        H33.setRoundBottomLeft(20);
        H33.setRoundBottomRight(20);
        H33.setRoundTopLeft(20);
        H33.setRoundTopRight(20);

        LH33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H33Layout = new javax.swing.GroupLayout(H33);
        H33.setLayout(H33Layout);
        H33Layout.setHorizontalGroup(
            H33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH33, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H33Layout.setVerticalGroup(
            H33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH33, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H34.setBackground(new java.awt.Color(204, 255, 102));
        H34.setPreferredSize(new java.awt.Dimension(80, 70));
        H34.setRoundBottomLeft(20);
        H34.setRoundBottomRight(20);
        H34.setRoundTopLeft(20);
        H34.setRoundTopRight(20);

        LH34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H34Layout = new javax.swing.GroupLayout(H34);
        H34.setLayout(H34Layout);
        H34Layout.setHorizontalGroup(
            H34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H34Layout.setVerticalGroup(
            H34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H35.setBackground(new java.awt.Color(204, 255, 102));
        H35.setPreferredSize(new java.awt.Dimension(80, 70));
        H35.setRoundBottomLeft(20);
        H35.setRoundBottomRight(20);
        H35.setRoundTopLeft(20);
        H35.setRoundTopRight(20);

        LH35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H35Layout = new javax.swing.GroupLayout(H35);
        H35.setLayout(H35Layout);
        H35Layout.setHorizontalGroup(
            H35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H35Layout.setVerticalGroup(
            H35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH35, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H36.setBackground(new java.awt.Color(204, 255, 102));
        H36.setMinimumSize(new java.awt.Dimension(100, 75));
        H36.setPreferredSize(new java.awt.Dimension(80, 70));
        H36.setRoundBottomLeft(20);
        H36.setRoundBottomRight(20);
        H36.setRoundTopLeft(20);
        H36.setRoundTopRight(20);

        LH36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H36Layout = new javax.swing.GroupLayout(H36);
        H36.setLayout(H36Layout);
        H36Layout.setHorizontalGroup(
            H36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        H36Layout.setVerticalGroup(
            H36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        H37.setBackground(new java.awt.Color(204, 255, 102));
        H37.setMinimumSize(new java.awt.Dimension(100, 75));
        H37.setPreferredSize(new java.awt.Dimension(80, 70));
        H37.setRoundBottomLeft(20);
        H37.setRoundBottomRight(20);
        H37.setRoundTopLeft(20);
        H37.setRoundTopRight(20);

        LH37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H37Layout = new javax.swing.GroupLayout(H37);
        H37.setLayout(H37Layout);
        H37Layout.setHorizontalGroup(
            H37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(H37Layout.createSequentialGroup()
                .addComponent(LH37, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        H37Layout.setVerticalGroup(
            H37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        H38.setBackground(new java.awt.Color(204, 255, 102));
        H38.setPreferredSize(new java.awt.Dimension(80, 70));
        H38.setRoundBottomLeft(20);
        H38.setRoundBottomRight(20);
        H38.setRoundTopLeft(20);
        H38.setRoundTopRight(20);

        LH38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H38Layout = new javax.swing.GroupLayout(H38);
        H38.setLayout(H38Layout);
        H38Layout.setHorizontalGroup(
            H38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH38, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H38Layout.setVerticalGroup(
            H38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH38, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        H39.setBackground(new java.awt.Color(204, 255, 102));
        H39.setPreferredSize(new java.awt.Dimension(80, 70));
        H39.setRoundBottomLeft(20);
        H39.setRoundBottomRight(20);
        H39.setRoundTopLeft(20);
        H39.setRoundTopRight(20);

        LH39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LH39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LH39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LH39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout H39Layout = new javax.swing.GroupLayout(H39);
        H39.setLayout(H39Layout);
        H39Layout.setHorizontalGroup(
            H39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH39, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        H39Layout.setVerticalGroup(
            H39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LH39, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(H14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(H27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(H15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(H32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(H35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(H36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(H37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LH27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH27MouseClicked
      /*  if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo27;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H27.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo27;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H27.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH27MouseClicked

    private void LH28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH28MouseClicked
       /*  if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo28;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H28.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo28;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H28.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH28MouseClicked

    private void LH29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH29MouseClicked
      /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo29;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H29.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo29;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H29.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH29MouseClicked

    private void LH30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH30MouseClicked
      /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo30;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H30.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo30;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H30.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH30MouseClicked

    private void LH31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH31MouseClicked
    /*    if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo31;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H31.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo31;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H31.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH31MouseClicked

    private void LH32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH32MouseClicked
     /*    if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo32;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H32.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo32;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H32.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH32MouseClicked

    private void LH33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH33MouseClicked
     /*    if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo33;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H33.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo33;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H33.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH33MouseClicked

    private void LH34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH34MouseClicked
     /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo34;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H34.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo34;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H34.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH34MouseClicked

    private void LH35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH35MouseClicked
    /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo35;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H35.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo35;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H35.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH35MouseClicked

    private void LH36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH36MouseClicked
      /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo36;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H36.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo36;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H36.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH36MouseClicked

    private void LH37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH37MouseClicked
     /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo37;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H37.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo37;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H37.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH37MouseClicked

    private void LH38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH38MouseClicked
      /* if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo38;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H38.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
          }else{
            codigooreden = codigo38;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H38.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
       }*/
    }//GEN-LAST:event_LH38MouseClicked

    private void LH39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH39MouseClicked
    /*    if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo39;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H39.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo39;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H39.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_LH39MouseClicked

    private void LH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH1MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo1;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H1.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo1;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H1.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH1MouseClicked

    private void LH2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH2MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo2;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H2.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo2;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H2.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH2MouseClicked

    private void LH3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH3MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo3;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H3.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo3;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H3.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH3MouseClicked

    private void LH4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH4MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo4;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H4.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo4;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H4.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH4MouseClicked

    private void LH5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH5MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo5;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H5.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo5;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H5.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH5MouseClicked

    private void LH6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH6MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo6;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H6.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo6;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H6.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH6MouseClicked

    private void LH7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH7MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo7;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H7.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo7;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H7.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH7MouseClicked

    private void LH8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH8MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo8;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H8.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo8;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H8.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH8MouseClicked

    private void LH9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH9MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo9;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H9.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo9;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H9.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH9MouseClicked

    private void LH10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH10MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo10;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H10.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo10;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H10.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH10MouseClicked

    private void LH11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH11MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo11;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H11.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo11;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H11.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH11MouseClicked

    private void LH12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH12MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo12;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H12.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo12;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H12.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH12MouseClicked

    private void LH13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH13MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo13;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H13.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo13;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H13.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH13MouseClicked

    private void LH14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH14MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo14;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H14.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo14;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H14.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH14MouseClicked

    private void LH15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH15MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo15;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H15.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo15;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H15.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH15MouseClicked

    private void LH16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH16MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo16;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H16.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo16;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H16.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH16MouseClicked

    private void LH17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH17MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo17;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H17.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo17;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H17.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH17MouseClicked

    private void LH18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH18MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo18;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H18.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo18;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H18.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH18MouseClicked

    private void LH19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH19MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo19;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H19.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo19;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H19.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH19MouseClicked

    private void LH20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH20MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo20;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H20.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo20;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H20.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH20MouseClicked

    private void LH21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH21MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo21;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H21.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo21;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H21.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH21MouseClicked

    private void LH22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH22MouseClicked
        if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo22;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H22.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo22;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H22.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }
    }//GEN-LAST:event_LH22MouseClicked

    private void LH23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH23MouseClicked
     /*   if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo23;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H23.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo23;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H23.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_LH23MouseClicked

    private void LH24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH24MouseClicked
      /*    if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo24;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H24.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo24;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H24.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_LH24MouseClicked

    private void LH25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH25MouseClicked
    /*  if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo25;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H26.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo25;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H26.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_LH25MouseClicked

    private void LH26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LH26MouseClicked
  /*      if ((evt.getModifiers() & 4) !=0){
            codigooreden= codigo26;
            BuscarExistencia();
            if(existe >= 2){UpdateCantidadMenos();} else if (existe == 1){eliminarProducto();} else{JOptionPane.showMessageDialog(this, "Aun no tienes agregado este producto");}
            H26.setBackground(Color.darkGray);
            timer.setRepeats(false);
            timer.start();
        }else{
            codigooreden = codigo26;
            BuscarExistencia();
            if(existe == 0){InsertarProductoPedido();}else{UpdateCantidad();}
            H26.setBackground(Color.GREEN);
            timer.setRepeats(false);
            timer.start();
        }*/
    }//GEN-LAST:event_LH26MouseClicked
 
    
    private void nombres(){
    ArrayList<EtiquetasClass> result = EtiquetasClass.ListaEtiquetasHelados();
        for (int i = 0; i < result.size(); i++) {
          int codigo = result.get(i).getCodigo();
          
            if (290== codigo) {
             descripcion1 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_1 = result.get(i).getDescripcion2().toUpperCase(); Precio1 = result.get(i).getPrecio();codigo1 = result.get(i).getCodigo();
            }
            else if (291 == codigo){
             descripcion2 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_2 = result.get(i).getDescripcion2().toUpperCase(); Precio2 = result.get(i).getPrecio();codigo2 = result.get(i).getCodigo();
            }
             else if (292 == codigo){
             descripcion3 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_3 = result.get(i).getDescripcion2().toUpperCase(); Precio3 = result.get(i).getPrecio();codigo3 = result.get(i).getCodigo();
            }
             else if (293== codigo){
             descripcion4 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_4 = result.get(i).getDescripcion2().toUpperCase(); Precio4 = result.get(i).getPrecio();codigo4 = result.get(i).getCodigo();
            } 
             else if (294== codigo){
             descripcion5 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_5 = result.get(i).getDescripcion2().toUpperCase(); Precio5 = result.get(i).getPrecio();codigo5 = result.get(i).getCodigo();
            }
             else if (295== codigo){
             descripcion6 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_6 = result.get(i).getDescripcion2().toUpperCase(); Precio6 = result.get(i).getPrecio();codigo6 = result.get(i).getCodigo();
            }
             else if (296== codigo){
             descripcion7 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_7 = result.get(i).getDescripcion2().toUpperCase(); Precio7 = result.get(i).getPrecio();codigo7 = result.get(i).getCodigo();
            }
             else if (297== codigo){
             descripcion8 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_8 = result.get(i).getDescripcion2().toUpperCase(); Precio8 = result.get(i).getPrecio();codigo8 = result.get(i).getCodigo();
            }
             else if (298== codigo){
             descripcion9 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_9 = result.get(i).getDescripcion2().toUpperCase(); Precio9 = result.get(i).getPrecio();codigo9 = result.get(i).getCodigo();
            }
             else if (299== codigo){
             descripcion10 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_10 = result.get(i).getDescripcion2().toUpperCase(); Precio10 = result.get(i).getPrecio();codigo10 = result.get(i).getCodigo();
            }
             else if (300== codigo){
             descripcion11 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_11 = result.get(i).getDescripcion2().toUpperCase(); Precio11 = result.get(i).getPrecio();codigo11 = result.get(i).getCodigo();
            }
             else if (301== codigo){
             descripcion12 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_12 = result.get(i).getDescripcion2().toUpperCase(); Precio12 = result.get(i).getPrecio();codigo12 = result.get(i).getCodigo();
            }
             else if (302== codigo){
             descripcion13 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_13 = result.get(i).getDescripcion2().toUpperCase(); Precio13 = result.get(i).getPrecio();codigo13 = result.get(i).getCodigo();
            }
             else if (303== codigo){
             descripcion14 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_14 = result.get(i).getDescripcion2().toUpperCase(); Precio14 = result.get(i).getPrecio();codigo14 = result.get(i).getCodigo();
            }
             else if (304== codigo){
             descripcion15 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_15 = result.get(i).getDescripcion2().toUpperCase(); Precio15 = result.get(i).getPrecio();codigo15 = result.get(i).getCodigo();
            }
            else if (305== codigo){
             descripcion16 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_16 = result.get(i).getDescripcion2().toUpperCase(); Precio16 = result.get(i).getPrecio();codigo16 = result.get(i).getCodigo();
            }
            else if (306== codigo){
             descripcion17 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_17 = result.get(i).getDescripcion2().toUpperCase(); Precio17 = result.get(i).getPrecio();codigo17 = result.get(i).getCodigo();
            }
            else if (307== codigo){
             descripcion18 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_18 = result.get(i).getDescripcion2().toUpperCase(); Precio18 = result.get(i).getPrecio();codigo18 = result.get(i).getCodigo();
            }
            else if (308== codigo){
             descripcion19 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_19 = result.get(i).getDescripcion2().toUpperCase(); Precio19 = result.get(i).getPrecio();codigo19 = result.get(i).getCodigo();
            }
            else if (309== codigo){
             descripcion20 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_20 = result.get(i).getDescripcion2().toUpperCase(); Precio20 = result.get(i).getPrecio();codigo20 = result.get(i).getCodigo();
            }
            else if (310== codigo){
             descripcion21 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_21 = result.get(i).getDescripcion2().toUpperCase(); Precio21 = result.get(i).getPrecio();codigo21 = result.get(i).getCodigo();
            }
            else if (311== codigo){
             descripcion22 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_22 = result.get(i).getDescripcion2().toUpperCase(); Precio22 = result.get(i).getPrecio();codigo22 = result.get(i).getCodigo();
            }
          /*  else if (0 == codigo){
             descripcion23 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_23 = result.get(i).getDescripcion2().toUpperCase(); Precio23 = result.get(i).getPrecio();codigo23 = result.get(i).getCodigo();
            }
            else if (0 == codigo){
             descripcion24 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_24 = result.get(i).getDescripcion2().toUpperCase(); Precio24 = result.get(i).getPrecio();codigo24 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion25 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_25 = result.get(i).getDescripcion2().toUpperCase(); Precio25 = result.get(i).getPrecio();codigo25 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion26 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_26 = result.get(i).getDescripcion2().toUpperCase(); Precio26 = result.get(i).getPrecio();codigo26 = result.get(i).getCodigo();
            }
             else if (0== codigo){
             descripcion27 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_27 = result.get(i).getDescripcion2().toUpperCase(); Precio27 = result.get(i).getPrecio();codigo27 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion28 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_28 = result.get(i).getDescripcion2().toUpperCase(); Precio28 = result.get(i).getPrecio();codigo28 = result.get(i).getCodigo();
            }
             else if (0== codigo){
             descripcion29 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_29 = result.get(i).getDescripcion2().toUpperCase(); Precio29 = result.get(i).getPrecio();codigo29 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion30= result.get(i).getDescripcion1().toUpperCase(); descripcion2_30 = result.get(i).getDescripcion2().toUpperCase(); Precio30 = result.get(i).getPrecio();codigo30 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion31 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_31 = result.get(i).getDescripcion2().toUpperCase(); Precio31 = result.get(i).getPrecio();codigo31 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion32 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_32 = result.get(i).getDescripcion2().toUpperCase(); Precio32 = result.get(i).getPrecio();codigo32 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion33 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_33 = result.get(i).getDescripcion2().toUpperCase(); Precio33 = result.get(i).getPrecio();codigo33 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion34 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_34 = result.get(i).getDescripcion2().toUpperCase(); Precio34 = result.get(i).getPrecio();codigo34 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion35 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_35 = result.get(i).getDescripcion2().toUpperCase(); Precio35 = result.get(i).getPrecio();codigo35 = result.get(i).getCodigo();
            }
            else if (0== codigo){
            descripcion36 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_36 = result.get(i).getDescripcion2().toUpperCase(); Precio36 = result.get(i).getPrecio();codigo36 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion37 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_37 = result.get(i).getDescripcion2().toUpperCase(); Precio37 = result.get(i).getPrecio();codigo37 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion38 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_38 = result.get(i).getDescripcion2().toUpperCase(); Precio38 = result.get(i).getPrecio();codigo38 = result.get(i).getCodigo();
            }
            else if (0== codigo){
             descripcion39 = result.get(i).getDescripcion1().toUpperCase(); descripcion2_39 = result.get(i).getDescripcion2().toUpperCase(); Precio39 = result.get(i).getPrecio();codigo39 = result.get(i).getCodigo();
            }*/
            
        }
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound H1;
    private ClassAngels.PanelRound H10;
    private ClassAngels.PanelRound H11;
    private ClassAngels.PanelRound H12;
    private ClassAngels.PanelRound H13;
    private ClassAngels.PanelRound H14;
    private ClassAngels.PanelRound H15;
    private ClassAngels.PanelRound H16;
    private ClassAngels.PanelRound H17;
    private ClassAngels.PanelRound H18;
    private ClassAngels.PanelRound H19;
    private ClassAngels.PanelRound H2;
    private ClassAngels.PanelRound H20;
    private ClassAngels.PanelRound H21;
    private ClassAngels.PanelRound H22;
    private ClassAngels.PanelRound H23;
    private ClassAngels.PanelRound H24;
    private ClassAngels.PanelRound H25;
    private ClassAngels.PanelRound H26;
    private ClassAngels.PanelRound H27;
    private ClassAngels.PanelRound H28;
    private ClassAngels.PanelRound H29;
    private ClassAngels.PanelRound H3;
    private ClassAngels.PanelRound H30;
    private ClassAngels.PanelRound H31;
    private ClassAngels.PanelRound H32;
    private ClassAngels.PanelRound H33;
    private ClassAngels.PanelRound H34;
    private ClassAngels.PanelRound H35;
    private ClassAngels.PanelRound H36;
    private ClassAngels.PanelRound H37;
    private ClassAngels.PanelRound H38;
    private ClassAngels.PanelRound H39;
    private ClassAngels.PanelRound H4;
    private ClassAngels.PanelRound H5;
    private ClassAngels.PanelRound H6;
    private ClassAngels.PanelRound H7;
    private ClassAngels.PanelRound H8;
    private ClassAngels.PanelRound H9;
    private javax.swing.JLabel LH1;
    private javax.swing.JLabel LH10;
    private javax.swing.JLabel LH11;
    private javax.swing.JLabel LH12;
    private javax.swing.JLabel LH13;
    private javax.swing.JLabel LH14;
    private javax.swing.JLabel LH15;
    private javax.swing.JLabel LH16;
    private javax.swing.JLabel LH17;
    private javax.swing.JLabel LH18;
    private javax.swing.JLabel LH19;
    private javax.swing.JLabel LH2;
    private javax.swing.JLabel LH20;
    private javax.swing.JLabel LH21;
    private javax.swing.JLabel LH22;
    private javax.swing.JLabel LH23;
    private javax.swing.JLabel LH24;
    private javax.swing.JLabel LH25;
    private javax.swing.JLabel LH26;
    private javax.swing.JLabel LH27;
    private javax.swing.JLabel LH28;
    private javax.swing.JLabel LH29;
    private javax.swing.JLabel LH3;
    private javax.swing.JLabel LH30;
    private javax.swing.JLabel LH31;
    private javax.swing.JLabel LH32;
    private javax.swing.JLabel LH33;
    private javax.swing.JLabel LH34;
    private javax.swing.JLabel LH35;
    private javax.swing.JLabel LH36;
    private javax.swing.JLabel LH37;
    private javax.swing.JLabel LH38;
    private javax.swing.JLabel LH39;
    private javax.swing.JLabel LH4;
    private javax.swing.JLabel LH5;
    private javax.swing.JLabel LH6;
    private javax.swing.JLabel LH7;
    private javax.swing.JLabel LH8;
    private javax.swing.JLabel LH9;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
 private void Etiquetas() {
        String texto1 = "<html><center><body>"+descripcion1+"<br>"+descripcion2_1+"<br><font color='RED'>Q"+Precio1+"</font></body></center></html>";
        LH1.setText(texto1);
        String texto2 ="<html><center><body>"+descripcion2+"<br>"+descripcion2_2+"<br><font color='RED'>Q"+Precio2+"</font></body></center></html>";
        LH2.setText(texto2);
        String texto3 ="<html><center><body>"+descripcion3+"<br>"+descripcion2_3+"<br><font color='RED'>Q"+Precio3+"</font></body></center></html>";
        LH3.setText(texto3);
        String texto4 ="<html><center><body>"+descripcion4+"<br>"+descripcion2_4+"<br><font color='RED'>Q"+Precio4+"</font></body></center></html>";
        LH4.setText(texto4);
        String texto5 ="<html><center><body>"+descripcion5+"<br>"+descripcion2_5+"<br><font color='RED'>Q"+Precio5+"</font></body></center></html>";
        LH5.setText(texto5);
        String texto6 ="<html><center><body>"+descripcion6+"<br>"+descripcion2_6+"<br><font color='RED'>Q"+Precio6+"</font></body></center></html>";
        LH6.setText(texto6);
        String texto7 ="<html><center><body>"+descripcion7+"<br>"+descripcion2_7+"<br><font color='RED'>Q"+Precio7+"</font></body></center></html>";
        LH7.setText(texto7);
        String texto8 ="<html><center><body>"+descripcion8+"<br>"+descripcion2_8+"<br><font color='RED'>Q"+Precio8+"</font></body></center></html>";
        LH8.setText(texto8);
        String texto9 ="<html><center><body>"+descripcion9+"<br>"+descripcion2_9+"<br><font color='RED'>Q"+Precio9+"</font></body></center></html>";
        LH9.setText(texto9);
        String texto10 ="<html><center><body>"+descripcion10+"<br>"+descripcion2_10+"<br><font color='RED'>Q"+Precio10+"</font></body></center></html>";
        LH10.setText(texto10);
        String texto11 ="<html><center><body>"+descripcion11+"<br>"+descripcion2_11+"<br><font color='RED'>Q"+Precio11+"</font></body></center></html>";
        LH11.setText(texto11);
        String texto12 ="<html><center><body>"+descripcion12+"<br>"+descripcion2_12+"<br><font color='RED'>Q"+Precio12+"</font></body></center></html>";
        LH12.setText(texto12);
        String texto13 ="<html><center><body>"+descripcion13+"<br>"+descripcion2_13+"<br><font color='RED'>Q"+Precio13+"</font></body></center></html>";
        LH13.setText(texto13);
        String texto14 ="<html><center><body>"+descripcion14+"<br>"+descripcion2_14+"<br><font color='RED'>Q"+Precio14+"</font></body></center></html>";
        LH14.setText(texto14);
        String texto15 ="<html><center><body>"+descripcion15+"<br>"+descripcion2_15+"<br><font color='RED'>Q"+Precio15+"</font></body></center></html>";
        LH15.setText(texto15);
        String texto16 ="<html><center><body>"+descripcion16+"<br>"+descripcion2_16+"<br><font color='RED'>Q"+Precio16+"</font></body></center></html>";
        LH16.setText(texto16);
        String texto17 ="<html><center><body>"+descripcion17+"<br>"+descripcion2_17+"<br><font color='RED'>Q"+Precio17+"</font></body></center></html>";
        LH17.setText(texto17);
        String texto18 ="<html><center><body>"+descripcion18+"<br>"+descripcion2_18+"<br><font color='RED'>Q"+Precio18+"</font></body></center></html>";
        LH18.setText(texto18);
        String texto19 ="<html><center><body>"+descripcion19+"<br>"+descripcion2_19+"<br><font color='RED'>Q"+Precio19+"</font></body></center></html>";
        LH19.setText(texto19);
        String texto20 ="<html><center><body>"+descripcion20+"<br>"+descripcion2_20+"<br><font color='RED'>Q"+Precio20+"</font></body></center></html>";
        LH20.setText(texto20);
        String texto21 ="<html><center><body>"+descripcion21+"<br>"+descripcion2_21+"<br><font color='RED'>Q"+Precio21+"</font></body></center></html>";
        LH21.setText(texto21);
        String texto22 ="<html><center><body>"+descripcion22+"<br>"+descripcion2_22+"<br><font color='RED'>Q"+Precio22+"</font></body></center></html>";
        LH22.setText(texto22);
        /*String texto23 ="<html><center><body>"+descripcion23+"<br>"+descripcion2_23+"<br><font color='RED'>Q"+Precio23+"</font></body></center></html>";
        LH23.setText(texto23);
        String texto24 ="<html><center><body>"+descripcion24+"<br>"+descripcion2_24+"<br><font color='RED'>Q"+Precio24+"</font></body></center></html>";
        LH24.setText(texto24);
        String texto25 ="<html><center><body>"+descripcion25+"<br>"+descripcion2_25+"<br><font color='RED'>Q"+Precio25+"</font></body></center></html>";
        LH25.setText(texto25);
        String texto26 ="<html><center><body>"+descripcion26+"<br>"+descripcion2_26+"<br><font color='RED'>Q"+Precio26+"</font></body></center></html>";
        LH26.setText(texto26);
        String texto27 ="<html><center><body>"+descripcion27+"<br>"+descripcion2_27+"<br><font color='RED'>Q"+Precio27+"</font></body></center></html>";
        LH27.setText(texto27);
        String texto28 ="<html><center><body>"+descripcion28+"<br>"+descripcion2_28+"<br><font color='RED'>Q"+Precio28+"</font></body></center></html>";
        LH28.setText(texto28);
        String texto29 ="<html><center><body>"+descripcion29+"<br>"+descripcion2_29+"<br><font color='RED'>Q"+Precio29+"</font></body></center></html>";
        LH29.setText(texto29);
        String texto30 ="<html><center><body>"+descripcion30+"<br>"+descripcion2_30+"<br><font color='RED'>Q"+Precio30+"</font></body></center></html>";
        LH30.setText(texto30);
        String texto31 ="<html><center><body>"+descripcion31+"<br>"+descripcion2_31+"<br><font color='RED'>Q"+Precio31+"</font></body></center></html>";
        LH31.setText(texto31);
        String texto32 ="<html><center><body>"+descripcion32+"<br>"+descripcion2_32+"<br><font color='RED'>Q"+Precio32+"</font></body></center></html>";
        LH32.setText(texto32);
        String texto33 ="<html><center><body>"+descripcion33+"<br>"+descripcion2_33+"<br><font color='RED'>Q"+Precio33+"</font></body></center></html>";
        LH33.setText(texto33);
        String texto34 ="<html><center><body>"+descripcion34+"<br>"+descripcion2_34+"<br><font color='RED'>Q"+Precio34+"</font></body></center></html>";
        LH34.setText(texto34);
        String texto35 ="<html><center><body>"+descripcion35+"<br>"+descripcion2_35+"<br><font color='RED'>Q"+Precio35+"</font></body></center></html>";
        LH35.setText(texto35);
        String texto36 ="<html><center><body>"+descripcion36+"<br>"+descripcion2_36+"<br><font color='RED'>Q"+Precio36+"</font></body></center></html>";
        LH36.setText(texto36);
        String texto37 ="<html><center><body>"+descripcion37+"<br>"+descripcion2_37+"<br><font color='RED'>Q"+Precio37+"</font></body></center></html>";
        LH37.setText(texto37);
        String texto38="<html><center><body>"+descripcion38+"<br>"+descripcion2_38+"<br><font color='RED'>Q"+Precio38+"</font></body></center></html>";
        LH38.setText(texto38);
        String texto39 ="<html><center><body>"+descripcion39+"<br>"+descripcion2_39+"<br><font color='RED'>Q"+Precio39+"</font></body></center></html>";
        LH39.setText(texto39);*/
        
    }
}

