package Views;

import Controllers.ILogIn;
import java.util.ArrayList;

public class UILogIn extends javax.swing.JFrame {
    
    private ILogIn logIn;
    private ArrayList <String> users;
    
    public UILogIn(ILogIn logIn)
    {
        initComponents();
        this.setVisible(true);
        this.setTitle("Gestor de Bases de Datos");
        setLocationRelativeTo(null);
        
        this.logIn = logIn;
        this.bgpDataBases.add(this.rbtSqlServer);
        this.bgpDataBases.add(this.rbtMySQL);
        this.bgpDataBases.add(this.rbtPostgreSQL);
        this.bgpDataBases.setSelected(this.rbtMySQL.getModel(), true);
        users = this.logIn.setUsersMySQL(this.cbxUsers);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpDataBases = new javax.swing.ButtonGroup();
        pnlGeneral = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        pnlLogIn = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        cbxUsers = new javax.swing.JComboBox();
        btnCancel = new javax.swing.JButton();
        btnConect = new javax.swing.JButton();
        btnShowPass = new javax.swing.JButton();
        pwfPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        pnlDataBase = new javax.swing.JPanel();
        rbtMySQL = new javax.swing.JRadioButton();
        rbtSqlServer = new javax.swing.JRadioButton();
        rbtPostgreSQL = new javax.swing.JRadioButton();
        lblSelecction = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Acceso al Sistema");
        lblName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblUser.setText("Usuario:");

        lblPass.setText("Contraseña:");

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnConect.setText("Conectar");
        btnConect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectActionPerformed(evt);
            }
        });

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sources/Eye.jpg"))); // NOI18N
        btnShowPass.setBorder(null);
        btnShowPass.setBorderPainted(false);
        btnShowPass.setContentAreaFilled(false);
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnShowPassMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnShowPassMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogInLayout = new javax.swing.GroupLayout(pnlLogIn);
        pnlLogIn.setLayout(pnlLogInLayout);
        pnlLogInLayout.setHorizontalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogInLayout.createSequentialGroup()
                        .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUser)
                            .addComponent(lblPass))
                        .addGap(25, 25, 25)
                        .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogInLayout.createSequentialGroup()
                                    .addComponent(pwfPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlLogInLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnConect))
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogInLayout.setVerticalGroup(
            pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogInLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(cbxUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblPass)
                    .addComponent(btnShowPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConect)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pnlDataBase.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, null));

        rbtMySQL.setText("MySQL");
        rbtMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMySQLActionPerformed(evt);
            }
        });

        rbtSqlServer.setText("SQL Server");
        rbtSqlServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSqlServerActionPerformed(evt);
            }
        });

        rbtPostgreSQL.setText("PostgreSQL");
        rbtPostgreSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPostgreSQLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDataBaseLayout = new javax.swing.GroupLayout(pnlDataBase);
        pnlDataBase.setLayout(pnlDataBaseLayout);
        pnlDataBaseLayout.setHorizontalGroup(
            pnlDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtSqlServer)
                    .addComponent(rbtMySQL)
                    .addComponent(rbtPostgreSQL)))
        );
        pnlDataBaseLayout.setVerticalGroup(
            pnlDataBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDataBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtMySQL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtSqlServer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtPostgreSQL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblSelecction.setText("Seleccione la Base de Datos:");

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pnlDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelecction)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelecction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectActionPerformed
        String password = "";
        char[] var = this.pwfPassword.getPassword();

        for(int i = 0;i < this.pwfPassword.getPassword().length;i++)
                password += var[i];
        
        this.logIn.join(users.get(cbxUsers.getSelectedIndex()), password);
    }//GEN-LAST:event_btnConectActionPerformed

    private void rbtMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMySQLActionPerformed
        cbxUsers.removeAllItems();
        this.logIn.setUsersMySQL(this.cbxUsers);
    }//GEN-LAST:event_rbtMySQLActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.logIn.close();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void rbtSqlServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSqlServerActionPerformed
        cbxUsers.removeAllItems();
    }//GEN-LAST:event_rbtSqlServerActionPerformed

    private void rbtPostgreSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPostgreSQLActionPerformed
        cbxUsers.removeAllItems();
    }//GEN-LAST:event_rbtPostgreSQLActionPerformed

    private void btnShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMousePressed
        this.lblPassword.setText(String.valueOf(this.pwfPassword.getPassword()));
    }//GEN-LAST:event_btnShowPassMousePressed

    private void btnShowPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMouseExited
        this.lblPassword.setText("");
    }//GEN-LAST:event_btnShowPassMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpDataBases;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConect;
    private javax.swing.JButton btnShowPass;
    private javax.swing.JComboBox cbxUsers;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSelecction;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlDataBase;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlLogIn;
    private javax.swing.JPasswordField pwfPassword;
    private javax.swing.JRadioButton rbtMySQL;
    private javax.swing.JRadioButton rbtPostgreSQL;
    private javax.swing.JRadioButton rbtSqlServer;
    // End of variables declaration//GEN-END:variables
}
