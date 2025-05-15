/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import MANAGEMENT.Photographers;
import CONFIG.Session;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author mikel
 */
public class Edit_Photographer extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_Photographer
     */
    public Edit_Photographer() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
          //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        photog_id.setBackground(new java.awt.Color(0,0,0,1));
        fnfield.setBackground(new java.awt.Color(0,0,0,1));
        lnfield.setBackground(new java.awt.Color(0,0,0,1));
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        etfield.setBackground(new java.awt.Color(0,0,0,1));
        expfield.setBackground(new java.awt.Color(0,0,0,1));
        rfield.setBackground(new java.awt.Color(0,0,0,1));
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

        jPanel1 = new javax.swing.JPanel();
        details = new javax.swing.JLabel();
        photog_id = new javax.swing.JTextField();
        rfield = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        rate_error = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        email_error = new javax.swing.JLabel();
        etfield = new javax.swing.JTextField();
        expertise_error = new javax.swing.JLabel();
        experience_error = new javax.swing.JLabel();
        expfield = new javax.swing.JTextField();
        lnfield = new javax.swing.JTextField();
        lname_error = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        name_error = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        contact_error = new javax.swing.JLabel();
        edit_p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        light_Yellow2 = new ColorGrading.Light_Yellow();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setBackground(new java.awt.Color(0, 0, 0));
        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(255, 255, 240));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("EDIT PHOTOGRAPHER");
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 240, 40));

        photog_id.setEditable(false);
        photog_id.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        photog_id.setForeground(new java.awt.Color(255, 255, 255));
        photog_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        photog_id.setCaretColor(new java.awt.Color(240, 240, 240));
        photog_id.setOpaque(false);
        photog_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                photog_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                photog_idFocusLost(evt);
            }
        });
        photog_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photog_idActionPerformed(evt);
            }
        });
        jPanel1.add(photog_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 40));

        rfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        rfield.setForeground(new java.awt.Color(153, 153, 153));
        rfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Rate", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        rfield.setCaretColor(new java.awt.Color(240, 240, 240));
        rfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        rfield.setOpaque(false);
        rfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rfieldFocusLost(evt);
            }
        });
        rfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfieldActionPerformed(evt);
            }
        });
        jPanel1.add(rfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 310, 60));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 60));

        id.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 40, 40));

        rate_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        rate_error.setForeground(new java.awt.Color(255, 102, 102));
        rate_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(rate_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 310, 20));

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
        jPanel1.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 310, 60));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 310, 20));

        etfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        etfield.setForeground(new java.awt.Color(153, 153, 153));
        etfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Expertise", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        etfield.setCaretColor(new java.awt.Color(240, 240, 240));
        etfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        etfield.setOpaque(false);
        etfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                etfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                etfieldFocusLost(evt);
            }
        });
        etfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etfieldActionPerformed(evt);
            }
        });
        jPanel1.add(etfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 310, 60));

        expertise_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        expertise_error.setForeground(new java.awt.Color(255, 102, 102));
        expertise_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(expertise_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 310, 20));

        experience_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        experience_error.setForeground(new java.awt.Color(255, 102, 102));
        experience_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(experience_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 310, 20));

        expfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        expfield.setForeground(new java.awt.Color(153, 153, 153));
        expfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Experience", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        expfield.setCaretColor(new java.awt.Color(240, 240, 240));
        expfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        expfield.setOpaque(false);
        expfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                expfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                expfieldFocusLost(evt);
            }
        });
        expfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expfieldActionPerformed(evt);
            }
        });
        jPanel1.add(expfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 310, 60));

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
        jPanel1.add(lnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 310, 60));

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 102, 102));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 310, 20));

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
        jPanel1.add(fnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 60));

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 102, 102));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(name_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 310, 20));

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
        jPanel1.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 310, 60));

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 102, 102));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(contact_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 310, 20));

        edit_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit_pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit_pMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");

        javax.swing.GroupLayout edit_pLayout = new javax.swing.GroupLayout(edit_p);
        edit_p.setLayout(edit_pLayout);
        edit_pLayout.setHorizontalGroup(
            edit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        edit_pLayout.setVerticalGroup(
            edit_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(edit_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 80, 30));

        javax.swing.GroupLayout light_Yellow2Layout = new javax.swing.GroupLayout(light_Yellow2);
        light_Yellow2.setLayout(light_Yellow2Layout);
        light_Yellow2Layout.setHorizontalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        light_Yellow2Layout.setVerticalGroup(
            light_Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void etfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etfieldFocusGained
        etfield.setForeground(Color.WHITE);
        setTitledBorder(etfield, "Expertise", Color.decode("#F5E196"));
    }//GEN-LAST:event_etfieldFocusGained

    private void etfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_etfieldFocusLost
        displayError(expertise_error, "");
        setTitledBorder(etfield, "Expertise", Color.WHITE);
        etfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_etfieldFocusLost

    private void etfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etfieldActionPerformed

    private void expfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expfieldFocusGained
        expfield.setForeground(Color.WHITE);
        setTitledBorder(expfield, "Experience", Color.decode("#F5E196"));
    }//GEN-LAST:event_expfieldFocusGained

    private void expfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_expfieldFocusLost
       displayError(experience_error, "");
        setTitledBorder(expfield, "Experience", Color.WHITE);
        expfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_expfieldFocusLost

    private void expfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expfieldActionPerformed

    private void rfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rfieldFocusGained
        rfield.setForeground(Color.WHITE);
        setTitledBorder(rfield, "Rate", Color.decode("#F5E196"));
    }//GEN-LAST:event_rfieldFocusGained

    private void rfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rfieldFocusLost
        displayError(rate_error, "");
        setTitledBorder(rfield, "Rate", Color.WHITE);
        rfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_rfieldFocusLost

    private void rfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfieldActionPerformed

   
    private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }
    
    
    
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Photographers us = new Photographers();
        
            // Get the desktop pane (make sure this is a JDesktopPane)
            JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

            desktopPane.add(us);
            us.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked

    private void edit_pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_pMouseEntered
        edit_p.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_edit_pMouseEntered

    private void edit_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_pMouseExited
        edit_p.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_edit_pMouseExited

    private void edit_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_pMouseClicked
        boolean valid = true;
        String error = "Field cannot be empty!";

        connectDB con = new connectDB();
        Connection conn = con.getConnection();

        String fname = fnfield.getText().trim();
        String lname = lnfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String experience = expfield.getText().trim();
        String expertise = etfield.getText().trim();
        String rate = rfield.getText().trim();
        String p_id = photog_id.getText().trim();

        // Validation checks
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
            displayError(email_error, "Invalid email!");
            valid = false;
        }

        if (contact.isEmpty()) {
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, error);
            valid = false;
        } else if (!isPhoneNumberValid(contact)) { // FIXED: now checking phone format
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, "Invalid phone number!");
            valid = false;
        }

        if (experience.isEmpty()) {
            setInvalidTitledBorder(expfield, "Experience");
            displayError(experience_error, error);
            valid = false;
        }

        if (expertise.isEmpty()) {
            setInvalidTitledBorder(etfield, "Expertise");
            displayError(expertise_error, error);
            valid = false;
        }

        if (rate.isEmpty()) {
            setInvalidTitledBorder(rfield, "Rate");
            displayError(rate_error, error);
            valid = false;
        }

        // ❌ Stop execution if any validation fails
        if (!valid) {
            return;
        }
        
        boolean emailExists = false;
        
        
       String query = "SELECT p_email FROM photographer WHERE p_id = ? ";
       
       try(PreparedStatement pst = conn.prepareStatement(query)){
            pst.setString(1, email);
            pst.setString(2, p_id);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    if (rs.getString("email").equals(email)) {
                        emailExists = true;
                    }
                }
            }
        
    }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
       
       if (emailExists) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Email already exists!");
            valid = false;
        }

        // If any errors exist, stop execution
        if (!valid) return;
        
      
        // ✅ Corrected SQL (no extra comma)
        String sql = "UPDATE photographer SET p_fname = ?, p_lname = ?, p_email = ?, p_contact = ?, p_experience = ?, p_expertise = ?, p_rate = ? WHERE p_id = ? ";

        try (PreparedStatement pstmt = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, fname);
            pstmt.setString(2, lname);
            pstmt.setString(3, email);
            pstmt.setString(4, contact);
            pstmt.setString(5, experience);
            pstmt.setString(6, expertise);
            pstmt.setString(7, rate);
            pstmt.setString(8, p_id);


           
            
            int result = pstmt.executeUpdate();

            if (result > 0) {
                // ✅ Log action with client ID directly
                Session sess = Session.getInstance();
                String action = "Edited photographer with ID " + p_id;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                JOptionPane.showMessageDialog(null, "Photographer with ID " + p_id + " edited successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Editing failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_pMouseClicked

    private void photog_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_photog_idFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_photog_idFocusGained

    private void photog_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_photog_idFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_photog_idFocusLost

    private void photog_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photog_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photog_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel contact_error;
    private javax.swing.JLabel details;
    private javax.swing.JPanel edit_p;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    public javax.swing.JTextField etfield;
    private javax.swing.JLabel experience_error;
    private javax.swing.JLabel expertise_error;
    public javax.swing.JTextField expfield;
    public javax.swing.JTextField fnfield;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private ColorGrading.Light_Yellow light_Yellow2;
    private javax.swing.JLabel lname_error;
    public javax.swing.JTextField lnfield;
    private javax.swing.JLabel name_error;
    public javax.swing.JTextField pfield;
    public javax.swing.JTextField photog_id;
    private javax.swing.JLabel rate_error;
    public javax.swing.JTextField rfield;
    // End of variables declaration//GEN-END:variables
}
