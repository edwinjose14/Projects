
package JFrame;

import TiendaPasteles.Pasteles;
import TiendaPasteles.PastelesEspeciales;
import TiendaPasteles.PastelesSorpresa;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Sorpresa extends javax.swing.JInternalFrame {

    public Sorpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tMasa = new javax.swing.JTextField();
        tSabor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tHarina = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tPorciones = new javax.swing.JTextField();
        tSorpresa = new javax.swing.JTextField();
        botonAtras = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PASTELES SORPRESA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 220, 32);

        jLabel3.setText("MASA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 60, 14);

        jLabel4.setText("SABOR:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 60, 14);

        tMasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tMasaKeyTyped(evt);
            }
        });
        getContentPane().add(tMasa);
        tMasa.setBounds(110, 80, 140, 20);
        getContentPane().add(tSabor);
        tSabor.setBounds(110, 110, 140, 20);

        jLabel5.setText("HARINA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 60, 14);
        getContentPane().add(tHarina);
        tHarina.setBounds(110, 140, 140, 20);

        jLabel6.setText("DIRECCION DE ENVIO: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 160, 14);
        getContentPane().add(tDireccion);
        tDireccion.setBounds(160, 170, 90, 20);

        jLabel7.setText("NUMERO DE PORCIONES");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 250, 130, 14);

        jLabel8.setText("CONTENIDO SORPRESA:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 280, 150, 14);

        tPorciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPorcionesKeyTyped(evt);
            }
        });
        getContentPane().add(tPorciones);
        tPorciones.setBounds(160, 250, 90, 20);
        getContentPane().add(tSorpresa);
        tSorpresa.setBounds(30, 300, 230, 40);

        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras);
        botonAtras.setBounds(30, 360, 100, 40);

        botonRegistrar.setText("REGISTRAR");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(150, 360, 100, 40);

        jLabel10.setText("TIPO DE PASTEL:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 210, 100, 14);

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECC", "FRIA", "NORMAL" }));
        tipo.setToolTipText("");
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo);
        tipo.setBounds(160, 210, 90, 20);

        setBounds(0, 0, 308, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void tMasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMasaKeyTyped
        validar(evt);
    }//GEN-LAST:event_tMasaKeyTyped

    private void tPorcionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPorcionesKeyTyped
       validar(evt);
    }//GEN-LAST:event_tPorcionesKeyTyped

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
       registrar();
    }//GEN-LAST:event_botonRegistrarActionPerformed

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

            if(tSorpresa.getText().equals("")) limpio=true;
            if(tPorciones.getText().equals("")) limpio=true;
            if(tSabor.getText().equals("")) limpio=true;
            if(tHarina.getText().equals("")) limpio=true;
            if(tDireccion.getText().equals("")) limpio=true;
            if(tipo.getSelectedItem().equals("SELECC")) limpio=true;
            
            if (limpio){
                JOptionPane.showMessageDialog(null, "Faltan Campos");
                return;
            }
            //******************************
            Pasteles pastel;
                        
            double costo = Auxiliar.costos(tMasa.getText())+15000;
            double precioVenta=Auxiliar.venta(costo, 3);
            double utilidad = precioVenta-costo;
            
            pastel = new PastelesSorpresa(tSorpresa.getText(),Integer.parseInt(tPorciones.getText()), Integer.parseInt(tMasa.getText()), tSabor.getText(),tHarina.getText(),"", tDireccion.getText(), costo, precioVenta, utilidad);
            Auxiliar.proceso(pastel);
            
            JOptionPane.showMessageDialog(null, "Pastel Registrado");
            tSorpresa.setText("");
            tPorciones.setText("");
            tMasa.setText("");
            tSabor.setText("");
            tHarina.setText("");      
            tDireccion.setText(""); 
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tHarina;
    private javax.swing.JTextField tMasa;
    private javax.swing.JTextField tPorciones;
    private javax.swing.JTextField tSabor;
    private javax.swing.JTextField tSorpresa;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
