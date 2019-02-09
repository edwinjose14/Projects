
package JFrame;

import TiendaPasteles.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Especiales extends javax.swing.JInternalFrame {

    public Especiales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tDecoracion = new javax.swing.JTextField();
        tMasa = new javax.swing.JTextField();
        tSabor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tHarina = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tPisos = new javax.swing.JTextField();
        tColor = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PASTELES ESPECIALES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 220, 32);

        jLabel2.setText("DECORACION: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 290, 80, 14);

        jLabel3.setText("MASA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 60, 14);

        jLabel4.setText("SABOR:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 60, 14);
        getContentPane().add(tDecoracion);
        tDecoracion.setBounds(110, 290, 140, 20);

        tMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMasaActionPerformed(evt);
            }
        });
        tMasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tMasaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMasaKeyTyped(evt);
            }
        });
        getContentPane().add(tMasa);
        tMasa.setBounds(110, 80, 140, 20);

        tSabor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tSaborKeyTyped(evt);
            }
        });
        getContentPane().add(tSabor);
        tSabor.setBounds(110, 110, 140, 20);

        jLabel5.setText("HARINA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 60, 14);
        getContentPane().add(tHarina);
        tHarina.setBounds(110, 140, 140, 20);
        getContentPane().add(tDireccion);
        tDireccion.setBounds(160, 200, 90, 20);

        jLabel7.setText("NUMERO DE PISO:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 230, 130, 14);

        jLabel8.setText("COLOR:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 260, 80, 14);

        tPisos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPisosKeyTyped(evt);
            }
        });
        getContentPane().add(tPisos);
        tPisos.setBounds(160, 230, 90, 20);
        getContentPane().add(tColor);
        tColor.setBounds(110, 260, 140, 20);

        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras);
        botonAtras.setBounds(30, 330, 100, 40);

        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(150, 330, 100, 40);

        jLabel9.setText("DIRECCION DE ENVIO: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 200, 160, 14);

        jLabel10.setText("TIPO DE PASTEL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 170, 100, 14);

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECC", "FRIA", "NORMAL" }));
        tipo.setToolTipText("");
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo);
        tipo.setBounds(160, 170, 90, 20);

        setBounds(0, 0, 311, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void tMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMasaActionPerformed

    }//GEN-LAST:event_tMasaActionPerformed

    private void tMasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMasaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMasaKeyPressed

    private void tMasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMasaKeyTyped
       validar(evt);
    }//GEN-LAST:event_tMasaKeyTyped

    private void tPisosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPisosKeyTyped
        validar(evt);
    }//GEN-LAST:event_tPisosKeyTyped

    private void tSaborKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tSaborKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tSaborKeyTyped
    
    public void validar(KeyEvent evt){
        
        char validar=evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null,"Digitar Solo Numeros");
        
        }
        
    }
    public void registrar(){
               boolean limpio=false;
        try {
 
            if(tPisos.getText().equals("")) limpio=true;
            if(tColor.getText().equals("")) limpio=true;
            if(tDecoracion.getText().equals("")) limpio=true;
            if(tSabor.getText().equals("")) limpio=true;
            if(tHarina.getText().equals("")) limpio=true;
            if(tDireccion.getText().equals("")) limpio=true;
            if(tipo.getSelectedItem().equals("SELECC")) limpio=true;
            
            if (limpio){
                JOptionPane.showMessageDialog(null, "Faltan Campos");
                return;
            }
            
            Pasteles pastel;
            double costo = Auxiliar.costos(tMasa.getText());
            double precioVenta=Auxiliar.venta(costo, 2);
            double utilidad = precioVenta-costo;
            
            pastel = new PastelesEspeciales(Integer.parseInt(tPisos.getText()), tColor.getText(), tDecoracion.getText(), Integer.parseInt(tMasa.getText()), tSabor.getText(),tHarina.getText(),"", tDireccion.getText(), costo, precioVenta, utilidad);
            Auxiliar.proceso(pastel);
            
            
            JOptionPane.showMessageDialog(null, "Pastel Registrado");
            tPisos.setText("");
            tColor.setText("");
            tDecoracion.setText("");  
            tMasa.setText("");
            tSabor.setText("");
            tHarina.setText("");      
            tDireccion.setText(""); 
            tipo.setSelectedItem("SELECC");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tColor;
    private javax.swing.JTextField tDecoracion;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tHarina;
    private javax.swing.JTextField tMasa;
    private javax.swing.JTextField tPisos;
    private javax.swing.JTextField tSabor;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
