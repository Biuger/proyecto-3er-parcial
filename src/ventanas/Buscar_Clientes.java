/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Buscar_Clientes extends javax.swing.JFrame {
    
    /**
     * Creates new form Registrar_Clientes
     */
    
    public Buscar_Clientes() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnbuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edadEncontrada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idEncontrado = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        telefonoEncontrado = new javax.swing.JLabel();
        nombreEncontrado = new javax.swing.JLabel();
        correoEncontrado = new javax.swing.JLabel();
        Fondo_aplicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton1.setText("Menu principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 160, 60));

        jButton2.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jButton2.setText("Salir ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 130, 60));

        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 350, 30));

        jLabel1.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Busqueda de clientes por nombre ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lato", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del cliente a buscar: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnbuscar.setFont(new java.awt.Font("Lato", 1, 24)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Telefono:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        edadEncontrada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        edadEncontrada.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(edadEncontrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        idEncontrado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        idEncontrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(idEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        telefonoEncontrado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        telefonoEncontrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(telefonoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        nombreEncontrado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombreEncontrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nombreEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        correoEncontrado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        correoEncontrado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(correoEncontrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        Fondo_aplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wallpaper-4655085.png"))); // NOI18N
        getContentPane().add(Fondo_aplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
Interfaz principal = new Interfaz();
principal.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        boolean encontrado = false;
        String nombreEncontradoString = txtbuscar.getText();
        for (Cliente c: controlClientes.clientes) {
            if (c.getNombre().equals(nombreEncontradoString)) {
                idEncontrado.setText(c.getId());
                nombreEncontrado.setText(c.getNombre());        
                correoEncontrado.setText(c.getCorreo());
                edadEncontrada.setText(""+c.getEdad());
                telefonoEncontrado.setText(""+c.getTelefono());
                encontrado = true;
            }
        }
        if (encontrado==false) {
            JOptionPane.showMessageDialog(rootPane, "Busqueda finalizada, sin resultados");    
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo_aplicacion;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel correoEncontrado;
    private javax.swing.JLabel edadEncontrada;
    private javax.swing.JLabel idEncontrado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nombreEncontrado;
    private javax.swing.JLabel telefonoEncontrado;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
