
package Formularios;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EleccionProducto extends javax.swing.JFrame {

    public static String llamado;
    public EleccionProducto() {
        initComponents();
        setLocationRelativeTo(this);
        fondo();
        
    }

    public void fondo(){
        JLabel lbl_Fondo = new JLabel();
        panel1.add(lbl_Fondo);
        lbl_Fondo.setSize(panel1.getSize());
        ImageIcon f = new ImageIcon(getClass().getResource("/Imagenes/rallas.jpg"));
        ImageIcon fr = new ImageIcon(f.getImage().getScaledInstance(lbl_Fondo.getWidth(),lbl_Fondo.getHeight(),java.awt.Image.SCALE_SMOOTH));
        lbl_Fondo.setIcon(fr);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        lblAM = new javax.swing.JLabel();
        lblAutoMarca = new javax.swing.JLabel();
        lblAC = new javax.swing.JLabel();
        lblAutoChino = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(".::Eleccion de Tipo de Compra::.");

        lblAM.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAM.setForeground(new java.awt.Color(0, 0, 153));
        lblAM.setText("AUTOS NO CHINOS");
        lblAM.setName(""); // NOI18N

        lblAutoMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carri.png"))); // NOI18N
        lblAutoMarca.setText("jLabel2");
        lblAutoMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAutoMarcaMouseClicked(evt);
            }
        });

        lblAC.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblAC.setForeground(new java.awt.Color(255, 0, 0));
        lblAC.setText("AUTOS CHINOS");
        lblAC.setName(""); // NOI18N

        lblAutoChino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAutoChino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geely.png"))); // NOI18N
        lblAutoChino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAutoChinoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAutoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblAM)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblAC))
                    .addComponent(lblAutoChino, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblAutoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAutoChino, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblAutoChinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAutoChinoMouseClicked
        dispose();
        FichadeAprob fa = new FichadeAprob();
        llamado = lblAC.getText();
        fa.txtLLamado.setText(llamado);
        fa.setVisible(true);
    }//GEN-LAST:event_lblAutoChinoMouseClicked

    private void lblAutoMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAutoMarcaMouseClicked
        dispose();
        FichadeAprob fa = new FichadeAprob();
        llamado = lblAM.getText();
        fa.txtLLamado.setText(llamado);
        fa.setVisible(true);
    }//GEN-LAST:event_lblAutoMarcaMouseClicked

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
            java.util.logging.Logger.getLogger(EleccionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EleccionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EleccionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EleccionProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EleccionProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel lblAC;
    public javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblAutoChino;
    private javax.swing.JLabel lblAutoMarca;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
