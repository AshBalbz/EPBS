/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.JOptionPane;
import config.connectDB;

/**
 *
 * @author mikel
 */
public class REGISTRATION extends javax.swing.JFrame {

    /**
     * Creates new form REGISTRATION
     */
    public REGISTRATION() {
        initComponents();
    }
    
        private Color hoverColor = new Color(180, 180, 180); // Grayish color on hover
        private Color defaultColor = new Color(255, 255, 255); // Default white color
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        System_Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Registration = new javax.swing.JLabel();
        Balbz_logo = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        nfield = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        acc_type = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        email1 = new javax.swing.JLabel();
        ufield = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        createpass = new javax.swing.JPasswordField();
        pass1 = new javax.swing.JLabel();
        sps1 = new javax.swing.JCheckBox();
        sp1 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        pass2 = new javax.swing.JLabel();
        sp2 = new javax.swing.JLabel();
        sps2 = new javax.swing.JCheckBox();
        sign_up = new javax.swing.JButton();
        acc = new javax.swing.JLabel();
        sign_in = new javax.swing.JLabel();
        BG2 = new javax.swing.JLabel();

        System_Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 20)); // NOI18N
        System_Name.setForeground(new java.awt.Color(250, 249, 190));
        System_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System_Name.setText("Event Photography Booking System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registration.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        Registration.setForeground(new java.awt.Color(250, 249, 190));
        Registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registration.setText("Registration");
        jPanel2.add(Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 220, 30));

        Balbz_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo1.png"))); // NOI18N
        jPanel2.add(Balbz_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 100, 120));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/icons8-registration-64.png"))); // NOI18N
        jPanel2.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, -1));

        nfield.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        nfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nfieldMouseClicked(evt);
            }
        });
        nfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfieldActionPerformed(evt);
            }
        });
        jPanel2.add(nfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 220, 30));

        name.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 240));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Full Name");
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 20));

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        efield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        efield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efieldActionPerformed(evt);
            }
        });
        jPanel2.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 220, 30));

        email.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 240));
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("Email");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        role.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 100, 30));

        acc_type.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        acc_type.setForeground(new java.awt.Color(255, 255, 240));
        acc_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_type.setText("Role");
        jPanel2.add(acc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 100, -1));

        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        pfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfieldActionPerformed(evt);
            }
        });
        jPanel2.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 220, 30));

        email1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        email1.setForeground(new java.awt.Color(255, 255, 240));
        email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email1.setText("Phone Number");
        jPanel2.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 220, -1));

        ufield.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        ufield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ufield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufieldActionPerformed(evt);
            }
        });
        jPanel2.add(ufield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 220, 30));

        username.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 240));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 20));

        createpass.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        createpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, 30));

        pass1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        pass1.setForeground(new java.awt.Color(255, 255, 240));
        pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass1.setText("Create Password");
        jPanel2.add(pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 220, 20));

        sps1.setBackground(new java.awt.Color(24, 24, 24));
        sps1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sps1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sps1MouseClicked(evt);
            }
        });
        sps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sps1ActionPerformed(evt);
            }
        });
        jPanel2.add(sps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 20, 30));

        sp1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sp1.setForeground(new java.awt.Color(255, 255, 240));
        sp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp1.setText("Show Password");
        jPanel2.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, 30));

        confirmpass.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, 30));

        pass2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        pass2.setForeground(new java.awt.Color(255, 255, 240));
        pass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass2.setText("Confirm Password");
        jPanel2.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 220, 20));

        sp2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sp2.setForeground(new java.awt.Color(255, 255, 240));
        sp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sp2.setText("Show Password");
        jPanel2.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 30));

        sps2.setBackground(new java.awt.Color(24, 24, 24));
        sps2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sps2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sps2MouseClicked(evt);
            }
        });
        sps2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sps2ActionPerformed(evt);
            }
        });
        jPanel2.add(sps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 20, 30));

        sign_up.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sign_up.setText("Sign Up");
        sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_upMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_upMouseExited(evt);
            }
        });
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });
        jPanel2.add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        acc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        acc.setForeground(new java.awt.Color(255, 255, 240));
        acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc.setText("Already have an account? ");
        jPanel2.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 190, 30));

        sign_in.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sign_in.setForeground(new java.awt.Color(255, 255, 51));
        sign_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_in.setText("Click here to Sign In");
        sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_inMouseClicked(evt);
            }
        });
        jPanel2.add(sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 190, 30));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/G2.png"))); // NOI18N
        jPanel2.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efieldActionPerformed

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
    }//GEN-LAST:event_roleActionPerformed

    private void nfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nfieldActionPerformed

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void sps1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sps1MouseClicked
        if (sps1.isSelected()) {
            createpass.setEchoChar((char) 0);  // Show password
        } else {
            createpass.setEchoChar('*');  // Hide password
        }      }//GEN-LAST:event_sps1MouseClicked

    private void sps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sps1ActionPerformed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sign_upActionPerformed

    private void sps2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sps2MouseClicked
        if (sps2.isSelected()) {
            confirmpass.setEchoChar((char) 0);  // Show password
        } else {
            confirmpass.setEchoChar('*');  // Hide password
        }   
    }//GEN-LAST:event_sps2MouseClicked

    private void sps2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sps2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sps2ActionPerformed

    private void nfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nfieldMouseClicked

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked
        String name = nfield.getText().trim();
        String email = efield.getText().trim();
        String pass1 = new String(createpass.getPassword()).trim();
        String pass2 = new String(confirmpass.getPassword()).trim();
        String contact = pfield.getText().trim();

    // Validate empty fields
    if (name.isEmpty() || email.isEmpty() || pass1.isEmpty() || pass2.isEmpty() || contact.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate email format
    String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    if (!email.matches(emailRegex)) {
        JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate contact number (only digits allowed)
    if (!contact.matches("\\d+")) {
        JOptionPane.showMessageDialog(this, "Contact number must contain only numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate password match
    if (!pass1.equals(pass2)) {
        JOptionPane.showMessageDialog(this, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validate password strength
    String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
    if (!pass1.matches(passwordRegex)) {
        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:\n"
                + "- One uppercase letter\n"
                + "- One lowercase letter\n"
                + "- One number\n"
                + "- One special character (@#$%^&+=!)", 
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
        
    } else {
        connectDB con = new connectDB();
        int result = con.InsertData("INSERT INTO user (u_fname, email, contact, username, password, role) "
                + "VALUES ('"+nfield.getText()+"', "
                         + "'"+efield.getText()+"',"
                         + "'"+pfield.getText()+"',"
                         + "'"+ufield.getText()+"',"
                         + "'"+confirmpass.getText()+"',"
                          + "'"+role.getSelectedItem()+"')");
       if (result == 1) {
                       JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                       new LOGIN().setVisible(true);
                       this.dispose();
                   } 
                   else {
                       JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
    }

    // Proceed to the next step (e.g., saving to the database)
    JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_sign_upMouseClicked

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void sign_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseClicked
        LOGIN log = new LOGIN();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sign_inMouseClicked

    private void sign_upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseEntered
        sign_up.setBackground(defaultColor);
    }//GEN-LAST:event_sign_upMouseEntered

    private void sign_upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseExited
        sign_up.setBackground(hoverColor);
    }//GEN-LAST:event_sign_upMouseExited

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel Balbz_logo;
    private javax.swing.JLabel Registration;
    private javax.swing.JLabel System_Name;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel acc_type;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JTextField efield;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nfield;
    private javax.swing.JLabel pass1;
    private javax.swing.JLabel pass2;
    private javax.swing.JTextField pfield;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel sign_in;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel sp1;
    private javax.swing.JLabel sp2;
    private javax.swing.JCheckBox sps1;
    private javax.swing.JCheckBox sps2;
    private javax.swing.JTextField ufield;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
