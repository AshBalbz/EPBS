
package AUTHENTICATION;

import static CONFIG.AnswerHashing.hashAnswer;
import CONFIG.Session;
import CONFIG.connectDB;
import DASHBOARDS.Admin_Dashboard;
import DASHBOARDS.Staff_Dashboard;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class security extends javax.swing.JFrame {

    public security() {
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
        field.setForeground(new Color(255, 0, 0));
       
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
        combo1 = new Swing.Combobox();
        combo2 = new Swing.Combobox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sub = new Swing.Button();
        answerField2 = new Swing.TextField();
        answerField1 = new Swing.TextField();
        ans_error2 = new javax.swing.JLabel();
        ans_error1 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        light_Yellow2 = new ColorGrading.Light_Yellow();

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
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 720));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Security Questions");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 23, 630, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        combo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite fruit?", "Who's your bff?" }));
        combo1.setLabeText("");
        jPanel3.add(combo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, -1));

        combo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What's your favorite food? ", "What's your middle name?" }));
        combo2.setLabeText("");
        jPanel3.add(combo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 350, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel3.setText("Answer: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 60, 50));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel2.setText("Answer: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, 50));

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

        answerField2.setLabelText("");
        answerField2.setOpaque(false);
        answerField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerField2FocusLost(evt);
            }
        });
        jPanel3.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 450, 50));

        answerField1.setLabelText("");
        answerField1.setOpaque(false);
        answerField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                answerField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerField1FocusLost(evt);
            }
        });
        jPanel3.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 450, 50));

        ans_error2.setBackground(new java.awt.Color(255, 255, 255));
        ans_error2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ans_error2.setForeground(new java.awt.Color(255, 0, 0));
        ans_error2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(ans_error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 450, 30));

        ans_error1.setBackground(new java.awt.Color(255, 255, 255));
        ans_error1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        ans_error1.setForeground(new java.awt.Color(255, 0, 0));
        ans_error1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(ans_error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 450, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 700, 490));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        jPanel1.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        javax.swing.GroupLayout light_Yellow2Layout = new javax.swing.GroupLayout(light_Yellow2);
        light_Yellow2.setLayout(light_Yellow2Layout);
        light_Yellow2Layout.setHorizontalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        light_Yellow2Layout.setVerticalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
       

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
    boolean valid = true; 

        // Retrieve user details from session
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();

        System.out.println("User ID from session: " + userId);

        if (userId == null || userId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Session expired. Please search for your account again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Null-safe combo selections
        String selectedQuestion1 = combo1.getSelectedItem() != null ? combo1.getSelectedItem().toString().trim() : "";
        String selectedQuestion2 = combo2.getSelectedItem() != null ? combo2.getSelectedItem().toString().trim() : "";
        String userAnswer1 = answerField1.getText().trim();
        String userAnswer2 = answerField2.getText().trim();

        String answerError = "Answer field cannot be empty!";
        String questionError = "Please select a security question!";

        // Input validation
        if (selectedQuestion1.isEmpty()) {
            displayError(ans_error1, questionError);
            valid = false;
        }

        if (userAnswer1.isEmpty()) {
            textFieldLineError(answerField1);
            displayError(ans_error1, answerError);
            valid = false;
        }

        if (selectedQuestion2.isEmpty()) {
            displayError(ans_error2, questionError);
            valid = false;
        }

        if (userAnswer2.isEmpty()) {
            textFieldLineError(answerField2);
            displayError(ans_error2, answerError);
            valid = false;
        }

        if (!valid) {
            return;
        }

        try {
            connectDB con = new connectDB();
            String query = "SELECT question, answer FROM securityQuestion WHERE user_id = ? AND question IN (?, ?)";

            try (Connection connection = con.getConnection();
                 PreparedStatement pst = connection.prepareStatement(query)) {

                pst.setString(1, userId);
                pst.setString(2, selectedQuestion1);
                pst.setString(3, selectedQuestion2);

                try (ResultSet rs = pst.executeQuery()) {
                    Map<String, String> questionAnswerMap = new HashMap<>();

                    while (rs.next()) {
                        String storedQuestion = rs.getString("question").trim();
                        String storedHashedAnswer = rs.getString("answer").trim();
                        System.out.println("Stored Question: " + storedQuestion);
                        System.out.println("Stored Hashed Answer: " + storedHashedAnswer);
                        questionAnswerMap.put(storedQuestion, storedHashedAnswer);
                    }

                    // Make sure both questions were found
                    if (!questionAnswerMap.containsKey(selectedQuestion1) || !questionAnswerMap.containsKey(selectedQuestion2)) {
                        JOptionPane.showMessageDialog(this, "Security questions not found or mismatched.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Hash user input
                    String hashedUserAnswer1 = hashAnswer(userAnswer1);
                    String hashedUserAnswer2 = hashAnswer(userAnswer2);

                    boolean answer1Correct = questionAnswerMap.get(selectedQuestion1).equals(hashedUserAnswer1);
                    boolean answer2Correct = questionAnswerMap.get(selectedQuestion2).equals(hashedUserAnswer2);

                    // Only proceed if BOTH answers are correct
                    if (answer1Correct && answer2Correct) {
                        JOptionPane.showMessageDialog(this, "Answers verified! Proceed to reset password.", "Success", JOptionPane.INFORMATION_MESSAGE);
                        new resetPass().setVisible(true); // Ensure resetPass is properly initialized and set visible
                        this.dispose();
                    } else {
                        if (!answer1Correct) {
                            displayError(ans_error1, "Incorrect answer!");
                            textFieldLineError(answerField1);
                        }
                        if (!answer2Correct) {
                            displayError(ans_error2, "Incorrect answer!");
                            textFieldLineError(answerField2);
                        }
                        // Ensure it does not proceed
                        return;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Unexpected error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_subActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        forgotPassword in = new forgotPassword();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
        return;
    }//GEN-LAST:event_closeMouseClicked

    private void answerField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerField1FocusGained
             answerField1.setLineColor(new Color(153,102,0));
    }//GEN-LAST:event_answerField1FocusGained

    private void answerField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerField1FocusLost
        displayError(ans_error1, "");
        answerField1.setForeground(Color.black);
    }//GEN-LAST:event_answerField1FocusLost

    private void answerField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerField2FocusGained
             answerField2.setLineColor(new Color(153,102,0));
    }//GEN-LAST:event_answerField2FocusGained

    private void answerField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerField2FocusLost
        displayError(ans_error2, "");
        answerField2.setForeground(Color.black);
    }//GEN-LAST:event_answerField2FocusLost

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
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(security.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new security().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_error1;
    private javax.swing.JLabel ans_error2;
    private Swing.TextField answerField1;
    private Swing.TextField answerField2;
    private javax.swing.JLabel close;
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
    private ColorGrading.Light_Yellow light_Yellow2;
    private javax.swing.JLabel mini;
    private Swing.Button sub;
    // End of variables declaration//GEN-END:variables
}
