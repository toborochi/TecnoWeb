/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnoweb;

import dbconnection.DBConnection;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import smtp.SMTP;
import pop3.POP3;

/**
 *
 * @author Asus
 */
public class Dashboard extends javax.swing.JFrame {

    DBConnection dbc;
    SMTP smtp;
    POP3 pop3;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        smtp = new SMTP();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        smtpSubject = new javax.swing.JTextField();
        smtpData = new javax.swing.JScrollPane();
        smtpContent = new javax.swing.JTextArea();
        smtpSubjectLabel = new javax.swing.JLabel();
        smtpDataLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        smtpSend = new javax.swing.JButton();
        pop3Label = new javax.swing.JLabel();
        pop3ButtonConnect = new javax.swing.JButton();
        pop3ButtonDisconnect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pop3Email = new javax.swing.JTextArea();
        pop3Recargar = new javax.swing.JButton();
        pop3Next = new javax.swing.JButton();
        pop3Previous = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pop3Cantidad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        sqlConnect = new javax.swing.JButton();
        sqlDisconnect = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sqlTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        smtpSubject.setToolTipText("");

        smtpContent.setColumns(20);
        smtpContent.setRows(5);
        smtpData.setViewportView(smtpContent);

        smtpSubjectLabel.setText("Subject:");

