
package PHOTOS;

import AUTHENTICATION.*;
import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Setting;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author mikel
 */
public class SecQuestions extends javax.swing.JFrame {

    /**
     * Creates new form securityQueston
     */
    public SecQuestions() {
        initComponents();
        
        combo1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        combo2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        
        answerField1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,16));
        answerField2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN,16));
        answerField1.setOpaque(false);
        answerField2.setOpaque(false);
        answerField1.setBackground(new Color(0,0,0,1));
        answerField2.setBackground(new Color(0,0,0,1));
        
       

        sub.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
    }

       private Color hoverColor = new Color(180, 180, 180); // Grayish color on hover
       private Color defaultColor = new Color(255, 255, 255); // Default white color
     
       
       private void displayError(JLabel field, String message) {
        field.setText(message);
        field.setForeground(new Color(255, 105, 97));
       
       }
       
       private void textFieldLineError(JTextField textField){
           answerField1.setLineColor(new Color(250, 0, 0));
       }
       
       
       
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        combo2 = new Swing.Combobox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sub = new Swing.Button();
        answerField2 = new Swing.TextField();
        answerField1 = new Swing.TextField();
        combo1 = new Swing.Combobox();
        ans_error1 = new javax.swing.JLabel();
        ans_error2 = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Set Up Security Questions");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 23, 640, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite food? ", "What's your middle name?" }));
        combo2.setLabeText("");
        jPanel3.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Answer: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 70, 40));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Answer: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 40));

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
        jPanel3.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 110, 40));

        answerField2.setLabelText("");
        answerField2.setOpaque(false);
        answerField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerField2ActionPerformed(evt);
            }
        });
        jPanel3.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 450, 50));

        answerField1.setLabelText("");
        answerField1.setOpaque(false);
        jPanel3.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 450, 50));

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite fruit?", "Who's your bff?" }));
        combo1.setLabeText("");
        jPanel3.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 50));

        ans_error1.setBackground(new java.awt.Color(255, 255, 255));
        ans_error1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ans_error1.setForeground(new java.awt.Color(255, 0, 0));
        ans_error1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(ans_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 450, 30));

        ans_error2.setBackground(new java.awt.Color(255, 255, 255));
        ans_error2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ans_error2.setForeground(new java.awt.Color(255, 0, 0));
        ans_error2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(ans_error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 450, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 700, 490));

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
      
                boolean valid = true;

         // Retrieve user details from session
         Session sess = Session.getInstance();
         String userId = sess.getUser_id();  // Get user_id from session

         if (userId == null || userId.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Session expired. Please search for your account again.", "Error", JOptionPane.ERROR_MESSAGE);
             return;
         }

         String selectedQuestion1 = combo1.getSelectedItem().toString(); 
         String selectedQuestion2 = combo2.getSelectedItem().toString();
         String userAnswer1 = answerField1.getText().trim(); 
         String userAnswer2 = answerField2.getText().trim();

         String answerError = "Answer field cannot be empty!";

         // Check if answers are empty and mark fields individually
         if (userAnswer1.isEmpty()) {
             textFieldLineError(answerField1);
             displayError(ans_error1, answerError);
             valid = false;
         }

         if (userAnswer2.isEmpty()) {
             textFieldLineError(answerField2);
             displayError(ans_error2, answerError);
             valid = false;
         }

         // If any are invalid, show a general message and stop
         if (!valid) {
             JOptionPane.showMessageDialog(this, "Please enter both answers.", "Input Error", JOptionPane.ERROR_MESSAGE);
             return;
         }

         try {
             // Database connection
             connectDB con = new connectDB();
             Connection connection = con.getConnection();

             // Fetch security questions and answers using user_id from session
             String query = "SELECT question, answer FROM securityquestion WHERE user_id = ? AND question IN (?, ?)";
             PreparedStatement pst = connection.prepareStatement(query);
             pst.setString(1, userId);  
             pst.setString(2, selectedQuestion1);
             pst.setString(3, selectedQuestion2);
             ResultSet rs = pst.executeQuery();

             int correctAnswers = 0;

             while (rs.next()) {
                 String storedQuestion = rs.getString("question").trim();
                 String correctAnswer = rs.getString("answer").trim();

                 if (storedQuestion.equals(selectedQuestion1) && correctAnswer.equalsIgnoreCase(userAnswer1)) {
                     correctAnswers++;
                 } else if (storedQuestion.equals(selectedQuestion2) && correctAnswer.equalsIgnoreCase(userAnswer2)) {
                     correctAnswers++;
                 }
             }

             if (correctAnswers == 2) {
                 JOptionPane.showMessageDialog(this, "Answers verified! Proceed to reset password.", "Success", JOptionPane.INFORMATION_MESSAGE);
                 new resetPass().setVisible(true);
                 this.dispose();
             } else {
                 textFieldLineError(answerField1);
                 displayError(ans_error1, "Incorrect answer.");

                 textFieldLineError(answerField2);
                 displayError(ans_error2, "Incorrect answer.");

                 JOptionPane.showMessageDialog(this, "One or both answers are incorrect.", "Verification Failed", JOptionPane.ERROR_MESSAGE);
             }

             rs.close();
             pst.close();
             connection.close();
         } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
       
    }//GEN-LAST:event_subActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Setting in = new Setting();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void answerField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerField2ActionPerformed

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
            java.util.logging.Logger.getLogger(SecQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecQuestions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new SecQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_error1;
    private javax.swing.JLabel ans_error2;
    private Swing.TextField answerField1;
    private Swing.TextField answerField2;
    private Swing.Combobox combo1;
    private Swing.Combobox combo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private ColorGrading.Light_Yellow light_Yellow1;
    private Swing.Button sub;
    // End of variables declaration//GEN-END:variables
}
