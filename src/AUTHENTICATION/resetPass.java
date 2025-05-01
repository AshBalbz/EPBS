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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

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
            textField.setForeground(Color.decode("#F5E196"));
    }
      }

    public void setInvalidTitledBorder(JComponent component, String title) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(new Color(255, 105, 97)),  // Red border for invalid input
            title,
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("Franklin Gothic Medium", Font.PLAIN, 16),
            new Color(255, 105, 97) // Red text color for the title
        );

        component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

        // Make text field background fully transparent
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            textField.setOpaque(false); 
            textField.setBackground(new Color(0, 0, 0, 0)); 
            textField.setCaretColor(Color.WHITE); // Make sure cursor is visible
            textField.setForeground(new Color(255, 105, 97));
        }
    }
    
     private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(new Color(255, 105, 97));
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        n_pass = new javax.swing.JTextField();
        v_pass = new javax.swing.JTextField();
        vc = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        n_pass.setForeground(new java.awt.Color(153, 153, 153));
        n_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "New Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        n_pass.setCaretColor(new java.awt.Color(240, 240, 240));
        n_pass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        n_pass.setOpaque(false);
        n_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                n_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                n_passFocusLost(evt);
            }
        });
        n_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_passActionPerformed(evt);
            }
        });
        jPanel1.add(n_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 60));

        v_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        v_pass.setForeground(new java.awt.Color(153, 153, 153));
        v_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Verify Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        v_pass.setCaretColor(new java.awt.Color(240, 240, 240));
        v_pass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        v_pass.setOpaque(false);
        v_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                v_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                v_passFocusLost(evt);
            }
        });
        v_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_passActionPerformed(evt);
            }
        });
        jPanel1.add(v_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, 60));

        vc.setBackground(new java.awt.Color(51, 51, 51));
        vc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        vc.setForeground(new java.awt.Color(255, 255, 255));
        vc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vc.setText("Save");
        vc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vcMouseClicked(evt);
            }
        });
        jPanel1.add(vc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 76, 26));

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
    }// </editor-fold>//GEN-END:initComponents

    private void n_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_passFocusGained
        n_pass.setForeground(Color.WHITE);
        setTitledBorder(n_pass, "New Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_n_passFocusGained

    private void n_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_passFocusLost
      
    }//GEN-LAST:event_n_passFocusLost

    private void n_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_passActionPerformed

    private void v_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_passFocusGained
        v_pass.setForeground(Color.WHITE);
        setTitledBorder(v_pass, "Verify Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_v_passFocusGained

    private void v_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_passFocusLost
        
    }//GEN-LAST:event_v_passFocusLost

    private void v_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_passActionPerformed

    private void vcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vcMouseClicked
        // Get new password input
        String newPassword = n_pass.getText().trim();
        String confirmPassword = v_pass.getText().trim();

        // Validate input fields
        if (newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter and confirm your new password.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Try again.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Get the user ID from session
            Session sess = Session.getInstance();
            int userId = Integer.parseInt(sess.getUser_id());

            if (userId == -1) {
                JOptionPane.showMessageDialog(this, "Session expired. Please log in again.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hash the new password
            String hashedPassword = Util.hashPassword(newPassword);

            // Database connection
            connectDB con = new connectDB();
            Connection connection = con.getConnection();

            // Update password query
            String updateQuery = "UPDATE user SET password = ? WHERE u_id = ?";
            PreparedStatement pst = connection.prepareStatement(updateQuery);
            pst.setString(1, hashedPassword);
            pst.setInt(2, userId);

            int updated = pst.executeUpdate();

            if (updated > 0) {
                // **Clear the session before redirecting**
                sess.setUser_id(null);

                JOptionPane.showMessageDialog(this, "Password reset successful! Please log in with your new password.", "Success", JOptionPane.INFORMATION_MESSAGE);
                new LOGIN().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password reset failed. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            connection.close();

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_vcMouseClicked

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JTextField n_pass;
    public javax.swing.JTextField v_pass;
    private javax.swing.JLabel vc;
    // End of variables declaration//GEN-END:variables
}
