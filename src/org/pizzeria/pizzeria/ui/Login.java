/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizzeria.pizzeria.ui;

/**
 *
 * @author Gonzalo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        this.setTitle ("Login de Usuarios");
        this.setLocation(600,200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        log_usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        log_pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        tipo_usuario = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ugis.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 190));

        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        log_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_usuarioActionPerformed(evt);
            }
        });
        log_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                log_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(log_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 137, -1));

        jLabel3.setText("Clave");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        log_pass.setText("jPasswordField1");
        getContentPane().add(log_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 137, -1));

        jLabel4.setText("Acceso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        tipo_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recepción", "Cocina", "Cliente", "Encargado", " " }));
        tipo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tipo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetActionPerformed

    private void log_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_log_usuarioActionPerformed

    private void tipo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_usuarioActionPerformed

    private void log_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_log_usuarioKeyTyped
        char c = evt.getKeyChar();
if ((c<'a'||c>'z') && (c<'A'||c>'Z')&&(c<' '||c>' '))evt.consume();
    }//GEN-LAST:event_log_usuarioKeyTyped

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        String cadena2,cadena3,cadena4;
        
        cadena2 = log_usuario.getText();
        cadena3 = log_pass.getText().toString();
        cadena4 = tipo_usuario.getSelectedItem().toString();
        
                if (log_usuario.getText().equals("") || (log_pass.getText().equals("")) || (tipo_usuario.getSelectedItem().equals(null))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            log_usuario.requestFocus();
        }


    }//GEN-LAST:event_btn_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField log_pass;
    private javax.swing.JTextField log_usuario;
    private javax.swing.JComboBox<String> tipo_usuario;
    // End of variables declaration//GEN-END:variables
}
