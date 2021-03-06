/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import calses1.Fraccion;
import calses1.NumeroMixto;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtNumeradorUno = new javax.swing.JTextField();
        txtDenominadorUno = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtNumeradorDos = new javax.swing.JTextField();
        txtDenominadorDos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeradorTres = new javax.swing.JTextField();
        txtDenominadorTres = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cmdMixto = new javax.swing.JButton();
        txtEntero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeradorMix = new javax.swing.JTextField();
        txtDenominadorMix = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("SOLUCIÓN FRACCIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        txtNumeradorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, -1));

        txtDenominadorUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar ", "Restar\t", "Multiplicar", "Dividir", "Conversion Mixto\t" }));
        cmbOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 20));

        txtNumeradorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeradorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeradorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, -1));

        txtDenominadorDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominadorDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominadorDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 20));

        txtNumeradorTres.setEditable(false);
        jPanel1.add(txtNumeradorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 70, -1));

        txtDenominadorTres.setEditable(false);
        jPanel1.add(txtDenominadorTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 70, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 70, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, 10));

        cmdMixto.setText("Convertir a Mixto");
        cmdMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txtEntero.setEditable(false);
        txtEntero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnteroActionPerformed(evt);
            }
        });
        jPanel1.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 40, 40));

        jLabel3.setText("Numero Mixto");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        txtNumeradorMix.setEditable(false);
        jPanel1.add(txtNumeradorMix, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 30, 30));

        txtDenominadorMix.setEditable(false);
        jPanel1.add(txtDenominadorMix, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 30, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 30, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int op,n1,n2,d1,d2;
     Fraccion f1,f2,f3 = null;
     
     if(txtNumeradorUno.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite numerador numero 1","Error", JOptionPane.ERROR_MESSAGE);
         txtNumeradorUno.requestFocusInWindow();
     }else if(txtDenominadorUno.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite denominador numero 1","Error", JOptionPane.ERROR_MESSAGE);
         txtDenominadorUno.requestFocusInWindow();
     }else if(txtNumeradorDos.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite numerador numero 2","Error", JOptionPane.ERROR_MESSAGE);
         txtNumeradorDos.requestFocusInWindow();
     }else if(txtDenominadorDos.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite denominador numero 2","Error",JOptionPane.ERROR_MESSAGE);
         txtDenominadorDos.requestFocusInWindow();
         
     }else{
         
     }
     op = cmbOperacion.getSelectedIndex();
     n1 = Integer.parseInt(txtNumeradorUno.getText());
     d1 = Integer.parseInt(txtDenominadorUno.getText());
     n2 = Integer.parseInt(txtNumeradorDos.getText());
     d2 = Integer.parseInt(txtDenominadorDos.getText());
     
     f1 = new Fraccion(n1, d1);
     f2 = new Fraccion(n2, d2);
     
     switch(op){
         case 0:
             f3 = f1.sumar(f2); 
             break;
         case 1:
             f3 = f1.resta(f2);
             break;
         case 2:
             f3 = f1.multiplicacion(f2);
             break;
         case 3:
             f3 = f1.division(f2);
             break;
     }
     txtNumeradorTres.setText(""+f3.getNumerador());
     txtDenominadorTres.setText(""+f3.getDenominador());
     
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmbOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionActionPerformed
       
    }//GEN-LAST:event_cmbOperacionActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtNumeradorUno.setText("");
       txtNumeradorDos.setText("");
       txtNumeradorTres.setText("");
       txtDenominadorUno.setText("");
       txtDenominadorDos.setText("");
       txtDenominadorTres.setText("");
       txtEntero.setText("");
       txtNumeradorMix.setText("");
       txtDenominadorMix.setText("");
       
       txtNumeradorUno.requestFocusInWindow();
       cmbOperacion.setSelectedIndex(0);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtNumeradorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorUnoKeyTyped
       char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
                   
    }//GEN-LAST:event_txtNumeradorUnoKeyTyped

    private void txtDenominadorUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorUnoKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
                      
    }//GEN-LAST:event_txtDenominadorUnoKeyTyped

    private void txtNumeradorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeradorDosKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
                      
    }//GEN-LAST:event_txtNumeradorDosKeyTyped

    private void txtDenominadorDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominadorDosKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              
              evt.consume(); 
                      
          } 
                    
    }//GEN-LAST:event_txtDenominadorDosKeyTyped

    private void txtEnteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnteroActionPerformed
       
    }//GEN-LAST:event_txtEnteroActionPerformed

    private void cmdMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMixtoActionPerformed
       NumeroMixto r1,r2,r3 = null;
       int entero,numerador,denominador;
       numerador = Integer.parseInt(txtNumeradorTres.getText());
       denominador = Integer.parseInt(txtDenominadorTres.getText());
       entero = numerador / denominador ;
       
       r1 = new NumeroMixto (numerador,denominador, entero);
       r3= r1.Numeromixto();
       txtDenominadorMix.setText(""+r3.getDenominador());
       txtNumeradorMix.setText(""+r3.getNumerador());
       txtEntero.setText(""+r3.getEntera());
    }//GEN-LAST:event_cmdMixtoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdMixto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominadorDos;
    private javax.swing.JTextField txtDenominadorMix;
    private javax.swing.JTextField txtDenominadorTres;
    private javax.swing.JTextField txtDenominadorUno;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNumeradorDos;
    private javax.swing.JTextField txtNumeradorMix;
    private javax.swing.JTextField txtNumeradorTres;
    private javax.swing.JTextField txtNumeradorUno;
    // End of variables declaration//GEN-END:variables
}
