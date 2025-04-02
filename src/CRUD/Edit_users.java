/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN_MANAGEMENT;

import AUTHENTICATION.REGISTRATION;
import CONFIG.connectDB;
import java.awt.Color;
import static java.awt.Color.RED;
import static java.awt.Color.YELLOW;
import java.awt.Font;
import java.awt.Point;
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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author mikel
 */
public class Edit_user extends javax.swing.JPanel {
 
    
    
    public Edit_user() {
        initComponents();
        
        
        user_id.setBackground(new java.awt.Color(0,0,0,1));
        fnfield.setBackground(new java.awt.Color(0,0,0,1));
        lnfield.setBackground(new java.awt.Color(0,0,0,1));
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        ufield.setBackground(new java.awt.Color(0,0,0,1));
       

        
    }
    
      
     
    private static void centerJPanel(JDesktopPane desktopPane, JPanel panel) {
       int x = (desktopPane.getWidth() - panel.getWidth()) / 2;
       int y = (desktopPane.getHeight() - panel.getHeight()) / 2;
       panel.setLocation(x, y);
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

        edit_user = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        ln_icon = new javax.swing.JLabel();
        user_id = new javax.swing.JTextField();
        user_ID = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        lnfield = new javax.swing.JTextField();
        fn_icon = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        status_icon = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        c_icon = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        ufield = new javax.swing.JTextField();
        u_icon = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        user_icon = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        stat = new javax.swing.JComboBox<>();
        username_error = new javax.swing.JLabel();
        email_error = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        name_error = new javax.swing.JLabel();
        contact_error = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        edit_user.setBackground(new java.awt.Color(0, 0, 0));
        edit_user.setForeground(new java.awt.Color(255, 102, 102));
        edit_user.setLayout(null);

        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(255, 255, 240));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("USER DETAILS");
        edit_user.add(details);
        details.setBounds(0, 10, 590, 40);

        ln_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        edit_user.add(ln_icon);
        ln_icon.setBounds(20, 140, 40, 50);

