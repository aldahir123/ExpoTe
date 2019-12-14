
package Formularios;

import static Formularios.Login.*;
import static daoClases.daoUsuario.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    Icon cs = new ImageIcon(getClass().getResource("/Imagenes/exit.png"));
    Icon s = new ImageIcon(getClass().getResource("/Imagenes/salir.png"));
    Icon a = new ImageIcon(getClass().getResource("/Imagenes/Help_27009.png"));
    
    public MenuPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        llenalabel();
        Permisos();
        lbl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnEleccionProd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmSalir = new javax.swing.JMenu();
        jmCerrarSesion2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmsalir = new javax.swing.JMenuItem();
        jMenu2registro = new javax.swing.JMenu();
        jmUsuarios = new javax.swing.JMenuItem();
        jmProdA = new javax.swing.JMenuItem();
        jmProdB = new javax.swing.JMenuItem();
        reportepro = new javax.swing.JMenu();
        consultaUsu = new javax.swing.JMenuItem();
        consultaProA = new javax.swing.JMenuItem();
        consultaProB = new javax.swing.JMenuItem();
        jMenu3reportes = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        cliventa = new javax.swing.JMenuItem();
        jMenu1ayuda = new javax.swing.JMenu();
        jmAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle(".::AUTO FACIL::. || Bienvenido Usuario");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 204));
        jLabel5.setText("BIENVENIDO(A):");

        lblUsuario.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(204, 255, 204));
        lblUsuario.setText("eee");

        btnEleccionProd.setBackground(new java.awt.Color(204, 0, 0));
        btnEleccionProd.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        btnEleccionProd.setForeground(new java.awt.Color(255, 255, 255));
        btnEleccionProd.setText("ELECCION DEL PRODUCTO");
        btnEleccionProd.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnEleccionProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEleccionProdActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(lblUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btnEleccionProd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEleccionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(485, 485, 485))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(104, 104, 104)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(btnEleccionProd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        jmSalir.setText("Archivo");
        jmSalir.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jmCerrarSesion2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmCerrarSesion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jmCerrarSesion2.setText("Cerrar Sesión");
        jmCerrarSesion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCerrarSesion2ActionPerformed(evt);
            }
        });
        jmSalir.add(jmCerrarSesion2);
        jmSalir.add(jSeparator1);

        jmsalir.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jmsalir.setText("Salir");
        jmsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsalirActionPerformed(evt);
            }
        });
        jmSalir.add(jmsalir);

        jMenuBar1.add(jmSalir);

        jMenu2registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.png"))); // NOI18N
        jMenu2registro.setText("Registros");
        jMenu2registro.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jmUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jmUsuarios.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        jmUsuarios.setText("Usuarios");
        jmUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuariosActionPerformed(evt);
            }
        });
        jMenu2registro.add(jmUsuarios);

        jmProdA.setBackground(new java.awt.Color(255, 255, 255));
        jmProdA.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmProdA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro1.png"))); // NOI18N
        jmProdA.setText("Productos A");
        jmProdA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdAActionPerformed(evt);
            }
        });
        jMenu2registro.add(jmProdA);

        jmProdB.setBackground(new java.awt.Color(255, 255, 255));
        jmProdB.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmProdB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro1.png"))); // NOI18N
        jmProdB.setText("Productos B");
        jmProdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProdBActionPerformed(evt);
            }
        });
        jMenu2registro.add(jmProdB);

        jMenuBar1.add(jMenu2registro);

        reportepro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Detalle.png"))); // NOI18N
        reportepro.setText("Consultas");
        reportepro.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        consultaUsu.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        consultaUsu.setText("Consultar Usuarios");
        consultaUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaUsuActionPerformed(evt);
            }
        });
        reportepro.add(consultaUsu);

        consultaProA.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        consultaProA.setText("Consultar Producto A");
        consultaProA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProAActionPerformed(evt);
            }
        });
        reportepro.add(consultaProA);

        consultaProB.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        consultaProB.setText("Consultar Producto B");
        consultaProB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProBActionPerformed(evt);
            }
        });
        reportepro.add(consultaProB);

        jMenuBar1.add(reportepro);

        jMenu3reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reporte1.png"))); // NOI18N
        jMenu3reportes.setText("Reportes");
        jMenu3reportes.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User.png"))); // NOI18N
        cliente.setText("Clientes");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        jMenu3reportes.add(cliente);

        cliventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nofactura.png"))); // NOI18N
        cliventa.setText("Ventas");
        cliventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliventaActionPerformed(evt);
            }
        });
        jMenu3reportes.add(cliventa);

        jMenuBar1.add(jMenu3reportes);

        jMenu1ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Help_27009.png"))); // NOI18N
        jMenu1ayuda.setText("Ayuda");
        jMenu1ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1ayuda.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        jmAyuda.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jmAyuda.setText("Mas...");
        jmAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAyudaActionPerformed(evt);
            }
        });
        jMenu1ayuda.add(jmAyuda);

        jMenuBar1.add(jMenu1ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public void lbl(){
        JLabel lbl_Fondo = new JLabel();
        escritorio.add(lbl_Fondo);
        lbl_Fondo.setSize(escritorio.getSize());
        ImageIcon f = new ImageIcon(getClass().getResource("/Imagenes/golosina.jpg"));
        ImageIcon fr = new ImageIcon(f.getImage().getScaledInstance(lbl_Fondo.getWidth(),lbl_Fondo.getHeight(),java.awt.Image.SCALE_SMOOTH));
        lbl_Fondo.setIcon(fr);
    }
    
    private void jmUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuariosActionPerformed
        RegistroUsuario ru = new RegistroUsuario();
        escritorio.add(ru);
        ru.toFront();
        ru.setVisible(true);
    }//GEN-LAST:event_jmUsuariosActionPerformed

    private void jmCerrarSesion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCerrarSesion2ActionPerformed
        int msg = JOptionPane.showConfirmDialog(this,"¿Estas seguro que deseas cerrar sesión?","Cerrar Sesión",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,cs);
        if(msg == JOptionPane.YES_OPTION){
            Login l = new Login();        
            dispose();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jmCerrarSesion2ActionPerformed

    private void jmsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsalirActionPerformed
        int msg = JOptionPane.showConfirmDialog(this,"¿Estas seguro que deseas cerrar?","Cerrar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,s);
        if(msg == JOptionPane.YES_OPTION){
            dispose();
        }
    }//GEN-LAST:event_jmsalirActionPerformed

    private void consultaProAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProAActionPerformed
        ListarAutoNoChino la = new ListarAutoNoChino();
        escritorio.add(la);
        la.toFront();
        la.setVisible(true);
    }//GEN-LAST:event_consultaProAActionPerformed

    private void consultaUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaUsuActionPerformed
        ListarUsuarios lu = new ListarUsuarios();
        escritorio.add(lu);
        lu.toFront();
        lu.setVisible(true);
    }//GEN-LAST:event_consultaUsuActionPerformed

    private void jmProdAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdAActionPerformed
        RegistroProductoNC pa = new RegistroProductoNC();
        escritorio.add(pa);
        pa.toFront();
        pa.setVisible(true);
    }//GEN-LAST:event_jmProdAActionPerformed

    private void jmProdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProdBActionPerformed
        RegistroProductoC pb = new RegistroProductoC();
        escritorio.add(pb);
        pb.toFront();
        pb.setVisible(true);
    }//GEN-LAST:event_jmProdBActionPerformed

    private void consultaProBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProBActionPerformed
        ListarAutoChino la = new ListarAutoChino();
        escritorio.add(la);
        la.toFront();
        la.setVisible(true);
    }//GEN-LAST:event_consultaProBActionPerformed

    private void jmAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAyudaActionPerformed
        JOptionPane.showMessageDialog(null,"Contacta con un administrador y/o llama a la agencia central (01)5866974", "Ayuda", JOptionPane.PLAIN_MESSAGE, a);
    }//GEN-LAST:event_jmAyudaActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        ListarClientes lc = new ListarClientes();
        escritorio.add(lc);
        lc.toFront();
        lc.setVisible(true);
    }//GEN-LAST:event_clienteActionPerformed

    private void cliventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliventaActionPerformed
        ListarVentas lv = new ListarVentas();
        escritorio.add(lv);
        lv.toFront();
        lv.setVisible(true);
    }//GEN-LAST:event_cliventaActionPerformed

    //codigo de eleciion
    private void btnEleccionProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEleccionProdActionPerformed
        EleccionProducto ep = new EleccionProducto();
        ep.setVisible(true);
    }//GEN-LAST:event_btnEleccionProdActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    public void Permisos(){
        if(tipousu.equals("VENDEDOR")){
            jMenu2registro.setVisible(false);
            
        }else{
            jMenu1ayuda.setVisible(false);
            btnEleccionProd.setVisible(false);
        }
    }
    public void llenalabel(){
        lblUsuario.setText(tipousu+"(A) "+nomusu+" "+apeusu);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEleccionProd;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenuItem cliventa;
    private javax.swing.JMenuItem consultaProA;
    private javax.swing.JMenuItem consultaProB;
    private javax.swing.JMenuItem consultaUsu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1ayuda;
    private javax.swing.JMenu jMenu2registro;
    private javax.swing.JMenu jMenu3reportes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmAyuda;
    private javax.swing.JMenuItem jmCerrarSesion2;
    private javax.swing.JMenuItem jmProdA;
    private javax.swing.JMenuItem jmProdB;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmUsuarios;
    private javax.swing.JMenuItem jmsalir;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JMenu reportepro;
    // End of variables declaration//GEN-END:variables

}
