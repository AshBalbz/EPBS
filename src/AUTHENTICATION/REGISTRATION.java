
package AUTHENTICATION;

import java.awt.Color;
import javax.swing.JOptionPane;
import CONFIG.connectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


public class REGISTRATION extends javax.swing.JFrame {

    
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
        fn_icon = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        c_icon = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        pass1_icon = new javax.swing.JLabel();
        pass2_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        nfield = new javax.swing.JTextField();
        efield = new javax.swing.JTextField();
        pfield = new javax.swing.JTextField();
        ufield = new javax.swing.JTextField();
        showPass = new javax.swing.JLabel();
        showPass1 = new javax.swing.JLabel();
        createpass = new javax.swing.JPasswordField();
        confirmpass = new javax.swing.JPasswordField();
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

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel2.add(fn_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 30, 30));

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        jPanel2.add(e_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 30, 30));

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        jPanel2.add(c_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, 30));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel2.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 30, 30));

        pass1_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass1_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass1_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 30, 30));

        pass2_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass2_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass2_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 30, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/setting.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 40, 30));

        role.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        role.setForeground(new java.awt.Color(153, 153, 153));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 100, 30));

        nfield.setBackground(new java.awt.Color(255, 255, 250));
        nfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        nfield.setForeground(new java.awt.Color(153, 153, 153));
        nfield.setText(" Enter full name...");
        nfield.setToolTipText("");
        nfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nfieldFocusLost(evt);
            }
        });
        nfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nfieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nfieldMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nfieldMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nfieldMouseReleased(evt);
            }
        });
        nfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nfieldActionPerformed(evt);
            }
        });
        jPanel2.add(nfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 220, 30));

        efield.setBackground(new java.awt.Color(255, 255, 250));
        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setText(" Enter email...");
        efield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        efield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                efieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                efieldFocusLost(evt);
            }
        });
        efield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                efieldMousePressed(evt);
            }
        });
        efield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efieldActionPerformed(evt);
            }
        });
        jPanel2.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 220, 30));

        pfield.setBackground(new java.awt.Color(255, 255, 250));
        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setText(" Enter phone number...");
        pfield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        pfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfieldFocusLost(evt);
            }
        });
        pfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pfieldMousePressed(evt);
            }
        });
        pfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfieldActionPerformed(evt);
            }
        });
        jPanel2.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 220, 30));

        ufield.setBackground(new java.awt.Color(255, 255, 250));
        ufield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        ufield.setForeground(new java.awt.Color(153, 153, 153));
        ufield.setText(" Enter username...");
        ufield.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ufield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ufieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ufieldFocusLost(evt);
            }
        });
        ufield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ufieldMousePressed(evt);
            }
        });
        ufield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufieldActionPerformed(evt);
            }
        });
        jPanel2.add(ufield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 220, 30));

        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hidden.png"))); // NOI18N
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 40, 30));

        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hidden.png"))); // NOI18N
        showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPass1MouseClicked(evt);
            }
        });
        jPanel2.add(showPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 30, 30));

        createpass.setBackground(new java.awt.Color(240, 240, 240));
        createpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        createpass.setForeground(new java.awt.Color(153, 153, 153));
        createpass.setText(" Create password...");
        createpass.setEchoChar('\u0000');
        createpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                createpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                createpassFocusLost(evt);
            }
        });
        createpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createpassMousePressed(evt);
            }
        });
        createpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpassActionPerformed(evt);
            }
        });
        jPanel2.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 220, 30));

        confirmpass.setBackground(new java.awt.Color(240, 240, 240));
        confirmpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        confirmpass.setForeground(new java.awt.Color(153, 153, 153));
        confirmpass.setText(" Confirm password...");
        confirmpass.setEchoChar('\u0000');
        confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassFocusLost(evt);
            }
        });
        confirmpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                confirmpassMousePressed(evt);
            }
        });
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 220, 30));

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
        jPanel2.add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_inMouseExited(evt);
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
    }//GEN-LAST:event_roleActionPerformed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
       
    }//GEN-LAST:event_sign_upActionPerformed

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked
        String name = nfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String username = ufield.getText().trim();
        String pass1 = new String(createpass.getPassword()).trim();
        String pass2 = new String(confirmpass.getPassword()).trim();
        String roleSelected = (role.getSelectedItem() != null) ? role.getSelectedItem().toString() : "";
        
        JComponent[] fields = {nfield, efield, pfield, ufield, createpass, confirmpass};
        for (JComponent field : fields) {
            field.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
        }

        if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || username.isEmpty() || pass1.isEmpty() || pass2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean hasError = false;
        StringBuilder errorMsg = new StringBuilder();

        if (name.isEmpty() || name.equals("Enter full name...")) {
            errorMsg.append("Full Name cannot be empty!\n");
            nfield.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (email.isEmpty() || email.equals("Enter email...")) {
            errorMsg.append("Email cannot be empty!\n");
            efield.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (contact.isEmpty() || contact.equals("Enter phone number...")) {
            errorMsg.append("Contact Number cannot be empty!\n");
            pfield.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (username.isEmpty() || username.equals("Enter username...")) {
            errorMsg.append("Username cannot be empty!\n");
            ufield.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (pass1.isEmpty() || pass1.equals("Create password...")) {
            errorMsg.append("Password cannot be empty!\n");
            createpass.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (pass2.isEmpty() || pass2.equals("Confirm password...")) {
            errorMsg.append("Confirm Password cannot be empty!\n");
            confirmpass.setBorder(new LineBorder(Color.RED, 2));
            hasError = true;
        }

        if (roleSelected.isEmpty()) { 
            errorMsg.append("Please select a role!\n");
            hasError = true;
        }

        if (hasError) {
            JOptionPane.showMessageDialog(null, errorMsg.toString(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
            efield.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        if (!contact.matches("\\d{10,15}")) {
            JOptionPane.showMessageDialog(null, "Contact number must be between 10 to 15 digits. It should be number only!", "Error", JOptionPane.ERROR_MESSAGE);
            pfield.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        // Validate password match
        if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            createpass.setBorder(new LineBorder(Color.RED, 2));
            confirmpass.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        // Validate password strength
        if (!pass1.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$")) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters and include:\n"
                    + "- One uppercase letter\n"
                    + "- One lowercase letter\n"
                    + "- One number\n"
                    + "- One special character (@#$%^&*()_+-=[]{};':\"\\|,.<>/?)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            createpass.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        // Database Connection
        connectDB con = new connectDB();
        Connection cn = con.getConnection(); 

        if (cn == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // **Check if email already exists**
            String checkEmailSql = "SELECT COUNT(*) FROM user WHERE email = ?";
            try (PreparedStatement emailPst = cn.prepareStatement(checkEmailSql)) {
                emailPst.setString(1, email);
                ResultSet rsEmail = emailPst.executeQuery();
                if (rsEmail.next() && rsEmail.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // **Check if username already exists**
            String checkUsernameSql = "SELECT COUNT(*) FROM user WHERE username = ?";
            try (PreparedStatement usernamePst = cn.prepareStatement(checkUsernameSql)) {
                usernamePst.setString(1, username);
                ResultSet rsUsername = usernamePst.executeQuery();
                if (rsUsername.next() && rsUsername.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(null, "Username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // **Insert Data Securely**
            String insertSql = "INSERT INTO user (u_fname, email, contact, username, password, role, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pst = cn.prepareStatement(insertSql)) {
                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, contact);
                pst.setString(4, username);
                pst.setString(5, pass1); // TODO: Hash password before saving
                pst.setString(6, roleSelected);
                pst.setString(7, "Inactive");

                int result = pst.executeUpdate();
                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "Registered Successfully!");
                    new LOGIN().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (cn != null) cn.close(); // Ensure connection is closed
            } catch (SQLException ex) {
                Logger.getLogger(REGISTRATION.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

   



    }//GEN-LAST:event_sign_upMouseClicked

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

    private void efieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusGained
           if(efield.getText().equals(" Enter email...")){
            efield.setText("");
            efield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_efieldFocusGained

    private void efieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusLost
        if(efield.getText().isEmpty()){
            efield.setText(" Enter email...");
            efield.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_efieldFocusLost

    private void efieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efieldActionPerformed

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
            if(pfield.getText().equals(" Enter phone number...")){
            pfield.setText("");
            pfield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pfieldFocusGained

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
        if(pfield.getText().isEmpty()){
            pfield.setText(" Enter phone number...");
            pfield.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void nfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nfieldActionPerformed

    private void nfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nfieldFocusLost
        if(nfield.getText().isEmpty()){
            nfield.setText(" Enter full name...");
            nfield.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_nfieldFocusLost

    private void nfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nfieldFocusGained
        if(nfield.getText().equals(" Enter full name...")){
            nfield.setText("");
            nfield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nfieldFocusGained

    private void ufieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusGained
        if(ufield.getText().equals(" Enter username...")){
            ufield.setText("");
            ufield.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_ufieldFocusGained

    private void ufieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusLost
        if(ufield.getText().isEmpty()){
            ufield.setText(" Enter username...");
            ufield.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_ufieldFocusLost

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

    private void createpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusGained
        if (new String(createpass.getPassword()).equals(" Create password...")) {
            createpass.setText("");
            createpass.setEchoChar('•'); // Mask password
            createpass.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_createpassFocusGained

    private void createpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusLost
        if (new String(createpass.getPassword()).isEmpty()) {
            createpass.setText(" Create password...");
            createpass.setEchoChar((char) 0); // Show text instead of masked chars
            createpass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_createpassFocusLost

    private void createpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createpassActionPerformed

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        if (new String(confirmpass.getPassword()).equals(" Confirm password...")) {
            confirmpass.setText("");
            confirmpass.setEchoChar('•'); // Mask password
            confirmpass.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_confirmpassFocusGained

    private void confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusLost
        if (new String(confirmpass.getPassword()).isEmpty()) {
            confirmpass.setText(" Confirm password...");
            confirmpass.setEchoChar((char) 0); // Show text instead of masked chars
            confirmpass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_confirmpassFocusLost

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed
    
    boolean pass_visible = false;
    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        pass_visible = !pass_visible;
        String currentText = createpass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("Create password...")) {
                createpass.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/view.png")));
        } else {
            if (!currentText.equals("Create password...")) {
                createpass.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hidden.png")));
        }
    }//GEN-LAST:event_showPassMouseClicked
    
    boolean pass_visible1 = false;
    private void showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MouseClicked
        pass_visible1 = !pass_visible1;
        String currentText = confirmpass.getText().trim();

        if (pass_visible1) {
            if (!currentText.equals("Confirm password...")) {
                confirmpass.setEchoChar((char) 0);
            }
            showPass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/view.png")));
        } else {
            if (!currentText.equals("Confirm password...")) {
                confirmpass.setEchoChar('•');
            }
            showPass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hidden.png")));
        }
    }//GEN-LAST:event_showPass1MouseClicked

    private void sign_inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseEntered
            sign_in.setForeground(new Color(231,231,198));

    }//GEN-LAST:event_sign_inMouseEntered

    private void sign_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseExited
            sign_in.setForeground(new Color(255,255,0));
    }//GEN-LAST:event_sign_inMouseExited

    private void nfieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfieldMouseEntered
           
    }//GEN-LAST:event_nfieldMouseEntered

    private void nfieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfieldMousePressed
        nfield.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_nfieldMousePressed

    private void nfieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfieldMouseReleased
        
    }//GEN-LAST:event_nfieldMouseReleased

    private void nfieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nfieldMouseExited
        
    }//GEN-LAST:event_nfieldMouseExited

    private void efieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efieldMousePressed
        efield.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_efieldMousePressed

    private void pfieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfieldMousePressed
        pfield.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_pfieldMousePressed

    private void ufieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufieldMousePressed
        ufield.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_ufieldMousePressed

    private void createpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createpassMousePressed
        createpass.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_createpassMousePressed

    private void confirmpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmpassMousePressed
        confirmpass.setBorder(new LineBorder(Color.BLACK, 1));
    }//GEN-LAST:event_confirmpassMousePressed

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
    private javax.swing.JLabel c_icon;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JLabel e_icon;
    private javax.swing.JTextField efield;
    private javax.swing.JLabel fn_icon;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nfield;
    private javax.swing.JLabel pass1_icon;
    private javax.swing.JLabel pass2_icon;
    private javax.swing.JTextField pfield;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    private javax.swing.JLabel sign_in;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel u_icon;
    private javax.swing.JTextField ufield;
    // End of variables declaration//GEN-END:variables
}
