
package AUTHENTICATION;

import CONFIG.Session;
import CONFIG.Util;
import java.awt.Color;
import javax.swing.JOptionPane;
import CONFIG.connectDB;
import DASHBOARDS.Admin_Dashboard;
import DASHBOARDS.Staff_Dashboard;
import java.awt.Font;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class LOGIN extends javax.swing.JFrame {

    public LOGIN() {
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
     
    static String status;
    static String type;
    
    public static boolean loginAcc(String username, String password){
        connectDB con = new connectDB();
  
        try {
            String query = "SELECT * FROM user WHERE username = '" + username + "'";
            ResultSet resultSet = con.getData(query);

            if (resultSet.next()) {
                
                String hashedPass = resultSet.getString("password");
                String rehashedPass = Util.hashPassword(password);
                if(hashedPass.equals(rehashedPass)){

                    status = resultSet.getString("status");
                    type = resultSet.getString("role");

                    Session sess = Session.getInstance();
                    sess.setUser_id(resultSet.getString("u_id"));
                    sess.setU_fname(resultSet.getString("u_fname"));
                    sess.setU_lname(resultSet.getString("u_lname"));                  
                    sess.setEmail(resultSet.getString("email"));
                    sess.setContact(resultSet.getString("contact"));
                    sess.setUsername(resultSet.getString("username"));
                    sess.setRole(resultSet.getString("role"));
                    sess.setStatus(resultSet.getString("status"));
                    
                    System.out.println("Session User ID: " + sess.getUser_id());
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LOGIN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        System_Name = new javax.swing.JLabel();
        username_error = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        show_pass = new javax.swing.JLabel();
        unf = new javax.swing.JTextField();
        password_error = new javax.swing.JLabel();
        psf = new javax.swing.JPasswordField();
        p_icon = new javax.swing.JLabel();
        new_user = new javax.swing.JLabel();
        Click = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        Exit = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        BG1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/logo1.png"))); // NOI18N
        LOGIN.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 153));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Event Photography Booking ");
        LOGIN.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 800, 40));

        System_Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        System_Name.setForeground(new java.awt.Color(255, 255, 153));
        System_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System_Name.setText("System");
        LOGIN.add(System_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 800, 40));

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 51, 51));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LOGIN.add(username_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 120, 20));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        LOGIN.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 40, 40));

        show_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hidden.png"))); // NOI18N
        show_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_passMouseClicked(evt);
            }
        });
        LOGIN.add(show_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 40, 40));

        unf.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        unf.setForeground(new java.awt.Color(153, 153, 153));
        unf.setText("Enter username...");
        unf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unfFocusLost(evt);
            }
        });
        unf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unfActionPerformed(evt);
            }
        });
        LOGIN.add(unf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 270, 40));

        password_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        password_error.setForeground(new java.awt.Color(255, 51, 51));
        password_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LOGIN.add(password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 130, 20));

        psf.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        psf.setForeground(new java.awt.Color(153, 153, 153));
        psf.setText("Enter password...");
        psf.setToolTipText("");
        psf.setEchoChar('\u0000');
        psf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                psfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                psfFocusLost(evt);
            }
        });
        LOGIN.add(psf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 270, 40));

        p_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/padlock.png"))); // NOI18N
        LOGIN.add(p_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 40, 40));

        new_user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        new_user.setForeground(new java.awt.Color(255, 255, 255));
        new_user.setText("New User? ");
        new_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_userMouseClicked(evt);
            }
        });
        LOGIN.add(new_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 80, 30));

        Click.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Click.setForeground(new java.awt.Color(255, 255, 0));
        Click.setText("Click here to register");
        Click.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClickMouseExited(evt);
            }
        });
        LOGIN.add(Click, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 150, 30));

        error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        LOGIN.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 446, 270, 20));

        Login.setLayout(new java.awt.BorderLayout());

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login.setText("Login");
        login.setMaximumSize(new java.awt.Dimension(25, 19));
        login.setMinimumSize(new java.awt.Dimension(25, 19));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        Login.add(login, java.awt.BorderLayout.CENTER);

        LOGIN.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 90, 30));

        Exit.setLayout(new java.awt.BorderLayout());

        exit.setBackground(new java.awt.Color(240, 240, 190));
        exit.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        Exit.add(exit, java.awt.BorderLayout.CENTER);

        LOGIN.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, 90, 30));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/1.png"))); // NOI18N
        BG1.setAutoscrolls(true);
        LOGIN.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LOGIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void new_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_userMouseClicked
       

    }//GEN-LAST:event_new_userMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
      
        displayError(error, "");
        boolean valid = true;

        String username = unf.getText().trim();
        String password = new String(psf.getPassword()).trim();

        // Default border (White)
        TitledBorder defaultBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.WHITE, 1),
            ""
          
        );

        // Error border (Red with "Field Required" title)
        TitledBorder errorBorder = BorderFactory.createTitledBorder(
            BorderFactory.createLineBorder(Color.RED, 2),
            "Field Required",
            TitledBorder.RIGHT, TitledBorder.TOP,
            new Font("Franklin Gothic Medium", Font.PLAIN, 16),
            Color.RED
        );

        if (username.isEmpty() || username.equals("Enter username...")) {
            unf.setBorder(errorBorder);
            displayError(username_error, "Field Required!");
            valid = false;
        } else {
            unf.setBorder(defaultBorder);  // Reset to default
        }

        if (password.isEmpty() || password.equals("Enter password...")) {
            psf.setBorder(errorBorder);
            displayError(password_error, "Field Required!");
            valid = false;
        } else {
            psf.setBorder(defaultBorder);  // Reset to default
        }

        if (!valid) return; // Stop execution if validation fails
    
    
    connectDB con = new connectDB();
    Connection cn = con.getConnection();
            
            
     String hashedPassword = Util.hashPassword(password);
        
                if (loginAcc(username, password)) {
            
            Session sess = Session.getInstance();
            String roleFromDB = sess.getRole();
            String status = sess.getStatus();

            if ("Pending".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(this, "Your account is pending approval.", "Login Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Login successful! You are logged in as " + roleFromDB + ".", "Success", JOptionPane.INFORMATION_MESSAGE);

               
                if ("Admin".equalsIgnoreCase(roleFromDB)) {
                    Admin_Dashboard admin = new  Admin_Dashboard();
                    admin.setVisible(true);
                } else if ("Staff".equalsIgnoreCase(roleFromDB)) {
                    Staff_Dashboard staff = new Staff_Dashboard();
                    staff.setVisible(true);
                }

                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Error", JOptionPane.ERROR_MESSAGE);
        } 

    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
         login.setBackground(defaultColor); 
         login.setBorder(BorderFactory.createLineBorder(Color. YELLOW, 1));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
         login.setOpaque(true); // Ensure background change is visible
         login.setBorder(BorderFactory.createLineBorder(Color. BLACK, 1));
         login.setBackground(hoverColor);    }//GEN-LAST:event_loginMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
         exit.setBackground(defaultColor);
         exit.setBorder(BorderFactory.createLineBorder(Color. YELLOW, 1));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
         exit.setOpaque(true); // Ensure background change is visible
         exit.setBackground(hoverColor); 
         exit.setBorder(BorderFactory.createLineBorder(Color. BLACK, 1));
     }//GEN-LAST:event_exitMouseExited

    private void ClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouseClicked
       REGISTRATION reg = new REGISTRATION();
       reg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ClickMouseClicked

    private void ClickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouseEntered
       Click.setForeground(new Color(231,231,198));
    }//GEN-LAST:event_ClickMouseEntered

    private void ClickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickMouseExited
        Click.setForeground(new Color(255,255,0));
    }//GEN-LAST:event_ClickMouseExited

    
    private boolean pass_visible = false;
    private void show_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_passMouseClicked
        
        pass_visible = !pass_visible;
        String currentText = psf.getText().trim();

        if (pass_visible) {
            if (!currentText.equals(" Enter password...")) {
                psf.setEchoChar((char) 0);
            }
            show_pass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/view.png")));
        } else {
            if (!currentText.equals(" Enter password...")) {
                psf.setEchoChar('•');
            }
            show_pass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hidden.png")));
        }
     

    }//GEN-LAST:event_show_passMouseClicked

    private void unfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unfFocusGained
        if(unf.getText().equals("Enter username...")){
            unf.setText("");
            unf.setForeground(Color.BLACK);
            unf.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));

        }
    }//GEN-LAST:event_unfFocusGained

    private void unfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unfFocusLost
        if(unf.getText().isEmpty()){
            unf.setText("Enter username...");
            unf.setForeground(Color.GRAY);
            unf.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(username_error, "");
        resetBorder(unf);
    }//GEN-LAST:event_unfFocusLost

    private void psfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psfFocusGained
       if (new String(psf.getPassword()).equals("Enter password...")) {
            psf.setText("");
            psf.setEchoChar('•'); // Mask password
            psf.setForeground(Color.BLACK);           
            psf.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 1));

        }   
    }//GEN-LAST:event_psfFocusGained

    private void psfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psfFocusLost
        if (new String(psf.getPassword()).isEmpty()) {
            psf.setText("Enter password...");
            psf.setEchoChar((char) 0); // Show text instead of masked chars
            psf.setForeground(Color.GRAY);
            psf.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        displayError(password_error, "");
        resetBorder(psf);
    }//GEN-LAST:event_psfFocusLost

    private void unfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_unfActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel Click;
    private javax.swing.JPanel Exit;
    private javax.swing.JPanel LOGIN;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel System_Name;
    private javax.swing.JLabel error;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel login;
    private javax.swing.JLabel new_user;
    private javax.swing.JLabel p_icon;
    private javax.swing.JLabel password_error;
    private javax.swing.JPasswordField psf;
    private javax.swing.JLabel show_pass;
    private javax.swing.JLabel u_icon;
    private javax.swing.JTextField unf;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
