package Views;

import Controllers.IControl;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        lblDataBases1 = new javax.swing.JLabel();
        pnlTables = new javax.swing.JPanel();
        lblDataBaseName = new javax.swing.JLabel();
        scpTables = new javax.swing.JScrollPane();
        lstTables = new javax.swing.JList();
        btnExit = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
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

        btnUpdateField.setText("Actualizar Campos");

        btnInsertData.setText("Insertar Datos");

        btnRemoveData.setText("Borrar Datos");

        javax.swing.GroupLayout pnlDataBasesOptionsLayout = new javax.swing.GroupLayout(pnlDataBasesOptions);
        pnlDataBasesOptions.setLayout(pnlDataBasesOptionsLayout);
        pnlDataBasesOptionsLayout.setHorizontalGroup(
            pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCreateDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveTable, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertData, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveData, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDataBasesOptionsLayout.setVerticalGroup(
            pnlDataBasesOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCreateDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDataBases1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblDataBases1.setText("Base de Datos:");

        javax.swing.GroupLayout pnlDataBasesLayout = new javax.swing.GroupLayout(pnlDataBases);
        pnlDataBases.setLayout(pnlDataBasesLayout);
        pnlDataBasesLayout.setHorizontalGroup(
            pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDataBasesLayout.createSequentialGroup()
                        .addGroup(pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbxDataBases, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDataBasesOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlDataBasesLayout.createSequentialGroup()
                        .addGroup(pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataBases1)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, pnlDataBasesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblDataBases)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlDataBasesLayout.setVerticalGroup(
            pnlDataBasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDataBases1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(cbxDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDataBasesOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlTables.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lblDataBaseName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataBaseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataBaseName.setText("Tablas Existentes");

        scpTables.setViewportView(lstTables);

        javax.swing.GroupLayout pnlTablesLayout = new javax.swing.GroupLayout(pnlTables);
        pnlTables.setLayout(pnlTablesLayout);
        pnlTablesLayout.setHorizontalGroup(
            pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpTables, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addComponent(lblDataBaseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlTablesLayout.setVerticalGroup(
            pnlTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataBaseName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpTables, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAddUser.setText("Añadir Usuario");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
                        .addGap(10, 10, 10)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDataBases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(pnlTables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDataBaseActionPerformed
        String dataBaseName = JOptionPane.showInputDialog("Ingrese Nombre de la Base de Datos: ");
        String message = this.control.createDataBase(currentUser, currentPass, dataBaseName);
        
        if(message.isEmpty()){
            this.dataBasesNames = this.control.initialState(this.currentUser, this.currentPass, this.cbxDataBases);
            JOptionPane.showMessageDialog(  null, 
                                            "Los Datos han sido ingresados correctamente.", 
                                            "Datos Correctos", 
                                            JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(  null, 
                                            message, 
                                            "Datos Incorrectos", 
                                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnCreateDataBaseActionPerformed

    private void btnRemoveDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataBaseActionPerformed
        int option = JOptionPane.showConfirmDialog(  null, 
                                            "¿Desea eliminar las base de Datos '" + dataBasesNames.get(this.cbxDataBases.getSelectedIndex()) + "' ?", 
                                            "Datos Correctos", 
                                            JOptionPane.YES_NO_CANCEL_OPTION);
        if(option == JOptionPane.OK_OPTION){
            this.control.removeDataBase(currentUser, currentPass, dataBasesNames.get(this.cbxDataBases.getSelectedIndex()));
        
            this.cbxDataBases.removeItemAt(this.cbxDataBases.getSelectedIndex());
            this.cbxDataBases.setSelectedIndex(0);

            this.dataBasesNames = this.control.initialState(this.currentUser, this.currentPass, this.cbxDataBases);
        }
    }//GEN-LAST:event_btnRemoveDataBaseActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.control.close();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        this.control.addUser(currentUser, currentPass);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void cbxDataBasesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDataBasesItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            this.control.showTables(this.currentUser, this.currentPass, dataBasesNames.get(cbxDataBases.getSelectedIndex()), this.lstTables);
        }
    }//GEN-LAST:event_cbxDataBasesItemStateChanged

    private void btnCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTableActionPerformed
        this.control.createTable(this.currentUser, this.currentPass, String.valueOf(this.cbxDataBases.getSelectedItem()));
    }//GEN-LAST:event_btnCreateTableActionPerformed

    private void btnRemoveTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTableActionPerformed
        if(this.lstTables.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(  null, 
                                            "Seleccione un registro de la lista", 
                                            "Datos Incorrectos", 
                                            JOptionPane.ERROR_MESSAGE);
        } else {
            String problem = this.control.dropTable(this.currentUser, this.currentPass, String.valueOf(this.cbxDataBases.getSelectedItem()), String.valueOf(this.lstTables.getSelectedValue()));
            if(problem.isEmpty()) {
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
                                            "No posee permisos para eliminar esta tabla", 
                                            "Excepción", 
                                            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveTableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnCreateDataBase;
    private javax.swing.JButton btnCreateTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsertData;
    private javax.swing.JButton btnInsertField;
    private javax.swing.JButton btnRemoveData;
    private javax.swing.JButton btnRemoveDataBase;
    private javax.swing.JButton btnRemoveTable;
    private javax.swing.JButton btnUpdateField;
    private javax.swing.JComboBox cbxDataBases;
    private javax.swing.JLabel lblDataBaseName;
    private javax.swing.JLabel lblDataBases;
    private javax.swing.JLabel lblDataBases1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList lstTables;
    private javax.swing.JPanel pnlDataBases;
    private javax.swing.JPanel pnlDataBasesOptions;
    private javax.swing.JPanel pnlTables;
    private javax.swing.JScrollPane scpTables;
    // End of variables declaration//GEN-END:variables

}
