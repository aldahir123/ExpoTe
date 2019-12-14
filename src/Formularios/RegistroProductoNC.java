
package Formularios;

import Clases.ProductoA;
import daoClases.daoProductoA;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroProductoNC extends javax.swing.JInternalFrame {

    daoProductoA opa = new daoProductoA("ProductoA.txt");
    DefaultTableModel mod = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 7){
                return true;
            }else{
                return false;
            }
        }
        
    };
    int filaseleccionada;
    
    public RegistroProductoNC() {
        initComponents();
        agregarColumna();
        llenaColor();
        llenaAnio();
        bloquea(false);
        agregarFila();
        bloqueo_boton1(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prueba = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        cboColor = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        admi = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoA = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rbMecanico = new javax.swing.JRadioButton();
        rbAutomatico = new javax.swing.JRadioButton();
        cboAnio = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrousuario.png"))); // NOI18N
        jLabel1.setText("REGISTRO DE VEHICULOS NO CHINOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        prueba.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("MARCA:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("CODIGO:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("PRECIO:");

        txtModelo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        cboColor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnRegistrar.setText("GUARDAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo_1.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("MODELO:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("AÑO:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("COLOR:");

        btnModificar.setBackground(new java.awt.Color(51, 51, 51));
        btnModificar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblProductoA.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tblProductoA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProductoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductoA);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        rbMecanico.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbMecanico);
        rbMecanico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbMecanico.setForeground(new java.awt.Color(0, 102, 102));
        rbMecanico.setText("Mecanico");

        rbAutomatico.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbAutomatico);
        rbAutomatico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbAutomatico.setForeground(new java.awt.Color(0, 102, 102));
        rbAutomatico.setText("Automatico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAutomatico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMecanico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAutomatico)
                    .addComponent(rbMecanico))
                .addContainerGap())
        );

        cboAnio.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        javax.swing.GroupLayout pruebaLayout = new javax.swing.GroupLayout(prueba);
        prueba.setLayout(pruebaLayout);
        pruebaLayout.setHorizontalGroup(
            pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pruebaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(61, 61, 61)
                                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModelo)
                                    .addComponent(cboColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboAnio, 0, 162, Short.MAX_VALUE)))
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(69, 69, 69)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(895, 895, 895))
        );
        pruebaLayout.setVerticalGroup(
            pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pruebaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, 1106, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(getMar().length()==0||getMod().length()==0||cboAnio.getSelectedIndex()==0||txtPrecio.getText().length()==0
                ||cboColor.getSelectedIndex()==0 ||rbAutomatico.isSelected()==false&&rbMecanico.isSelected()==false){
            JOptionPane.showMessageDialog(this,"Faltan llenar Datos!!!");
        }else{
            int msg = JOptionPane.showConfirmDialog(this,"Deseas Grabar el Registro","Grabar",JOptionPane.YES_NO_OPTION);
            if(msg == JOptionPane.YES_OPTION){
                ProductoA u = new ProductoA(getCod(),getMar(),getMod(),getAnio(),getCol(),getTip(),getPre());
                opa.agregar(u);
                opa.grabar();
                agregarFila();
                JOptionPane.showMessageDialog(this,"REGISTRO SATISFACTORIO","Registro",JOptionPane.PLAIN_MESSAGE);
                limpiar();
                bloquea(false);
                bloqueo_boton1(false);
            }else{
                txtCodigo.requestFocus();
                agregarFila();
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bloquea(true);
        limpiar();
        txtCodigo.setText("" + opa.getCorrelativo());
        bloqueo_boton1(false);
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(getMar().length()==0||getMod().length()==0||cboAnio.getSelectedIndex()==0||txtPrecio.getText().length()==0
                ||cboColor.getSelectedIndex()==0 ||rbAutomatico.isSelected()==false&&rbMecanico.isSelected()==false){
            JOptionPane.showMessageDialog(this,"Faltan llenar Datos!!!");
        }else{
            int msg = JOptionPane.showConfirmDialog(this,"Deseas Modificar el Registro","Modificar",JOptionPane.YES_NO_OPTION);
            if(msg == JOptionPane.YES_OPTION){
                ProductoA u = opa.buscarCod(getCod());
                if(u!=null){
                    u.setCodigo(getCod());
                    u.setMarca(getMar());
                    u.setModelo(getMod());
                    u.setAño(getAnio());
                    u.setColor(getCol());
                    u.setTipo(getTip());
                    u.setPrecio(getPre());
                    opa.grabar();//actualizar datos en el archivo
                    agregarFila();
                    bloquea(false);
                    limpiar();
                    bloqueo_boton1(false);
                }else{
                    JOptionPane.showMessageDialog(this,"No lo encontro!!","Validación",JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        filaseleccionada = tblProductoA.getSelectedRow();
        if(filaseleccionada>=0){
            ProductoA obj = opa.buscarCod(getCod());
            opa.eliminar(obj);
            opa.grabar();//actualizar datos en el archivo
            agregarFila();
            JOptionPane.showMessageDialog(this,"USUARIO ELIMINADO","Eliminado",JOptionPane.PLAIN_MESSAGE);
            limpiar();
            bloquea(false);
            bloqueo_boton1(false);
        }else
        JOptionPane.showMessageDialog(null,"Seleccionar fila a eliminar");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblProductoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoAMouseClicked
        filaseleccionada = tblProductoA.getSelectedRow();
        DefaultTableModel modelotabla = (DefaultTableModel)tblProductoA.getModel();
        txtCodigo.setText(tblProductoA.getValueAt(filaseleccionada,0).toString());
        txtMarca.setText(tblProductoA.getValueAt(filaseleccionada,1).toString());
        txtModelo.setText(tblProductoA.getValueAt(filaseleccionada,2).toString());
        cboAnio.setSelectedItem(tblProductoA.getValueAt(filaseleccionada,3).toString());
        cboColor.setSelectedItem(tblProductoA.getValueAt(filaseleccionada,4).toString());
        String tipo = tblProductoA.getValueAt(filaseleccionada,5).toString();
        if(tipo.equals("Mecanico"))
            rbAutomatico.setSelected(true);
        else
            rbMecanico.setSelected(true);
        txtPrecio.setText(tblProductoA.getValueAt(filaseleccionada,6).toString());
        bloquea(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_tblProductoAMouseClicked

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
       char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(null,InforNum,"Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
      char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(null,InforLet,"Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    public void llenaColor(){
        cboColor.addItem("--Selecciona--");
        cboColor.addItem("Negro");
        cboColor.addItem("Azul");
        cboColor.addItem("Rojo");
        cboColor.addItem("Verde");
        cboColor.addItem("Plomo");
        cboColor.addItem("Blanco");
    }
    public void llenaAnio(){
        cboAnio.addItem("--Selecciona--");
        cboAnio.addItem("2010");
        cboAnio.addItem("2011");
        cboAnio.addItem("2012");
        cboAnio.addItem("2013");
        cboAnio.addItem("2014");
        cboAnio.addItem("2015");
        cboAnio.addItem("2016");
        cboAnio.addItem("2017");
        cboAnio.addItem("2018");
    }
    
    public void limpiar(){
        txtCodigo.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        cboAnio.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        cboColor.setSelectedIndex(0);
        txtPrecio.setText("");
        
        txtMarca.requestFocus();
    }
    public void bloquea(boolean est){
       txtCodigo.setEnabled(false);
       txtMarca.setEnabled(est);
       txtModelo.setEnabled(est);
       cboAnio.setEnabled(est);
       rbAutomatico.setEnabled(est);
       rbMecanico.setEnabled(est);
       cboColor.setEnabled(est);
       txtPrecio.setEnabled(est);
    }
    public void bloqueo_boton1(boolean s){
        btnModificar.setEnabled(s);                                
        btnRegistrar.setEnabled(s);
        btnEliminar.setEnabled(s);
    }
    public int getCod(){ return Integer.parseInt(txtCodigo.getText());}
    public String getMar(){ return txtMarca.getText();}
    public String getMod(){ return txtModelo.getText();}
    public String getAnio(){ return cboAnio.getSelectedItem().toString();}
    public String getCol(){ return cboColor.getSelectedItem().toString();}
    public String getTip(){ return getSelecTipo().trim();}
    public double getPre(){ return Double.parseDouble(txtPrecio.getText());}
    public String getSelecTipo(){
        String tipp = "";        
        if(rbMecanico.isSelected() == true)
            tipp = rbMecanico.getLabel();               
        else
            tipp = rbAutomatico.getLabel();
        return tipp;
    }
    
    private void agregarColumna(){
        mod.addColumn("Codigo");
        mod.addColumn("Marca");
        mod.addColumn("Modelo");
        mod.addColumn("Año");
        mod.addColumn("Color");
        mod.addColumn("Tipo");
        mod.addColumn("Precio $");
        tblProductoA.setModel(mod);
    }
    
    public void agregarFila(){
        mod.setRowCount(0);
        for(int i=0;i<opa.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = opa.obtener(i).getCodigo();
            vec[1] = opa.obtener(i).getMarca();
            vec[2] = opa.obtener(i).getModelo();
            vec[3] = opa.obtener(i).getAño();
            vec[4] = opa.obtener(i).getColor();
            vec[5] = opa.obtener(i).getTipo();
            vec[6] = opa.obtener(i).getPrecio();
            mod.addRow(vec);
        }
        tblProductoA.setModel(mod);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel admi;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboAnio;
    private javax.swing.JComboBox<String> cboColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel prueba;
    private javax.swing.JRadioButton rbAutomatico;
    private javax.swing.JRadioButton rbMecanico;
    private javax.swing.JTable tblProductoA;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
