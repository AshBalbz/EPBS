
package AUTHENTICATION;

import CONFIG.Util;
import java.awt.Color;
import javax.swing.JOptionPane;
import CONFIG.connectDB;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


public class REGISTRATION extends javax.swing.JFrame {

    connectDB con = new connectDB();
    
    public REGISTRATION() {
        initComponents();
        
        fnfield.setBackground(new java.awt.Color(0,0,0,1));
        lnfield.setBackground(new java.awt.Color(0,0,0,1));
        efield.setBackground(new java.awt.Color(0,0,0,1));
        pfield.setBackground(new java.awt.Color(0,0,0,1));
        ufield.setBackground(new java.awt.Color(0,0,0,1));
        createpass.setBackground(new java.awt.Color(0,0,0,1));
        confirmpass.setBackground(new java.awt.Color(0,0,0,1));
    }
    
          private void displayError(JLabel field, String message) {
                    field.setText(message);
                    field.setForeground(new Color(255, 105, 97));
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
    
        private Color hoverColor = new Color(180, 180, 180); // Grayish color on hover
        private Color defaultColor = new Color(255, 255, 255); // Default white color
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        System_Name = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Registration = new javax.swing.JLabel();
        Balbz_logo = new javax.swing.JLabel();
        fn_icon = new javax.swing.JLabel();
        ln_icon = new javax.swing.JLabel();
        e_icon = new javax.swing.JLabel();
        c_icon = new javax.swing.JLabel();
        u_icon = new javax.swing.JLabel();
        pass1_icon = new javax.swing.JLabel();
        pass2_icon = new javax.swing.JLabel();
        r_icon = new javax.swing.JLabel();
        name_error = new javax.swing.JLabel();
        lname_error = new javax.swing.JLabel();
        email_error = new javax.swing.JLabel();
        contact_error = new javax.swing.JLabel();
        username_error = new javax.swing.JLabel();
        createpass_error = new javax.swing.JLabel();
        confirmpass_error = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        sign_up = new javax.swing.JButton();
        acc = new javax.swing.JLabel();
        sign_in = new javax.swing.JLabel();
        fnfield = new javax.swing.JTextField();
        lnfield = new javax.swing.JTextField();
        efield = new javax.swing.JTextField();
        pfield = new javax.swing.JTextField();
        ufield = new javax.swing.JTextField();
        showPass1 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        showPass = new javax.swing.JLabel();
        createpass = new javax.swing.JPasswordField();
        mini = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        BG2 = new javax.swing.JLabel();

        System_Name.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 20)); // NOI18N
        System_Name.setForeground(new java.awt.Color(250, 249, 190));
        System_Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        System_Name.setText("Event Photography Booking System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registration.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 24)); // NOI18N
        Registration.setForeground(new java.awt.Color(250, 249, 190));
        Registration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registration.setText("Registration");
        jPanel2.add(Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 8, 230, 40));

        Balbz_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo1.png"))); // NOI18N
        jPanel2.add(Balbz_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 100, 120));

        fn_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fn_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel2.add(fn_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 30, 50));

        ln_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ln_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/information.png"))); // NOI18N
        jPanel2.add(ln_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 30, 50));

        e_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        e_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/email.png"))); // NOI18N
        jPanel2.add(e_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 30, 50));

        c_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/phone-call.png"))); // NOI18N
        jPanel2.add(c_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 30, 50));

        u_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/user.png"))); // NOI18N
        jPanel2.add(u_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 30, 50));

        pass1_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass1_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass1_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 30, 50));

        pass2_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pass2_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/padlock.png"))); // NOI18N
        jPanel2.add(pass2_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 30, 50));

        r_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        r_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/role-u.png"))); // NOI18N
        jPanel2.add(r_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 30, 50));

        name_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        name_error.setForeground(new java.awt.Color(255, 51, 51));
        name_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(name_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 260, 20));

        lname_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        lname_error.setForeground(new java.awt.Color(255, 51, 51));
        lname_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(lname_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 260, 20));

        email_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        email_error.setForeground(new java.awt.Color(255, 51, 51));
        email_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(email_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 260, 20));

        contact_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        contact_error.setForeground(new java.awt.Color(255, 51, 51));
        contact_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(contact_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 260, 20));

        username_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        username_error.setForeground(new java.awt.Color(255, 51, 51));
        username_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(username_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 260, 20));

        createpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        createpass_error.setForeground(new java.awt.Color(255, 51, 51));
        createpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(createpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 260, 20));

        confirmpass_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        confirmpass_error.setForeground(new java.awt.Color(255, 51, 51));
        confirmpass_error.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(confirmpass_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 260, 20));

        role.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        role.setForeground(new java.awt.Color(153, 153, 153));
        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Staff" }));
        role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleActionPerformed(evt);
            }
        });
        jPanel2.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 100, 40));

        sign_up.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sign_up.setText("Sign Up");
        sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_upMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_upMouseExited(evt);
            }
        });
        sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_upActionPerformed(evt);
            }
        });
        jPanel2.add(sign_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, -1, -1));

        acc.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        acc.setForeground(new java.awt.Color(255, 255, 240));
        acc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc.setText("Already have an account? ");
        jPanel2.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, 190, 30));

        sign_in.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        sign_in.setForeground(new java.awt.Color(255, 255, 51));
        sign_in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sign_in.setText("Click here to Sign In");
        sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sign_inMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sign_inMouseExited(evt);
            }
        });
        jPanel2.add(sign_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 660, 190, 30));

        fnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        fnfield.setForeground(new java.awt.Color(153, 153, 153));
        fnfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "First Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        fnfield.setCaretColor(new java.awt.Color(240, 240, 240));
        fnfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        fnfield.setOpaque(false);
        fnfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnfieldFocusLost(evt);
            }
        });
        fnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnfieldActionPerformed(evt);
            }
        });
        jPanel2.add(fnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 270, 60));

        lnfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        lnfield.setForeground(new java.awt.Color(153, 153, 153));
        lnfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Last Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        lnfield.setCaretColor(new java.awt.Color(240, 240, 240));
        lnfield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        lnfield.setOpaque(false);
        lnfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lnfieldFocusLost(evt);
            }
        });
        lnfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnfieldActionPerformed(evt);
            }
        });
        jPanel2.add(lnfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 270, 60));

        efield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        efield.setForeground(new java.awt.Color(153, 153, 153));
        efield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        jPanel2.add(efield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 270, 60));

        pfield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        pfield.setForeground(new java.awt.Color(153, 153, 153));
        pfield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Phone Number", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
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
        jPanel2.add(pfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 270, 60));

        ufield.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        ufield.setForeground(new java.awt.Color(153, 153, 153));
        ufield.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        ufield.setCaretColor(new java.awt.Color(240, 240, 240));
        ufield.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        ufield.setOpaque(false);
        ufield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ufieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ufieldFocusLost(evt);
            }
        });
        ufield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ufieldActionPerformed(evt);
            }
        });
        jPanel2.add(ufield, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 270, 60));

        showPass1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        showPass1.setToolTipText("");
        showPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPass1MouseClicked(evt);
            }
        });
        jPanel2.add(showPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 20, 50));

        confirmpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        confirmpass.setForeground(new java.awt.Color(153, 153, 153));
        confirmpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        confirmpass.setEchoChar('\u0000');
        confirmpass.setOpaque(false);
        confirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpassFocusLost(evt);
            }
        });
        confirmpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpassActionPerformed(evt);
            }
        });
        jPanel2.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 270, 60));

        showPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/hide_password.png"))); // NOI18N
        showPass.setToolTipText("");
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 20, 50));

        createpass.setFont(new java.awt.Font("Franklin Gothic Medium", 2, 16)); // NOI18N
        createpass.setForeground(new java.awt.Color(153, 153, 153));
        createpass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Create Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Franklin Gothic Medium", 0, 16), new java.awt.Color(240, 240, 240))); // NOI18N
        createpass.setEchoChar('\u0000');
        createpass.setOpaque(false);
        createpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                createpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                createpassFocusLost(evt);
            }
        });
        createpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createpassActionPerformed(evt);
            }
        });
        jPanel2.add(createpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 270, 60));

        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        jPanel2.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/new.png"))); // NOI18N
        jPanel2.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_upActionPerformed
       
    }//GEN-LAST:event_sign_upActionPerformed

    private void sign_upMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseClicked
      boolean valid = true;


       connectDB con = new connectDB();
        Connection cn = con.getConnection();

        String fname = fnfield.getText().trim();
        String lname = lnfield.getText().trim();
        String email = efield.getText().trim();
        String contact = pfield.getText().trim();
        String username = ufield.getText().trim();
        String password = createpass.getText();
        String password2 = confirmpass.getText();
        String roleSelected = (role.getSelectedItem() != null) ? role.getSelectedItem().toString() : "";
        String status = "Pending";

        
          String hashedPassword = Util.hashPassword(password);
        // Input Validations
        if (fname.isEmpty()){
            setInvalidTitledBorder(fnfield, "First Name");
            displayError(name_error, "Field cannot be empty!");
            valid = false;
        }

        if (lname.isEmpty()) {
            setInvalidTitledBorder(lnfield, "Last Name");
            displayError(lname_error, "Field cannot be empty!");
            valid = false;
        }

        if (email.isEmpty()) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Field cannot be empty!");
            valid = false;
        } else if (!isEmailValid(email)) {
            setInvalidTitledBorder(efield, "Email");
            displayError(email_error, "Invalid email!");
            valid = false;
        }

        if (contact.isEmpty()) {
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, "Field cannot be empty!");
            valid = false;
        } else if (!isPhoneNumberValid(contact)) {
            setInvalidTitledBorder(pfield, "Phone Number");
            displayError(contact_error, "Invalid phone number!");
            valid = false;
        }

        if (username.isEmpty()) {
            setInvalidTitledBorder(ufield, "Username");
            displayError(username_error, "Field cannot be empty!");
            valid = false;
        }
        
        if (password.isEmpty()) {
            setInvalidTitledBorder(createpass, "Create Password");
            displayError(createpass_error, "Field cannot be empty!");
            valid = false;
        } else if (password.length() < 8) {
            setInvalidTitledBorder(createpass, "Create Password");
            displayError(createpass_error, "Password Too Short!");
            valid = false;
        }

        if (password2.isEmpty()) {
            setInvalidTitledBorder(confirmpass, "Confirm Password");
            displayError(confirmpass_error, "Field cannot be empty!");
            valid = false;
        }

        // Ensure both fields are not empty before checking for a match
        if (!password.isEmpty() && !password2.isEmpty() && !Arrays.equals(createpass.getPassword(), confirmpass.getPassword())) {
            setInvalidTitledBorder(createpass, "Create Password");
            setInvalidTitledBorder(confirmpass, "Confirm Password");
            displayError(confirmpass_error, "Passwords DO NOT Match!");
            displayError(createpass_error, "Passwords DO NOT Match!");
            valid = false;
        }

               
        
        // Check if email or username already exists
        if (con.fieldExists("username", username) || con.fieldExists("email", email)) {
            if (con.fieldExists("username", username)) {
                setInvalidTitledBorder(ufield, "Username");
                displayError(username_error, "Username Already Taken!");
                valid = false;
            }
            if (con.fieldExists("email", email)) {
                setInvalidTitledBorder(efield, "Username");
                displayError(email_error, "Email Already Exist!");
                valid = false;
            }
        } else {
            if (valid) {
                // Use PreparedStatement to prevent SQL injection
                String sql = "INSERT INTO user (u_fname, u_lname, email, contact, username, password, role, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (java.sql.PreparedStatement pstmt = con.getConnection().prepareStatement(sql)) {
                    pstmt.setString(1, fname);
                    pstmt.setString(2, lname);
                    pstmt.setString(3, email);
                    pstmt.setString(4, contact);
                    pstmt.setString(5, username);
                    pstmt.setString(6, hashedPassword);
                    pstmt.setString(7, roleSelected);
                    pstmt.setString(8, status);
                    
                int result = pstmt.executeUpdate();
                
                if (result > 0) {
                    JOptionPane.showMessageDialog(null, "Registered successfully!");
                        new LOGIN().setVisible(true);
                        this.dispose();
                  
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }
        }

    }//GEN-LAST:event_sign_upMouseClicked

     private boolean isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        String phoneRegex = "^(\\+63|0)9\\d{9}$";
        return phoneNumber.matches(phoneRegex);
    }
    
    
    private void sign_inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseClicked
        LOGIN log = new LOGIN();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sign_inMouseClicked

    private void sign_upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseEntered
        sign_up.setBackground(defaultColor);
    }//GEN-LAST:event_sign_upMouseEntered

    private void sign_upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_upMouseExited
        sign_up.setBackground(hoverColor);
    }//GEN-LAST:event_sign_upMouseExited
    
    boolean pass_visible = false;    
    boolean pass_visible1 = false;
    private void sign_inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseEntered
            sign_in.setForeground(new Color(231,231,198));

    }//GEN-LAST:event_sign_inMouseEntered

    private void sign_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_inMouseExited
            sign_in.setForeground(new Color(255,255,0));
    }//GEN-LAST:event_sign_inMouseExited

    private void roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleActionPerformed

    }//GEN-LAST:event_roleActionPerformed

    private void fnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusGained
        fnfield.setForeground(Color.WHITE);
        setTitledBorder(fnfield, "First Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_fnfieldFocusGained

    private void fnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnfieldFocusLost
        displayError(name_error, "");
        setTitledBorder(fnfield, "First Name", Color.WHITE);
        fnfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_fnfieldFocusLost

    private void fnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnfieldActionPerformed

    }//GEN-LAST:event_fnfieldActionPerformed

    private void lnfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusGained
        lnfield.setForeground(Color.WHITE);
        setTitledBorder(lnfield, "Last Name", Color.decode("#F5E196"));
    }//GEN-LAST:event_lnfieldFocusGained

    private void lnfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnfieldFocusLost
        setTitledBorder(lnfield, "Last Name", Color.WHITE);
        lnfield.setForeground(Color.WHITE);
        displayError(lname_error, "");
    }//GEN-LAST:event_lnfieldFocusLost

    private void lnfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnfieldActionPerformed

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

    private void pfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusGained
        pfield.setForeground(Color.WHITE);
        setTitledBorder(pfield, "Phone Number", Color.decode("#F5E196"));
    }//GEN-LAST:event_pfieldFocusGained

    private void pfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfieldFocusLost
        displayError(contact_error, "");
        setTitledBorder(pfield, "Phone Number", Color.WHITE);
        pfield.setForeground(Color.WHITE);
    }//GEN-LAST:event_pfieldFocusLost

    private void pfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfieldActionPerformed

    private void ufieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusGained
        ufield.setForeground(Color.WHITE);
        setTitledBorder(ufield, "Username", Color.decode("#F5E196"));
    }//GEN-LAST:event_ufieldFocusGained

    private void ufieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ufieldFocusLost
        displayError(username_error, "");
        setTitledBorder(ufield, "Username", Color.WHITE);
        ufield.setForeground(Color.WHITE);
    }//GEN-LAST:event_ufieldFocusLost

    private void ufieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ufieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ufieldActionPerformed

    private void createpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusGained
        createpass.setEchoChar('•'); // Mask password
        createpass.setForeground(Color.WHITE);
        setTitledBorder(createpass, "Create Password", Color.decode("#F5E196"));

    }//GEN-LAST:event_createpassFocusGained

    private void createpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_createpassFocusLost

        setTitledBorder(createpass, "Create Password", Color.WHITE);
        createpass.setForeground(Color.WHITE);
        displayError(createpass_error, "");
    }//GEN-LAST:event_createpassFocusLost

    private void createpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createpassActionPerformed

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        pass_visible = !pass_visible;
        String currentText = createpass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                createpass.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                createpass.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }

    }//GEN-LAST:event_showPassMouseClicked

    private void confirmpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusGained
        confirmpass.setEchoChar('•'); // Mask password
        confirmpass.setForeground(Color.WHITE);
        setTitledBorder(confirmpass, "Confirm Password", Color.decode("#F5E196"));
    }//GEN-LAST:event_confirmpassFocusGained

    private void confirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpassFocusLost
        setTitledBorder(confirmpass, "Confirm Password", Color.WHITE);
        confirmpass.setForeground(Color.WHITE);
        displayError(confirmpass_error, "");
    }//GEN-LAST:event_confirmpassFocusLost

    private void confirmpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpassActionPerformed

    private void showPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPass1MouseClicked
       pass_visible = !pass_visible;
        String currentText = confirmpass.getText().trim();

        if (pass_visible) {
            if (!currentText.equals("")) {
                confirmpass.setEchoChar((char) 0);
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/show_password.png")));
        } else {
            if (!currentText.equals("")) {
                confirmpass.setEchoChar('•');
            }
            showPass.setIcon(new ImageIcon(getClass().getResource("/PHOTOS/hide_password.png")));
        }
    }//GEN-LAST:event_showPass1MouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked

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
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRATION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRATION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel Balbz_logo;
    private javax.swing.JLabel Registration;
    private javax.swing.JLabel System_Name;
    private javax.swing.JLabel acc;
    private javax.swing.JLabel c_icon;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JLabel confirmpass_error;
    private javax.swing.JLabel contact_error;
    private javax.swing.JPasswordField createpass;
    private javax.swing.JLabel createpass_error;
    private javax.swing.JLabel e_icon;
    public javax.swing.JTextField efield;
    private javax.swing.JLabel email_error;
    private javax.swing.JLabel fn_icon;
    public javax.swing.JTextField fnfield;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ln_icon;
    private javax.swing.JLabel lname_error;
    public javax.swing.JTextField lnfield;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel name_error;
    private javax.swing.JLabel pass1_icon;
    private javax.swing.JLabel pass2_icon;
    public javax.swing.JTextField pfield;
    private javax.swing.JLabel r_icon;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JLabel showPass;
    private javax.swing.JLabel showPass1;
    private javax.swing.JLabel sign_in;
    private javax.swing.JButton sign_up;
    private javax.swing.JLabel u_icon;
    public javax.swing.JTextField ufield;
    private javax.swing.JLabel username_error;
    // End of variables declaration//GEN-END:variables
}
