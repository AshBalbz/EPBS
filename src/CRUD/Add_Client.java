
package CRUD;

import BOOKING.Client;
import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Clients;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Add_Client extends javax.swing.JInternalFrame {

    
    public Add_Client() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
          //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        fname.setBackground(new Color(0,0,0,1));
        lname.setBackground(new Color(0,0,0,1));
        email.setBackground(new Color(0,0,0,1));
        address.setBackground(new Color(0,0,0,1));
        phone_no.setBackground(new Color(0,0,0,1));
        
        fname.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        lname.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        email.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        address.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        phone_no.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
        
        fname.setForeground(new Color(0,0,0));
        lname.setForeground(new Color(0,0,0));
        email.setForeground(new Color(0,0,0));
        address.setForeground(new Color(0,0,0));
        phone_no.setForeground(new Color(0,0,0));
        
        
      
       
    }

      private void displayError(JLabel field, String message) {
               field.setText(message);
               field.setForeground(new Color(255, 0, 0));
           }
      
      
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fname_error = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        add_error = new javax.swing.JLabel();
        email_error = new javax.swing.JLabel();
        contact_error = new javax.swing.JLabel();
        fname = new Swing.TextField();
        lname = new Swing.TextField();
        address = new Swing.TextField();
        email = new Swing.TextField();
        phone_no = new Swing.TextField();
        details = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        Continue = new javax.swing.JLabel();
        submit = new Swing.Button();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        fname_error.setForeground(new java.awt.Color(255, 102, 102));
        fname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(fname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 320, 20));

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 102, 102));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 320, 20));

        add_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        add_error.setForeground(new java.awt.Color(255, 102, 102));
        add_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(add_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 320, 20));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 102, 102));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 320, 20));

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 102, 102));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(contact_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 320, 20));

        fname.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        fname.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        fname.setLabelText("First Name");
        fname.setLineColor(new java.awt.Color(153, 102, 0));
        fname.setOpaque(false);
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 320, 60));

        lname.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        lname.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        lname.setLabelText("Last Name");
        lname.setLineColor(new java.awt.Color(153, 102, 0));
        lname.setOpaque(false);
        lname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnameFocusLost(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 320, 60));

        address.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        address.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        address.setLabelText("Address");
        address.setLineColor(new java.awt.Color(153, 102, 0));
        address.setOpaque(false);
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, 60));

        email.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        email.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        email.setLabelText("Email");
        email.setLineColor(new java.awt.Color(153, 102, 0));
        email.setOpaque(false);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 320, 60));

        phone_no.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        phone_no.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        phone_no.setLabelText("Phone No.");
        phone_no.setLineColor(new java.awt.Color(153, 102, 0));
        phone_no.setOpaque(false);
        phone_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phone_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phone_noFocusLost(evt);
            }
        });
        jPanel1.add(phone_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 320, 60));

        details.setBackground(new java.awt.Color(0, 0, 0));
        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(51, 51, 0));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("ADD CLIENT");
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 140, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button_black.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 60));

        Continue.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue.setText("Add");
        jPanel1.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 70, 50));

        submit.setBackground(new java.awt.Color(153, 102, 0));
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 110, 50));

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

   
    
    
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Clients pack = new Clients();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(pack);
        pack.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        fname.setLineColor(new Color(153,102,0));
        
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
       displayError(fname_error, "");
       fname.setForeground(Color.black);
    }//GEN-LAST:event_fnameFocusLost

    private void lnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusGained
        lname.setLineColor(new Color(153,102,0));

    }//GEN-LAST:event_lnameFocusGained

    private void lnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnameFocusLost
      displayError(lname_error,"");
      lname.setForeground(Color.black);
    }//GEN-LAST:event_lnameFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        address.setLineColor(new Color(153,102,0));

    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
      displayError(add_error, "");
      address.setForeground(Color.black);
    }//GEN-LAST:event_addressFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setLineColor(new Color(153,102,0));

    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
      displayError(email_error, "");
      email.setForeground(Color.black);
    }//GEN-LAST:event_emailFocusLost

    private void phone_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_noFocusGained
        phone_no.setLineColor(new Color(153,102,0));

    }//GEN-LAST:event_phone_noFocusGained

    private void phone_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phone_noFocusLost
       displayError(contact_error, "");
       address.setForeground(Color.black); 
    }//GEN-LAST:event_phone_noFocusLost

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
         boolean valid = true;
        String error = "Field cannot be empty!";

        connectDB con = new connectDB();
        Connection conn = con.getConnection();

        String cname = fname.getText().trim();
        String clname = lname.getText().trim();
        String add = address.getText().trim();
        String cemail = email.getText().trim();
        String contact = phone_no.getText().trim(); // renamed to avoid conflict

        // Validation checks
        if (cname.isEmpty()) {
            displayError(fname_error, error);
            valid = false;
        }
        
        if (clname.isEmpty()) {
            displayError(lname_error, error);
            valid = false;
        }
        
        if (add.isEmpty()) {
            displayError(add_error, error);
            valid = false;
        }
        
        if (cemail.isEmpty()) {
            displayError(email_error, error);  // fixed label
            valid = false;
        } else if(!isEmailValid(cemail)) {
            
            displayError(email_error, "Invalid Email!");
            valid = false;
        }
        
        if (contact.isEmpty()) {
            displayError(contact_error, error); // fixed label
            valid = false;
        } else if(!isPhoneNumberValid(contact)) {
            
            displayError(contact_error, "Invalid Phone Number!");
            valid = false;
        }

        // Stop execution if any validation fails
        if (!valid) {
            return;
        }

        // Correct SQL
        String sql = "INSERT INTO client (c_fname, c_lname, c_address, c_email, c_contact) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, cname);
            pstmt.setString(2, clname);
            pstmt.setString(3, add);
            pstmt.setString(4, cemail);
            pstmt.setString(5, contact);

            int result = pstmt.executeUpdate();

            if (result > 0) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                int lastInsertedId = 0;
                if (generatedKeys.next()) {
                    lastInsertedId = generatedKeys.getInt(1);
                }

                // Logging the action
                Session sess = Session.getInstance();
                String action = "Added new client with ID " + lastInsertedId;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                JOptionPane.showMessageDialog(null, "Client added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Addition failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_submitMouseClicked

    
       private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }
    
    
    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        submit.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
        submit.setBackground(new Color(153,102,0));
    }//GEN-LAST:event_submitMouseExited

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JLabel add_error;
    private Swing.TextField address;
    private javax.swing.JLabel back;
    private javax.swing.JLabel contact_error;
    private javax.swing.JLabel details;
    private Swing.TextField email;
    private javax.swing.JLabel email_error;
    private Swing.TextField fname;
    private javax.swing.JLabel fname_error;
    private javax.swing.JPanel jPanel1;
    private Swing.TextField lname;
    private javax.swing.JLabel lname_error;
    private Swing.TextField phone_no;
    private Swing.Button submit;
    // End of variables declaration//GEN-END:variables
}
