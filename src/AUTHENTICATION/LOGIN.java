
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
import javax.swing.JComponent;
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
        
        unf.setBackground(new java.awt.Color(0, 0, 0, 1));
        psf.setBackground(new java.awt.Color(0, 0, 0, 1));
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
        password_error = new javax.swing.JLabel();
        p_icon = new javax.swing.JLabel();
        new_user = new javax.swing.JLabel();
        Click = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        unf = new javax.swing.JTextField();
        showPass = new javax.swing.JLabel();
        psf = new javax.swing.JPasswordField();
        BG1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LOGIN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/logo1.png"))); // NOI18N
        LOGIN.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 840, -1));

        Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 153));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Event Photography Booking ");
        LOGIN.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 840, 40));

        System_Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        System_Name.setForeground(new java.awt.Color(255, 255, 153));
        System_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System_Name.setText("System");
        LOGIN.add(System_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 840, 40));

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 51, 51));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LOGIN.add(username_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 280, 20));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        LOGIN.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 40, 50));

        password_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        password_error.setForeground(new java.awt.Color(255, 51, 51));
        password_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LOGIN.add(password_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 280, 20));

        p_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/padlock.png"))); // NOI18N
        LOGIN.add(p_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 40, 50));

        new_user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        new_user.setForeground(new java.awt.Color(255, 255, 255));
        new_user.setText("New User? ");
        new_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_userMouseClicked(evt);
            }
        });
        LOGIN.add(new_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 80, 30));

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
        LOGIN.add(Click, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 590, 150, 30));

        error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        LOGIN.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 270, 20));

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

        LOGIN.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 90, 30));

        unf.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        unf.setForeground(new java.awt.Color(153, 153, 153));
        unf.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        unf.setCaretColor(new java.awt.Color(240, 240, 240));
        unf.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        unf.setOpaque(false);
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
        LOGIN.add(unf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 280, 60));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        LOGIN.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 40, 50));

        psf.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        psf.setForeground(new java.awt.Color(153, 153, 153));
        psf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        psf.setEchoChar('\u0000');
        psf.setOpaque(false);
        psf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                psfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                psfFocusLost(evt);
            }
        });
        psf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psfActionPerformed(evt);
            }
        });
        LOGIN.add(psf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 280, 60));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/new.png"))); // NOI18N
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
      
    boolean valid = true;

        String username = unf.getText().trim();
        String password = new String(psf.getPassword()).trim();

        if (username.isEmpty()) {
            setInvalidTitledBorder(unf, "Username");
            displayError(username_error, "Field cannot be empty!");
            valid = false;
        }

        if (password.isEmpty()) {
            setInvalidTitledBorder(psf, "Password");
            displayError(password_error, "Field cannot be empty!");
            valid = false;
        }

        if (!valid) {
            return;
        }

        connectDB con = new connectDB();
        Connection cn = con.getConnection();
        
        if (!con.fieldExists("username", username)){
            setInvalidTitledBorder(unf, "Username");
            displayError(username_error, "Invalid Username!");
            return;
        } 

       if (loginAcc(username, password)) {
            
            Session sess = Session.getInstance();
            String roleFromDB = sess.getRole();
            String status = sess.getStatus();

            if ("Pending".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(this, "Your account is pending approval.", "Login Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Login successful! You are logged in as " + roleFromDB + ".", "Success", JOptionPane.INFORMATION_MESSAGE);

               
                if ("Admin".equalsIgnoreCase(roleFromDB)) {
                    Admin_Dashboard admin = new Admin_Dashboard();
                    admin.setVisible(true);
                } else if ("Staff".equalsIgnoreCase(roleFromDB)) {
                    Admin_Dashboard staff = new Admin_Dashboard();
                    staff.setVisible(true);
                }

                this.dispose();
            }
        } else{
            setInvalidTitledBorder(psf, "Password");
            displayError(password_error, "Password Incorrect!");
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
    private void unfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unfFocusGained
        unf.setForeground(Color.WHITE);
        setTitledBorder(unf, "Username", Color.decode("#F5E196"));
    }//GEN-LAST:event_unfFocusGained

    private void unfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unfFocusLost
        displayError(username_error, "");
        setTitledBorder(unf, "Username", Color.WHITE);
        unf.setForeground(Color.WHITE);
    }//GEN-LAST:event_unfFocusLost

    private void unfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unfActionPerformed

    private void psfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psfFocusGained
        psf.setEchoChar('•'); // Mask password
        psf.setForeground(Color.WHITE);
        setTitledBorder(psf, "Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_psfFocusGained

    private void psfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_psfFocusLost

        setTitledBorder(psf, "Password", Color.WHITE);
        psf.setForeground(Color.WHITE);
        displayError(password_error, "");
    }//GEN-LAST:event_psfFocusLost

    private void psfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psfActionPerformed

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        pass_visible = !pass_visible;
        String currentText = psf.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                psf.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                psf.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_showPassMouseClicked

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
    private javax.swing.JPanel LOGIN;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel System_Name;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel login;
    private javax.swing.JLabel new_user;
    private javax.swing.JLabel p_icon;
    private javax.swing.JLabel password_error;
    private javax.swing.JPasswordField psf;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel u_icon;
    public javax.swing.JTextField unf;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
