
package CRUD;

import MANAGEMENT.Packages;
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
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Edit_Package extends javax.swing.JInternalFrame {

    
    public Edit_Package() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
          //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
        pnfield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        dfield.setBackground(new java.awt.Color(0,0,0,1));
        sfield.setBackground(new java.awt.Color(0,0,0,1));
        tfield.setBackground(new java.awt.Color(0,0,0,1));
       
    }

        private void displayError(JLabel field, String message) {
               field.setText(message);
               field.setForeground(new Color(255, 105, 97));
           }
        

         public void setTitledBorder(JComponent component, String title, Color color) {
           TitledBorder titledBorder = BorderFactory.createTitledBorder(
               BorderFactory.createEmptyBorder(),  // Use given color
               title,  
               TitledBorder.LEFT,  
               TitledBorder.TOP,  
               new Font("Franklin Gothic Medium", Font.PLAIN, 16),  
               color  // Title text color
           );

           component.setBorder(BorderFactory.createCompoundBorder(titledBorder, new EmptyBorder(0, 5, 0, 0)));

           
           
           // Make text field or text area background fully transparent
           if (component instanceof JTextField) {
               JTextField textField = (JTextField) component;
               textField.setOpaque(false); // Remove background fill
               textField.setBackground(new Color(0, 0, 0, 0)); // Full transparency
               textField.setCaretColor(Color.WHITE); // Ensure cursor is visible
               textField.setForeground(Color.decode("#F5E196"));
           }

           if (component instanceof JTextArea) {
               JTextArea area = (JTextArea) component;
               area.setOpaque(false); // Remove background fill
               area.setBackground(new Color(0, 0, 0, 0)); // Full transparency
               area.setCaretColor(Color.WHITE);
               area.setForeground(Color.decode("#F5E196"));
           }

       
         }      

         

       public void setInvalidTitledBorder(JComponent component, String title) {
           TitledBorder titledBorder = BorderFactory.createTitledBorder(
               BorderFactory.createEmptyBorder(),  // Red border for invalid input
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
        pnfield = new javax.swing.JTextField();
        pfield = new javax.swing.JTextField();
        dfield = new javax.swing.JTextArea();
        sfield = new javax.swing.JTextArea();
        tfield = new javax.swing.JTextField();
        name_error = new javax.swing.JLabel();
        service_error = new javax.swing.JLabel();
        desc_error = new javax.swing.JLabel();
        price_error = new javax.swing.JLabel();
        dura_error = new javax.swing.JLabel();
        details = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        add_p = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(820, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pnfield.setForeground(new java.awt.Color(153, 153, 153));
        pnfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Package Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        pnfield.setCaretColor(new java.awt.Color(240, 240, 240));
        pnfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pnfield.setOpaque(false);
        pnfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnfieldFocusLost(evt);
            }
        });
        pnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnfieldActionPerformed(evt);
            }
        });
        jPanel1.add(pnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 720, 50));

        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Price", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        jPanel1.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 720, 50));

        dfield.setColumns(20);
        dfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        dfield.setForeground(new java.awt.Color(153, 153, 153));
        dfield.setRows(5);
        dfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Description", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        dfield.setOpaque(false);
        dfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dfieldFocusLost(evt);
            }
        });
        jPanel1.add(dfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 720, 80));

        sfield.setColumns(20);
        sfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        sfield.setForeground(new java.awt.Color(153, 153, 153));
        sfield.setRows(5);
        sfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Included Services", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        sfield.setOpaque(false);
        sfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sfieldFocusLost(evt);
            }
        });
        jPanel1.add(sfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 720, 70));

        tfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        tfield.setForeground(new java.awt.Color(153, 153, 153));
        tfield.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Duration", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        tfield.setCaretColor(new java.awt.Color(240, 240, 240));
        tfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfield.setOpaque(false);
        tfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfieldFocusLost(evt);
            }
        });
        tfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfieldActionPerformed(evt);
            }
        });
        jPanel1.add(tfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 720, 50));

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(name_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, 20));

        service_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        service_error.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(service_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 320, 20));

        desc_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        desc_error.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(desc_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 320, 20));

        price_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        price_error.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(price_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 320, 20));

        dura_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        dura_error.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.add(dura_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 320, 20));

        details.setBackground(new java.awt.Color(0, 0, 0));
        details.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 20)); // NOI18N
        details.setForeground(new java.awt.Color(255, 255, 240));
        details.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        details.setText("EDIT PACKAGES");
        jPanel1.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 190, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 60));

        add_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_pMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_pMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_pMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update");

        javax.swing.GroupLayout add_pLayout = new javax.swing.GroupLayout(add_p);
        add_p.setLayout(add_pLayout);
        add_pLayout.setHorizontalGroup(
            add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        add_pLayout.setVerticalGroup(
            add_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(add_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 80, 30));

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

    private void add_pMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseExited
        add_p.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_add_pMouseExited

    private void add_pMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseEntered
        add_p.setBackground(new Color(180, 180, 180));
    }//GEN-LAST:event_add_pMouseEntered

    private void add_pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_pMouseClicked
        boolean valid = true;
        String error = "Field cannot be empty!";

        connectDB con = new connectDB();
        Connection conn = con.getConnection();

        String pname = pnfield.getText().trim();
        String price = pfield.getText().trim();
        String desc = dfield.getText().trim();
        String service = sfield.getText().trim();
        String duration = tfield.getText().trim();
       

        // Validation checks
        if (pname.isEmpty()) {
            setInvalidTitledBorder(pnfield, "Package Name");
            displayError(name_error, error);
            valid = false;
        }

        if (price.isEmpty()) {
            setInvalidTitledBorder(pfield, "Price");
            displayError(price_error, error);
            valid = false;
        }

       
        if (desc.isEmpty()) {
            setInvalidTitledBorder(dfield, "Description");
            displayError(desc_error, error);
            valid = false;
        }

        if (service.isEmpty()) {
            setInvalidTitledBorder(sfield, "Included Services");
            displayError(service_error, error);
            valid = false;
        }

        if (duration.isEmpty()) {
            setInvalidTitledBorder(tfield, "Duration");
            displayError(dura_error, error);
            valid = false;
        }

        // ❌ Stop execution if any validation fails
        if (!valid) {
            return;
        }

        // ✅ Corrected SQL (no extra comma)
       String sql = "UPDATE FROM package pp_name = ?, pp_price = ?, pp_desc = ?, pp_service = ? , pp_duration = ? WHERE pp_id = ?";

        try (PreparedStatement pstmt = con.getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, pname);
            pstmt.setString(2, price);
            pstmt.setString(3, desc);
            pstmt.setString(4, service);
            pstmt.setString(5, duration);
         

            int result = pstmt.executeUpdate();

            if (result > 0) {
                ResultSet generatedKeys = pstmt.getGeneratedKeys();
                int selectedId = 1;
                if (generatedKeys.next()) {
                    selectedId = generatedKeys.getInt(1);
                }

                // Logging the action
                Session sess = Session.getInstance();
                String action = "Edited a package with ID " + selectedId;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                JOptionPane.showMessageDialog(null, "Package edited successfully!");

            } else {
                JOptionPane.showMessageDialog(null, "Updating failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_add_pMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Packages pack = new Packages();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(pack);
        pack.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked

    private void tfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfieldActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_tfieldActionPerformed

    private void tfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfieldFocusLost
        displayError(dura_error, "");
        setTitledBorder(tfield, "Duration", Color.WHITE);
        tfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_tfieldFocusLost

    private void tfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfieldFocusGained
        tfield.setForeground(Color.WHITE);
        setTitledBorder(tfield, "Duration", Color.decode("#F5E196"));
    }//GEN-LAST:event_tfieldFocusGained

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
        displayError(price_error, "");
        setTitledBorder(pfield, "Price", Color.WHITE);
        pfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
        pfield.setForeground(Color.WHITE);
        setTitledBorder(pfield, "Price", Color.decode("#F5E196"));
    }//GEN-LAST:event_pfieldFocusGained

    private void sfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sfieldFocusGained
        sfield.setForeground(Color.WHITE);
        setTitledBorder(sfield, "Included Services", Color.decode("#F5E196"));
    }//GEN-LAST:event_sfieldFocusGained

    private void sfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sfieldFocusLost
        displayError(service_error, "");
        setTitledBorder(sfield, "Included Services", Color.WHITE);
        sfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_sfieldFocusLost

    private void dfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dfieldFocusGained
        dfield.setForeground(Color.WHITE);
        setTitledBorder(dfield, "Description", Color.decode("#F5E196"));
    }//GEN-LAST:event_dfieldFocusGained

    private void dfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dfieldFocusLost
        displayError(dura_error, "");
        setTitledBorder(dfield, "Description", Color.WHITE);
        dfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_dfieldFocusLost

    private void pnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnfieldFocusGained
        pnfield.setForeground(Color.WHITE);
        setTitledBorder(pnfield, "Package Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_pnfieldFocusGained

    private void pnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnfieldFocusLost
        displayError(name_error, "");
        setTitledBorder(pnfield, "Package Name", Color.WHITE);
        pnfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnfieldFocusLost

    private void pnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnfieldActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_p;
    private javax.swing.JLabel back;
    private javax.swing.JLabel desc_error;
    private javax.swing.JLabel details;
    private javax.swing.JTextArea dfield;
    private javax.swing.JLabel dura_error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name_error;
    public javax.swing.JTextField pfield;
    public javax.swing.JTextField pnfield;
    private javax.swing.JLabel price_error;
    private javax.swing.JLabel service_error;
    private javax.swing.JTextArea sfield;
    public javax.swing.JTextField tfield;
    // End of variables declaration//GEN-END:variables
}