        smtpDataLabel.setText("Content:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/email.png"))); // NOI18N
        jLabel1.setText("SMTP");

        smtpSend.setText(" Send Email");
        smtpSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smtpSendActionPerformed(evt);
            }
        });

        pop3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/text.png"))); // NOI18N
        pop3Label.setText("POP3");

        pop3ButtonConnect.setText("Connect");
        pop3ButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop3ButtonConnectActionPerformed(evt);
            }
        });

        pop3ButtonDisconnect.setText("Disconnect");
        pop3ButtonDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop3ButtonDisconnectActionPerformed(evt);
            }
        });

        pop3Email.setColumns(20);
        pop3Email.setRows(5);
        jScrollPane1.setViewportView(pop3Email);

        pop3Recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_redo.png"))); // NOI18N
        pop3Recargar.setText("Reload");
        pop3Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop3RecargarActionPerformed(evt);
            }
        });

        pop3Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_right.png"))); // NOI18N
        pop3Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop3NextActionPerformed(evt);
            }
        });

        pop3Previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_left.png"))); // NOI18N
        pop3Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pop3PreviousActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Emails:");

        pop3Cantidad.setText("0");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/databases.png"))); // NOI18N
        jLabel3.setText("SQL (Postgre)");

        sqlConnect.setText("Connect");
        sqlConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlConnectActionPerformed(evt);
            }
        });

        sqlDisconnect.setText("Disconnect");
        sqlDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqlDisconnectActionPerformed(evt);
            }
        });

        jButton1.setText("Query");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sqlTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "per_cod", "per_nom", "per_appm", "per_prof", "per_telf", "per_cel", "per_email", "per_dir", "per_flug", "per_pass"
            }
        ));
        sqlTable.setMinimumSize(new java.awt.Dimension(300, 64));
        sqlTable.setShowGrid(false);
        jScrollPane2.setViewportView(sqlTable);

        jScrollPane3.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pop3Recargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pop3Cantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pop3Previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pop3Next))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(smtpSend))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smtpSubjectLabel)
                            .addComponent(smtpDataLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(smtpSubject)
                            .addComponent(smtpData)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pop3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pop3ButtonConnect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pop3ButtonDisconnect))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(sqlConnect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sqlDisconnect))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smtpSend)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sqlConnect)
                                    .addComponent(sqlDisconnect)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(smtpSubjectLabel)
                                    .addComponent(smtpSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(smtpData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(smtpDataLabel))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pop3Label)
                                    .addComponent(pop3ButtonConnect)
                                    .addComponent(pop3ButtonDisconnect))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pop3Recargar)
                                    .addComponent(pop3Next)
                                    .addComponent(pop3Previous)
                                    .addComponent(jLabel2)
                                    .addComponent(pop3Cantidad))
                                .addGap(0, 8, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(10, 10, 10))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smtpSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smtpSendActionPerformed

        if (smtpSubject.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "There is no Subject!");
        } else {
            try {
                // ENVIAR UN CORREO
                smtp.connect();
                smtp.logIn();

                smtp.sendMail(smtpSubject.getText(), smtpContent.getText());

                smtp.logOut();
                smtp.close();
            } catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_smtpSendActionPerformed

    private void pop3ButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop3ButtonConnectActionPerformed
        try {
            // CONECTAR
            pop3 = new POP3();
            pop3.connect();
            pop3.logIn();
            pop3.getListAmmount();
            pop3Cantidad.setText(Integer.toString(pop3.emails));
            pop3Email.setText(pop3.getMail(Integer.toString(pop3.currentEmail)));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pop3ButtonConnectActionPerformed

    private void pop3ButtonDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop3ButtonDisconnectActionPerformed
        try {
            // DESCONECTAR
            pop3.logOut();
            pop3.close();
            pop3 = null;
            pop3Email.setText("");
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pop3ButtonDisconnectActionPerformed

    private void pop3NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop3NextActionPerformed
        // TODO add your handling code here:
        if (pop3 == null) {
            JOptionPane.showMessageDialog(null, "Conect POP3!");
        } else {
            try {
                pop3.nextEmail();
                pop3Email.setText(pop3.getMail(Integer.toString(pop3.currentEmail)));
            } catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pop3NextActionPerformed

    private void pop3PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop3PreviousActionPerformed

        if (pop3 == null) {
            JOptionPane.showMessageDialog(null, "Conect POP3!");
        } else {
            try {
                pop3.previousEmail();
                pop3Email.setText(pop3.getMail(Integer.toString(pop3.currentEmail)));
            } catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pop3PreviousActionPerformed

    private void pop3RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pop3RecargarActionPerformed

        if (pop3 == null) {
            JOptionPane.showMessageDialog(null, "Conect POP3!");
        } else {
            try {
                pop3.getListAmmount();
                pop3Cantidad.setText(Integer.toString(pop3.emails));
            } catch (IOException ex) {
                Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_pop3RecargarActionPerformed

    private void sqlConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlConnectActionPerformed
        dbc = new DBConnection();
        dbc.connect();
    }//GEN-LAST:event_sqlConnectActionPerformed

    private void sqlDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqlDisconnectActionPerformed
        dbc.close();
        dbc=null;
    }//GEN-LAST:event_sqlDisconnectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            if (!pop3Email.getText().isEmpty()) {
                String p = pop3.getSubject(pop3Email.getText());
                System.out.println(p);
                if (p.length()>0 && dbc!=null) {
                    LinkedList<Object[]> r = dbc.getTable(p);
                    DefaultTableModel model = (DefaultTableModel) sqlTable.getModel();
                    model.setRowCount(0);
                    for (int i = 0; i < r.size(); ++i) {

                        model.addRow(r.get(i));
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "There is no SUBJECT Selected!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton pop3ButtonConnect;
    private javax.swing.JButton pop3ButtonDisconnect;
    private javax.swing.JLabel pop3Cantidad;
    private javax.swing.JTextArea pop3Email;
    private javax.swing.JLabel pop3Label;
    private javax.swing.JButton pop3Next;
    private javax.swing.JButton pop3Previous;
    private javax.swing.JButton pop3Recargar;
    private javax.swing.JTextArea smtpContent;
    private javax.swing.JScrollPane smtpData;
    private javax.swing.JLabel smtpDataLabel;
    private javax.swing.JButton smtpSend;
    private javax.swing.JTextField smtpSubject;
    private javax.swing.JLabel smtpSubjectLabel;
    private javax.swing.JButton sqlConnect;
    private javax.swing.JButton sqlDisconnect;
    private javax.swing.JTable sqlTable;
    // End of variables declaration//GEN-END:variables

}
