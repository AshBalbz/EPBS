
package ADMINISTRATOR;

import AUTHENTICATION.LOGIN;
import CONFIG.Session;
import CONFIG.Util;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mikel
 */
public class Change_pass extends javax.swing.JPanel {

    /**
     * Creates new form Change_pass
     */
    public Change_pass() {
        initComponents();
        
        
        current_pass.setBackground(new java.awt.Color(0,0,0,1));
        new_pass.setBackground(new java.awt.Color(0,0,0,1));
        confirm_pass.setBackground(new java.awt.Color(0,0,0,1));
        
    }
    
      
     
    private static void centerJPanel(JDesktopPane desktopPane, JPanel panel) {
       int x = (desktopPane.getWidth() - panel.getWidth()) / 2;
       int y = (desktopPane.getHeight() - panel.getHeight()) / 2;
       panel.setLocation(x, y);
   }



        private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(java.awt.Color.RED);
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
            BorderFactory.createLineBorder(Color.RED, 1),  // Red border for invalid input
            title,
            TitledBorder.LEFT,
            TitledBorder.TOP,
            new Font("Franklin Gothic Medium", Font.PLAIN, 16),
            Color.RED // Red text color for the title
        );

        component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

        // Make text field background fully transparent
        if (component instanceof JTextField) {
            JTextField textField = (JTextField) component;
            textField.setOpaque(false); 
            textField.setBackground(new Color(0, 0, 0, 0)); 
            textField.setCaretColor(Color.WHITE); // Make sure cursor is visible
            textField.setForeground(Color.RED);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yellow_Gradient1 = new ColorGrading.Yellow_Gradient();
        jPanel1 = new javax.swing.JPanel();
        show_pass = new javax.swing.JLabel();
        show_pass1 = new javax.swing.JLabel();
        show_pass2 = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        current_pass = new javax.swing.JPasswordField();
        new_pass = new javax.swing.JPasswordField();
        confirm_pass = new javax.swing.JPasswordField();
        pass1_error = new javax.swing.JLabel();
        pass2_error = new javax.swing.JLabel();
        pass3_error = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(589, 374));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_passMouseClicked(evt);
            }
        });
        jPanel1.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 40, 60));

        show_pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        jPanel1.add(show_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 40, 50));

        show_pass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        jPanel1.add(show_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 40, 50));

        save.setBackground(new java.awt.Color(255, 255, 204));
        save.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 204));
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        cancel.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 204));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        details.setForeground(new java.awt.Color(255, 255, 255));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("CHANGE PASSWORD");
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        current_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        current_pass.setForeground(new java.awt.Color(153, 153, 153));
        current_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        current_pass.setEchoChar('\u0000');
        current_pass.setOpaque(false);
        current_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                current_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                current_passFocusLost(evt);
            }
        });
        current_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                current_passActionPerformed(evt);
            }
        });
        jPanel1.add(current_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 60));

        new_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        new_pass.setForeground(new java.awt.Color(153, 153, 153));
        new_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "New Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        new_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_passMouseClicked(evt);
            }
        });
        new_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_passActionPerformed(evt);
            }
        });
        jPanel1.add(new_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 270, 60));

        confirm_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        confirm_pass.setForeground(new java.awt.Color(153, 153, 153));
        confirm_pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        confirm_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_passMouseClicked(evt);
            }
        });
        confirm_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_passActionPerformed(evt);
            }
        });
        jPanel1.add(confirm_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 270, 60));

        pass1_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        pass1_error.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.add(pass1_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 130, 20));

        pass2_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        pass2_error.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.add(pass2_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 130, 20));

        pass3_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        pass3_error.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.add(pass3_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 130, 20));

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
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
            String oldPasswordInput = current_pass.getText();
            String newPasswordInput = new_pass.getText();
            String confirmPasswordInput = confirm_pass.getText();

            // Check if new password and confirm password match
            if (!newPasswordInput.equals(confirmPasswordInput)) {
                JOptionPane.showMessageDialog(null, "New Password and Confirm Password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Query to get the current password
            String query = "SELECT password FROM user WHERE u_id = ?";
            PreparedStatement pst = cn.prepareStatement(query);
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String oldDbPass = rs.getString("password");

                // Verify old password before updating
                if (Util.verifyPassword(oldPasswordInput, oldDbPass)) { 
                    String newHashedPass = Util.hashPassword(newPasswordInput);
                    // Update password securely
                    String updateQuery = "UPDATE user SET password = ? WHERE u_id = ?";
                    PreparedStatement updatePst = cn.prepareStatement(updateQuery);
                    updatePst.setString(1, newHashedPass);
                    updatePst.setInt(2, userId);
                    int rowsUpdated = updatePst.executeUpdate();
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(null, "Password successfully updated! Please log in again.");
                        
                        // Clear session (log out user)
                        sess.setUser_id(null);
                        
                        // Open login form **AFTER closing other windows**
                        LOGIN in = new LOGIN();
                        
                        // Close all open frames and dialogs
                        for (Window window : Window.getWindows()) {
                            if (window instanceof JFrame || window instanceof JDialog) {
                                window.dispose();  // Dispose both JFrame and JDialog
                            }
                        }
                        
                        // Ensure login frame opens after all other windows close
                        SwingUtilities.invokeLater(() -> {
                            in.setVisible(true);
                        });
                    }
                    updatePst.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Old Password is Incorrect");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close resources
            rs.close();
            pst.close();
            cn.close();

        } catch (SQLException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database Error! " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Change_pass.class.getName()).log(Level.SEVERE, null, ex);
        }
            

            

    }//GEN-LAST:event_saveMouseClicked

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setForeground(new Color(255,255,204));
    }//GEN-LAST:event_saveMouseExited

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setForeground(new Color(255,255,204));
    }//GEN-LAST:event_cancelMouseExited

    private void current_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_passFocusGained
        current_pass.setEchoChar('•');
        current_pass.setForeground(Color.WHITE);
        setTitledBorder(current_pass, "Current Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_current_passFocusGained

    private void current_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_current_passFocusLost
        setTitledBorder(current_pass, "Current Password", Color.WHITE);
        current_pass.setForeground(Color.WHITE);
        displayError(pass1_error, "");
    }//GEN-LAST:event_current_passFocusLost

    private void current_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_current_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_current_passActionPerformed

    private void new_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_passFocusGained
        new_pass.setEchoChar('•');
        new_pass.setForeground(Color.WHITE);
        setTitledBorder(new_pass, "New Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_new_passFocusGained

    private void new_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_passFocusLost
        setTitledBorder(new_pass, "New Password", Color.WHITE);
        new_pass.setForeground(Color.WHITE);
        displayError(pass2_error, "");
    }//GEN-LAST:event_new_passFocusLost

    private void new_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_passActionPerformed

    private void confirm_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passFocusGained
        confirm_pass.setEchoChar('•');
        confirm_pass.setForeground(Color.WHITE);
        setTitledBorder(confirm_pass, "Confirm Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_confirm_passFocusGained

    private void confirm_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_passFocusLost
        setTitledBorder(confirm_pass, "Confirm Password", Color.WHITE);
        confirm_pass.setForeground(Color.WHITE);
        displayError(pass3_error, "");
    }//GEN-LAST:event_confirm_passFocusLost

    private void confirm_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirm_passActionPerformed
   
    boolean pass_visible = true;
    private void show_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMouseClicked
        pass_visible = !pass_visible;
        String currentText = current_pass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                current_pass.setEchoChar((char) 0);
            }
            show_pass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                current_pass.setEchoChar('•');
            }
            show_pass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_show_passMouseClicked
   
    private void new_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_passMouseClicked
        pass_visible = !pass_visible;
        String currentText = new_pass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                new_pass.setEchoChar((char) 0);
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                new_pass.setEchoChar('•');
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_new_passMouseClicked

    private void confirm_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirm_passMouseClicked
         pass_visible = !pass_visible;
        String currentText = confirm_pass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                confirm_pass.setEchoChar((char) 0);
            }
            show_pass2.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                confirm_pass.setEchoChar('•');
            }
            show_pass2.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_confirm_passMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JPasswordField current_pass;
    private javax.swing.JLabel details;
    private javax.swing.JPanel jPanel1;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JLabel pass1_error;
    private javax.swing.JLabel pass2_error;
    private javax.swing.JLabel pass3_error;
    private javax.swing.JLabel save;
    private javax.swing.JLabel show_pass;
    private javax.swing.JLabel show_pass1;
    private javax.swing.JLabel show_pass2;
    private ColorGrading.Yellow_Gradient yellow_Gradient1;
    // End of variables declaration//GEN-END:variables
}
