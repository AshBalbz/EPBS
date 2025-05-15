/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SETTINGS;

import AUTHENTICATION.resetPass;
import AUTHENTICATION.securityQuestion;
import static CONFIG.AnswerHashing.hashAnswer;
import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Setting;
import java.awt.Color;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author mikel
 */
public class secQuest extends javax.swing.JInternalFrame {

    /**
     * Creates new form secQuest
     */
    public secQuest() {
        initComponents();
        
         //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
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

        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
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
        light_Yellow2 = new ColorGrading.Light_Yellow();

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(820, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

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

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 70));

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
        jPanel3.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 110, 40));

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
        answerField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerField2ActionPerformed(evt);
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 680, 450));

        javax.swing.GroupLayout light_Yellow2Layout = new javax.swing.GroupLayout(light_Yellow2);
        light_Yellow2.setLayout(light_Yellow2Layout);
        light_Yellow2Layout.setHorizontalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        light_Yellow2Layout.setVerticalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(light_Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerField2ActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed

    }//GEN-LAST:event_subActionPerformed

    private void subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseExited
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.WHITE);
    }//GEN-LAST:event_subMouseExited

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
        sub.setBackground(new Color(180, 180,180));
        sub.setForeground(Color.BLACK);
    }//GEN-LAST:event_subMouseEntered

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked
boolean valid = true;

        // Retrieve user details from session
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();  // Get user_id from session

        if (userId == null || userId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Session expired. Please search for your account again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Null-safe combo selections
        String selectedQuestion1 = (combo1.getSelectedItem() != null) ? combo1.getSelectedItem().toString().trim() : "";
        String selectedQuestion2 = (combo2.getSelectedItem() != null) ? combo2.getSelectedItem().toString().trim() : "";
        String userAnswer1 = answerField1.getText().trim();
        String userAnswer2 = answerField2.getText().trim();

        String answerError = "Answer field cannot be empty!";
        String questionError = "Please select a security question!";

        // Validation
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

        connectDB con = new connectDB();
        int userIdInt;

        try {
            userIdInt = Integer.parseInt(userId);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid user ID format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection connection = con.getConnection()) {
            // Check if user already set security questions
            String checkQuery = "SELECT 1 FROM securityQuestion WHERE user_id = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, userIdInt);
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "You have already set security questions.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }

            // Hash the answers before saving
            String hashedAnswer1 = hashAnswer(userAnswer1);
            String hashedAnswer2 = hashAnswer(userAnswer2);

            // Insert both questions and answers
            String insertQuery = "INSERT INTO securityQuestion (user_id, question, answer) VALUES (?, ?, ?), (?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertQuery)) {
                pst.setInt(1, userIdInt);
                pst.setString(2, selectedQuestion1);
                pst.setString(3, hashedAnswer1);
                pst.setInt(4, userIdInt);
                pst.setString(5, selectedQuestion2);
                pst.setString(6, hashedAnswer2);
                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(null, "Security questions saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
 


        String action = "User set up security questions with ID" +userId;
        String logQuery = "INSERT INTO logs (u_id, action, date_time) VALUES (?, ?, ?)";

        try (PreparedStatement logStmt = connection.prepareStatement(logQuery)) {
            logStmt.setInt(1, userIdInt);
            logStmt.setString(2, action);
            logStmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            logStmt.executeUpdate();
        }

        } catch (SQLException ex) {
            Logger.getLogger(securityQuestion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Database error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(securityQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_subMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Setting in = new Setting();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans_error1;
    private javax.swing.JLabel ans_error2;
    private Swing.TextField answerField1;
    private Swing.TextField answerField2;
    private Swing.Combobox combo1;
    private Swing.Combobox combo2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private ColorGrading.Light_Yellow light_Yellow2;
    private Swing.Button sub;
    // End of variables declaration//GEN-END:variables
}
