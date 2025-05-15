
package AUTHENTICATION;

import CONFIG.Session;
import CONFIG.connectDB;
import DASHBOARDS.Admin_Dashboard;
import DASHBOARDS.Staff_Dashboard;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class SecurityQuestionPanel extends javax.swing.JFrame {

    public SecurityQuestionPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        questionField1 = new Swing.Combobox();
        questionField2 = new Swing.Combobox();
        answerField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        answerField1 = new javax.swing.JTextField();
        sub = new Swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SECURITY QUESTIONS");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 23, 630, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        questionField1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite food?", "What's your middle name?" }));
        questionField1.setLabeText("");
        questionField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionField1ActionPerformed(evt);
            }
        });
        jPanel3.add(questionField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, -1));

        questionField2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite food? ", "What's your middle name?" }));
        questionField2.setLabeText("");
        jPanel3.add(questionField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, -1));

        answerField2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jPanel3.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 450, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel3.setText("Answer: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 60, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel2.setText("Answer: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, 50));

        answerField1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jPanel3.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 450, 50));

        sub.setBackground(new java.awt.Color(0, 0, 0));
        sub.setForeground(new java.awt.Color(255, 255, 255));
        sub.setText("Submit");
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMouseExited(evt);
            }
        });
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });
        jPanel3.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
 Session sess = Session.getInstance();
        
        String question1 = (String) questionField1.getSelectedItem();
        String answer1 = answerField1.getText();
        String question2 = (String) questionField2.getSelectedItem();
        String answer2 = answerField2.getText();
        String userId = sess.getUser_id();

        if (question1.isEmpty() || answer1.isEmpty() || question2.isEmpty() || answer2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all questions and answers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        connectDB con = new connectDB();
        String insertSql = "INSERT INTO securityQuestion (user_id, question, answer) VALUES (?, ?, ?)";

        int result1 = con.insertData(insertSql, userId, question1, answer1);
        int result2 = con.insertData(insertSql, userId, question2, answer2);

        if (result1 > 0 && result2 > 0) {
            JOptionPane.showMessageDialog(this, "Security questions saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            String roleFromDB = sess.getRole();

            if ("Admin".equalsIgnoreCase(roleFromDB)) {
                Admin_Dashboard admin = new Admin_Dashboard();
                admin.setVisible(true);
            } else if ("Staff".equalsIgnoreCase(roleFromDB)) {
                Staff_Dashboard staff = new Staff_Dashboard();
                staff.setVisible(true);
            }

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save security questions. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_subMouseClicked

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
        sub.setBackground(new Color(180, 180,180));
        sub.setForeground(Color.BLACK);
    }//GEN-LAST:event_subMouseEntered

    private void subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseExited
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.WHITE);
    }//GEN-LAST:event_subMouseExited

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subActionPerformed

    private void questionField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityQuestionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecurityQuestionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private Swing.Combobox questionField1;
    private Swing.Combobox questionField2;
    private Swing.Button sub;
    // End of variables declaration//GEN-END:variables
}
