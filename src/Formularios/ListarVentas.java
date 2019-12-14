
package Formularios;

import daoClases.daoVenta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarVentas extends javax.swing.JInternalFrame {

    daoVenta ove = new daoVenta("Ventas.txt");
    DefaultTableModel mod = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 5){
                return true;
            }else{
                return false;
            }
        }
        
    };
    TableRowSorter trs;
    int filaseleccionada;
    public ListarVentas() {
        initComponents();
        agregarColumna();
        agregarFila();
        rbCodigo.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        rbProducto = new javax.swing.JRadioButton();
        rbFecha = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoA = new javax.swing.JTable();
        rbCliente = new javax.swing.JRadioButton();

        setClosable(true);

        buttonGroup1.add(rbProducto);
        rbProducto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbProducto.setText("Codigo Producto");

        buttonGroup1.add(rbFecha);
        rbFecha.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbFecha.setText("Fecha");

        buttonGroup1.add(rbCodigo);
        rbCodigo.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbCodigo.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Buscar por:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel1.setText("  LISTA DE VENTAS");

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

        buttonGroup1.add(rbCliente);
        rbCliente.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbCliente.setText("Codigo Cliente");
        rbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbClienteActionPerformed(evt);
            }
        });

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
                                .addComponent(rbFecha)
                                .addGap(76, 76, 76)
                                .addComponent(rbProducto)
                                .addGap(50, 50, 50)
                                .addComponent(rbCliente))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(rbFecha)
                    .addComponent(rbProducto)
                    .addComponent(rbCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
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
        if(rbFecha.isSelected())
            filtroColum(mod, tblProductoA, 1);
        if(rbProducto.isSelected())
            filtroColum(mod, tblProductoA, 2);
        if(rbCliente.isSelected())
            filtroColum(mod, tblProductoA, 4);
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void rbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbClienteActionPerformed

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
        mod.addColumn("Fecha");
        mod.addColumn("Codigo Auto");
        mod.addColumn("Codigo Vendedor");
        mod.addColumn("Codigo Cliente");
        tblProductoA.setModel(mod);
    }
    
    public void agregarFila(){
        mod.setRowCount(0);
        for(int i=0;i<ove.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = ove.obtener(i).getCodigo();
            vec[1] = ove.obtener(i).getFecha();
            vec[2] = ove.obtener(i).getCod_car();
            vec[3] = ove.obtener(i).getCod_vend();
            vec[4] = ove.obtener(i).getCod_cli();
            mod.addRow(vec);
        }
        tblProductoA.setModel(mod);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbFecha;
    private javax.swing.JRadioButton rbProducto;
    private javax.swing.JTable tblProductoA;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}