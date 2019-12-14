
package Formularios;
import daoClases.daoUsuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;


public class ListarUsuarios extends javax.swing.JInternalFrame {
    //creando variables
    static Connection conn=null;
    static Statement s=null;
    static ResultSet rs=null;
    //Para establecer el modelo al JTable
    

    daoUsuario ousu = new daoUsuario("Usuarios.txt");
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 11){
                return true;
            }else{
                return false;
            }
        }
        
    };// este codigo es para validar de no poder escribir en el JTable
    TableRowSorter trs;
    public ListarUsuarios() {
        initComponents();
        agregarColumna();
        agregarFila();
        rbCodigo.setSelected(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        rbUsuario = new javax.swing.JRadioButton();
        rbApellidos = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        tblUsuarios.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        buttonGroup1.add(rbUsuario);
        rbUsuario.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbUsuario.setText("Usuario");

        buttonGroup1.add(rbApellidos);
        rbApellidos.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rbApellidos.setText("Apellidos");

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
        jLabel1.setText("  LISTA DE USUARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(rbCodigo)
                        .addGap(60, 60, 60)
                        .addComponent(rbApellidos)
                        .addGap(76, 76, 76)
                        .addComponent(rbUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbCodigo)
                    .addComponent(rbApellidos)
                    .addComponent(rbUsuario))
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if(rbCodigo.isSelected())
        filtroColum(modelo, tblUsuarios, 0);
        if(rbApellidos.isSelected())
        filtroColum(modelo, tblUsuarios, 2);
        if(rbUsuario.isSelected())
        filtroColum(modelo, tblUsuarios, 10);
    }//GEN-LAST:event_txtBuscarKeyTyped


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
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Sexo");
        modelo.addColumn("DNI");
        modelo.addColumn("Fecha Nac");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Tipo");
        modelo.addColumn("Usuario");
        //modelo.addColumn("Contraseña");
        tblUsuarios.setModel(modelo);
    }
    public void agregarFila(){
        modelo.setRowCount(0);
        for(int i=0;i<ousu.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = ousu.obtener(i).getCodigo();
            vec[1] = ousu.obtener(i).getNombre();
            vec[2] = ousu.obtener(i).getApellidos();
            vec[3] = ousu.obtener(i).getSexo();
            vec[4] = ousu.obtener(i).getNum_doc();
            vec[5] = ousu.obtener(i).getFecha_nac();
            vec[6] = ousu.obtener(i).getCorreo();
            vec[7] = ousu.obtener(i).getTelefono();
            vec[8] = ousu.obtener(i).getDireccion();
            vec[9] = ousu.obtener(i).getTipo();
            vec[10] = ousu.obtener(i).getUsuario();
            //vec[11] = ousu.obtener(i).getContrasena();
            modelo.addRow(vec);
        }
        tblUsuarios.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbApellidos;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
