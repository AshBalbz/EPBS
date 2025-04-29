/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SETTINGS;

import AUTHENTICATION.Change_Pass;
import AUTHENTICATION.REGISTRATION;
import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Setting;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author mikel
 */
public class Update_Acc extends javax.swing.JInternalFrame {

    /**
     * Creates new form Profile
     */
    public Update_Acc() {
        initComponents();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
      
        fnfield.setBackground(new java.awt.Color(0,0,0,1));
        lnfield.setBackground(new java.awt.Color(0,0,0,1));
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        ufield.setBackground(new java.awt.Color(0,0,0,1));
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
    
     private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(java.awt.Color.RED);
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ln_icon = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        lnfield = new javax.swing.JTextField();
        fn_icon = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        c_icon = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        ufield = new javax.swing.JTextField();
        u_icon = new javax.swing.JLabel();
        Acc_Panel = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        username_error = new javax.swing.JLabel();
        email_error = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        name_error = new javax.swing.JLabel();
        contact_error = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        setForeground(java.awt.Color.white);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        ln_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel1.add(ln_icon);
        ln_icon.setBounds(60, 310, 40, 50);

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
        jPanel1.add(fnfield);
        fnfield.setBounds(100, 300, 260, 60);

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
        jPanel1.add(lnfield);
        lnfield.setBounds(100, 400, 260, 60);

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel1.add(fn_icon);
        fn_icon.setBounds(60, 410, 40, 50);

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        jPanel1.add(e_icon);
        e_icon.setBounds(460, 310, 40, 50);

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
        jPanel1.add(efield);
        efield.setBounds(500, 300, 260, 60);

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        jPanel1.add(c_icon);
        c_icon.setBounds(460, 410, 40, 50);

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
        jPanel1.add(pfield);
        pfield.setBounds(500, 400, 260, 60);

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
        jPanel1.add(ufield);
        ufield.setBounds(290, 500, 260, 60);

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel1.add(u_icon);
        u_icon.setBounds(250, 510, 40, 50);

        Acc_Panel.setOpaque(false);
        Acc_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/prof.png"))); // NOI18N
        Acc_Panel.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 330, 140));

        name_label.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        name_label.setForeground(new java.awt.Color(255, 255, 255));
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Name");
        Acc_Panel.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, -1));

        username_label.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_label.setText("@username");
        Acc_Panel.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 330, -1));

        jPanel1.add(Acc_Panel);
        Acc_Panel.setBounds(240, 50, 330, 200);

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 102, 102));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(username_error);
        username_error.setBounds(340, 560, 210, 20);

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(email_error);
        email_error.setBounds(550, 360, 210, 20);

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 102, 102));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lname_error);
        lname_error.setBounds(150, 460, 210, 20);

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 102, 102));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(name_error);
        name_error.setBounds(150, 360, 210, 20);

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 102, 102));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(contact_error);
        contact_error.setBounds(550, 460, 210, 20);

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 20, 50, 60);

        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new java.awt.BorderLayout());

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        edit.add(update, java.awt.BorderLayout.CENTER);

        jPanel1.add(edit);
        edit.setBounds(700, 590, 100, 40);

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow1);
        light_Yellow1.setBounds(0, 0, 830, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusGained
        fnfield.setForeground(Color.WHITE);
        setTitledBorder(fnfield, "First Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_fnfieldFocusGained

    private void fnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusLost
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

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
 boolean valid = true;
            connectDB con = new connectDB();
            Connection conn = con.getConnection();

            // Check if database connection is successful
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Get updated values from input fields
            String newFirstName = fnfield.getText().trim();
            String newLastName = lnfield.getText().trim();
            String newEmail = efield.getText().trim();
            String newContact = pfield.getText().trim();
            String newUsername = ufield.getText().trim();

            // Get session instance
            Session sess = Session.getInstance();
            String userId = sess.getUser_id(); // Retrieve user_id

            // Debugging check
            System.out.println("User ID: " + userId);

            // Validate userId (prevent execution if null/empty)
            if (userId == null || userId.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: User ID is missing!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Input Validation
            if (newFirstName.isEmpty()) {
                setInvalidTitledBorder(fnfield, "First Name");
                displayError(name_error, "Field cannot be empty!");
                valid = false;
            }

            if (newLastName.isEmpty()) {
                setInvalidTitledBorder(lnfield, "Last Name");
                displayError(lname_error, "Field cannot be empty!");
                valid = false;
            }

            if (newEmail.isEmpty()) {
                setInvalidTitledBorder(efield, "Email");
                displayError(email_error, "Field cannot be empty!");
                valid = false;
            }

            if (newContact.isEmpty()) {
                setInvalidTitledBorder(pfield, "Phone Number");
                displayError(contact_error, "Field cannot be empty!");
                valid = false;
            }

            if (newUsername.isEmpty()) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Field cannot be empty!");
                valid = false;
            }

            // Stop execution if validation fails
            if (!valid) return;

            // Check if email or username already exists, excluding the current user
            boolean usernameExists = false;
            boolean emailExists = false;

            String query = "SELECT username, email FROM user WHERE (username = ? OR email = ?) AND u_id <> ?";

            try (PreparedStatement pst = conn.prepareStatement(query)) {
                pst.setString(1, newUsername);
                pst.setString(2, newEmail);
                pst.setString(3, userId);

                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        if (rs.getString("username").equals(newUsername)) {
                            usernameExists = true;
                        }
                        if (rs.getString("email").equals(newEmail)) {
                            emailExists = true;
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Show validation errors if username/email exists
            if (usernameExists) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Username Already Taken!");
                valid = false;
            }

            if (emailExists) {
                setInvalidTitledBorder(efield, "Email");
                displayError(email_error, "Email Already Exists!");
                valid = false;
            }

            // Stop execution if validation fails
            if (!valid) return;

            // Update session data
            sess.setU_fname(newFirstName);
            sess.setU_lname(newLastName);
            sess.setEmail(newEmail);
            sess.setContact(newContact);
            sess.setUsername(newUsername);

            // Update UI labels
            name_label.setText(newFirstName + " " + newLastName);
            username_label.setText("@" + newUsername);

            // Update user data in database
            String sql = "UPDATE user SET u_fname = ?, u_lname = ?, email = ?, contact = ?, username = ? WHERE u_id = ?";

            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, newFirstName);
                pst.setString(2, newLastName);
                pst.setString(3, newEmail);
                pst.setString(4, newContact);
                pst.setString(5, newUsername);

                // Check if user_id is an integer or string
                try {
                    int userIdInt = Integer.parseInt(userId);
                    pst.setInt(6, userIdInt);
                } catch (NumberFormatException e) {
                    pst.setString(6, userId);
                }

                int updated = pst.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Profile updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update profile.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Ensure connection is closed properly
                try {
                    if (conn != null) conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(REGISTRATION.class.getName()).log(Level.SEVERE, null, ex);
                }
            }          

    }//GEN-LAST:event_updateMouseClicked

     private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }
    
    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
      
    }//GEN-LAST:event_updateMouseExited

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       Session sess = Session.getInstance();
            String fullName = sess.getU_fname()+ " " + sess.getU_lname(); // Add space between first and last name
            name_label.setHorizontalAlignment(SwingConstants.CENTER); // Center align text
            name_label.setText(fullName);

            username_label.setText("@"+sess.getUsername());

            fnfield.setText(""+sess.getU_fname());
            lnfield.setText(""+sess.getU_lname());
            ufield.setText(""+sess.getUsername());
            pfield.setText(""+sess.getContact());
            efield.setText(""+sess.getEmail());  

    }//GEN-LAST:event_formInternalFrameActivated

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
       edit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_editMouseExited

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        boolean valid = true;
            connectDB con = new connectDB();
            Connection conn = con.getConnection();

            // Check if database connection is successful
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Get updated values from input fields
            String newFirstName = fnfield.getText().trim();
            String newLastName = lnfield.getText().trim();
            String newEmail = efield.getText().trim();
            String newContact = pfield.getText().trim();
            String newUsername = ufield.getText().trim();

            // Get session instance
            Session sess = Session.getInstance();
            String userId = sess.getUser_id(); // Retrieve user_id

            // Debugging check
            System.out.println("User ID: " + userId);

            // Validate userId (prevent execution if null/empty)
            if (userId == null || userId.trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error: User ID is missing!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Input Validation
            if (newFirstName.isEmpty()) {
                setInvalidTitledBorder(fnfield, "First Name");
                displayError(name_error, "Field cannot be empty!");
                valid = false;
            }

            if (newLastName.isEmpty()) {
                setInvalidTitledBorder(lnfield, "Last Name");
                displayError(lname_error, "Field cannot be empty!");
                valid = false;
            }

            if (newEmail.isEmpty()) {
                setInvalidTitledBorder(efield, "Email");
                displayError(email_error, "Field cannot be empty!");
                valid = false;
            }

            if (newContact.isEmpty()) {
                setInvalidTitledBorder(pfield, "Phone Number");
                displayError(contact_error, "Field cannot be empty!");
                valid = false;
            }

            if (newUsername.isEmpty()) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Field cannot be empty!");
                valid = false;
            }

            // Stop execution if validation fails
            if (!valid) return;

            // Check if email or username already exists, excluding the current user
            boolean usernameExists = false;
            boolean emailExists = false;

            String query = "SELECT username, email FROM user WHERE (username = ? OR email = ?) AND u_id <> ?";

            try (PreparedStatement pst = conn.prepareStatement(query)) {
                pst.setString(1, newUsername);
                pst.setString(2, newEmail);
                pst.setString(3, userId);

                try (ResultSet rs = pst.executeQuery()) {
                    while (rs.next()) {
                        if (rs.getString("username").equals(newUsername)) {
                            usernameExists = true;
                        }
                        if (rs.getString("email").equals(newEmail)) {
                            emailExists = true;
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Show validation errors if username/email exists
            if (usernameExists) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Username Already Taken!");
                valid = false;
            }

            if (emailExists) {
                setInvalidTitledBorder(efield, "Email");
                displayError(email_error, "Email Already Exists!");
                valid = false;
            }

            // Stop execution if validation fails
            if (!valid) return;

            // Update session data
            sess.setU_fname(newFirstName);
            sess.setU_lname(newLastName);
            sess.setEmail(newEmail);
            sess.setContact(newContact);
            sess.setUsername(newUsername);

            // Update UI labels
            name_label.setText(newFirstName + " " + newLastName);
            username_label.setText("@" + newUsername);

            // Update user data in database
            String sql = "UPDATE user SET u_fname = ?, u_lname = ?, email = ?, contact = ?, username = ? WHERE u_id = ?";

            try (PreparedStatement pst = conn.prepareStatement(sql)) {
                pst.setString(1, newFirstName);
                pst.setString(2, newLastName);
                pst.setString(3, newEmail);
                pst.setString(4, newContact);
                pst.setString(5, newUsername);

                // Check if user_id is an integer or string
                try {
                    int userIdInt = Integer.parseInt(userId);
                    pst.setInt(6, userIdInt);
                } catch (NumberFormatException e) {
                    pst.setString(6, userId);
                }

                int updated = pst.executeUpdate();
                if (updated > 0) {
                    JOptionPane.showMessageDialog(this, "Profile updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update profile.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                // Ensure connection is closed properly
                try {
                    if (conn != null) conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(REGISTRATION.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_editMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Setting us = new Setting();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(us);
        us.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acc_Panel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel c_icon;
    private javax.swing.JLabel contact_error;
    private javax.swing.JLabel e_icon;
    private javax.swing.JPanel edit;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel fn_icon;
    public javax.swing.JTextField fnfield;
    private javax.swing.JPanel jPanel1;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel ln_icon;
    private javax.swing.JLabel lname_error;
    public javax.swing.JTextField lnfield;
    private javax.swing.JLabel name_error;
    private javax.swing.JLabel name_label;
    public javax.swing.JTextField pfield;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel u_icon;
    public javax.swing.JTextField ufield;
    private javax.swing.JLabel update;
    private javax.swing.JLabel username_error;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
