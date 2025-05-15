
package MANAGEMENT;


import AUTHENTICATION.LOGIN;
import CONFIG.Session;
import CONFIG.connectDB;
import SETTINGS.ChangePassword;
import SETTINGS.Update_Acc;
import SETTINGS.secQuest;
import java.awt.Color;
import java.sql.Connection;
import java.time.LocalDateTime;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author mikel
 */
public class Setting extends javax.swing.JInternalFrame {

    /**
     * Creates new form Profile
     */
    public Setting() {
        initComponents();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
      
     
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Acc_Panel1 = new javax.swing.JPanel();
        change_pass = new javax.swing.JLabel();
        security = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        settings = new javax.swing.JLabel();
        Acc_Panel = new javax.swing.JPanel();
        profile = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        efield = new javax.swing.JTextField();
        c_icon = new javax.swing.JLabel();
        pfield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        acc = new javax.swing.JLabel();

        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(840, 650));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        Acc_Panel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Acc_Panel1.setOpaque(false);
        Acc_Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        change_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        change_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/lockxxx.png"))); // NOI18N
        change_pass.setText(" Change Password");
        change_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                change_passMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                change_passMouseExited(evt);
            }
        });
        Acc_Panel1.add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 30));

        security.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        security.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/settingsxx.png"))); // NOI18N
        security.setText("  Set Up Security Question");
        security.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                securityMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                securityMouseExited(evt);
            }
        });
        Acc_Panel1.add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 30));

        logout.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/logoutxxx.png"))); // NOI18N
        logout.setText(" Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        Acc_Panel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 210, 30));

        update.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/update_black.png"))); // NOI18N
        update.setText("  Update Information");
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
        Acc_Panel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setBackground(new java.awt.Color(255, 255, 255));
        settings.setFont(new java.awt.Font("Britannic Bold", 0, 20)); // NOI18N
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("SETTINGS");
        jPanel2.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        Acc_Panel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        jPanel1.add(Acc_Panel1);
        Acc_Panel1.setBounds(450, 130, 330, 450);

        Acc_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Acc_Panel.setOpaque(false);
        Acc_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/prof.png"))); // NOI18N
        Acc_Panel.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 330, 120));

        name_label.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Name");
        Acc_Panel.add(name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 330, 30));

        username_label.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        username_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_label.setText("@username");
        Acc_Panel.add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 330, -1));

        e_icon.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        e_icon.setText("Email:");
        Acc_Panel.add(e_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 30));

        efield.setEditable(false);
        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
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
        Acc_Panel.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 260, 50));

        c_icon.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        c_icon.setText("Phone Number:");
        Acc_Panel.add(c_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 30));

        pfield.setEditable(false);
        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
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
        Acc_Panel.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 260, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc.setFont(new java.awt.Font("Britannic Bold", 0, 20)); // NOI18N
        acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc.setText("ACCOUNT DETAILS");
        jPanel3.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        Acc_Panel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 70));

        jPanel1.add(Acc_Panel);
        Acc_Panel.setBounds(40, 20, 330, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void change_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseClicked
        ChangePassword change = new ChangePassword();
        
        JDesktopPane pane = getDesktopPane();
        pane.add(change);
        change.setVisible(true);
    }//GEN-LAST:event_change_passMouseClicked

    private void change_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseEntered
        change_pass.setForeground(new Color(180, 180, 180));
    }//GEN-LAST:event_change_passMouseEntered

    private void change_passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseExited
        change_pass.setForeground(Color.BLACK);
    }//GEN-LAST:event_change_passMouseExited

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       Session sess = Session.getInstance();
            String fullName = sess.getU_fname()+ " " + sess.getU_lname(); // Add space between first and last name
            name_label.setHorizontalAlignment(SwingConstants.CENTER); // Center align text
            name_label.setText(fullName);

            username_label.setText("@"+sess.getUsername());

            pfield.setText(""+sess.getContact());
            efield.setText(""+sess.getEmail());  

    }//GEN-LAST:event_formInternalFrameActivated

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
    
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
      
    }//GEN-LAST:event_pfieldFocusGained

    private void efieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_efieldActionPerformed

    private void efieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusLost
      
    }//GEN-LAST:event_efieldFocusLost

    private void efieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efieldFocusGained
    
    }//GEN-LAST:event_efieldFocusGained

    private void securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseClicked
        secQuest set = new secQuest();
        JDesktopPane desk = getDesktopPane();
        desk.add(set);
        set.setVisible(true);
  
    }//GEN-LAST:event_securityMouseClicked

    private void securityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseEntered
        security.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_securityMouseEntered

    private void securityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseExited
        security.setBackground(Color.BLACK);
    }//GEN-LAST:event_securityMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        Update_Acc up = new Update_Acc();
        
        JDesktopPane pane = getDesktopPane();
        pane.add(up);
        up.setVisible(true);
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(Color.BLACK);
    }//GEN-LAST:event_updateMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION);
        if(confirm != JOptionPane.YES_OPTION){
            return;
        }
        
        
         Session sess = Session.getInstance();
         String user = sess.getUser_id();
         connectDB con = new connectDB();
         Connection cn = con.getConnection();
 
                String action = "User logged out with ID " + user;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
     
        LOGIN log = new LOGIN();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        update.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
       logout.setForeground(Color.BLACK);
    }//GEN-LAST:event_logoutMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acc_Panel;
    private javax.swing.JPanel Acc_Panel1;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel c_icon;
    private javax.swing.JLabel change_pass;
    private javax.swing.JLabel e_icon;
    public javax.swing.JTextField efield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel name_label;
    public javax.swing.JTextField pfield;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel security;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel update;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
