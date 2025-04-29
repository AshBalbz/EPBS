
package DASHBOARDS;

import MANAGEMENT.Account;
import MANAGEMENT.Logs;
import MANAGEMENT.Packages;
import MANAGEMENT.Photographers;
import MANAGEMENT.Setting;
import MANAGEMENT.Users;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class Staff_Dashboard extends javax.swing.JFrame {

    
    public Staff_Dashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        home_text = new javax.swing.JLabel();
        h_icon = new javax.swing.JLabel();
        photographers = new javax.swing.JPanel();
        photographer_text = new javax.swing.JLabel();
        p_icon = new javax.swing.JLabel();
        packages = new javax.swing.JPanel();
        package_text = new javax.swing.JLabel();
        pp_icon = new javax.swing.JLabel();
        booking = new javax.swing.JPanel();
        booking_text = new javax.swing.JLabel();
        b_icon = new javax.swing.JLabel();
        acc = new javax.swing.JPanel();
        booking_text1 = new javax.swing.JLabel();
        b_icon1 = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();
        ads_dash = new javax.swing.JPanel();
        a_icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/lg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        home.setOpaque(false);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_text.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        home_text.setForeground(new java.awt.Color(240, 240, 240));
        home_text.setText("Home");
        home.add(home_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 60, 40));

        h_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        h_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/home.png"))); // NOI18N
        home.add(h_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(home);
        home.setBounds(0, 70, 180, 40);

        photographers.setOpaque(false);
        photographers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photographersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                photographersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                photographersMouseExited(evt);
            }
        });
        photographers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photographer_text.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        photographer_text.setForeground(new java.awt.Color(240, 240, 240));
        photographer_text.setText("Photographer");
        photographers.add(photographer_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 40));

        p_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/photography.png"))); // NOI18N
        photographers.add(p_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(photographers);
        photographers.setBounds(0, 120, 180, 40);

        packages.setOpaque(false);
        packages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packagesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                packagesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                packagesMouseExited(evt);
            }
        });
        packages.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        package_text.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        package_text.setForeground(new java.awt.Color(240, 240, 240));
        package_text.setText("Packages");
        packages.add(package_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 40));

        pp_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pp_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/package.png"))); // NOI18N
        packages.add(pp_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(packages);
        packages.setBounds(0, 170, 180, 40);

        booking.setOpaque(false);
        booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookingMouseExited(evt);
            }
        });
        booking.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        booking_text.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        booking_text.setForeground(new java.awt.Color(240, 240, 240));
        booking_text.setText("Booking");
        booking.add(booking_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 40));

        b_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/appointment.png"))); // NOI18N
        booking.add(b_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(booking);
        booking.setBounds(0, 220, 180, 40);

        acc.setOpaque(false);
        acc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accMouseExited(evt);
            }
        });
        acc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        booking_text1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        booking_text1.setForeground(new java.awt.Color(240, 240, 240));
        booking_text1.setText("Account");
        acc.add(booking_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 40));

        b_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/profile-user.png"))); // NOI18N
        acc.add(b_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(acc);
        acc.setBounds(0, 20, 180, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 180, 560));
        getContentPane().add(mainDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 820, 640));

        ads_dash.setBackground(new java.awt.Color(167, 134, 42));
        ads_dash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/ad.png"))); // NOI18N
        ads_dash.add(a_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 60));

        title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("STAFF DASHBOARD");
        ads_dash.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 690, 60));

        getContentPane().add(ads_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 820, 60));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/Gradient.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void photographersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographersMouseEntered
         photographers.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_photographersMouseEntered

    private void photographersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographersMouseExited
         photographers.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_photographersMouseExited

    private void photographersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photographersMouseClicked
        Photographers pt = new Photographers();
        mainDesktop.add(pt);
        pt.setVisible(true); 
    }//GEN-LAST:event_photographersMouseClicked

    private void packagesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packagesMouseEntered
        packages.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_packagesMouseEntered

    private void packagesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packagesMouseExited
       packages.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_packagesMouseExited

    private void packagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packagesMouseClicked
       Packages pc = new Packages();
       mainDesktop.add(pc);
       pc.setVisible(true);
    }//GEN-LAST:event_packagesMouseClicked

    private void bookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseEntered
        booking.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_bookingMouseEntered

    private void bookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseExited
       booking.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_bookingMouseExited

    private void bookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingMouseClicked

    private void accMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseEntered
         acc.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_accMouseEntered

    private void accMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseExited
        acc.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_accMouseExited

    private void accMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accMouseClicked
       Setting set = new Setting();
        mainDesktop.add(set);
        set.setVisible(true);

        
    }//GEN-LAST:event_accMouseClicked

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
            java.util.logging.Logger.getLogger(Staff_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel a_icon;
    private javax.swing.JPanel acc;
    private javax.swing.JPanel ads_dash;
    private javax.swing.JLabel b_icon;
    private javax.swing.JLabel b_icon1;
    private javax.swing.JPanel booking;
    private javax.swing.JLabel booking_text;
    private javax.swing.JLabel booking_text1;
    private javax.swing.JLabel h_icon;
    private javax.swing.JPanel home;
    private javax.swing.JLabel home_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JLabel p_icon;
    private javax.swing.JLabel package_text;
    private javax.swing.JPanel packages;
    private javax.swing.JLabel photographer_text;
    private javax.swing.JPanel photographers;
    private javax.swing.JLabel pp_icon;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
