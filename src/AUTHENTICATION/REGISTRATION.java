
package AUTHENTICATION;

import CONFIG.Util;
import java.awt.Color;
import javax.swing.JOptionPane;
import CONFIG.connectDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class REGISTRATION extends javax.swing.JFrame {

    connectDB con = new connectDB();
    
    public REGISTRATION() {
        initComponents();
    }
    
    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
    public void setInvalidBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(Color.RED, 1), 
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
    private void displayError(JLabel field, String message) {
        field.setText(message);
        field.setForeground(java.awt.Color.RED);
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
        fn_icon = new javax.swing.JLabel();
        ln_icon = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        c_icon = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        pass1_icon = new javax.swing.JLabel();
        pass2_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        lnfield = new javax.swing.JTextField();
        name_error = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        email_error = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        contact_error = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        username_error = new javax.swing.JLabel();
        ufield = new javax.swing.JTextField();
        showPass = new javax.swing.JLabel();
        showPass1 = new javax.swing.JLabel();
        createpass_error = new javax.swing.JLabel();
        createpass = new javax.swing.JPasswordField();
        confirmpass_error = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        role_error = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        sign_up = new javax.swing.JButton();
        acc = new javax.swing.JLabel();
        sign_in = new javax.swing.JLabel();
        BG2 = new javax.swing.JLabel();

        System_Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 20)); // NOI18N
        System_Name.setForeground(new java.awt.Color(250, 249, 190));
        System_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System_Name.setText("Event Photography Booking System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registration.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        Registration.setForeground(new java.awt.Color(250, 249, 190));
        Registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registration.setText("Registration");
        jPanel2.add(Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 220, -1));

        Balbz_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo1.png"))); // NOI18N
        jPanel2.add(Balbz_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 100, 120));

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel2.add(fn_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 30, 40));

        ln_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel2.add(ln_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 30, 40));

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        jPanel2.add(e_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 30, 40));

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        jPanel2.add(c_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 30, 40));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel2.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 30, 40));

        pass1_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass1_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass1_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 30, 40));

        pass2_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass2_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass2_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 30, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/setting.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 30, 40));

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 51, 51));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 260, 20));

        lnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        lnfield.setForeground(new java.awt.Color(153, 153, 153));
        lnfield.setText(" Enter last name...");
        lnfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnfieldFocusLost(evt);
            }
        });
        lnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnfieldActionPerformed(evt);
            }
        });
        jPanel2.add(lnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 260, 40));

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 51, 51));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(name_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 260, 20));

        fnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        fnfield.setForeground(new java.awt.Color(153, 153, 153));
        fnfield.setText(" Enter first name...");
        fnfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnfieldFocusLost(evt);
            }
        });
        fnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnfieldActionPerformed(evt);
            }
        });
        jPanel2.add(fnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 260, 40));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 51, 51));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 260, 20));

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setText(" Enter email...");
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
        jPanel2.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 260, 40));

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 51, 51));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(contact_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 260, 20));

        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setText(" Enter phone number...");
        pfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pfieldFocusLost(evt);
            }
        });
        pfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfieldActionPerformed(evt);
            }
        });
        jPanel2.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 260, 40));

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 51, 51));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(username_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 260, 20));

        ufield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        ufield.setForeground(new java.awt.Color(153, 153, 153));
        ufield.setText(" Enter username...");
        ufield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ufieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ufieldFocusLost(evt);
            }
        });
        ufield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufieldActionPerformed(evt);
            }
        });
        jPanel2.add(ufield, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 260, 40));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hidden.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 30, 40));

        showPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hidden.png"))); // NOI18N
        showPass1.setToolTipText("");
        showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPass1MouseClicked(evt);
            }
        });
        jPanel2.add(showPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 30, 40));

        createpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        createpass_error.setForeground(new java.awt.Color(255, 51, 51));
        createpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(createpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 260, 20));

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
        jPanel2.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 260, 40));

        confirmpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        confirmpass_error.setForeground(new java.awt.Color(255, 51, 51));
        confirmpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(confirmpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 260, 20));

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
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, 260, 40));

        role_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        role_error.setForeground(new java.awt.Color(255, 51, 51));
        role_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(role_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 260, 20));

        role.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        role.setForeground(new java.awt.Color(153, 153, 153));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 100, 40));

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
        jPanel2.add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        acc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        acc.setForeground(new java.awt.Color(255, 255, 240));
        acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc.setText("Already have an account? ");
        jPanel2.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 190, 30));

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
        jPanel2.add(sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 190, 30));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/1.png"))); // NOI18N
        jPanel2.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed
    }//GEN-LAST:event_roleActionPerformed

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
       
    }//GEN-LAST:event_sign_upActionPerformed

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked
      boolean valid = true;
      String emptyFieldMessage = "Fields cannot be empty!";


        String fname = fnfield.getText().trim();
        String lname = lnfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String username = ufield.getText().trim();
        String pass1 = new String(createpass.getPassword()).trim();
        String pass2 = new String(confirmpass.getPassword()).trim();
        String roleSelected = (role.getSelectedItem() != null) ? role.getSelectedItem().toString() : "";
        String status = "Pending";

        String hashedPassword = Util.hashPassword(pass1);

         // Input Validations
       
         if (fname.isEmpty() || fname.equals(" Enter first name...")) {
             setInvalidBorder(fnfield);
             displayError(name_error, emptyFieldMessage);
             valid = false;
         }

         if (lname.isEmpty() || lname.equals(" Enter last name...")) {
             setInvalidBorder(lnfield);
             displayError(name_error, emptyFieldMessage);
             valid = false;
         }

         if (email.isEmpty() || email.equals(" Enter email...")) {
             setInvalidBorder(efield);
             displayError(email_error, emptyFieldMessage);
             valid = false;
         } else if (!isEmailValid(email)) {
             setInvalidBorder(efield);
             displayError(email_error, "Invalid Email!");
             valid = false;
         }

         if (contact.isEmpty() || contact.equals(" Enter phone number...")) {
             setInvalidBorder(pfield);
             displayError(contact_error, emptyFieldMessage);
             valid = false;
         }

         if (username.isEmpty() || username.equals(" Enter username...")) {
             setInvalidBorder(ufield);
             displayError(username_error, emptyFieldMessage);
             valid = false;
         }

         if (pass1.isEmpty() || pass1.equals(" Create password...")) {
             setInvalidBorder(createpass);
             displayError(createpass_error, emptyFieldMessage);
             valid = false;
         } else if (pass1.length() < 8) {
             setInvalidBorder(createpass);
             displayError(createpass_error, "Password Too Short!");
             valid = false;
         } else {
             if (pass2.isEmpty() || pass2.equals(" Confirm password...")) {
                 setInvalidBorder(confirmpass);
                 displayError(confirmpass_error, emptyFieldMessage);
                 valid = false;
             } else if (!Arrays.equals(createpass.getPassword(), confirmpass.getPassword())) {
                 setInvalidBorder(confirmpass);
                 setInvalidBorder(createpass);
                 displayError(confirmpass_error, "Passwords DO NOT Match!");
                 displayError(createpass_error, "Passwords DO NOT Match!");
                 valid = false;
             } else {
                 resetBorder(createpass);
                 displayError(createpass_error, "");
             }
         }

         // Check if email or username already exists
         if (con.fieldExists("username", username) || con.fieldExists("email", email)) {
             if (con.fieldExists("username", username)) {
                 setInvalidBorder(ufield);
                 displayError(username_error, "Username Already Taken!");
                 valid = false;
             }
             if (con.fieldExists("email", email)) {
                 setInvalidBorder(efield);
                 displayError(email_error, "Email Already Exist!");
                 valid = false;
             }

        } else {
            if (valid) {
                // Use PreparedStatement to prevent SQL injection
                String sql = "INSERT INTO user (u_fname, u_lname, email, contact, username, password, role, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = con.getConnection().prepareStatement(sql)) {
                    pstmt.setString(1, fname);
                    pstmt.setString(2, lname);
                    pstmt.setString(3, email);
                    pstmt.setString(4, contact);
                    pstmt.setString(5, username);
                    pstmt.setString(6, hashedPassword);
                    pstmt.setString(7, roleSelected);
                    pstmt.setString(8, status);
                    
                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        JOptionPane.showMessageDialog(null, "Registered Successfully!");
                        new LOGIN().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Registration Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
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
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hides.png")));
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
            showPass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hides.png")));
        }
    }//GEN-LAST:event_showPass1MouseClicked

    private void sign_inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseEntered
            sign_in.setForeground(new Color(231,231,198));

    }//GEN-LAST:event_sign_inMouseEntered

    private void sign_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseExited
            sign_in.setForeground(new Color(255,255,0));
    }//GEN-LAST:event_sign_inMouseExited

    private void fnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnfieldActionPerformed
        

        
    }//GEN-LAST:event_fnfieldActionPerformed

    private void fnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusGained
        if(fnfield.getText().equals(" Enter first name...")){
            fnfield.setText("");
            fnfield.setForeground(Color.BLACK);
            fnfield.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
    }//GEN-LAST:event_fnfieldFocusGained

    private void fnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusLost
        if(fnfield.getText().isEmpty()){
            fnfield.setText(" Enter first name...");
            fnfield.setForeground(Color.GRAY);
            fnfield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(name_error, "");
        resetBorder(fnfield);
    }//GEN-LAST:event_fnfieldFocusLost

    private void efieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusGained
        if(efield.getText().equals(" Enter email...")){
            efield.setText("");
            efield.setForeground(Color.BLACK);
            efield.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
    }//GEN-LAST:event_efieldFocusGained

    private void efieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusLost
        if(efield.getText().isEmpty()){
            efield.setText(" Enter email...");
            efield.setForeground(Color.GRAY);
            efield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(email_error, "");
        resetBorder(efield);
    }//GEN-LAST:event_efieldFocusLost

    private void efieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efieldActionPerformed

    private void lnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusGained
        if(lnfield.getText().equals(" Enter last name...")){
            lnfield.setText("");
            lnfield.setForeground(Color.BLACK);
            lnfield.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
        
    }//GEN-LAST:event_lnfieldFocusGained

    private void lnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusLost
         if(lnfield.getText().isEmpty()){
            lnfield.setText(" Enter last name...");
            lnfield.setForeground(Color.GRAY);
            lnfield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(lname_error, "");
        resetBorder(lnfield);
    }//GEN-LAST:event_lnfieldFocusLost

    private void lnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnfieldActionPerformed

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
        if(pfield.getText().equals(" Enter phone number...")){
            pfield.setText("");
            pfield.setForeground(Color.BLACK);
            pfield.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
    }//GEN-LAST:event_pfieldFocusGained

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
        if(pfield.getText().isEmpty()){
            pfield.setText(" Enter phone number...");
            pfield.setForeground(Color.GRAY);
            pfield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(contact_error, "");
        resetBorder(pfield);
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void ufieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusGained
        if(ufield.getText().equals(" Enter username...")){
            ufield.setText("");
            ufield.setForeground(Color.BLACK);
            ufield.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
    }//GEN-LAST:event_ufieldFocusGained

    private void ufieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusLost
        if(ufield.getText().isEmpty()){
            ufield.setText(" Enter username...");
            ufield.setForeground(Color.GRAY);
            ufield.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(username_error, "");
        resetBorder(ufield);
    }//GEN-LAST:event_ufieldFocusLost

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

    private void createpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusGained
        if (new String(createpass.getPassword()).equals(" Create password...")) {
            createpass.setText("");
            createpass.setEchoChar('•'); // Mask password
            createpass.setForeground(Color.BLACK);           
            createpass.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));

        }   
    }//GEN-LAST:event_createpassFocusGained

    private void createpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusLost
        if (new String(createpass.getPassword()).isEmpty()) {
            createpass.setText(" Create password...");
            createpass.setEchoChar((char) 0); // Show text instead of masked chars
            createpass.setForeground(Color.GRAY);
            createpass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(createpass_error, "");
        resetBorder(createpass);
    }//GEN-LAST:event_createpassFocusLost

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        if (new String(confirmpass.getPassword()).equals(" Confirm password...")) {
            confirmpass.setText("");
            confirmpass.setEchoChar('•'); // Mask password
            confirmpass.setForeground(Color.BLACK);           
            confirmpass.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));
        }
    }//GEN-LAST:event_confirmpassFocusGained

    private void confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusLost
         if (new String(confirmpass.getPassword()).isEmpty()) {
            confirmpass.setText(" Confirm password...");
            confirmpass.setEchoChar((char) 0); // Show text instead of masked chars
            confirmpass.setForeground(Color.GRAY);
            confirmpass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(confirmpass_error, "");
        resetBorder(confirmpass);
    }//GEN-LAST:event_confirmpassFocusLost

    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    
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
    private javax.swing.JLabel confirmpass_error;
    private javax.swing.JLabel contact_error;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JLabel createpass_error;
    private javax.swing.JLabel e_icon;
    private javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel fn_icon;
    private javax.swing.JTextField fnfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ln_icon;
    private javax.swing.JLabel lname_error;
    private javax.swing.JTextField lnfield;
    private javax.swing.JLabel name_error;
    private javax.swing.JLabel pass1_icon;
    private javax.swing.JLabel pass2_icon;
    private javax.swing.JTextField pfield;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel role_error;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    private javax.swing.JLabel sign_in;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel u_icon;
    private javax.swing.JTextField ufield;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
