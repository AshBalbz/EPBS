
package SETTINGS;

import java.awt.Color;

public class Set extends javax.swing.JPanel {

   
    public Set() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settings = new javax.swing.JLabel();
        security = new javax.swing.JLabel();
        change_pass = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        settings.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        settings.setForeground(new java.awt.Color(255, 255, 255));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settings.setText("SETTINGS");
        add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 9, 220, 30));

        security.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        security.setForeground(new java.awt.Color(255, 255, 255));
        security.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/update_white.png"))); // NOI18N
        security.setText(" Set Up Security Question");
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
        add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 30));

        change_pass.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        change_pass.setForeground(new java.awt.Color(255, 255, 255));
        change_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
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
        add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 30));

        update.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/update_white.png"))); // NOI18N
        update.setText(" Update");
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
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 30));

        logout.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/logout_u.png"))); // NOI18N
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
        add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void securityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_securityMouseClicked

    private void securityMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseEntered
        security.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_securityMouseEntered

    private void securityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityMouseExited
        security.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_securityMouseExited

    private void change_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_change_passMouseClicked

    private void change_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseEntered
       change_pass.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_change_passMouseEntered

    private void change_passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseExited
        change_pass.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_change_passMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       
     
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(new Color (180, 180, 180));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_updateMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_logoutMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel change_pass;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel security;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
