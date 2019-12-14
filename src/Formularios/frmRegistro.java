
package Formularios;

import Clases.Usuario;
import daoClases.daoUsuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import seguridad.encriptamiento;

public class frmRegistro extends javax.swing.JFrame {

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
        
    };
        int filaseleccionada;
    public frmRegistro() {
        initComponents();
        setLocationRelativeTo(this);
        agregarColumna();
        bloquea(false);
        llenaTipo();
        agregarFila();
        bloqueo_boton1(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        prueba = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        cboTipo = new javax.swing.JComboBox<>();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        admi = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prueba.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("TIPO:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("NOMBRE:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("USUARIO:");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("CONTRASENA:");

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("CODIGO:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("CORREO:");

        txtApellido.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtcodigo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        cboTipo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        btnRegistrar.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        txtCorreo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtContra.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("APELLIDOS:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("FECHA DE NAC:");

        txtFechaNac.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SEXO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        rbMasculino.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbMasculino.setForeground(new java.awt.Color(0, 102, 102));
        rbMasculino.setText("Masculino");

        rbFemenino.setBackground(new java.awt.Color(153, 204, 255));
        buttonGroup1.add(rbFemenino);
        rbFemenino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        rbFemenino.setForeground(new java.awt.Color(0, 102, 102));
        rbFemenino.setText("Femenino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFemenino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMasculino)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFemenino)
                    .addComponent(rbMasculino))
                .addContainerGap())
        );

        txtTelefono.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("TELEFONO:");

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("DIRECCION:");

        txtDireccion.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

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

        tblUsuarios.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        javax.swing.GroupLayout pruebaLayout = new javax.swing.GroupLayout(prueba);
        prueba.setLayout(pruebaLayout);
        pruebaLayout.setHorizontalGroup(
            pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pruebaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pruebaLayout.createSequentialGroup()
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pruebaLayout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(txtContra))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pruebaLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(64, 64, 64))))
                        .addGroup(pruebaLayout.createSequentialGroup()
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtFechaNac, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(pruebaLayout.createSequentialGroup()
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pruebaLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pruebaLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel3)
                    .addComponent(jLabel10)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pruebaLayout.setVerticalGroup(
            pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pruebaLayout.createSequentialGroup()
                .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(5, 5, 5)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pruebaLayout.createSequentialGroup()
                        .addGroup(pruebaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pruebaLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pruebaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrousuario.png"))); // NOI18N
        jLabel1.setText("REGISTRO DE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(getNom().length()==0||getApe().length()==0||getDoc().length()==0||getFechaNac().length()==0||getCor().length()==0||getTel().length()==0
            ||getDir().length()==0||getUsu().length()==0||txtContra.getText().trim().length()==0||cboTipo.getSelectedIndex()==0
            ||rbFemenino.isSelected()==false&&rbMasculino.isSelected()==false){
            JOptionPane.showMessageDialog(this,"Faltan llenar Datos!!!");
        }else{
            int msg = JOptionPane.showConfirmDialog(this,"Deseas Grabar el Registro","Grabar",JOptionPane.YES_NO_OPTION);
            if(msg == JOptionPane.YES_OPTION){
                Usuario u = new Usuario(getCod(),getNom(),getApe(),getSex(),getDoc(),getFechaNac(),getCor(),
                    getTel(),getDir(),getTip(),getUsu(),getCont());
                ousu.agregar(u);
                ousu.grabar();
                agregarFila();
                JOptionPane.showMessageDialog(this,"REGISTRO SATISFACTORIO","Registro",JOptionPane.PLAIN_MESSAGE);
                limpiar();
                bloquea(false);
                bloqueo_boton1(false);
            }else{
                txtNombre.requestFocus();
                agregarFila();
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        bloquea(true);
        limpiar();
        txtcodigo.setText("" + ousu.getCorrelativo());
        bloqueo_boton1(false);
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(getNom().length()==0||getApe().length()==0||getDoc().length()==0||getFechaNac().length()==0||getCor().length()==0||getTel().length()==0
            ||getDir().length()==0||getUsu().length()==0||txtContra.getText().length()==0||cboTipo.getSelectedIndex()==0
            ||rbFemenino.isSelected()==false&&rbMasculino.isSelected()==false){
            JOptionPane.showMessageDialog(this,"Faltan llenar Datos!!!");
        }else{
            int msg = JOptionPane.showConfirmDialog(this,"Deseas Modificar el Registro","Modificar",JOptionPane.YES_NO_OPTION);
            if(msg == JOptionPane.YES_OPTION){
                Usuario u = ousu.buscarCod(getCod());
                if(u!=null){
                    u.setNombre(getNom());
                    u.setApellidos(getApe());
                    u.setNum_doc(getDoc());
                    u.setSexo(getSex());
                    u.setFecha_nac(getFechaNac());
                    u.setCorreo(getCor());
                    u.setTelefono(getTel());
                    u.setDireccion(getDir());
                    u.setTipo(getTip());
                    u.setUsuario(getUsu());
                    u.setContrasena(getCont());
                    ousu.grabar();//actualizar datos en el archivo
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
        filaseleccionada = tblUsuarios.getSelectedRow();
        if(filaseleccionada>=0){
            Usuario obj = ousu.buscarCod(getCod());
            ousu.eliminar(obj);
            ousu.grabar();//actualizar datos en el archivo
            agregarFila();
            JOptionPane.showMessageDialog(this,"USUARIO ELIMINADO","Eliminado",JOptionPane.PLAIN_MESSAGE);
            limpiar();
            bloquea(false);
            bloqueo_boton1(false);
        }else
            JOptionPane.showMessageDialog(null,"Seleccionar fila a eliminar");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        filaseleccionada = tblUsuarios.getSelectedRow();
        DefaultTableModel modelotabla = (DefaultTableModel)tblUsuarios.getModel();
        
        txtcodigo.setText(tblUsuarios.getValueAt(filaseleccionada,0).toString());
        txtNombre.setText(tblUsuarios.getValueAt(filaseleccionada,1).toString());
        txtApellido.setText(tblUsuarios.getValueAt(filaseleccionada,2).toString());
        String sexo = tblUsuarios.getValueAt(filaseleccionada,3).toString();
        if(sexo.equals("Femenino"))
        rbFemenino.setSelected(true);
        else
        rbMasculino.setSelected(true);
        txtDni.setText(tblUsuarios.getValueAt(filaseleccionada,4).toString());
        txtFechaNac.setText(tblUsuarios.getValueAt(filaseleccionada,5).toString());
        txtCorreo.setText(tblUsuarios.getValueAt(filaseleccionada,6).toString());
        txtTelefono.setText(tblUsuarios.getValueAt(filaseleccionada,7).toString());
        txtDireccion.setText(tblUsuarios.getValueAt(filaseleccionada,8).toString());
        cboTipo.setSelectedItem(tblUsuarios.getValueAt(filaseleccionada,9).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(filaseleccionada,10).toString());
        bloquea(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_tblUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }
    
    public void llenaTipo(){
    cboTipo.addItem("--Selecciona--");
    cboTipo.addItem("ADMINISTRADOR");
    cboTipo.addItem("VENDEDOR");
    }
    
    public void limpiar(){
        txtcodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
       
        buttonGroup1.clearSelection();
        txtDni.setText("");
        txtFechaNac.setText("");
       
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
       
        cboTipo.setSelectedIndex(0);
        txtUsuario.setText("");
        txtContra.setText("");
        
        txtNombre.requestFocus();
    }
    public void bloquea(boolean est){
       txtcodigo.setEnabled(false);
       txtApellido.setEnabled(est);
       txtNombre.setEnabled(est);
       
       rbFemenino.setEnabled(est);
       rbMasculino.setEnabled(est);
       txtDni.setEnabled(est);
       txtFechaNac.setEnabled(est);
       
       txtCorreo.setEnabled(est);
       txtTelefono.setEnabled(est);
       txtDireccion.setEnabled(est);
       
       cboTipo.setEnabled(est);
       txtUsuario.setEnabled(est);
       txtContra.setEnabled(est);
       
    }
    public void bloqueo_boton1(boolean s){
        btnModificar.setEnabled(s);                                
        btnRegistrar.setEnabled(s);
        btnEliminar.setEnabled(s);
    }
    
    public int getCod(){ return Integer.parseInt(txtcodigo.getText());}
    public String getNom(){ return txtNombre.getText();}
    public String getApe(){ return txtApellido.getText();}
    
    public String getCor(){ return txtCorreo.getText();}
    public String getTel(){ return txtTelefono.getText();}
    public String getDir(){ return txtDireccion.getText();}
    
    public String getSex(){ return getSelecSexo().trim();}
    public String getDoc(){ return txtDni.getText();}
    public String getFechaNac(){ return txtFechaNac.getText();}
    
    public String getTip(){ return cboTipo.getSelectedItem().toString();}
    public String getUsu(){ return txtUsuario.getText();}
    public String getCont(){
        encriptamiento ep= new encriptamiento("12345678");  
        String encrypt = ep.encrypt(txtContra.getText());
        return encrypt;
    }
    
    public String getSelecSexo(){
        String sexx = "";        
        if(rbMasculino.isSelected() == true)
            sexx = rbMasculino.getLabel();               
        else
            sexx = rbFemenino.getLabel();
        return sexx;
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
    public static javax.swing.JLabel admi;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel prueba;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}
