package Views;

import Controllers.IControl;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UIControl extends javax.swing.JFrame {

    private final IControl control;
    private final String currentUser;
    private final String currentPass;
    
    private ArrayList <String> dataBasesNames;
    
    public UIControl(IControl control, String currentUser, String currentPass, ArrayList <String> dataBasesNames)
    {
        initComponents();
        this.setVisible(true);
        this.setTitle("Gestor de Bases de Datos");
        setLocationRelativeTo(null);
        
        this.control = control; 
        this.currentUser = currentUser;
        this.currentPass = currentPass;
        this.dataBasesNames = dataBasesNames;
        
        this.cbxDataBases.removeAllItems();
        
        dataBasesNames.stream().forEach((dataBasesName) -> {
            cbxDataBases.addItem(dataBasesName);
        });
        
        this.control.changeStart((CardLayout) this.pnlAction.getLayout(), this.pnlAction);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDataBases = new javax.swing.JPanel();
        lblDataBases = new javax.swing.JLabel();
        cbxDataBases = new javax.swing.JComboBox();
        pnlDataBasesOptions = new javax.swing.JPanel();
        btnCreateDataBase = new javax.swing.JButton();
        btnRemoveDataBase = new javax.swing.JButton();
        btnCreateTable = new javax.swing.JButton();
        btnRemoveTable = new javax.swing.JButton();
        btnInsertField = new javax.swing.JButton();
        btnUpdateField = new javax.swing.JButton();
        btnInsertData = new javax.swing.JButton();
        btnRemoveData = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnShowTables = new javax.swing.JButton();
        lblCurrent = new javax.swing.JLabel();
        pnlAction = new javax.swing.JPanel();
        pnlShowTables = new javax.swing.JPanel();
        scpTables = new javax.swing.JScrollPane();
        lstTables = new javax.swing.JList();
        lblDataBaseName = new javax.swing.JLabel();
        pnlAddTable = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        scpTabla = new javax.swing.JScrollPane();
        tblPrincipal = new javax.swing.JTable();
        pnlInformacion = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblAddTable = new javax.swing.JLabel();
        pnlAddUser = new javax.swing.JPanel();
        lblTitle2 = new javax.swing.JLabel();
        pnlUser = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblUserPass = new javax.swing.JLabel();
        txtUserPass = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblPermission = new javax.swing.JLabel();
        pnlDataBasePermission = new javax.swing.JPanel();
        lblDataBasePermission = new javax.swing.JLabel();
        pnlDataBasePermissionOptions = new javax.swing.JPanel();
        chkCreateDataBase = new javax.swing.JCheckBox();
        chkRemoveDataBase = new javax.swing.JCheckBox();
        pnlTablesPermission = new javax.swing.JPanel();
        pnlTablePermissionOptions = new javax.swing.JPanel();
        chkCreateTables = new javax.swing.JCheckBox();
        chkInsertData = new javax.swing.JCheckBox();
        chkAlterTable = new javax.swing.JCheckBox();
        chkRemoveData = new javax.swing.JCheckBox();
        chkShowData = new javax.swing.JCheckBox();
        chkUpdateData = new javax.swing.JCheckBox();
        lblTablePermission = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        pnlShowData = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlDataBases.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblDataBases.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataBases.setText("Bases de Datos Existentes");

        cbxDataBases.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDataBasesItemStateChanged(evt);
            }
        });

        pnlDataBasesOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        btnCreateDataBase.setText("Crear Base de Datos");
        btnCreateDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDataBaseActionPerformed(evt);
            }
        });

        btnRemoveDataBase.setText("Eliminar Base de Datos");
        btnRemoveDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDataBaseActionPerformed(evt);
            }
        });

        btnCreateTable.setText("Crear tabla");
        btnCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTableActionPerformed(evt);
            }
        });

        btnRemoveTable.setText("Eliminar Tabla");
        btnRemoveTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTableActionPerformed(evt);
            }
        });

        btnInsertField.setText("Insertar Campo");
        btnInsertField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertFieldActionPerformed(evt);
            }
        });

        btnUpdateField.setText("Actualizar Campos");

        btnInsertData.setText("Insertar Datos");

        btnRemoveData.setText("Borrar Datos");

        btnAddUser.setText("Añadir Usuario");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnShowTables.setText("Ver Tablas");
        btnShowTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTablesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDataBasesOptionsLayout = new javax.swing.GroupLayout(pnlDataBasesOptions);
        pnlDataBasesOptions.setLayout(pnlDataBasesOptionsLayout);
        pnlDataBasesOptionsLayout.setHorizontalGroup(
            pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDataBasesOptionsLayout.createSequentialGroup()
                        .addGroup(pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCreateDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveTable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertData, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataBasesOptionsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnShowTables, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDataBasesOptionsLayout.setVerticalGroup(
            pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowTables, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveTable, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCurrent.setText("Base de Datos ACTUAL:");

        javax.swing.GroupLayout pnlDataBasesLayout = new javax.swing.GroupLayout(pnlDataBases);
        pnlDataBases.setLayout(pnlDataBasesLayout);
        pnlDataBasesLayout.setHorizontalGroup(
            pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbxDataBases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlDataBasesOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDataBasesLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(lblDataBases)))
                    .addComponent(lblCurrent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataBasesLayout.setVerticalGroup(
            pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCurrent)
                .addGap(8, 8, 8)
                .addComponent(cbxDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDataBasesOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAction.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        pnlAction.setLayout(new java.awt.CardLayout());

        scpTables.setViewportView(lstTables);

        lblDataBaseName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataBaseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataBaseName.setText("Tablas Existentes");

        javax.swing.GroupLayout pnlShowTablesLayout = new javax.swing.GroupLayout(pnlShowTables);
        pnlShowTables.setLayout(pnlShowTablesLayout);
        pnlShowTablesLayout.setHorizontalGroup(
            pnlShowTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlShowTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpTables, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addComponent(lblDataBaseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlShowTablesLayout.setVerticalGroup(
            pnlShowTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpTables, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAction.add(pnlShowTables, "pnlShowTables");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre Atributo", "Tipo Atributo", "Longitud"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scpTabla.setViewportView(tblPrincipal);

        pnlInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblNombre.setText("Nombre Tabla");

        btnAgregar.setText("Añadir Atributo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover Atributo");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInformacionLayout = new javax.swing.GroupLayout(pnlInformacion);
        pnlInformacion.setLayout(pnlInformacionLayout);
        pnlInformacionLayout.setHorizontalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacionLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover)))
                .addContainerGap())
        );
        pnlInformacionLayout.setVerticalGroup(
            pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(btnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemover))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblAddTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAddTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddTable.setText("INGRESO DE NUEVA TABLA");

        javax.swing.GroupLayout pnlAddTableLayout = new javax.swing.GroupLayout(pnlAddTable);
        pnlAddTable.setLayout(pnlAddTableLayout);
        pnlAddTableLayout.setHorizontalGroup(
            pnlAddTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addGroup(pnlAddTableLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlAddTableLayout.setVerticalGroup(
            pnlAddTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddTable, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap())
        );

        pnlAction.add(pnlAddTable, "pnlAddTable");

        lblTitle2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle2.setText("INGRESO DE NUEVO USUARIO");

        pnlUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Nombre Usuario");

        lblUserPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserPass.setText("Contraseña");

        txtUserPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserPassKeyTyped(evt);
            }
        });

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblPermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPermission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPermission.setText("Permisos");

        lblDataBasePermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataBasePermission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataBasePermission.setText("Bases de Datos");

        pnlDataBasePermissionOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        chkCreateDataBase.setText("Crear Base de Datos");
        chkCreateDataBase.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkCreateDataBaseItemStateChanged(evt);
            }
        });

        chkRemoveDataBase.setText("Eliminar Base de Datos");

        javax.swing.GroupLayout pnlDataBasePermissionOptionsLayout = new javax.swing.GroupLayout(pnlDataBasePermissionOptions);
        pnlDataBasePermissionOptions.setLayout(pnlDataBasePermissionOptionsLayout);
        pnlDataBasePermissionOptionsLayout.setHorizontalGroup(
            pnlDataBasePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataBasePermissionOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkCreateDataBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkRemoveDataBase, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDataBasePermissionOptionsLayout.setVerticalGroup(
            pnlDataBasePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasePermissionOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkCreateDataBase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkRemoveDataBase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlDataBasePermissionLayout = new javax.swing.GroupLayout(pnlDataBasePermission);
        pnlDataBasePermission.setLayout(pnlDataBasePermissionLayout);
        pnlDataBasePermissionLayout.setHorizontalGroup(
            pnlDataBasePermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDataBasePermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasePermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataBasePermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDataBasePermissionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDataBasePermissionLayout.setVerticalGroup(
            pnlDataBasePermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasePermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDataBasePermissionOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTablePermissionOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        chkCreateTables.setText("Crear Tablas");

        chkInsertData.setText("Insertar Datos");

        chkAlterTable.setText("Alterar Campos");

        chkRemoveData.setText("Eliminar Datos");

        chkShowData.setText("Ver Datos");

        chkUpdateData.setText("Actualizar Datos");

        javax.swing.GroupLayout pnlTablePermissionOptionsLayout = new javax.swing.GroupLayout(pnlTablePermissionOptions);
        pnlTablePermissionOptions.setLayout(pnlTablePermissionOptionsLayout);
        pnlTablePermissionOptionsLayout.setHorizontalGroup(
            pnlTablePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablePermissionOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkShowData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkRemoveData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkAlterTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkInsertData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkCreateTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkUpdateData, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTablePermissionOptionsLayout.setVerticalGroup(
            pnlTablePermissionOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablePermissionOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkCreateTables)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkInsertData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAlterTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkRemoveData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkUpdateData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkShowData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTablePermission.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTablePermission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTablePermission.setText("Tablas");

        javax.swing.GroupLayout pnlTablesPermissionLayout = new javax.swing.GroupLayout(pnlTablesPermission);
        pnlTablesPermission.setLayout(pnlTablesPermissionLayout);
        pnlTablesPermissionLayout.setHorizontalGroup(
            pnlTablesPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesPermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablesPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTablePermissionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTablePermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTablesPermissionLayout.setVerticalGroup(
            pnlTablesPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesPermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTablePermission, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTablePermissionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblPermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(pnlDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(pnlTablesPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPermission)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTablesPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCreateUser.setText("Crear Usuario");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateUser))
                .addGap(125, 125, 125))
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 31, Short.MAX_VALUE)
                .addComponent(btnCreateUser)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAddUserLayout = new javax.swing.GroupLayout(pnlAddUser);
        pnlAddUser.setLayout(pnlAddUserLayout);
        pnlAddUserLayout.setHorizontalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlAddUserLayout.setVerticalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAction.add(pnlAddUser, "pnlAddUser");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Consultar");

        jButton4.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Base de Datos:");

        jLabel3.setText("Tablas:");

        jButton1.setText("Seleccionar Todos los Campos");

        jLabel4.setText("Campos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addContainerGap(346, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlShowDataLayout = new javax.swing.GroupLayout(pnlShowData);
        pnlShowData.setLayout(pnlShowDataLayout);
        pnlShowDataLayout.setHorizontalGroup(
            pnlShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlShowDataLayout.setVerticalGroup(
            pnlShowDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShowDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAction.add(pnlShowData, "pnlShowData");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("GESTOR DE BASES DE DATOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDataBases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDataBaseActionPerformed
        String dataBaseName = JOptionPane.showInputDialog("Ingrese Nombre de la Base de Datos: ");

        if(dataBaseName != null) {
            String message = this.control.createDataBase(currentUser, currentPass, dataBaseName);
        
            if(message.isEmpty()){
                this.dataBasesNames = this.control.initialState(this.currentUser, this.currentPass, this.cbxDataBases);
                JOptionPane.showMessageDialog(  null, 
                                                "La base de datos ha sido creada correctamente.", 
                                                "Datos Correctos", 
                                                JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(  null, 
                                                message, 
                                                "Datos Incorrectos", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateDataBaseActionPerformed

    private void btnRemoveDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataBaseActionPerformed
        int option = JOptionPane.showConfirmDialog( null, 
                                                    "¿Desea eliminar las base de Datos '" + dataBasesNames.get(this.cbxDataBases.getSelectedIndex()) + "' ?", 
                                                    "Datos Correctos", 
                                                    JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(option == JOptionPane.OK_OPTION){
            String message = this.control.removeDataBase(currentUser, currentPass, dataBasesNames.get(this.cbxDataBases.getSelectedIndex()));
            
            if(message.isEmpty()){
                this.cbxDataBases.removeItemAt(this.cbxDataBases.getSelectedIndex());
                this.cbxDataBases.setSelectedIndex(0);
                this.dataBasesNames = this.control.initialState(this.currentUser, this.currentPass, this.cbxDataBases);
                
                JOptionPane.showMessageDialog(  null, 
                                                "La base de datos ha sido eliminada correctamente.", 
                                                "Datos Correctos", 
                                                JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(  null, 
                                                message, 
                                                "Datos Incorrectos", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveDataBaseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.control.close();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        this.cleanCreateUser();
        this.control.changeAddUser((CardLayout) this.pnlAction.getLayout(), this.pnlAction);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void cbxDataBasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDataBasesItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            this.btnShowTablesActionPerformed(null);
        }
    }//GEN-LAST:event_cbxDataBasesItemStateChanged

    private void btnCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTableActionPerformed
        this.cleanCreateTable();
        this.control.changeAddTable((CardLayout) this.pnlAction.getLayout(), this.pnlAction);
        this.btnAgregarActionPerformed(evt);
    }//GEN-LAST:event_btnCreateTableActionPerformed

    private void btnRemoveTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTableActionPerformed
        if(this.lstTables.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(  null, 
                                            "Seleccione una tabla de la lista disponible", 
                                            "Datos Incorrectos", 
                                            JOptionPane.ERROR_MESSAGE);
        } else {
            String message = this.control.dropTable(this.currentUser, this.currentPass, String.valueOf(this.cbxDataBases.getSelectedItem()), String.valueOf(this.lstTables.getSelectedValue()));
            
            if(message.isEmpty()) {
                JOptionPane.showMessageDialog(  null, 
                                            "La tabla ha sido eliminada correctamente", 
                                            "Eliminacion correcta", 
                                            JOptionPane.ERROR_MESSAGE);
                
                this.cbxDataBases.removeAllItems();
                    dataBasesNames.stream().forEach((dataBasesName) -> {
                    cbxDataBases.addItem(dataBasesName);
                });
            }
            else
                JOptionPane.showMessageDialog(  null, 
                                                message, 
                                                "Error de Eliminación", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveTableActionPerformed

    private void btnInsertFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertFieldActionPerformed
        
    }//GEN-LAST:event_btnInsertFieldActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!this.txtNombre.getText().isEmpty()) {
            if(this.tblPrincipal.isValid()) {
                String message = this.control.addTable(this.currentUser, this.currentPass, String.valueOf(this.cbxDataBases.getSelectedItem()), this.tblPrincipal, this.txtNombre);
            
                if(message.isEmpty()){
                    JOptionPane.showMessageDialog(  null,
                                                    "La Tabla '" + this.txtNombre.getText() + "' se creó exitosamente",
                                                    "Tabla creada",
                                                    JOptionPane.INFORMATION_MESSAGE);

                    this.btnShowTablesActionPerformed(null);
                }
                else
                    JOptionPane.showMessageDialog(  null,
                                                    message,
                                                    "Error",
                                                    JOptionPane.ERROR_MESSAGE);
            } else 
                JOptionPane.showMessageDialog(  null,
                                                "Datos Incorrectos. Debe corregir el/los campo(s) sombreado(s)",
                                                "Datos Incorrectos",
                                                JOptionPane.ERROR_MESSAGE);
        } else
            JOptionPane.showMessageDialog(  null,
                                            "Coloque un nombre a la Tabla",
                                            "Dato no Seleccionado",
                                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.control.addRow(this.tblPrincipal);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int iRow;
        if((iRow = this.tblPrincipal.getSelectedRow()) != -1){
            DefaultTableModel cModel = (DefaultTableModel)this.tblPrincipal.getModel();
            cModel.removeRow(iRow);
        } else
            JOptionPane.showMessageDialog(  null,
                                            "No ha seleccionado ninguna columna.",
                                            "Dato no Seleccionado",
                                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void txtUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyTyped
        if(this.txtUserName.getText().length() >= 20)
            evt.consume();

        char c = evt.getKeyChar();

        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
    }//GEN-LAST:event_txtUserNameKeyTyped

    private void txtUserPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserPassKeyTyped
        if(this.txtUserPass.getText().length() >= 20)
            evt.consume();

        char c = evt.getKeyChar();

        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9'))
            evt.consume();

    }//GEN-LAST:event_txtUserPassKeyTyped

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        char[] state = new char[6];

        state[0] = this.chkShowData.isSelected()?'Y':'N';
        state[1] = this.chkInsertData.isSelected()?'Y':'N';
        state[2] = this.chkUpdateData.isSelected()?'Y':'N';
        state[3] = this.chkRemoveData.isSelected()?'Y':'N';
        state[4] = this.chkCreateDataBase.isSelected()?'Y':'N';
        state[5] = this.chkRemoveDataBase.isSelected()?'Y':'N';

        String message = this.control.addUser(state, this.currentUser, this.currentPass, this.txtUserName, this.txtUserPass);

        if(message.isEmpty()) {
            JOptionPane.showMessageDialog(  null,
                                            "Usuario '" + this.txtUserName + "' creado correctamente.",
                                            "Datos Correctos",
                                            JOptionPane.INFORMATION_MESSAGE);

            this.btnShowTablesActionPerformed(evt);
        } else
            JOptionPane.showMessageDialog(  null,
                                            message,
                                            "Datos Incorrectos",
                                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void chkCreateDataBaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCreateDataBaseItemStateChanged
        if(this.chkCreateDataBase.isSelected())
            this.chkCreateTables.setSelected(true);
        else
            this.chkCreateTables.setSelected(false);
    }//GEN-LAST:event_chkCreateDataBaseItemStateChanged

    private void btnShowTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTablesActionPerformed
        this.control.showTables(this.currentUser, this.currentPass, dataBasesNames.get(cbxDataBases.getSelectedIndex()), this.lstTables);
        this.control.changeStart((CardLayout) this.pnlAction.getLayout(), this.pnlAction);
    }//GEN-LAST:event_btnShowTablesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCreateDataBase;
    private javax.swing.JButton btnCreateTable;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsertData;
    private javax.swing.JButton btnInsertField;
    private javax.swing.JButton btnRemoveData;
    private javax.swing.JButton btnRemoveDataBase;
    private javax.swing.JButton btnRemoveTable;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowTables;
    private javax.swing.JButton btnUpdateField;
    private javax.swing.JComboBox cbxDataBases;
    private javax.swing.JCheckBox chkAlterTable;
    private javax.swing.JCheckBox chkCreateDataBase;
    private javax.swing.JCheckBox chkCreateTables;
    private javax.swing.JCheckBox chkInsertData;
    private javax.swing.JCheckBox chkRemoveData;
    private javax.swing.JCheckBox chkRemoveDataBase;
    private javax.swing.JCheckBox chkShowData;
    private javax.swing.JCheckBox chkUpdateData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblAddTable;
    private javax.swing.JLabel lblCurrent;
    private javax.swing.JLabel lblDataBaseName;
    private javax.swing.JLabel lblDataBasePermission;
    private javax.swing.JLabel lblDataBases;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPermission;
    private javax.swing.JLabel lblTablePermission;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPass;
    private javax.swing.JList lstTables;
    private javax.swing.JPanel pnlAction;
    private javax.swing.JPanel pnlAddTable;
    private javax.swing.JPanel pnlAddUser;
    private javax.swing.JPanel pnlDataBasePermission;
    private javax.swing.JPanel pnlDataBasePermissionOptions;
    private javax.swing.JPanel pnlDataBases;
    private javax.swing.JPanel pnlDataBasesOptions;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlShowData;
    private javax.swing.JPanel pnlShowTables;
    private javax.swing.JPanel pnlTablePermissionOptions;
    private javax.swing.JPanel pnlTablesPermission;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JScrollPane scpTabla;
    private javax.swing.JScrollPane scpTables;
    private javax.swing.JTable tblPrincipal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPass;
    // End of variables declaration//GEN-END:variables
    
    private void cleanCreateTable(){
        this.txtNombre.setText("");
        
        DefaultTableModel cModel = (DefaultTableModel) tblPrincipal.getModel();
        cModel.getDataVector().removeAllElements();
        this.tblPrincipal.removeAll();
        this.tblPrincipal.clearSelection();
    }
    
    private void cleanCreateUser(){
        this.txtUserName.setText("");
        this.txtUserPass.setText("");
        
        this.chkCreateDataBase.setSelected(false);
        this.chkRemoveDataBase.setSelected(false);
        this.chkCreateTables.setSelected(false);
        this.chkInsertData.setSelected(false);
        this.chkAlterTable.setSelected(false);
        this.chkRemoveData.setSelected(false);
        this.chkUpdateData.setSelected(false);
        this.chkShowData.setSelected(false);
    }
}
