/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package angels;
import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author jluis
 */
public class Tiket {
    
    
    
    public static void main(String[] args) throws IOException { 
    
    String subTotal = "";
    String total= "";
    String dineroR= "";
    String devolucion= "";
    //JTable jtbl_venta); 

    
    PrinterMatrix printer = new PrinterMatrix();
    Extenso e = new Extenso();
    
    e.setNumber(20.30);
    
    //Definir el tamanho del papel para la impresion de dinamico y 32 columnas
    int filas = 10;
    int tamaño = filas+40;
    printer.setOutSize(tamaño, 80);
        System.out.println("ENTRA");
    //Imprimir = 1ra linea de la columa de 1 a 32
    printer.printTextWrap(0, 1, 5, 80, "===================================================================");
    printer.printTextWrap(1, 1, 35, 80, "CARNIVOROS"); //Nombre establecimiento
    printer.printTextWrap(3, 1, 31, 80, "Barrio Bellavista"); //Barrio
    printer.printTextWrap(4, 1, 37, 80, "Clle 47"); //Direccion
    printer.printTextWrap(5, 1, 38, 80, "12345"); //Codigo Postal
    printer.printTextWrap(6, 1, 10, 41, "Fecha"); //Aqui va la fecha de recibo
    printer.printTextWrap(6, 1, 38, 80, "Hora"); //Aqui va la hora de recibo
    printer.printTextWrap(7, 1, 3, 80, "Numero"); //Numero del recibo - FACTURA O PEDIDO
    printer.printTextWrap(8, 1, 3, 80, "Atiende"); //Nombre Cajero
    printer.printTextWrap(9, 1, 3, 80, "Cliente");//Nombre del Cliente
    printer.printTextWrap(10,1, 5, 80, "——————————–——————————–——————————–——————————–——–———–——–—–———–——–———");
    printer.printTextWrap(11,1, 7, 80, "ID   DESCRIPCION                        CANT           PRECIO");
    printer.printTextWrap(12,1, 0, 80, " ");

    /*for (int i = 0; i < filas; i++) {
        //int p = 13+i; //Fila

       /* printer.printTextWrap(p , 1, 7, 19 , jtbl_venta.getValueAt(i,0).toString());
        printer.printTextWrap(p , 1, 12, 42 , jtbl_venta.getValueAt(i,1).toString());
        printer.printTextWrap(p , 1, 47, 49, jtbl_venta.getValueAt(i,2).toString());

        String pre= printer.alinharADireita(10, jtbl_venta.getValueAt(i,3).toString());
        printer.printTextWrap(p , 1, 57, 80, pre);

        //String inp= printer.alinharADireita(7,punto_Venta.jtbl_venta.getValueAt(i,6).toString());
        //printer.printTextWrap(p , 1, 25, 32, inp);
    }
    DecimalFormat formateador = new DecimalFormat("#.###");*/
    
    String sub= printer.alinharADireita(10, subTotal);
    printer.printTextWrap(filas+17, 1, 5, 80, "Subtotal: ");
    printer.printTextWrap(filas+17, 1, 20, 80, "$"+sub);

    String tot= printer.alinharADireita(10, total);
    printer.printTextWrap(filas+18, 1, 5, 80, "Total a pagar: ");
    printer.printTextWrap(filas+18, 1, 20, 80, "$"+tot);

    String efe= printer.alinharADireita(10,dineroR);
    printer.printTextWrap(filas+19, 1, 5, 80, "Efectivo : ");
    printer.printTextWrap(filas+19, 1, 20, 80, "$"+efe);

    String cam= printer.alinharADireita(10,devolucion);
    printer.printTextWrap(filas+20, 1, 5, 80, "Cambio : ");
    printer.printTextWrap(filas+20, 1, 20, 80, "$"+ cam);

    printer.printTextWrap(filas+21, 1, 5, 80, "——————————–——————————–——————————–——————————–——–———–——–—–———–——–———");
    printer.printTextWrap(filas+22, 1, 26,80, "!Gracias por su preferencia!");
    printer.printTextWrap(filas+23, 1, 30, 80, "WorkIt App - v1.0.0");
    printer.printTextWrap(filas+24, 1, 31, 80, "Software a Medida");
    printer.printTextWrap(filas+25, 1, 25, 80, "Contacto: workitapp@gmail.com");
    printer.printTextWrap(filas+26, 1, 5,80, "===================================================================");


    ///CREAR ARCHIVO EN CARPETA DEL PROYECTO PARA PEDIDOS
    printer.toFile("C:\\tmp\\impresion.txt");
    FileInputStream inputStream = null;

    try {
        inputStream = new FileInputStream("C:\\tmp\\impresion.txt");
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar");
    }
    if (inputStream == null) {
        return;
    }
    
    
    DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
    Doc document = new SimpleDoc(inputStream, docFormat, null);
    PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();
    PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

    if (defaultPrintService != null) {
        DocPrintJob printJob = defaultPrintService.createPrintJob();
        try {
            printJob.print(document, attributeSet);
        } catch (PrintException ex) {
            System.out.println("angels.Tiket.main()"+ex);
        }
    } else {
        System.err.println("No existen impresoras instaladas");
    }
   // inputStream.close();
    //imprimirFin(subTotal, total, dineroR, devolucion); //ESTE METODO NO SE UTILIZARA
    }
}

      
