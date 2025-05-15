
package DASHBOARDS;

import BOOKING.Client;
import MANAGEMENT.Bookings;
import MANAGEMENT.Clients;
import MANAGEMENT.Logs;
import MANAGEMENT.Packages;
import MANAGEMENT.Photographers;
import MANAGEMENT.Users;
import MANAGEMENT.Setting;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class Admin_Dashboard extends javax.swing.JFrame {

    
    public Admin_Dashboard() {
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
        client = new javax.swing.JPanel();
        user_text1 = new javax.swing.JLabel();
        u_icon1 = new javax.swing.JLabel();
        users = new javax.swing.JPanel();
        user_text = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        photographers = new javax.swing.JPanel();
        photographer_text = new javax.swing.JLabel();
        p_icon = new javax.swing.JLabel();
        packages = new javax.swing.JPanel();
        package_text = new javax.swing.JLabel();
        pp_icon = new javax.swing.JLabel();
        log = new javax.swing.JPanel();
        booking_text2 = new javax.swing.JLabel();
        b_icon2 = new javax.swing.JLabel();
        booking = new javax.swing.JPanel();
        booking_text = new javax.swing.JLabel();
        b_icon = new javax.swing.JLabel();
        acc = new javax.swing.JPanel();
        booking_text1 = new javax.swing.JLabel();
        b_icon1 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        mainDesktop = new javax.swing.JDesktopPane();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        ads_dash = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        a_icon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/lg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 180, 120));

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

        client.setOpaque(false);
        client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientMouseExited(evt);
            }
        });
        client.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_text1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        user_text1.setForeground(new java.awt.Color(240, 240, 240));
        user_text1.setText("Client");
        user_text1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_text1MouseClicked(evt);
            }
        });
        client.add(user_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        u_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/receptionist.png"))); // NOI18N
        client.add(u_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(client);
        client.setBounds(0, 320, 180, 40);

        users.setOpaque(false);
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });
        users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_text.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        user_text.setForeground(new java.awt.Color(240, 240, 240));
        user_text.setText("Users");
        user_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_textMouseClicked(evt);
            }
        });
        users.add(user_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 40, 40));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/receptionist.png"))); // NOI18N
        users.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(users);
        users.setBounds(0, 120, 180, 40);

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
        photographers.setBounds(0, 170, 180, 40);

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
        packages.setBounds(0, 220, 180, 40);

        log.setOpaque(false);
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logMouseExited(evt);
            }
        });
        log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        booking_text2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        booking_text2.setForeground(new java.awt.Color(240, 240, 240));
        booking_text2.setText("Logs");
        log.add(booking_text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 80, 40));

        b_icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/log-file.png"))); // NOI18N
        log.add(b_icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel3.add(log);
        log.setBounds(0, 370, 180, 40);

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
        booking.setBounds(0, 270, 180, 40);

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 180, 560));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/Gradient.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 180, 690));
        getContentPane().add(mainDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 820, 650));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        ads_dash.setBackground(new java.awt.Color(167, 134, 42));
        ads_dash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ADMIN DASHBOARD");
        ads_dash.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 260, 70));

        a_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/ad.png"))); // NOI18N
        ads_dash.add(a_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        getContentPane().add(ads_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 70));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 180, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        Users us = new Users();  // Instantiate the Users internal frame
        mainDesktop.add(us);     // Add it to the JDesktopPane
        us.setVisible(true);
    }//GEN-LAST:event_usersMouseClicked

    private void user_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textMouseClicked
    Users us = new Users();  // Instantiate the Users internal frame
        mainDesktop.add(us);     // Add it to the JDesktopPane
        us.setVisible(true);
    }//GEN-LAST:event_user_textMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        users.setBorder(BorderFactory.createLineBorder(new Color(240,240,240)));
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        users.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_usersMouseExited

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
        Bookings book = new Bookings();
        mainDesktop.add(book);
        book.setVisible(true);
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

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
       Logs lg  = new Logs();
       mainDesktop.add(lg);
       lg.setVisible(true);
    }//GEN-LAST:event_logMouseClicked

    private void logMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseEntered
        log.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240)));
    }//GEN-LAST:event_logMouseEntered

    private void logMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseExited
        log.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_logMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
        return;
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
       this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_miniMouseClicked

    private void user_text1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_text1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user_text1MouseClicked

    private void clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseClicked
       Clients cl = new Clients();
       
       mainDesktop.add(cl);
       cl.setVisible(true);
    }//GEN-LAST:event_clientMouseClicked

    private void clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseEntered
       client.setBorder(BorderFactory.createLineBorder(new Color(240, 240, 240)));
    }//GEN-LAST:event_clientMouseEntered

    private void clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseExited
       client.setBorder(BorderFactory.createEmptyBorder());

    }//GEN-LAST:event_clientMouseExited

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
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
    private javax.swing.JLabel b_icon2;
    private javax.swing.JPanel booking;
    private javax.swing.JLabel booking_text;
    private javax.swing.JLabel booking_text1;
    private javax.swing.JLabel booking_text2;
    private javax.swing.JPanel client;
    private javax.swing.JLabel close;
    private javax.swing.JLabel h_icon;
    private javax.swing.JPanel home;
    private javax.swing.JLabel home_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel log;
    private javax.swing.JDesktopPane mainDesktop;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel p_icon;
    private javax.swing.JLabel package_text;
    private javax.swing.JPanel packages;
    private javax.swing.JLabel photographer_text;
    private javax.swing.JPanel photographers;
    private javax.swing.JLabel pp_icon;
    private javax.swing.JLabel title;
    private javax.swing.JLabel u_icon;
    private javax.swing.JLabel u_icon1;
    private javax.swing.JLabel user_text;
    private javax.swing.JLabel user_text1;
    private javax.swing.JPanel users;
    // End of variables declaration//GEN-END:variables
}
