/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTHENTICATION;

import CONFIG.Session;
import CONFIG.Util;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.Caret;

/**
 *
 * @author HP
 */
public class resetPass extends javax.swing.JFrame {

    /**
     * Creates new form resetPass
     */
    public resetPass() {
        initComponents();
        
        new_pass.setBackground(new Color (0,0,0,1));
        confirm_pass.setBackground(new Color (0,0,0,1));
        new_pass.setCaretPosition(new_pass.getText().length());
        confirm_pass.setCaretPosition(confirm_pass.getText().length());

        sub.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        
        

    }

    public void setTitledBorder(JComponent component, String title, Color color) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(color, 1),  // Use given color
            title,  
            TitledBorder.LEFT,  
            TitledBorder.TOP,  
            new Font("Franklin Gothic Medium", Font.PLAIN, 16),  
            color  // Title text color
        );

        component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

        // Make text field background fully transparent
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            textField.setOpaque(false); // Remove background fill
            textField.setBackground(new Color(0, 0, 0, 0)); // Ensure full transparency
            textField.setCaretColor(Color.WHITE); // Ensure cursor is visible
            textField.setForeground(new Color(96, 92, 60));
    }
      }

    public void setInvalidTitledBorder(JComponent component, String title) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(255, 0, 0)),  // Red border for invalid input
            title,
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("Franklin Gothic Medium", Font.PLAIN, 16),
            new Color(255, 0, 0) // Red text color for the title
        );

        component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

        // Make text field background fully transparent
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            textField.setOpaque(false); 
            textField.setBackground(new Color(0, 0, 0, 0)); 
            textField.setCaretColor(Color.WHITE); // Make sure cursor is visible
            textField.setForeground(new Color(255, 0, 0));
        }
    }
    
     private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(new Color(255, 0, 0));
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        showPass1 = new javax.swing.JLabel();
        new_pass = new javax.swing.JPasswordField();
        confirm_pass = new javax.swing.JPasswordField();
        pass1_error = new javax.swing.JLabel();
        pass2_error = new javax.swing.JLabel();
        sub = new Swing.Button();
        jLabel3 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        light_Yellow2 = new ColorGrading.Light_Yellow();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 641));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reset Password");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 23, 530, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hiddens.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 40, 50));

        showPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hiddens.png"))); // NOI18N
        showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPass1MouseClicked(evt);
            }
        });
        jPanel2.add(showPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 40, 50));

        new_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        new_pass.setForeground(new java.awt.Color(153, 153, 153));
        new_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 92, 60)), "New Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        new_pass.setEchoChar('\u0000');
        new_pass.setOpaque(false);
        new_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                new_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_passFocusLost(evt);
            }
        });
        new_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passActionPerformed(evt);
            }
        });
        jPanel2.add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 410, 60));

        confirm_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        confirm_pass.setForeground(new java.awt.Color(153, 153, 153));
        confirm_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 92, 60)), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        confirm_pass.setEchoChar('\u0000');
        confirm_pass.setOpaque(false);
        confirm_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirm_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_passFocusLost(evt);
            }
        });
        confirm_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_passActionPerformed(evt);
            }
        });
        jPanel2.add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 410, 60));

        pass1_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        pass1_error.setForeground(new java.awt.Color(255, 51, 51));
        pass1_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(pass1_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 410, 20));

        pass2_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        pass2_error.setForeground(new java.awt.Color(255, 51, 51));
        pass2_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(pass2_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 410, 20));

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
        jPanel2.add(sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 347, 100, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 580, 400));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

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
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        light_Yellow2Layout.setVerticalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 720));

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        security in = new security();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void confirm_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passFocusGained
        confirm_pass.setEchoChar('•'); // Mask password
        confirm_pass.setForeground(new Color(96, 92, 60));
        setTitledBorder(confirm_pass, "Confirm Password", new Color(96, 92, 60));
    }//GEN-LAST:event_confirm_passFocusGained

    private void confirm_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passFocusLost
        setTitledBorder(confirm_pass, "Confirm Password", Color.BLACK);
        confirm_pass.setForeground(Color.BLACK);
        displayError(pass2_error, "");
    }//GEN-LAST:event_confirm_passFocusLost

    private void confirm_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_passActionPerformed

    private void new_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_passFocusGained
        new_pass.setEchoChar('•'); // Mask password
        new_pass.setForeground(new Color(96, 92, 60));
        setTitledBorder(new_pass, "New Password", new Color(96, 92, 60));
    }//GEN-LAST:event_new_passFocusGained

    private void new_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_passFocusLost

        setTitledBorder(new_pass, "New Password", Color.BLACK);
        new_pass.setForeground(Color.BLACK);
        displayError(pass1_error, "");
    }//GEN-LAST:event_new_passFocusLost

    private void new_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passActionPerformed

    private boolean passVisibleConfirm = false;

    private void showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MouseClicked
       passVisibleConfirm = !passVisibleConfirm;

    if (passVisibleConfirm) {
        confirm_pass.setEchoChar((char) 0); // Show characters
        showPass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/view.png")));
    } else {
        confirm_pass.setEchoChar('•'); // Hide characters
        showPass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hiddens.png")));
    }
    }//GEN-LAST:event_showPass1MouseClicked

    
    private boolean passVisibleNew = false;
    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        
         passVisibleNew = !passVisibleNew;

     if (passVisibleNew) {
        new_pass.setEchoChar((char) 0); // Show characters
        showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/view.png")));
    } else {
        new_pass.setEchoChar('•'); // Hide characters
        showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hiddens.png")));
    }

    }//GEN-LAST:event_showPassMouseClicked

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

        try {
            connectDB con = new connectDB();
            Session sess = Session.getInstance(); // Use existing session
            Connection cn = con.getConnection();

            // Ensure connection is not null
            if (cn == null) {
                JOptionPane.showMessageDialog(null, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Debug: Print Session User ID
            System.out.println("Session User ID: " + sess.getUser_id());

            // Ensure session user ID is valid
            String userIdStr = sess.getUser_id();
            if (userIdStr == null || userIdStr.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Session user ID is missing!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int userId = Integer.parseInt(userIdStr); // Convert user ID safely

            // Retrieve input passwords
            String newPasswordInput = new_pass.getText();
            String confirmPasswordInput = confirm_pass.getText();

            // **Validation Checks**
            if (newPasswordInput.isEmpty()) {
                setInvalidTitledBorder(new_pass, "New Password");
                displayError(pass1_error, "Field cannot be empty!");
                valid = false;
            } else if (newPasswordInput.length() < 8) {
                setInvalidTitledBorder(new_pass, "New Password");
                displayError(pass1_error, "Password Too Short!");
                valid = false;
            }

            if (confirmPasswordInput.isEmpty()) {
                setInvalidTitledBorder(confirm_pass, "Confirm Password");
                displayError(pass2_error, "Field cannot be empty!");
                valid = false;
            }

            if (!newPasswordInput.isEmpty() && !confirmPasswordInput.isEmpty() && !newPasswordInput.equals(confirmPasswordInput)) {
                setInvalidTitledBorder(new_pass, "New Password");
                setInvalidTitledBorder(confirm_pass, "Confirm Password");
                displayError(pass2_error, "Passwords DO NOT Match!");
                displayError(pass1_error, "Passwords DO NOT Match!");
                valid = false;
            }

            // **Stop execution if validation fails**
            if (!valid) {
                return;
            }

            // **Update password directly without checking old password**
            String newHashedPass = Util.hashPassword(newPasswordInput);

            String updateQuery = "UPDATE user SET password = ? WHERE u_id = ?";
            PreparedStatement updatePst = cn.prepareStatement(updateQuery);
            updatePst.setString(1, newHashedPass);
            updatePst.setInt(2, userId);

            int rowsUpdated = updatePst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Password successfully reset! Please log in again.");

                // Clear session (log out user)
                sess.setUser_id(null);

                LOGIN log = new LOGIN();
                log.setVisible(true);
                this.dispose();
               
            } else {
                JOptionPane.showMessageDialog(null, "Failed to reset password!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            updatePst.close();
            cn.close();

        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error! " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_subActionPerformed

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
        return;
    }//GEN-LAST:event_closeMouseClicked


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
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private ColorGrading.Light_Yellow light_Yellow2;
    private javax.swing.JLabel mini;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JLabel pass1_error;
    private javax.swing.JLabel pass2_error;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    private Swing.Button sub;
    // End of variables declaration//GEN-END:variables
}
