/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Controller.MainControllerView;
import Controller.Records;

/**
 *
 * @author Diego Sullon
 */
public class RegisterPolice extends javax.swing.JPanel {

    private Main main;
    private Records records;

    /**
     * Creates new form Menu
     */
    public RegisterPolice() {
        initComponents();
    }

    public RegisterPolice(Main main, Records records) {
        this.main = main;
        this.records = records;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        inName = new javax.swing.JTextField();
        inSurname = new javax.swing.JTextField();
        inDni = new javax.swing.JTextField();
        inRank = new javax.swing.JComboBox<>();
        inSalary = new javax.swing.JSpinner();
        inAge = new javax.swing.JSpinner();
        registerButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombres");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("DNI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Rango");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Sueldo");

        inName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inNameActionPerformed(evt);
            }
        });

        inSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inSurnameActionPerformed(evt);
            }
        });

        inDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inDniActionPerformed(evt);
            }
        });

        inRank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cadete", "Suboficial", "Teniente", "Capitán", "Coronel", "Mayor", "General" }));

        inSalary.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inSalary.setModel(new javax.swing.SpinnerNumberModel(10.0d, null, null, 1.0d));

        inAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inAge.setModel(new javax.swing.SpinnerNumberModel(18, null, null, 1));
        inAge.setValue(18);

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registerButton.setText("Registrar");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(135, 135, 135)
                                    .addComponent(inAge))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(104, 104, 104)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inSalary)
                                        .addComponent(inDni, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(inSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                        .addComponent(inName)
                                        .addComponent(inRank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inNameActionPerformed

    private void inSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inSurnameActionPerformed

    private void inDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inDniActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        int age = (Integer) inAge.getValue();
        String rank = inRank.getSelectedItem().toString();
        String name = inName.getText();
        String surname = inSurname.getText();
        double balance = 0;
        double salary = (double) inSalary.getValue();
        String dni = inDni.getText();
        if (name.isEmpty() || surname.isEmpty() || dni.isEmpty()) {
            MainControllerView.changePanel(0);
        } else {
            records.registerPolice(age, rank, balance, salary, name, surname, dni);
            MainControllerView.changePanel(0);
        }
    }//GEN-LAST:event_registerButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner inAge;
    private javax.swing.JTextField inDni;
    private javax.swing.JTextField inName;
    private javax.swing.JComboBox<String> inRank;
    private javax.swing.JSpinner inSalary;
    private javax.swing.JTextField inSurname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton registerButton;
    // End of variables declaration//GEN-END:variables
}
