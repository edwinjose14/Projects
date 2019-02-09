
package JFrame;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ventanaTradicionales = new javax.swing.JMenuItem();
        ventanaEspeciales = new javax.swing.JMenuItem();
        ventanaSorpresa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jDesktopPane1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 810, 480);

        jMenu1.setText("Tipo de Pasteles");

        ventanaTradicionales.setText("Pasteles Tradicionales");
        ventanaTradicionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaTradicionalesActionPerformed(evt);
            }
        });
        jMenu1.add(ventanaTradicionales);

        ventanaEspeciales.setText("Pasteles Especiales");
        ventanaEspeciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaEspecialesActionPerformed(evt);
            }
        });
        jMenu1.add(ventanaEspeciales);

        ventanaSorpresa.setText("Pasteles Sorpresa");
        ventanaSorpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaSorpresaActionPerformed(evt);
            }
        });
        jMenu1.add(ventanaSorpresa);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inventario");

        jMenuItem4.setText("Conclusiones");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(822, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ventanaTradicionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaTradicionalesActionPerformed
 
        Tradicionales ventanaT =new Tradicionales();
        jDesktopPane1.add(ventanaT);
        ventanaT.setVisible(true);
    }//GEN-LAST:event_ventanaTradicionalesActionPerformed

    private void ventanaEspecialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaEspecialesActionPerformed
        Especiales ventanaE =new Especiales();
        jDesktopPane1.add(ventanaE);
        ventanaE.setVisible(true);
    }//GEN-LAST:event_ventanaEspecialesActionPerformed

    private void ventanaSorpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaSorpresaActionPerformed
        Sorpresa ventanaS = new Sorpresa();
        jDesktopPane1.add(ventanaS);
        ventanaS.setVisible(true);
    }//GEN-LAST:event_ventanaSorpresaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Propietario ventanaP = new Propietario();
        jDesktopPane1.add(ventanaP);
        ventanaP.setVisible(true);        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem ventanaEspeciales;
    private javax.swing.JMenuItem ventanaSorpresa;
    private javax.swing.JMenuItem ventanaTradicionales;
    // End of variables declaration//GEN-END:variables
}
