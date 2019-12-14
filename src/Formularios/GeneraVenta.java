
package Formularios;

//import Clases.Cliente;
import Clases.Venta;
import static Formularios.EleccionProducto.llamado;
import static Formularios.RegistroCliente.*;
import daoClases.daoProductoA;
import daoClases.daoProductoB;
import static daoClases.daoUsuario.*;
import daoClases.daoVenta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GeneraVenta extends javax.swing.JFrame {

    daoProductoA opa = new daoProductoA("ProductoA.txt");
    daoProductoB opb = new daoProductoB("ProductoB.txt");
    daoVenta ove = new daoVenta("Ventas.txt");
    //daoCliente ocli = new daoCliente("Clientes.txt");
    DefaultTableModel mod1 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 7){
                return true;
            }else{
                return false;
            }
        }
        
    };
    DefaultTableModel mod2 = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            if(column == 7){
                return true;
            }else{
                return false;
            }
        }
        
    };
    TableRowSorter trs;
    int filaseleccionada;
    
    public GeneraVenta() {
        initComponents();
        setLocationRelativeTo(this);
        txtCodCli.setText(codcli);
        txtVendedor.setText(apeusu+" "+nomusu);
        txtCliente.setText(apecli+" "+nomcli);
        agregarColumna();
        agregarFila();
        bloquearlbl();
        Permisos();
    }
    
    public void Permisos(){
        if(llamado.equals("AUTOS NO CHINOS"))
            btnVerPro2.setVisible(true);
        else
            btnVerPro1.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmProductosC = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        rbCodigo1 = new javax.swing.JRadioButton();
        rbMarca1 = new javax.swing.JRadioButton();
        rbAño1 = new javax.swing.JRadioButton();
        btnAgregar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductoA1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtBuscar1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        frmProductoNC = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductoA2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbCodigo2 = new javax.swing.JRadioButton();
        rbMarca2 = new javax.swing.JRadioButton();
        rbAño2 = new javax.swing.JRadioButton();
        btnAgregar2 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnVerPro1 = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVerPro2 = new javax.swing.JButton();
        txtAño = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        generarboleta = new javax.swing.JButton();

        jLabel9.setText("Buscar por:");

        buttonGroup2.add(rbCodigo1);
        rbCodigo1.setText("Codigo");

        buttonGroup2.add(rbMarca1);
        rbMarca1.setText("Marca");

        buttonGroup2.add(rbAño1);
        rbAño1.setText("Año");

        btnAgregar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar1.setText("AGREGAR");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        tblProductoA1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tblProductoA1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblProductoA1);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel12.setText("  LISTA DE PRODUCTOS CHINOS");

        txtBuscar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscar1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout frmProductosCLayout = new javax.swing.GroupLayout(frmProductosC.getContentPane());
        frmProductosC.getContentPane().setLayout(frmProductosCLayout);
        frmProductosCLayout.setHorizontalGroup(
            frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProductosCLayout.createSequentialGroup()
                .addGroup(frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProductosCLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(frmProductosCLayout.createSequentialGroup()
                                .addGroup(frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(frmProductosCLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(38, 38, 38)
                                        .addComponent(rbCodigo1)
                                        .addGap(60, 60, 60)
                                        .addComponent(rbMarca1)
                                        .addGap(76, 76, 76)
                                        .addComponent(rbAño1))
                                    .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, frmProductosCLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        frmProductosCLayout.setVerticalGroup(
            frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProductosCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGroup(frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmProductosCLayout.createSequentialGroup()
                        .addGroup(frmProductosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(rbCodigo1)
                            .addComponent(rbMarca1)
                            .addComponent(rbAño1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProductosCLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        tblProductoA2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tblProductoA2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductoA2);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jLabel7.setText("LISTA DE PRODUCTOS NO CHINOS");

        txtBuscar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscar2KeyTyped(evt);
            }
        });

        jLabel8.setText("Buscar por:");

        buttonGroup3.add(rbCodigo2);
        rbCodigo2.setText("Codigo");

        buttonGroup3.add(rbMarca2);
        rbMarca2.setText("Marca");

        buttonGroup3.add(rbAño2);
        rbAño2.setText("Año");

        btnAgregar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar2.setText("AGREGAR");
        btnAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmProductoNCLayout = new javax.swing.GroupLayout(frmProductoNC.getContentPane());
        frmProductoNC.getContentPane().setLayout(frmProductoNCLayout);
        frmProductoNCLayout.setHorizontalGroup(
            frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProductoNCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(frmProductoNCLayout.createSequentialGroup()
                        .addGroup(frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frmProductoNCLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38)
                                .addComponent(rbCodigo2)
                                .addGap(60, 60, 60)
                                .addComponent(rbMarca2)
                                .addGap(76, 76, 76)
                                .addComponent(rbAño2))
                            .addGroup(frmProductoNCLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(frmProductoNCLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        frmProductoNCLayout.setVerticalGroup(
            frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProductoNCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frmProductoNCLayout.createSequentialGroup()
                        .addGroup(frmProductoNCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rbCodigo2)
                            .addComponent(rbMarca2)
                            .addComponent(rbAño2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ºº DETALLE DE LA VENTA ºº");

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Cambria", 1, 18))); // NOI18N

        btnVerPro1.setText("Ver");
        btnVerPro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPro1ActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel11.setText("PRECIO:");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel6.setText("COLOR:");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel5.setText("AÑO:");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel4.setText("MODELO:");

        txtModelo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel3.setText("MARCA:");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel10.setText("CODIGO:");

        txtCodigo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        btnVerPro2.setText("Ver");
        btnVerPro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPro2ActionPerformed(evt);
            }
        });

        txtAño.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtColor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel14.setText("TIPO:");

        txtTipo.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(69, 69, 69)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(72, 72, 72)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerPro1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtAño, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtColor)
                            .addComponent(txtTipo))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(255, Short.MAX_VALUE)
                    .addComponent(btnVerPro2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(btnVerPro1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(btnVerPro2)
                    .addContainerGap(197, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel1.setText("Codigo Cliente:");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel2.setText("Vendedor:");

        txtCodCli.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jLabel13.setText("Cliente:");

        txtCliente.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        txtVendedor.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N

        generarboleta.setBackground(new java.awt.Color(255, 0, 0));
        generarboleta.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        generarboleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nofactura.png"))); // NOI18N
        generarboleta.setText("Generar Boleta");
        generarboleta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generarboleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarboletaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendedor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCliente)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(generarboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 102, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(generarboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*int cod_cli=Integer.parseInt(codcli);
    Cliente u = ocli.buscarCod(cod_cli);
            ocli.eliminar(u);
            ocli.grabar();*/
    private void btnVerPro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPro1ActionPerformed
        frmProductosC.setSize(729, 455);
        frmProductosC.setVisible(true);
        frmProductosC.setLocationRelativeTo(this);//para centrar
        rbCodigo1.setSelected(true);
    }//GEN-LAST:event_btnVerPro1ActionPerformed

    private void txtBuscar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar1KeyTyped
        if(rbCodigo1.isSelected())
            filtroColum1(mod1, tblProductoA1, 0);
        if(rbMarca1.isSelected())
            filtroColum1(mod1, tblProductoA1, 1);
        if(rbAño1.isSelected())
            filtroColum1(mod1, tblProductoA1, 3);
    }//GEN-LAST:event_txtBuscar1KeyTyped

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        filaseleccionada = tblProductoA1.getSelectedRow();
        mod1 = (DefaultTableModel)tblProductoA1.getModel();
        if(filaseleccionada==-1){
            JOptionPane.showMessageDialog(null,"Seleccionar un Producto");
        }else{
            txtCodigo.setText(tblProductoA1.getValueAt(filaseleccionada,0).toString());
            txtMarca.setText(tblProductoA1.getValueAt(filaseleccionada,1).toString());
            txtModelo.setText(tblProductoA1.getValueAt(filaseleccionada,2).toString());
            txtAño.setText(tblProductoA1.getValueAt(filaseleccionada,3).toString());
            txtColor.setText(tblProductoA1.getValueAt(filaseleccionada,4).toString());
            txtTipo.setText(tblProductoA2.getValueAt(filaseleccionada,5).toString());
            txtPrecio.setText(tblProductoA1.getValueAt(filaseleccionada,6).toString());
            frmProductosC.dispose();
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void txtBuscar2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscar2KeyTyped
        if(rbCodigo2.isSelected())
            filtroColum2(mod2, tblProductoA2, 0);
        if(rbMarca2.isSelected())
            filtroColum2(mod2, tblProductoA2, 1);
        if(rbAño2.isSelected())
            filtroColum2(mod2, tblProductoA2, 3);
    }//GEN-LAST:event_txtBuscar2KeyTyped

    private void btnAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar2ActionPerformed
        filaseleccionada = tblProductoA2.getSelectedRow();
        mod2 = (DefaultTableModel)tblProductoA2.getModel();
        if(filaseleccionada==-1){
            JOptionPane.showMessageDialog(null,"Seleccionar un Producto");
        }else{
            txtCodigo.setText(tblProductoA2.getValueAt(filaseleccionada,0).toString());
            txtMarca.setText(tblProductoA2.getValueAt(filaseleccionada,1).toString());
            txtModelo.setText(tblProductoA2.getValueAt(filaseleccionada,2).toString());
            txtAño.setText(tblProductoA2.getValueAt(filaseleccionada,3).toString());
            txtColor.setText(tblProductoA2.getValueAt(filaseleccionada,4).toString());
            txtTipo.setText(tblProductoA2.getValueAt(filaseleccionada,5).toString());
            txtPrecio.setText(tblProductoA2.getValueAt(filaseleccionada,6).toString());
            frmProductoNC.dispose();
        }
    }//GEN-LAST:event_btnAgregar2ActionPerformed

    private void btnVerPro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPro2ActionPerformed
        frmProductoNC.setSize(729, 455);
        frmProductoNC.setVisible(true);
        frmProductoNC.setLocationRelativeTo(this);
        rbCodigo2.setSelected(true);
    }//GEN-LAST:event_btnVerPro2ActionPerformed

    private void generarboletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarboletaActionPerformed
        Calendar cal=Calendar.getInstance(); 
        String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        if(txtCodigo.getText().length()==0)
          JOptionPane.showMessageDialog(null,"ELEGIR UN PRODUCTO..");
        else{
            Venta v = new Venta(ove.getCorrelativo(),fecha,txtCodigo.getText(),String.valueOf(codusu),txtCodCli.getText());
            ove.agregar(v);
            ove.grabar();
            ImprimeBoleta ib = new ImprimeBoleta();
            ib.lblFecha.setText(fecha);
            ib.lblCodPro.setText(txtCodigo.getText());
            ib.lblMarPro.setText(txtMarca.getText());
            ib.lblModPro.setText(txtModelo.getText());
            ib.lblAñoPro.setText(txtAño.getText());
            ib.lblTipPro.setText(txtColor.getText());
            ib.lblColPro.setText(txtColor.getText());
            double igv = Math.round(0.18*Double.parseDouble(txtPrecio.getText()));
            ib.LBLigv.setText("$"+String.valueOf(igv));
            ib.lblPrecio.setText("$"+txtPrecio.getText());
            dispose();
            ib.setVisible(true);
        }
    }//GEN-LAST:event_generarboletaActionPerformed

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
            java.util.logging.Logger.getLogger(GeneraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneraVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneraVenta().setVisible(true);
            }
        });
    }

    public void filtroColum1(DefaultTableModel dtm,JTable tabla, int c){                      
        //con esto buscamos datos en la tabla
        txtBuscar1.addKeyListener(new KeyAdapter(){        
        @Override
        public void keyReleased(KeyEvent e) {
            trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtBuscar1.getText(), c));
        }               
        });        
        trs = new TableRowSorter(dtm);
        tabla.setRowSorter(trs);        
    }
    public void filtroColum2(DefaultTableModel dtm,JTable tabla, int c){                      
        //con esto buscamos datos en la tabla
        txtBuscar2.addKeyListener(new KeyAdapter(){        
        @Override
        public void keyReleased(KeyEvent e) {
            trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtBuscar2.getText(), c));
        }               
        });        
        trs = new TableRowSorter(dtm);
        tabla.setRowSorter(trs);        
    }
    private void agregarColumna(){
        mod1.addColumn("Codigo");
        mod1.addColumn("Marca");
        mod1.addColumn("Modelo");
        mod1.addColumn("Año");
        mod1.addColumn("Color");
        mod1.addColumn("Tipo");
        mod1.addColumn("Precio $");
        tblProductoA1.setModel(mod1);
        
        mod2.addColumn("Codigo");
        mod2.addColumn("Marca");
        mod2.addColumn("Modelo");
        mod2.addColumn("Año");
        mod2.addColumn("Color");
        mod2.addColumn("Tipo");
        mod2.addColumn("Precio $");
        tblProductoA2.setModel(mod2);
    }
    
    public void agregarFila(){
        mod1.setRowCount(0);
        for(int i=0;i<opb.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = opb.obtener(i).getCodigo();
            vec[1] = opb.obtener(i).getMarca();
            vec[2] = opb.obtener(i).getModelo();
            vec[3] = opb.obtener(i).getAño();
            vec[4] = opb.obtener(i).getColor();
            vec[5] = opb.obtener(i).getTipo();
            vec[6] = opb.obtener(i).getPrecio();
            mod1.addRow(vec);
        }
        tblProductoA1.setModel(mod1);
        
        mod2.setRowCount(0);
        for(int i=0;i<opa.tamaño();i++){
            Object vec[] = new Object[11];
            vec[0] = opa.obtener(i).getCodigo();
            vec[1] = opa.obtener(i).getMarca();
            vec[2] = opa.obtener(i).getModelo();
            vec[3] = opa.obtener(i).getAño();
            vec[4] = opa.obtener(i).getColor();
            vec[5] = opa.obtener(i).getTipo();
            vec[6] = opa.obtener(i).getPrecio();
            mod2.addRow(vec);
        }
        tblProductoA2.setModel(mod2);
    }
    public void bloquearlbl(){
        txtCodigo.setEnabled(false);
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtAño.setEnabled(false);
        txtColor.setEnabled(false);
        txtTipo.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCodCli.setEnabled(false);
        txtCliente.setEnabled(false);
        txtVendedor.setEnabled(false);
        
        btnVerPro1.setVisible(false);
        btnVerPro2.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnAgregar2;
    private javax.swing.JButton btnVerPro1;
    private javax.swing.JButton btnVerPro2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JFrame frmProductoNC;
    private javax.swing.JFrame frmProductosC;
    private javax.swing.JButton generarboleta;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbAño1;
    private javax.swing.JRadioButton rbAño2;
    private javax.swing.JRadioButton rbCodigo1;
    private javax.swing.JRadioButton rbCodigo2;
    private javax.swing.JRadioButton rbMarca1;
    private javax.swing.JRadioButton rbMarca2;
    private javax.swing.JTable tblProductoA1;
    private javax.swing.JTable tblProductoA2;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscar1;
    private javax.swing.JTextField txtBuscar2;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
