
package JFrame;

public class Propietario extends javax.swing.JInternalFrame {


    public Propietario() {
        initComponents();
        asignar();
    }
    
    public void asignar(){
        totalPedidos.setText(String.valueOf(Auxiliar.total));
        totalEspeciales.setText(String.valueOf(Auxiliar.totalE));
        totalTradicional.setText(String.valueOf(Auxiliar.totalT));
        totalSorpresa.setText(String.valueOf(Auxiliar.totalS));
        
        double totalInversion = Auxiliar.costoT + Auxiliar.costoE + Auxiliar.costoS;
        inverTotal.setText(String.valueOf(totalInversion));
        inverTradicional.setText(String.valueOf(Auxiliar.costoT));
        inverEspecial.setText(String.valueOf(Auxiliar.costoE));
        inverSorpresa.setText(String.valueOf(Auxiliar.costoS));
        
        double utilidadTotal = Auxiliar.utilidadE + Auxiliar.utilidadS+Auxiliar.utilidadT;
        this.utilidadTotal.setText(String.valueOf(utilidadTotal));
        utilidadEspecial.setText(String.valueOf(Auxiliar.utilidadE));
        utilidadSorpresa.setText(String.valueOf(Auxiliar.utilidadS));
        utilidadTradicional.setText(String.valueOf(Auxiliar.utilidadT));        
        
        ventaTotal.setText(String.valueOf(Auxiliar.ventaTotal));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalSorpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalPedidos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalTradicional = new javax.swing.JLabel();
        totalEspeciales = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inverSorpresa = new javax.swing.JLabel();
        inverTotal = new javax.swing.JLabel();
        inverTradicional = new javax.swing.JLabel();
        inverEspecial = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ventaTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        utilidadSorpresa = new javax.swing.JLabel();
        utilidadTotal = new javax.swing.JLabel();
        utilidadTradicional = new javax.swing.JLabel();
        utilidadEspecial = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conclusiones");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 290, 50);

        jLabel2.setText("1.3 Total de pasteles Sorpresa: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 190, 14);

        totalSorpresa.setText("0");
        getContentPane().add(totalSorpresa);
        totalSorpresa.setBounds(280, 120, 60, 14);

        jLabel3.setText("1. Total de pasteles Pedidos: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 60, 190, 14);

        totalPedidos.setText("0");
        getContentPane().add(totalPedidos);
        totalPedidos.setBounds(280, 60, 60, 14);

        jLabel4.setText("1.1 Total de pasteles Tradicionales: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 80, 190, 14);

        jLabel5.setText("1.2 Total de pasteles Especiales: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 100, 190, 14);

        totalTradicional.setText("0");
        getContentPane().add(totalTradicional);
        totalTradicional.setBounds(280, 80, 60, 14);

        totalEspeciales.setText("0");
        getContentPane().add(totalEspeciales);
        totalEspeciales.setBounds(280, 100, 60, 14);

        jLabel6.setText("2.3 Total invertido Sorpresa:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 210, 180, 14);

        jLabel7.setText("4. Total Ventas:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 350, 140, 14);

        jLabel8.setText("3.3  Utilidad Total Sorpresa:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 310, 180, 14);

        jLabel9.setText("2.2 Total invertido Especiales:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 190, 180, 14);

        inverSorpresa.setText("0");
        getContentPane().add(inverSorpresa);
        inverSorpresa.setBounds(280, 210, 80, 14);

        inverTotal.setText("0");
        getContentPane().add(inverTotal);
        inverTotal.setBounds(280, 150, 80, 14);

        inverTradicional.setText("0");
        getContentPane().add(inverTradicional);
        inverTradicional.setBounds(280, 170, 70, 14);

        inverEspecial.setText("0");
        getContentPane().add(inverEspecial);
        inverEspecial.setBounds(280, 190, 80, 14);

        jLabel10.setText("2. Total invertido:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 150, 140, 14);

        jLabel11.setText("2.1 Total invertido Tradicionales:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 170, 180, 14);

        jLabel12.setText("3.1  Utilidad Total Tradicionales:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 270, 180, 14);

        jLabel13.setText("3.2  Utilidad Total Especiales:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 290, 180, 14);

        jLabel14.setText("3. Utilidad Total:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 250, 140, 14);

        ventaTotal.setText("0");
        getContentPane().add(ventaTotal);
        ventaTotal.setBounds(280, 350, 70, 14);

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 410, 190, 50);

        utilidadSorpresa.setText("0");
        getContentPane().add(utilidadSorpresa);
        utilidadSorpresa.setBounds(280, 310, 80, 14);

        utilidadTotal.setText("0");
        getContentPane().add(utilidadTotal);
        utilidadTotal.setBounds(280, 250, 80, 14);

        utilidadTradicional.setText("0");
        getContentPane().add(utilidadTradicional);
        utilidadTradicional.setBounds(280, 270, 90, 14);

        utilidadEspecial.setText("0");
        getContentPane().add(utilidadEspecial);
        utilidadEspecial.setBounds(280, 290, 80, 14);

        setBounds(0, 0, 382, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inverEspecial;
    private javax.swing.JLabel inverSorpresa;
    private javax.swing.JLabel inverTotal;
    private javax.swing.JLabel inverTradicional;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel totalEspeciales;
    private javax.swing.JLabel totalPedidos;
    private javax.swing.JLabel totalSorpresa;
    private javax.swing.JLabel totalTradicional;
    private javax.swing.JLabel utilidadEspecial;
    private javax.swing.JLabel utilidadSorpresa;
    private javax.swing.JLabel utilidadTotal;
    private javax.swing.JLabel utilidadTradicional;
    private javax.swing.JLabel ventaTotal;
    // End of variables declaration//GEN-END:variables
}
