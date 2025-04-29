/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTHENTICATION;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mikel
 */
public class Reset_Pass extends javax.swing.JPanel {

    /**
     * Creates new form Forgot_pass
     */
    public Reset_Pass() {
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

        n_pass = new javax.swing.JTextField();
        email_error = new javax.swing.JLabel();
        v_pass = new javax.swing.JTextField();
        code_error = new javax.swing.JLabel();
        reset = new javax.swing.JPanel();
        vc = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        add(n_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 60));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 270, 20));

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
        add(v_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, 60));

        code_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        code_error.setForeground(new java.awt.Color(255, 102, 102));
        add(code_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 270, 20));

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setLayout(new java.awt.BorderLayout());

        vc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        vc.setForeground(new java.awt.Color(255, 255, 255));
        vc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vc.setText("Save");
        reset.add(vc, java.awt.BorderLayout.CENTER);

        add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void n_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_passFocusGained
        n_pass.setForeground(Color.WHITE);
        setTitledBorder(n_pass, "New Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_n_passFocusGained

    private void n_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_n_passFocusLost
        displayError(email_error, "");
        setTitledBorder(n_pass, "New Password", Color.WHITE);
        n_pass.setForeground(Color.WHITE);
    }//GEN-LAST:event_n_passFocusLost

    private void n_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_n_passActionPerformed

    private void v_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_passFocusGained
        v_pass.setForeground(Color.WHITE);
        setTitledBorder(v_pass, "Verify Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_v_passFocusGained

    private void v_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_v_passFocusLost
        displayError(code_error, "");
        setTitledBorder(v_pass, "Verify Password", Color.WHITE);
        v_pass.setForeground(Color.WHITE);
    }//GEN-LAST:event_v_passFocusLost

    private void v_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_v_passActionPerformed

 private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel code_error;
    private javax.swing.JLabel email_error;
    public javax.swing.JTextField n_pass;
    private javax.swing.JPanel reset;
    public javax.swing.JTextField v_pass;
    private javax.swing.JLabel vc;
    // End of variables declaration//GEN-END:variables
}
