/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package primer;

/**
 *
 * @author alela
 */
public class Primera extends javax.swing.JFrame {

    /**
     * Creates new form Primera
     */
    public Primera() {
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

        label1 = new java.awt.Label();
        etiqueta = new javax.swing.JLabel();
        botonPrimer = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        label1.setBackground(new java.awt.Color(255, 153, 255));
        label1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        label1.setMinimumSize(new java.awt.Dimension(400, 300));
        label1.setText("Primera etiqueta");
        getContentPane().add(label1);
        label1.setBounds(0, 0, 210, 60);

        etiqueta.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        etiqueta.setText("Esta es la etiqueta");
        etiqueta.setBorder(javax.swing.BorderFactory.createTitledBorder("etiqueta"));
        etiqueta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(etiqueta);
        etiqueta.setBounds(10, 130, 200, 70);

        botonPrimer.setBackground(new java.awt.Color(240, 129, 114));
        botonPrimer.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        botonPrimer.setLabel("Primer boton");
        botonPrimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPrimerMouseClicked(evt);
            }
        });
        botonPrimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPrimerActionPerformed(evt);
            }
        });
        getContentPane().add(botonPrimer);
        botonPrimer.setBounds(230, 150, 150, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPrimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPrimerMouseClicked
        etiqueta.setText("Cambio de texto");
    }//GEN-LAST:event_botonPrimerMouseClicked

    private void botonPrimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPrimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPrimerActionPerformed

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
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Primera().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botonPrimer;
    private javax.swing.JLabel etiqueta;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
