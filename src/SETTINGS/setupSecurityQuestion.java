
package SETTINGS;

import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Setting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class setupSecurityQuestion extends javax.swing.JInternalFrame {

    public setupSecurityQuestion() {
        initComponents();
        
         //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        question2 = new javax.swing.JComboBox<>();
        question1 = new javax.swing.JComboBox<>();
        answerField2 = new javax.swing.JTextField();
        answerField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        question2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's the name of your mother?", "How old are you?" }));
        jPanel1.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 390, 40));

        question1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's your favorite food?", "What's your middle name?" }));
        jPanel1.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 390, 40));
        jPanel1.add(answerField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 520, 50));
        jPanel1.add(answerField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 510, 50));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 560, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cancel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 570, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Setting us = new Setting();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(us);
        us.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Session sess = Session.getInstance();
        String userId = sess.getUser_id();

        String selectedQuestion1 = question1.getSelectedItem().toString();
        String selectedQuestion2 = question2.getSelectedItem().toString(); 
        String userAnswer1 = answerField1.getText().trim(); 
        String userAnswer2 = answerField2.getText().trim(); 

        if (userId == null || userId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "User ID is missing. Please log in again.", "Session Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (userAnswer1.isEmpty() || userAnswer2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter answers for both questions.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            connectDB con = new connectDB();
            Connection connection = con.getConnection();

            String checkQuery = "SELECT * FROM securityQuestion WHERE user_id = ?";
            try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, Integer.parseInt(userId));
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "You have already set security questions.", "Error", JOptionPane.ERROR_MESSAGE);
                        return; // Exit method early
                    }
                }
            }

            // Validate inputs
            if (selectedQuestion1 == null || selectedQuestion1.trim().isEmpty() ||
                userAnswer1 == null || userAnswer1.trim().isEmpty() ||
                selectedQuestion2 == null || selectedQuestion2.trim().isEmpty() ||
                userAnswer2 == null || userAnswer2.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Security questions and answers cannot be empty.", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Insert two security questions
            String insertQuery = "INSERT INTO securityQuestion (user_id, question, answer) VALUES (?, ?, ?), (?, ?, ?)";
            try (PreparedStatement pst = connection.prepareStatement(insertQuery)) {
                pst.setInt(1, Integer.parseInt(userId));
                pst.setString(2, selectedQuestion1);
                pst.setString(3, userAnswer1);
                pst.setInt(4, Integer.parseInt(userId));
                pst.setString(5, selectedQuestion2);
                pst.setString(6, userAnswer2);
                pst.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Security questions saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField1;
    private javax.swing.JTextField answerField2;
    private javax.swing.JLabel back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> question1;
    private javax.swing.JComboBox<String> question2;
    // End of variables declaration//GEN-END:variables
}
