/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import MANAGEMENT.Photographers;
import MANAGEMENT.Users;
import CONFIG.Session;
import CONFIG.Util;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author mikel
 */
public class Add_User extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Photographer
     */
    public Add_User() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
          //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
        fnfield.setBackground(new java.awt.Color(0,0,0,1));
        lnfield.setBackground(new java.awt.Color(0,0,0,1));
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        ufield.setBackground(new java.awt.Color(0,0,0,1));
        createpass.setBackground(new java.awt.Color(0,0,0,1));
    }

        private void displayError(JLabel field, String message) {
               field.setText(message);
               field.setForeground(new Color(255, 105, 97));
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        add_p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        ln_icon = new javax.swing.JLabel();
        fn_icon = new javax.swing.JLabel();
        lnfield = new javax.swing.JTextField();
        efield = new javax.swing.JTextField();
        e_icon = new javax.swing.JLabel();
        c_icon = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        ufield = new javax.swing.JTextField();
        createpass = new javax.swing.JPasswordField();
        showPass = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        role_u = new javax.swing.JLabel();
        username_error = new javax.swing.JLabel();
        contact_error = new javax.swing.JLabel();
        email_error = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        name_error = new javax.swing.JLabel();
        createpass_error = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setBackground(new java.awt.Color(0, 0, 0));
        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(255, 255, 240));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("ADD USER");
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 60));

        add_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_pMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add");

        javax.swing.GroupLayout add_pLayout = new javax.swing.GroupLayout(add_p);
        add_p.setLayout(add_pLayout);
        add_pLayout.setHorizontalGroup(
            add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        add_pLayout.setVerticalGroup(
            add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(add_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 80, 30));

        fnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        fnfield.setForeground(new java.awt.Color(153, 153, 153));
        fnfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "First Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        fnfield.setCaretColor(new java.awt.Color(240, 240, 240));
        fnfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        fnfield.setOpaque(false);
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
        jPanel1.add(fnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 290, 60));

        ln_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel1.add(ln_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 50));

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel1.add(fn_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 50, 50));

        lnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        lnfield.setForeground(new java.awt.Color(153, 153, 153));
        lnfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Last Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        lnfield.setCaretColor(new java.awt.Color(240, 240, 240));
        lnfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        lnfield.setOpaque(false);
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
        jPanel1.add(lnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 290, 60));

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        jPanel1.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 290, 60));

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        jPanel1.add(e_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 50));

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        jPanel1.add(c_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 50, 50));

        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Phone Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        pfield.setCaretColor(new java.awt.Color(240, 240, 240));
        pfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pfield.setOpaque(false);
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
        jPanel1.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 290, 60));

        ufield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        ufield.setForeground(new java.awt.Color(153, 153, 153));
        ufield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        ufield.setCaretColor(new java.awt.Color(240, 240, 240));
        ufield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ufield.setOpaque(false);
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
        jPanel1.add(ufield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 290, 60));

        createpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        createpass.setForeground(new java.awt.Color(153, 153, 153));
        createpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        jPanel1.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 290, 60));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 40, 50));

        pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 50, 50));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel1.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

        role.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        role.setForeground(new java.awt.Color(153, 153, 153));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.setBorder(null);
        role.setOpaque(false);
        role.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roleMouseClicked(evt);
            }
        });
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 100, 40));

        role_u.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        role_u.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/role-u.png"))); // NOI18N
        jPanel1.add(role_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 50, 40));

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 102, 102));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(username_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 290, 20));

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 102, 102));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(contact_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 290, 20));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 290, 20));

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 102, 102));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 290, 20));

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 102, 102));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(name_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 20));

        createpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        createpass_error.setForeground(new java.awt.Color(255, 102, 102));
        createpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(createpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 290, 20));

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }
    
    
    
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       Users us = new Users();
       
       JDesktopPane pane = getDesktopPane();
       pane.add(us);
       us.setVisible(true);
       
    }//GEN-LAST:event_backMouseClicked

    private void add_pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseEntered
        add_p.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_add_pMouseEntered

    private void add_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseExited
        add_p.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_add_pMouseExited

    private void add_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseClicked
          boolean valid = true;
        String error = "Field cannot be empty!";

        connectDB con = new connectDB();
        Connection cn = con.getConnection();

        String fname = fnfield.getText().trim();
        String lname = lnfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String username = ufield.getText().trim();
        String password = createpass.getText();
        String roleSelected = (role.getSelectedItem() != null) ? role.getSelectedItem().toString() : "";
        String status = "Active";

        
          String hashedPassword = Util.hashPassword(password);
        // Input Validations
        if (fname.isEmpty()){
            setInvalidTitledBorder(fnfield, "First Name");
            displayError(name_error, error);
            valid = false;
        }

        if (lname.isEmpty()) {
            setInvalidTitledBorder(lnfield, "Last Name");
            displayError(lname_error, error);
            valid = false;
        }

        if (email.isEmpty()) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, error);
            valid = false;
        } else if (!isEmailValid(email)) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Invalid email!");
            valid = false;
        }

        if (contact.isEmpty()) {
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, error);
            valid = false;
        } else if (!isPhoneNumberValid(contact)) {
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, "Invalid phone number!");
            valid = false;
        }

        if (username.isEmpty()) {
            setInvalidTitledBorder(ufield, "Username");
            displayError(username_error, error);
            valid = false;
        }
        
        if (password.isEmpty()) {
            setInvalidTitledBorder(createpass, "Password");
            displayError(createpass_error, error);
            valid = false;
        }else if (password.length() < 8) {
            setInvalidTitledBorder(createpass, "Password");
            displayError(createpass_error, "Password Too Short!");
            valid = false;
        }
 
        // Check if email or username already exists
        if (con.fieldExists("username", username) || con.fieldExists("email", email)) {
            if (con.fieldExists("username", username)) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Username Already Taken!");
                valid = false;
            }
            if (con.fieldExists("email", email)) {
                setInvalidTitledBorder(efield, "Username");
                displayError(email_error, "Email Already Exist!");
                valid = false;
            }
        } else {
            if (valid) {
                // Use PreparedStatement to prevent SQL injection
                String sql = "INSERT INTO user (u_fname, u_lname, email, contact, username, password, role, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (java.sql.PreparedStatement pstmt = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                    pstmt.setString(1, fname);
                    pstmt.setString(2, lname);
                    pstmt.setString(3, email);
                    pstmt.setString(4, contact);
                    pstmt.setString(5, username);
                    pstmt.setString(6, hashedPassword);
                    pstmt.setString(7, roleSelected);
                    pstmt.setString(8, status);
                    
                int result = pstmt.executeUpdate();
                
              
                
                if (result > 0) {
                
                    ResultSet generatedKeys = pstmt.getGeneratedKeys();
                    int lastInsertedId = 0;
                    if (generatedKeys.next()) {
                        lastInsertedId = generatedKeys.getInt(1);
                    }

                    // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Added new user with ID " + lastInsertedId;
                    con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    
                    
                    JOptionPane.showMessageDialog(null, "User added successfully!");

                    // Close the registration form (JDialog)
                    JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                    if (parentDialog != null) {
                        parentDialog.dispose();  // Closes the JDialog
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_add_pMouseClicked

    private void fnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusGained
        fnfield.setForeground(Color.WHITE);
        setTitledBorder(fnfield, "First Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_fnfieldFocusGained

    private void fnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusLost
        displayError(name_error, "");
        setTitledBorder(fnfield, "First Name", Color.WHITE);
        fnfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_fnfieldFocusLost

    private void fnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnfieldActionPerformed

    }//GEN-LAST:event_fnfieldActionPerformed

    private void lnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusGained
        lnfield.setForeground(Color.WHITE);
        setTitledBorder(lnfield, "Last Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_lnfieldFocusGained

    private void lnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusLost
        setTitledBorder(lnfield, "Last Name", Color.WHITE);
        lnfield.setForeground(Color.WHITE);
        displayError(lname_error, "");
    }//GEN-LAST:event_lnfieldFocusLost

    private void lnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnfieldActionPerformed

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

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
        pfield.setForeground(Color.WHITE);
        setTitledBorder(pfield, "Phone Number", Color.decode("#F5E196"));
    }//GEN-LAST:event_pfieldFocusGained

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
        displayError(contact_error, "");
        setTitledBorder(pfield, "Phone Number", Color.WHITE);
        pfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void ufieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusGained
        ufield.setForeground(Color.WHITE);
        setTitledBorder(ufield, "Username", Color.decode("#F5E196"));
    }//GEN-LAST:event_ufieldFocusGained

    private void ufieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusLost
        displayError(username_error, "");
        setTitledBorder(ufield, "Username", Color.WHITE);
        ufield.setForeground(Color.WHITE);
    }//GEN-LAST:event_ufieldFocusLost

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

    private void createpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusGained
        createpass.setEchoChar('•'); // Mask password
        createpass.setForeground(Color.WHITE);
        setTitledBorder(createpass, "Password", Color.decode("#F5E196"));

    }//GEN-LAST:event_createpassFocusGained

    private void createpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusLost

        setTitledBorder(createpass, "Password", Color.WHITE);
        createpass.setForeground(Color.WHITE);
        displayError(createpass_error, "");
    }//GEN-LAST:event_createpassFocusLost

    private void createpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createpassActionPerformed

    boolean pass_visible = false;
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

    private void roleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roleMouseClicked

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed

    }//GEN-LAST:event_roleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_p;
    private javax.swing.JLabel back;
    private javax.swing.JLabel c_icon;
    private javax.swing.JLabel contact_error;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JLabel createpass_error;
    private javax.swing.JLabel details;
    private javax.swing.JLabel e_icon;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel fn_icon;
    public javax.swing.JTextField fnfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel ln_icon;
    private javax.swing.JLabel lname_error;
    public javax.swing.JTextField lnfield;
    private javax.swing.JLabel name_error;
    private javax.swing.JLabel pass;
    public javax.swing.JTextField pfield;
    public javax.swing.JComboBox<String> role;
    private javax.swing.JLabel role_u;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel u_icon;
    public javax.swing.JTextField ufield;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