        user_id.setEditable(false);
        user_id.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        user_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        user_id.setCaretColor(new java.awt.Color(240, 240, 240));
        user_id.setOpaque(false);
        user_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_idFocusLost(evt);
            }
        });
        user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_idActionPerformed(evt);
            }
        });
        edit_user.add(user_id);
        user_id.setBounds(60, 60, 50, 40);

        user_ID.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        user_ID.setForeground(new java.awt.Color(255, 255, 255));
        user_ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_ID.setText("ID");
        edit_user.add(user_ID);
        user_ID.setBounds(20, 60, 40, 40);

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
        edit_user.add(fnfield);
        fnfield.setBounds(60, 130, 260, 60);

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
        edit_user.add(lnfield);
        lnfield.setBounds(60, 220, 260, 60);

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        edit_user.add(fn_icon);
        fn_icon.setBounds(20, 230, 40, 50);

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        edit_user.add(e_icon);
        e_icon.setBounds(20, 320, 40, 50);

        status_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/status.png"))); // NOI18N
        edit_user.add(status_icon);
        status_icon.setBounds(390, 230, 50, 40);

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
        edit_user.add(efield);
        efield.setBounds(60, 310, 260, 60);

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        edit_user.add(c_icon);
        c_icon.setBounds(20, 410, 40, 50);

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
        edit_user.add(pfield);
        pfield.setBounds(60, 400, 260, 60);

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
        edit_user.add(ufield);
        ufield.setBounds(60, 490, 260, 60);

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        edit_user.add(u_icon);
        u_icon.setBounds(20, 500, 40, 50);

        update.setBackground(new java.awt.Color(255, 255, 204));
        update.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 204));
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
        edit_user.add(update);
        update.setBounds(480, 570, 56, 19);

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
        edit_user.add(cancel);
        cancel.setBounds(40, 570, 52, 19);

        user_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/setting.png"))); // NOI18N
        edit_user.add(user_icon);
        user_icon.setBounds(390, 140, 50, 40);

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
        edit_user.add(role);
        role.setBounds(440, 140, 110, 40);

        stat.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        stat.setForeground(new java.awt.Color(153, 153, 153));
        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Inactive", "Active" }));
        stat.setBorder(null);
        stat.setOpaque(false);
        stat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statMouseClicked(evt);
            }
        });
        stat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statActionPerformed(evt);
            }
        });
        edit_user.add(stat);
        stat.setBounds(440, 230, 110, 40);

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 102, 102));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_user.add(username_error);
        username_error.setBounds(110, 550, 210, 20);

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_user.add(email_error);
        email_error.setBounds(110, 370, 210, 20);

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 102, 102));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_user.add(lname_error);
        lname_error.setBounds(110, 280, 210, 20);

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 102, 102));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_user.add(name_error);
        name_error.setBounds(110, 190, 210, 20);

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 102, 102));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        edit_user.add(contact_error);
        contact_error.setBounds(110, 460, 210, 20);

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        edit_user.add(light_Yellow1);
        light_Yellow1.setBounds(0, 0, 590, 640);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_user, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void user_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idFocusGained

    private void user_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_idFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idFocusLost

    private void user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_idActionPerformed

    private void fnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusGained
           fnfield.setForeground(Color.WHITE);
           setTitledBorder(fnfield, "First Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_fnfieldFocusGained

    private void fnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusLost
            setTitledBorder(fnfield, "First Name", Color.WHITE);
            fnfield.setForeground(Color.WHITE);
            displayError(name_error, "");
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

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
     boolean valid = true;
     String error = "Field cannot be empty!";

        connectDB con = new connectDB();
        Connection cn = con.getConnection();

        // Check if connection is successful
        if (cn == null) {
            JOptionPane.showMessageDialog(null, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get user input values
        String fname = fnfield.getText().trim();
        String lname = lnfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String username = ufield.getText().trim();
        String roleSelected = (role.getSelectedItem() != null) ? role.getSelectedItem().toString() : "";
        String status = (stat.getSelectedItem() != null) ? stat.getSelectedItem().toString() : "";
        String u_id = user_id.getText().trim();  // Ensure user ID is properly trimmed

        // Input Validations
        if (fname.isEmpty()) {
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
            displayError(email_error, error);
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

        // If validation fails, exit early
        if (!valid) return;

        // Check if username or email already exists, excluding current user
        boolean usernameExists = false;
        boolean emailExists = false;

        String query = "SELECT username, email FROM user WHERE (username = ? OR email = ?) AND u_id <> ?";

        try (PreparedStatement pst = cn.prepareStatement(query)) {
            pst.setString(1, username);
            pst.setString(2, email);
            pst.setString(3, u_id);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    if (rs.getString("username").equals(username)) {
                        usernameExists = true;
                    }
                    if (rs.getString("email").equals(email)) {
                        emailExists = true;
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        // Show validation errors if username/email exists
        if (usernameExists) {
            setInvalidTitledBorder(ufield, "Username");
            displayError(username_error, "Username already taken!");
            valid = false;
        }

        if (emailExists) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Email already exists!");
            valid = false;
        }

        // If any errors exist, stop execution
        if (!valid) return;

        // Update user info if valid
        String updateSql = "UPDATE user SET u_fname = ?, u_lname = ?, email = ?, contact = ?, username = ?, role = ?, status = ? WHERE u_id = ?";

        try (PreparedStatement pst = cn.prepareStatement(updateSql)) {
            pst.setString(1, fname);
            pst.setString(2, lname);
            pst.setString(3, email);
            pst.setString(4, contact);
            pst.setString(5, username);
            pst.setString(6, roleSelected);
            pst.setString(7, status);
            pst.setString(8, u_id);

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Close the JDialog if it's open
                JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
                if (parentDialog != null) {
                    parentDialog.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "No user found with the given ID!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Ensure connection is closed properly
        finally {
            try {
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(REGISTRATION.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_updateMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        JDialog parentDialog = (JDialog) SwingUtilities.getWindowAncestor(this);
        if (parentDialog != null) {
            parentDialog.dispose();  // Closes the JDialog
        }
    }//GEN-LAST:event_cancelMouseClicked

    private void roleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roleMouseClicked

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed

    }//GEN-LAST:event_roleActionPerformed

    private void statMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_statMouseClicked

    private void statActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statActionPerformed

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setForeground(new Color(255,255,204));
    }//GEN-LAST:event_updateMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setForeground(new Color(255,255,204));
    }//GEN-LAST:event_cancelMouseExited

    private void ufieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusGained
         ufield.setForeground(Color.WHITE);
         setTitledBorder(ufield, "Username", Color.decode("#F5E196"));
    }//GEN-LAST:event_ufieldFocusGained

    private void ufieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusLost
            displayError(username_error, "");
            setTitledBorder( ufield, "Username", Color.WHITE);
             ufield.setForeground(Color.WHITE);
    }//GEN-LAST:event_ufieldFocusLost

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c_icon;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel contact_error;
    private javax.swing.JLabel details;
    private javax.swing.JLabel e_icon;
    private javax.swing.JPanel edit_user;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel fn_icon;
    public javax.swing.JTextField fnfield;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel ln_icon;
    private javax.swing.JLabel lname_error;
    public javax.swing.JTextField lnfield;
    private javax.swing.JLabel name_error;
    public javax.swing.JTextField pfield;
    public javax.swing.JComboBox<String> role;
    public javax.swing.JComboBox<String> stat;
    private javax.swing.JLabel status_icon;
    private javax.swing.JLabel u_icon;
    public javax.swing.JTextField ufield;
    private javax.swing.JLabel update;
    private javax.swing.JLabel user_ID;
    private javax.swing.JLabel user_icon;
    public javax.swing.JTextField user_id;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
