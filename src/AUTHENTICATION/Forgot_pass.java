/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTHENTICATION;

import java.awt.Color;
import java.awt.Font;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
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
 * @author mikel
 */
public class Forgot_pass extends javax.swing.JPanel {

    
    private Connection con;
    
    private void connect() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep_bookingsystem", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database connection failed.");
        }
    }

    private String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] result = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : result) sb.append(String.format("%02x", b));
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }
            
    public Forgot_pass() {
        initComponents();
        
         efield.setBackground(new java.awt.Color(0, 0, 0, 1));
         afield.setBackground(new java.awt.Color(0, 0, 0, 1));
         npfield.setBackground(new java.awt.Color(0, 0, 0, 1));
         cpfield.setBackground(new java.awt.Color(0, 0, 0, 1));
         sqfield.setBackground(new java.awt.Color(0, 0, 0, 1));  
         
//        JComboBox<String> comboBox = new JComboBox<>();
//        comboBox.setOpaque(false); // Make the combo box itself transparent
//        comboBox.setBackground(new Color(0, 0, 0, 1)); // Transparent background
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

       private Color hoverColor = new Color(180, 180, 180); // Grayish color on hover
       private Color defaultColor = new Color(255, 255, 255); // Default white color
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_pass1 = new javax.swing.JLabel();
        show_pass2 = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        afield = new javax.swing.JTextField();
        npfield = new javax.swing.JPasswordField();
        cpfield = new javax.swing.JPasswordField();
        email_error = new javax.swing.JLabel();
        security_error = new javax.swing.JLabel();
        answer_error = new javax.swing.JLabel();
        np_error = new javax.swing.JLabel();
        cp_error = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        u1 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        s = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        sqfield = new javax.swing.JComboBox<>();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_pass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_passwords.png"))); // NOI18N
        show_pass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_pass1MouseClicked(evt);
            }
        });
        add(show_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 50, 50));

        show_pass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_passwords.png"))); // NOI18N
        show_pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_pass2MouseClicked(evt);
            }
        });
        add(show_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 50, 50));

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
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
        add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 350, 60));

        afield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        afield.setForeground(new java.awt.Color(153, 153, 153));
        afield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Your Answer", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        afield.setCaretColor(new java.awt.Color(240, 240, 240));
        afield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        afield.setOpaque(false);
        afield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                afieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                afieldFocusLost(evt);
            }
        });
        afield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afieldActionPerformed(evt);
            }
        });
        add(afield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 350, 60));

        npfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        npfield.setForeground(new java.awt.Color(153, 153, 153));
        npfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "New Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        npfield.setOpaque(false);
        npfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                npfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                npfieldFocusLost(evt);
            }
        });
        npfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                npfieldMouseClicked(evt);
            }
        });
        npfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npfieldActionPerformed(evt);
            }
        });
        add(npfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 350, 60));

        cpfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        cpfield.setForeground(new java.awt.Color(153, 153, 153));
        cpfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        cpfield.setOpaque(false);
        cpfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cpfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpfieldFocusLost(evt);
            }
        });
        cpfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfieldMouseClicked(evt);
            }
        });
        cpfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfieldActionPerformed(evt);
            }
        });
        add(cpfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 350, 60));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 350, 20));

        security_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        security_error.setForeground(new java.awt.Color(255, 102, 102));
        add(security_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 350, 20));

        answer_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        answer_error.setForeground(new java.awt.Color(255, 102, 102));
        add(answer_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 350, 20));

        np_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        np_error.setForeground(new java.awt.Color(255, 102, 102));
        add(np_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 350, 20));

        cp_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        cp_error.setForeground(new java.awt.Color(255, 102, 102));
        add(cp_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 350, 20));

        update.setLayout(new java.awt.BorderLayout());

        u1.setBackground(new java.awt.Color(153, 153, 153));
        u1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        u1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u1.setText("Update");
        u1.setMaximumSize(new java.awt.Dimension(25, 19));
        u1.setMinimumSize(new java.awt.Dimension(25, 19));
        u1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                u1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                u1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                u1MouseExited(evt);
            }
        });
        update.add(u1, java.awt.BorderLayout.CENTER);

        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 90, 30));

        search.setLayout(new java.awt.BorderLayout());

        s.setBackground(new java.awt.Color(153, 153, 153));
        s.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        s.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        s.setText("Search");
        s.setMaximumSize(new java.awt.Dimension(25, 19));
        s.setMinimumSize(new java.awt.Dimension(25, 19));
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sMouseExited(evt);
            }
        });
        search.add(s, java.awt.BorderLayout.CENTER);

        add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 80, 30));

        cancel.setLayout(new java.awt.BorderLayout());

        c.setBackground(new java.awt.Color(153, 153, 153));
        c.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText("Cancel");
        c.setMaximumSize(new java.awt.Dimension(25, 19));
        c.setMinimumSize(new java.awt.Dimension(25, 19));
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cMouseExited(evt);
            }
        });
        cancel.add(c, java.awt.BorderLayout.CENTER);

        add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 90, 30));

        Title.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("FORGOT PASSWORD");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 40));

        sqfield.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sqfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's your favorite food?", "What's your middle name?", "What's the name of your mother?", "How old are you?" }));
        sqfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Security Questions", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        sqfield.setOpaque(false);
        sqfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqfieldActionPerformed(evt);
            }
        });
        add(sqfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 350, 60));

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        add(light_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getAccessibleContext().setAccessibleName("");
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

    private void afieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_afieldFocusGained
        afield.setForeground(Color.WHITE);
        setTitledBorder(afield, "Your Answer", Color.decode("#F5E196"));
    }//GEN-LAST:event_afieldFocusGained

    private void afieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_afieldFocusLost
        displayError(answer_error, "");
        setTitledBorder(afield, "Your Answer", Color.WHITE);
        afield.setForeground(Color.WHITE);
    }//GEN-LAST:event_afieldFocusLost

    private void afieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_afieldActionPerformed

    private void npfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npfieldFocusGained
        npfield.setEchoChar('•');
        npfield.setForeground(Color.WHITE);
        setTitledBorder(npfield, "New Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_npfieldFocusGained

    private void npfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npfieldFocusLost
        setTitledBorder(npfield, "New Password", Color.WHITE);
        npfield.setForeground(Color.WHITE);
        displayError(np_error, "");
    }//GEN-LAST:event_npfieldFocusLost

    private void npfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_npfieldMouseClicked
        
    }//GEN-LAST:event_npfieldMouseClicked

    private void npfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npfieldActionPerformed

    private void cpfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfieldFocusGained
        cpfield.setEchoChar('•');
        cpfield.setForeground(Color.WHITE);
        setTitledBorder(cpfield, "Confirm Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_cpfieldFocusGained

    private void cpfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpfieldFocusLost
        setTitledBorder(cpfield, "Confirm Password", Color.WHITE);
        cpfield.setForeground(Color.WHITE);
        displayError(cp_error, "");
    }//GEN-LAST:event_cpfieldFocusLost

    private void cpfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfieldMouseClicked

    private void cpfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfieldActionPerformed

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
     
        

    }//GEN-LAST:event_cMouseClicked

    private void cMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseEntered
        c.setBackground(defaultColor);
        c.setBorder(BorderFactory.createLineBorder(Color. YELLOW, 1));
    }//GEN-LAST:event_cMouseEntered

    private void cMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseExited
        c.setOpaque(true); // Ensure background change is visible
        c.setBorder(BorderFactory.createLineBorder(Color. BLACK, 1));
    }//GEN-LAST:event_cMouseExited

    private void sMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sMouseClicked

    private void sMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sMouseEntered

    private void sMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_sMouseExited

    private void u1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_u1MouseClicked

    private void u1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_u1MouseEntered

    private void u1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_u1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_u1MouseExited

    
    boolean pass_visible = true;
    private void show_pass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass1MouseClicked
        pass_visible = !pass_visible;
        String currentText = npfield.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                npfield.setEchoChar((char) 0);
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_passwords.png")));
        } else {
            if (!currentText.equals("")) {
                npfield.setEchoChar('•');
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_passwords.png")));
        }
    }//GEN-LAST:event_show_pass1MouseClicked

    private void show_pass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_pass2MouseClicked
        pass_visible = !pass_visible;
        String currentText = npfield.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                npfield.setEchoChar((char) 0);
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_passwords.png")));
        } else {
            if (!currentText.equals("")) {
                npfield.setEchoChar('•');
            }
            show_pass1.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_passwords.png")));
        }
    }//GEN-LAST:event_show_pass2MouseClicked

    private void sqfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqfieldActionPerformed

 private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
 
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    public javax.swing.JTextField afield;
    private javax.swing.JLabel answer_error;
    private javax.swing.JLabel c;
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel cp_error;
    private javax.swing.JPasswordField cpfield;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel np_error;
    private javax.swing.JPasswordField npfield;
    private javax.swing.JLabel s;
    private javax.swing.JPanel search;
    private javax.swing.JLabel security_error;
    private javax.swing.JLabel show_pass1;
    private javax.swing.JLabel show_pass2;
    private javax.swing.JComboBox<String> sqfield;
    private javax.swing.JLabel u1;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
