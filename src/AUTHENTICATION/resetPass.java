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
import javax.swing.ImageIcon;
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
        createpass = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
        createpass_error = new javax.swing.JLabel();
        confirmpass_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        createpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        createpass.setForeground(new java.awt.Color(153, 153, 153));
        createpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "New Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        createpass.setEchoChar('\u0000');
        createpass.setOpaque(false);
        createpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                createpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                createpassFocusLost(evt);
            }
        });
        createpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpassActionPerformed(evt);
            }
        });
        jPanel2.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 410, 60));

        confirmpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        confirmpass.setForeground(new java.awt.Color(153, 153, 153));
        confirmpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Verify Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        confirmpass.setEchoChar('\u0000');
        confirmpass.setOpaque(false);
        confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassFocusLost(evt);
            }
        });
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 410, 60));

        createpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        createpass_error.setForeground(new java.awt.Color(255, 51, 51));
        createpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(createpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 410, 20));

        confirmpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        confirmpass_error.setForeground(new java.awt.Color(255, 51, 51));
        confirmpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(confirmpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 410, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 580, 400));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        security in = new security();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        confirmpass.setEchoChar('•'); // Mask password
        confirmpass.setForeground(Color.WHITE);
        setTitledBorder(confirmpass, "Confirm Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_confirmpassFocusGained

    private void confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusLost
        setTitledBorder(confirmpass, "Confirm Password", Color.WHITE);
        confirmpass.setForeground(Color.WHITE);
        displayError(confirmpass_error, "");
    }//GEN-LAST:event_confirmpassFocusLost

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void createpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusGained
        createpass.setEchoChar('•'); // Mask password
        createpass.setForeground(Color.WHITE);
        setTitledBorder(createpass, "Create Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_createpassFocusGained

    private void createpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusLost

        setTitledBorder(createpass, "Create Password", Color.WHITE);
        createpass.setForeground(Color.WHITE);
        displayError(createpass_error, "");
    }//GEN-LAST:event_createpassFocusLost

    private void createpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createpassActionPerformed

    private void showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MouseClicked
        pass_visible = !pass_visible;
        String currentText = confirmpass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                confirmpass.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                confirmpass.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_showPass1MouseClicked

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        
        pass_visible = !pass_visible;
        String currentText = createpass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                createpass.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                createpass.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }   
    }//GEN-LAST:event_showPassMouseClicked

    boolean pass_visible = true;
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
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel confirmpass_error;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JLabel createpass_error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    // End of variables declaration//GEN-END:variables
}
