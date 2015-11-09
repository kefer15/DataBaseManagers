package Views;

import Controllers.IUser;
import javax.swing.JOptionPane;

public class UIUser extends javax.swing.JFrame {
    
    private IUser user;
    private String currentUser;
    private String currentPass;
    
    public UIUser(IUser user, String currentUser, String currentPass)
    {
        initComponents();
        this.setVisible(true);
        this.setTitle("Gestor de Bases de Datos");
        setLocationRelativeTo(null);
        
        this.user = user;
        this.currentUser = currentUser;
        this.currentPass = currentPass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPermission = new javax.swing.JPanel();
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
        pnlUser = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblUserPass = new javax.swing.JLabel();
        txtUserPass = new javax.swing.JTextField();
        btnCreateUser = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlPermission.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

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
                    .addComponent(chkRemoveDataBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(pnlDataBasePermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasePermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDataBasePermissionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDataBasePermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlDataBasePermissionLayout.setVerticalGroup(
            pnlDataBasePermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasePermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDataBasePermissionOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTablePermissionOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        chkCreateTables.setText("Crear Tablas");

        chkInsertData.setText("Insertar Datos");

        chkAlterTable.setText("Alterar Campos");

        chkRemoveData.setText("Eliminar Datos");

        chkShowData.setText("VerDatos");

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
                    .addComponent(chkUpdateData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(pnlTablesPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTablePermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlTablePermissionOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTablesPermissionLayout.setVerticalGroup(
            pnlTablesPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesPermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTablePermission, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTablePermissionOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlPermissionLayout = new javax.swing.GroupLayout(pnlPermission);
        pnlPermission.setLayout(pnlPermissionLayout);
        pnlPermissionLayout.setHorizontalGroup(
            pnlPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissionLayout.createSequentialGroup()
                .addGroup(pnlPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPermissionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTablesPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPermissionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPermissionLayout.setVerticalGroup(
            pnlPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermissionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPermissionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTablesPermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDataBasePermission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlUser.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblUserName.setText("Nombre Usuario");

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserNameKeyTyped(evt);
            }
        });

        lblUserPass.setText("Contraseña");

        txtUserPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserPassKeyTyped(evt);
            }
        });

        btnCreateUser.setText("Crear Usuario");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Usuarios");

        javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
        pnlUser.setLayout(pnlUserLayout);
        pnlUserLayout.setHorizontalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtUserPass, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(btnCreateUser)))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUserPass))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblUserName))
                    .addGroup(pnlUserLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlUserLayout.setVerticalGroup(
            pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUserPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCreateUser)
                .addContainerGap())
        );

        btnReturn.setText("Regresar");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("INGRESO DE NUEVO USUARIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPermission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        char[] state = new char[6];
        
        state[0] = this.chkShowData.isSelected()?'Y':'N';
        state[1] = this.chkInsertData.isSelected()?'Y':'N';
        state[2] = this.chkUpdateData.isSelected()?'Y':'N';
        state[3] = this.chkRemoveData.isSelected()?'Y':'N';
        state[4] = this.chkCreateDataBase.isSelected()?'Y':'N';
        state[5] = this.chkRemoveDataBase.isSelected()?'Y':'N';
        
        String message = this.user.newUser(state, this.currentUser, this.currentPass, this.txtUserName, this.txtUserPass);
        
        try {
            if(message.isEmpty()) {
                JOptionPane.showMessageDialog(  null, 
                                                "Los Datos han sido ingresados correctamente.", 
                                                "Datos Correctos", 
                                                JOptionPane.INFORMATION_MESSAGE);
                this.user.returnWindow(currentUser, currentPass);
            }
            else
                JOptionPane.showMessageDialog(  null, 
                                                message, 
                                                "Datos Incorrectos", 
                                                JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(  null, 
                                            "Se debe ingresar obligatoriamente el Nombre de Usuario y su Contraseña", 
                                            "Datos Incorrectos", 
                                            JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void chkCreateDataBaseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCreateDataBaseItemStateChanged
        if(this.chkCreateDataBase.isSelected())
            this.chkCreateTables.setSelected(true);
        else
            this.chkCreateTables.setSelected(false);
    }//GEN-LAST:event_chkCreateDataBaseItemStateChanged

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.user.returnWindow(currentUser, currentPass);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.user.close();
    }//GEN-LAST:event_btnExitActionPerformed

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
        
        if((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
            evt.consume();
        
    }//GEN-LAST:event_txtUserPassKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReturn;
    private javax.swing.JCheckBox chkAlterTable;
    private javax.swing.JCheckBox chkCreateDataBase;
    private javax.swing.JCheckBox chkCreateTables;
    private javax.swing.JCheckBox chkInsertData;
    private javax.swing.JCheckBox chkRemoveData;
    private javax.swing.JCheckBox chkRemoveDataBase;
    private javax.swing.JCheckBox chkShowData;
    private javax.swing.JCheckBox chkUpdateData;
    private javax.swing.JLabel lblDataBasePermission;
    private javax.swing.JLabel lblPermission;
    private javax.swing.JLabel lblTablePermission;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserPass;
    private javax.swing.JPanel pnlDataBasePermission;
    private javax.swing.JPanel pnlDataBasePermissionOptions;
    private javax.swing.JPanel pnlPermission;
    private javax.swing.JPanel pnlTablePermissionOptions;
    private javax.swing.JPanel pnlTablesPermission;
    private javax.swing.JPanel pnlUser;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserPass;
    // End of variables declaration//GEN-END:variables

}
