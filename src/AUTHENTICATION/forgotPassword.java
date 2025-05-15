
package AUTHENTICATION;

import CONFIG.Session;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class forgotPassword extends javax.swing.JFrame {

    public forgotPassword() {
        initComponents();
        
    }
    
    
        private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(new Color(255, 0, 0));
            field.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));

           }
    
        private void searchbarTextField(JTextField field, String createLineBorder) {
            Border line = BorderFactory.createLineBorder(Color.decode(createLineBorder));
            Border empty = new EmptyBorder(0, 5, 0, 0);
            field.setBorder(BorderFactory.createCompoundBorder(line, empty));
        }

        
  
        
        private void invalidsearchbarTextField(JTextField field) {
            field.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0)));
        }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search_error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        light_Yellow1 = new ColorGrading.Light_Yellow();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Find Your Account");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 23, 510, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/search_1.png"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 50, 50));

        searchField.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        jPanel2.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 380, 50));

        searchbutton.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, 40));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel4.setText("Email or Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 150, 40));

        search_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        search_error.setForeground(new java.awt.Color(255, 51, 51));
        search_error.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel2.add(search_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 430, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 580, 360));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 90));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        jPanel1.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        javax.swing.GroupLayout light_Yellow1Layout = new javax.swing.GroupLayout(light_Yellow1);
        light_Yellow1.setLayout(light_Yellow1Layout);
        light_Yellow1Layout.setHorizontalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        light_Yellow1Layout.setVerticalGroup(
            light_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(light_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        boolean valid = true;
        String searchInput = searchField.getText().trim();

        if (searchInput.isEmpty()) {
            displayError(search_error, "Field is empty!");
            return;
        }

        
        connectDB con = new connectDB();
        try {
            // Query to search by username OR email
            String query = "SELECT * FROM user WHERE username = ? OR email = ?";
            PreparedStatement pst = con.getConnection().prepareStatement(query);
            pst.setString(1, searchInput);
            pst.setString(2, searchInput);
            ResultSet rs = pst.executeQuery();

            // If user is found, store data in session and proceed
            if (rs.next()) {
                // Get user details
                String userId = rs.getString("u_id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String firstName = rs.getString("u_fname");
                String lastName = rs.getString("u_lname");

                // Store user details in session
                Session sess = Session.getInstance();
                sess.setUser_id(userId);
                sess.setUsername(username);
                sess.setEmail(email);
                sess.setU_fname(firstName);
                sess.setU_lname(lastName);

                JOptionPane.showMessageDialog(this, 
                    "User Found!\nRedirecting to Security Question Page...",
                    "Success", JOptionPane.INFORMATION_MESSAGE);

                // Open the security question page
                security sqp = new security();
                sqp.setVisible(true);
                this.dispose(); // Close search page

            } else {
                JOptionPane.showMessageDialog(this, "User not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close resources
            rs.close();
            pst.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        LOGIN in = new LOGIN();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        

    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        displayError(search_error, "");
    }//GEN-LAST:event_searchFieldFocusLost

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
        return;
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private ColorGrading.Light_Yellow light_Yellow1;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel search_error;
    private javax.swing.JButton searchbutton;
    // End of variables declaration//GEN-END:variables
}
