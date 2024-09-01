/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Modelo;

import Logica.Cliente;
import Logica.ClienteDAO;
import Logica.Conexion;
import Logica.RegistrarDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar Rojas
 */
public class Registrar extends javax.swing.JFrame {

    Cliente r = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    Conexion c;
     Interfaz1 login;


    public Registrar() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnombre1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/MONOCROMATICO_1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 280, 40));

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Carnet :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtid.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 40));

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("APELLIDOS : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 267, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CORREO ELECTRONICO : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 337, -1, 30));

        txtapellido.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 40));

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("TELEFONO/CELULAR : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 397, -1, 30));

        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 40));

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CREAR UNA CONTRASEÑA :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 457, -1, 30));

        txttelefono.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, 40));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("REGISTRAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 190, 40));

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NOMBRES : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 197, -1, 30));

        txtnombre1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtnombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        registrar();
        Interfaz();
    }//GEN-LAST:event_jButton3ActionPerformed
  /*  void Registrar() {

        try {
            Connection con = new Conexion().conectarPG();
            PreparedStatement ps = con.prepareStatement("INSERT INTO cliente (id ,nombre, apellido,telefono, correo, contraseña) values (?,?,?,?,?,?)");
//            String sql = txtNombres.getText() + "insert into cliente (nombre,apellido,correo,telefono,contraseña)"
//                    + "values(" + "," + txtApellidos.getText() + "," + txtCorreo.getText() + " ," + txtTelefono.getText() + "," + txtContraseña.getText() + ")";
            int id = Integer.valueOf(txtid.getText());
            int telefono = Integer.valueOf(txttelefono.getText());
            System.out.println(id);
            ps.setInt(1, id);
            ps.setString(2, txtnombre1.getText());
            ps.setString(3, txtapellido.getText());
            ps.setInt(4, telefono);
            ps.setString(5, txtcorreo.getText());
            ps.setString(6, txtcontraseña.getText());
            ps.execute();
            ps.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Se Registro Con Exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/

    void limpiar() {
        txtid.setText("");
        txtnombre1.setText("");
        txtapellido.setText("");
        txtcorreo.setText("");
        txttelefono.setText("");
        txtcontraseña.setText("");

    }

    void Interfaz() {
        Interfaz1 i = new Interfaz1();
        i.setVisible(true);
        this.setVisible(false);
    }
        
    void registrar(){
        Cliente r = new Cliente();
        
        r.setId(Integer.parseInt(txtid.getText()));
        r.setNombres(txtnombre1.getText());
        r.setApellidos(txtapellido.getText());
        r.setTelefono(Integer.parseInt(txttelefono.getText()));
        r.setCorreo(txtcorreo.getText());
        r.setContraseña(txtcontraseña.getText());
        r.insertarCliente();
    }
    
    void volverALogin(){
              if(this.isVisible()){
        login = new Interfaz1();
            this.setVisible(false);
        }
    }


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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre1;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}