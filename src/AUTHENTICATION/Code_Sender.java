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
public class Code_Sender extends javax.swing.JPanel {

    /**
     * Creates new form Forgot_pass
     */
    public Code_Sender() {
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

        efield = new javax.swing.JTextField();
        email_error = new javax.swing.JLabel();
        send = new javax.swing.JPanel();
        s = new javax.swing.JLabel();
        verification = new javax.swing.JTextField();
        code_error = new javax.swing.JLabel();
        verify = new javax.swing.JPanel();
        vc = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        efield.setCaretColor(new java.awt.Color(240, 240, 240));
        efield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        efield.setOpaque(false);
        efield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                efieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                efieldFocusLost(evt);
            }
        });
        efield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efieldActionPerformed(evt);
            }
        });
        add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 60));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 270, 20));

        send.setBackground(new java.awt.Color(0, 0, 0));
        send.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendMouseExited(evt);
            }
        });
        send.setLayout(new java.awt.BorderLayout());

        s.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s.setText("Send");
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
        });
        send.add(s, java.awt.BorderLayout.CENTER);

        add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 80, 30));

        verification.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        verification.setForeground(new java.awt.Color(153, 153, 153));
        verification.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Verification Code", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16))); // NOI18N
        verification.setCaretColor(new java.awt.Color(240, 240, 240));
        verification.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        verification.setOpaque(false);
        verification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                verificationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                verificationFocusLost(evt);
            }
        });
        verification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificationActionPerformed(evt);
            }
        });
        add(verification, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, 60));

        code_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        code_error.setForeground(new java.awt.Color(255, 102, 102));
        add(code_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 270, 20));

        verify.setBackground(new java.awt.Color(0, 0, 0));
        verify.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setLayout(new java.awt.BorderLayout());

        vc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        vc.setForeground(new java.awt.Color(255, 255, 255));
        vc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vc.setText("Verify Code");
        verify.add(vc, java.awt.BorderLayout.CENTER);

        add(verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void efieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusGained
        efield.setForeground(Color.WHITE);
        setTitledBorder(efield, "Email", Color.decode("#F5E196"));
    }//GEN-LAST:event_efieldFocusGained

    private void efieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusLost
        displayError(email_error, "");
        setTitledBorder(efield, "Email", Color.WHITE);
        efield.setForeground(Color.WHITE);
    }//GEN-LAST:event_efieldFocusLost

    private void efieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efieldActionPerformed

    private void verificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificationFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_verificationFocusGained

    private void verificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verificationFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_verificationFocusLost

    private void verificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verificationActionPerformed

    private void sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseClicked
      boolean valid = true; 
        
      String email = efield.getText().trim();
       
       if(!isEmailValid(email)){
           setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Invalid email!");
            valid = false;
       }
    }//GEN-LAST:event_sMouseClicked

    private void sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMouseClicked

    private void sendMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseEntered
        send.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_sendMouseEntered

    private void sendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMouseExited
        send.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_sendMouseExited

 private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel code_error;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel s;
    private javax.swing.JPanel send;
    private javax.swing.JLabel vc;
    public javax.swing.JTextField verification;
    private javax.swing.JPanel verify;
    // End of variables declaration//GEN-END:variables
}
