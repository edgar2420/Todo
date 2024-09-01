/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modelo;

import Logica.Controlador;
import Logica.Producto;
import Logica.ProductoDAO;
import static Modelo.Carrito.TablaDetalle;
import static Modelo.Carrito.txtTotalaPagar;
import static Modelo.Interfaz1.txtUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PollosChuy extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    ProductoDAO dao = new ProductoDAO();
    Producto p = new Producto();
    
    int cant;
    double pre;
    double tpagar;
    int item;
    
    Controlador controlbase = new Controlador();
    
    public PollosChuy() {
        initComponents();
        setLocation(150, 150);
        //this.setLocationRelativeTo(null);
        listarProducto();
    }
    
    String [] botones = {"SI", "NO"};
    
    void listarProducto() {
        modelo = (DefaultTableModel) TablaComida.getModel();
        List<Producto> lista = dao.listarProducto2();
        Object[] object = new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getN_restaurante();
            object[2] = lista.get(i).getPrecio();
            object[3] = lista.get(i).getNombre();
            object[4] = lista.get(i).getTipo();
            modelo.addRow(object);
        }
        TablaComida.setModel(modelo);
    }
    
    void calculatTotal() {
        tpagar = 0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            pre = Double.parseDouble(TablaDetalle.getValueAt(i, 2).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 5).toString());
            tpagar = tpagar + (cant * pre);
        }
        txtTotalaPagar.setText("" + tpagar + "0");
    }
    
    void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) TablaDetalle.getModel();
        modelo.setRowCount(0);
        txtTotalaPagar.setText("");
    }
    
    void nuevo(){
        txtID.setText("");
        txtRestaurante.setText("");
        txtPrecio.setText("");
        txtNombre.setText("");
        txtTipo.setText("");
        txtCantidad.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaComida = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtRestaurante = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/entrega1.png"))); // NOI18N
        jButton1.setText("PEDIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        TablaComida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Restaurante", "Precio", "Nombre", "Tipo"
            }
        ));
        TablaComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaComidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaComida);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 500, 130));

        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 280, -1));

        txtRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 280, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtTipo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 280, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Restaurante");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 280, -1));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 70, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = JOptionPane.showOptionDialog(this, "Su pedido actual se cancelara, ¿Esta seguro/a?", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        if (i == 0) {
            limpiarTabla();
        IniciarSesionCliente po = new IniciarSesionCliente();
        po.setVisible(true);
        this.setVisible(false);
        
        IniciarSesionCliente.labeldni.setText(controlbase.DevolverDatosSql("select nombre from cliente where correo ='"+txtUser.getText()+"'", 1));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TablaComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComidaMouseClicked
       int fila = TablaComida.getSelectedRow();
        if (fila >= 0) {
            String id = TablaComida.getValueAt(fila, 0).toString();
            String restaurante = TablaComida.getValueAt(fila, 1).toString();
            String precio = TablaComida.getValueAt(fila, 2).toString();
            String nombre = TablaComida.getValueAt(fila, 3).toString();
            String tipo = TablaComida.getValueAt(fila, 4).toString();
            
            txtID.setText(id);
            txtRestaurante.setText(restaurante);
            txtPrecio.setText(precio);
            txtNombre.setText(nombre);
            txtTipo.setText(tipo);
            
        }
    }//GEN-LAST:event_TablaComidaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       modelo = (DefaultTableModel) TablaDetalle.getModel();
       
       String id = txtID.getText();
        String rest = txtRestaurante.getText();
        String pre = txtPrecio.getText();
        String nomb = txtNombre.getText();
        String tip = txtTipo.getText();
        String cant = txtCantidad.getText();
        ArrayList lista = new ArrayList();
       
            lista.add(id);
            lista.add(rest);
            lista.add(pre);
            lista.add(nomb);
            lista.add(tip);
            lista.add(cant);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            
            modelo.addRow(ob);

        Carrito.TablaDetalle.setModel(modelo);
        calculatTotal();
        nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PollosChuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollosChuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollosChuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollosChuy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollosChuy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaComida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRestaurante;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
