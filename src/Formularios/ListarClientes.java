
package Formularios;

import daoClases.daoCliente;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarClientes extends javax.swing.JInternalFrame {

    daoCliente ocli = new daoCliente("Clientes.txt");
    DefaultTableModel mod = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 10){
                return true;
            }else{
                return false;
            }
        }
        
    };
    TableRowSorter trs;
    int filaseleccionada;
    public ListarClientes() {
        initComponents();
        agregarColumna();
        agregarFila();
        rbCodigo.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbDocumento = new javax.swing.JRadioButton();
        rbApellido = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoA = new javax.swing.JTable();

        setClosable(true);

        buttonGroup1.add(rbDocumento);
        rbDocumento.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbDocumento.setText("Nro. Documento");

        buttonGroup1.add(rbApellido);
        rbApellido.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbApellido.setText("Apellidos");

        buttonGroup1.add(rbCodigo);
        rbCodigo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbCodigo.setText("Codigo");
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Buscar por:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel1.setText("LISTA DE CLIENTES ");

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
        jScrollPane1.setViewportView(tblProductoA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addComponent(rbCodigo)
                                .addGap(60, 60, 60)
                                .addComponent(rbApellido)
                                .addGap(76, 76, 76)
                                .addComponent(rbDocumento))
                            .addComponent(jLabel1))
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbCodigo)
                    .addComponent(rbApellido)
                    .addComponent(rbDocumento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if(rbCodigo.isSelected())
            filtroColum(mod, tblProductoA, 0);
        if(rbApellido.isSelected())
            filtroColum(mod, tblProductoA, 2);
        if(rbDocumento.isSelected())
            filtroColum(mod, tblProductoA, 5);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCodigoActionPerformed


    public void filtroColum(DefaultTableModel dtm,JTable tabla, int c){                      
        //con esto buscamos datos en la tabla
        txtBuscar.addKeyListener(new KeyAdapter(){        
        @Override
        public void keyReleased(KeyEvent e) {
            trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtBuscar.getText(), c));
        }               
        });        
        trs = new TableRowSorter(dtm);
        tabla.setRowSorter(trs);        
    }
    private void agregarColumna(){
        mod.addColumn("Codigo");
        mod.addColumn("Nombre");
        mod.addColumn("Apellidos");
        mod.addColumn("Sexo");
        mod.addColumn("Tipo de Doc");
        mod.addColumn("Num de Doc");
        mod.addColumn("Edad");
        mod.addColumn("Correo");
        mod.addColumn("Telefono");
        mod.addColumn("Direccion");
        tblProductoA.setModel(mod);
    }
    
    public void agregarFila(){
        mod.setRowCount(0);
        for(int i=0;i<ocli.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = ocli.obtener(i).getCodigo();
            vec[1] = ocli.obtener(i).getNombre();
            vec[2] = ocli.obtener(i).getApellidos();
            vec[3] = ocli.obtener(i).getSexo();
            vec[4] = ocli.obtener(i).getTipo_doc();
            vec[5] = ocli.obtener(i).getNum_doc();
            vec[6] = ocli.obtener(i).getEdad();
            vec[7] = ocli.obtener(i).getCorreo();
            vec[8] = ocli.obtener(i).getTelefono();
            vec[9] = ocli.obtener(i).getDireccion();
            mod.addRow(vec);
        }
        tblProductoA.setModel(mod);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbApellido;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbDocumento;
    private javax.swing.JTable tblProductoA;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
