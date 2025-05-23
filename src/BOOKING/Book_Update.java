
package BOOKING;

import CONFIG.BookingSession;
import CONFIG.Session;
import CONFIG.connectDB;
import MANAGEMENT.Bookings;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Book_Update extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Book_Update() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
        
        back.setBackground(new Color(96, 92,60));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       

    }

    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
     private void displayError(JLabel field, String message) {
            field.setText(message);
            field.setForeground(new Color(255, 0, 0));
            field.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));

           }
    // Helper method for date conversion
    private String convertToSQLDate(String dateStr) throws ParseException {
        // Define the input date format (dd-MM-yyyy)
        SimpleDateFormat fromFormat = new SimpleDateFormat("dd-MM-yyyy");
        // Define the output date format (yyyy-MM-dd)
        SimpleDateFormat toFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse the date string from the input format
        Date date = fromFormat.parse(dateStr);

        // Return the formatted date string in the required SQL format
        return toFormat.format(date);
    }
    
        
    private String valueOrDefault(Object value, String defaultText) {
        return (value != null && !value.toString().isEmpty()) ? value.toString() : defaultText;
    }
   
        
    

    
  
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu1 = new javax.swing.JMenu();
        jProgressBar1 = new javax.swing.JProgressBar();
        selectedDate1 = new com.raven.datechooser.SelectedDate();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        bck = new javax.swing.JLabel();
        Continue = new javax.swing.JLabel();
        back = new Swing.Button();
        submit = new Swing.Button();
        roundedPanel2 = new Swing.RoundedPanel();
        Title1 = new javax.swing.JLabel();
        roundedPanel1 = new Swing.RoundedPanel();
        Title = new javax.swing.JLabel();
        JPanel3 = new javax.swing.JPanel();
        balance = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        method = new Swing.Combobox();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        down_pay = new Swing.TextField();
        down_error = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        JPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        eventTime = new Swing.TextField();
        reception = new Swing.TextField();
        error2 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        client = new javax.swing.JTextField();
        photographer = new javax.swing.JTextField();
        rate = new javax.swing.JTextField();
        pack = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        dura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        eventDate = new Swing.TextField();
        error3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("jMenu1");

        setPreferredSize(new java.awt.Dimension(820, 650));
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(840, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bck.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        bck.setForeground(new java.awt.Color(255, 255, 255));
        bck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/bc.png"))); // NOI18N
        bck.setText("  Back");
        jPanel1.add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 50));

        Continue.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue.setText("Submit");
        jPanel1.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 60, 50));

        back.setBackground(new java.awt.Color(96, 92, 60));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 120, 50));

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
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 120, 50));

        roundedPanel2.setBackground(new java.awt.Color(167, 134, 42));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Payment Details:");
        roundedPanel2.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 50));

        jPanel1.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 300, 250, 50));

        roundedPanel1.setBackground(new java.awt.Color(167, 134, 42));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Booking Details:");
        roundedPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 250, 50));

        JPanel3.setBackground(new java.awt.Color(255, 255, 255));
        JPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balance.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel3.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 90, 30));

        change.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel3.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 220, 30));

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel5.setText("Balance:");
        JPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 70, 30));

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel6.setText("Total Amount:");
        JPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        method.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "GCash" }));
        method.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        method.setLabeText("");
        JPanel3.add(method, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 110, 40));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel8.setText("Change:");
        JPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 30));

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Payment Method:");
        JPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 130, 30));

        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Down Payment:");
        JPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 40));

        down_pay.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        down_pay.setLabelText("");
        down_pay.setLineColor(new java.awt.Color(153, 102, 0));
        down_pay.setOpaque(false);
        down_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                down_payActionPerformed(evt);
            }
        });
        JPanel3.add(down_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 240, 50));

        down_error.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        down_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel3.add(down_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 20));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        total.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        JPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 140, 30));

        jPanel1.add(JPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 650, 200));

        JPanel2.setBackground(new java.awt.Color(255, 255, 255));
        JPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Reception:");
        JPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 40));

        eventTime.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        eventTime.setLabelText("");
        eventTime.setLineColor(new java.awt.Color(153, 102, 0));
        eventTime.setOpaque(false);
        eventTime.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eventTimeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eventTimeFocusLost(evt);
            }
        });
        eventTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTimeActionPerformed(evt);
            }
        });
        JPanel2.add(eventTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 230, 50));

        reception.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        reception.setLabelText("");
        reception.setLineColor(new java.awt.Color(153, 102, 0));
        reception.setOpaque(false);
        reception.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                receptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                receptionFocusLost(evt);
            }
        });
        reception.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionActionPerformed(evt);
            }
        });
        JPanel2.add(reception, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 240, 50));

        error2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        error2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JPanel2.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 240, 20));

        error1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        error1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JPanel2.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, 20));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Event Time:");
        JPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));

        jPanel1.add(JPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 360, 160));

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel18.setText("Duration (hrs):");
        JPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel10.setText("Photographer Name:");
        JPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, 30));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel11.setText("Rate Per Hour:");
        JPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel12.setText("Package Name:");
        JPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 30));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel13.setText("Price:");
        JPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 30));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel15.setText("Client Name:");
        JPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        client.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        client.setOpaque(false);
        client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientActionPerformed(evt);
            }
        });
        JPanel1.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 240, 30));

        photographer.setEditable(false);
        photographer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        photographer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        photographer.setOpaque(false);
        photographer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photographerActionPerformed(evt);
            }
        });
        JPanel1.add(photographer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 30));

        rate.setEditable(false);
        rate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        rate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rate.setOpaque(false);
        rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rateActionPerformed(evt);
            }
        });
        JPanel1.add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 30));

        pack.setEditable(false);
        pack.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        pack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pack.setOpaque(false);
        pack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packActionPerformed(evt);
            }
        });
        JPanel1.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 210, 30));

        price.setEditable(false);
        price.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        price.setOpaque(false);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        JPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 290, 30));

        dura.setEditable(false);
        dura.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        dura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dura.setOpaque(false);
        dura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duraActionPerformed(evt);
            }
        });
        JPanel1.add(dura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 230, 30));

        jPanel1.add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 370, 210));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/calendar (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 40, 40));

        eventDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eventDate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        eventDate.setLabelText("Event Date (YYYY-MM-DD)");
        eventDate.setLineColor(new java.awt.Color(153, 102, 0));
        eventDate.setOpaque(false);
        eventDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eventDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                eventDateFocusLost(evt);
            }
        });
        eventDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventDateActionPerformed(evt);
            }
        });
        jPanel1.add(eventDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 240, -1));

        error3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        error3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 240, 20));

        bid.setEditable(false);
        bid.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        bid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bid.setOpaque(false);
        bid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bidActionPerformed(evt);
            }
        });
        jPanel1.add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 60, 30));

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Booking ID: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 30));

        error5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        error5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(error5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 230, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
           
   boolean valid = true;
String error = "Field cannot be empty!";

// === INPUT VALUES ===
String bookingId = bid.getText().trim();
String cli = client.getText().trim(); 
String photo = photographer.getText().trim(); 
String pac = pack.getText().trim(); 
String prate = rate.getText().trim();
String pri = price.getText().trim();
String duration = dura.getText().trim();
String total_amt = total.getText().trim();
String chan = change.getText().trim();
String bal = balance.getText().trim();
String ev = eventTime.getText().trim();
String re = reception.getText().trim();
String evD = eventDate.getText().trim();
String down = down_pay.getText().trim();
String methodSelected = method.getSelectedItem() != null ? method.getSelectedItem().toString() : "";

// === Variable Declarations ===
int clientId = 0, photographerId = 0, packageId = 0;
double totalVal = 0.0, downVal = 0.0, calculatedChange = 0.0, calculatedBalance = 0.0;

// === VALIDATE TOTAL AMOUNT FIRST ===
if (total_amt.isEmpty()) {
    if (error2 != null) displayError(error2, error);
    valid = false;
} else {
    try {
        totalVal = Double.parseDouble(total_amt);
        if (totalVal < 0) {
            if (error2 != null) displayError(error2, "Total amount cannot be negative.");
            valid = false;
        }
    } catch (NumberFormatException e) {
        if (error2 != null) displayError(error2, "Invalid number format for total amount.");
        valid = false;
    }
}

// === VALIDATE DOWNPAYMENT ===
if (down.isEmpty()) {
    if (down_error != null) displayError(down_error, error);
    valid = false;
} else {
    try {
        downVal = Double.parseDouble(down);
        if (downVal < 0) {
            if (down_error != null) displayError(down_error, "Downpayment cannot be negative.");
            valid = false;
        }
    } catch (NumberFormatException e) {
        if (down_error != null) displayError(down_error, "Invalid number format for downpayment.");
        valid = false;
    }
}

// === FIELD VALIDATIONS ===
String timeError = "Invalid time format. Use HH:mm (24-hour format).";
if (cli.isEmpty()) { if (error5 != null) displayError(error5, error); valid = false; }
if (pac.isEmpty()) { if (error5 != null) displayError(error5, error); valid = false; }
if (prate.isEmpty()) { if (error5 != null) displayError(error5, error); valid = false; }
if (ev.isEmpty()) {
    if (error1 != null) displayError(error1, error);
    valid = false;
} else if (!ev.matches("^([01]\\d|2[0-3]):([0-5]\\d)$")) {
    if (error1 != null) displayError(error1, timeError);
    valid = false;
}
if (re.isEmpty()) { if (error2 != null) displayError(error2, error); valid = false; }

// === RESOLVE IDs FROM TEXT FIELDS ===
connectDB con = new connectDB();
try (Connection conn = con.getConnection()) {
    // Client ID
    try (PreparedStatement ps = conn.prepareStatement("SELECT c_id FROM client WHERE c_fname = ?")) {
        ps.setString(1, cli);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            clientId = rs.getInt("c_id");
        } else {
            if (error5 != null) displayError(error5, "Client not found.");
            valid = false;
        }
    }

    // Photographer ID
    try (PreparedStatement ps = conn.prepareStatement("SELECT p_id FROM photographer WHERE p_fname = ?")) {
        ps.setString(1, photo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            photographerId = rs.getInt("p_id");
        } else {
            if (error5 != null) displayError(error5, "Photographer not found.");
            valid = false;
        }
    }

    // Package ID
    try (PreparedStatement ps = conn.prepareStatement("SELECT pp_id FROM package WHERE pp_name = ?")) {
        ps.setString(1, pac);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            packageId = rs.getInt("pp_id");
        } else {
            if (error5 != null) displayError(error5, "Package not found.");
            valid = false;
        }
    }

    // === EVENT DATE VALIDATION & PHOTOGRAPHER AVAILABILITY ===
    if (evD.isEmpty()) {
        if (error3 != null) displayError(error3, error);
        valid = false;
    } else {
        try {
            LocalDate inputDate = LocalDate.parse(evD);
            if (inputDate.isBefore(LocalDate.now())) {
                if (error3 != null) displayError(error3, "Event date cannot be in the past.");
                valid = false;
            } else {
                String checkSql = "SELECT 1 FROM booking WHERE photographer_id = ? AND event_date = ?";
                try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                    checkStmt.setInt(1, photographerId);
                    checkStmt.setDate(2, java.sql.Date.valueOf(evD));
                    ResultSet rs = checkStmt.executeQuery();
                    if (rs.next()) {
                        if (error3 != null) displayError(error3, "Photographer is already booked on this date.");
                        valid = false;
                    }
                }
            }
        } catch (DateTimeParseException ex) {
            if (error3 != null) displayError(error3, "Invalid date format. Use yyyy-MM-dd.");
            valid = false;
        }
    }

    // === CALCULATE CHANGE AND BALANCE ===
    if (valid) {
        if (downVal >= totalVal) {
            calculatedChange = downVal - totalVal;
            calculatedBalance = 0.0;
        } else {
            calculatedChange = 0.0;
            calculatedBalance = totalVal - downVal;
        }
        change.setText(String.format("%.2f", calculatedChange));
        balance.setText(String.format("%.2f", calculatedBalance));
    }

    // === FINAL UPDATE ===
    if (valid) {
        String status = balance.getText().trim().equals("0.00") ? "Confirmed" : "Pending";
        String sql = "UPDATE booking SET client_id = ?, photographer_id = ?, package_id = ?, event_time = ?, reception = ?, event_date = ?, payment_method = ?, total_amount = ?, downpayment = ?, sukli = ?, balance = ?, status = ? WHERE b_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, clientId);
            pstmt.setInt(2, photographerId);
            pstmt.setInt(3, packageId);
            pstmt.setString(4, ev);
            pstmt.setString(5, re);
            pstmt.setDate(6, java.sql.Date.valueOf(evD));
            pstmt.setString(7, methodSelected);
            pstmt.setDouble(8, totalVal);
            pstmt.setDouble(9, downVal);
            pstmt.setDouble(10, calculatedChange);
            pstmt.setDouble(11, calculatedBalance);
            pstmt.setString(12, status);
            pstmt.setInt(13, Integer.parseInt(bookingId));

            int result = pstmt.executeUpdate();
            if (result > 0) {
                Session sess = Session.getInstance();
                String action = "Edited booking with ID " + bookingId;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                JOptionPane.showMessageDialog(null, "Booking with ID " + bookingId + " edited successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Editing failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    e.printStackTrace();
}




    }//GEN-LAST:event_submitMouseClicked

    
    // === Utility Method ===
private boolean isNullOrEmpty(String str) {
    return str == null || str.trim().isEmpty();
}

    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        submit.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
        submit.setBackground(new Color(153,102,0));
    }//GEN-LAST:event_submitMouseExited

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       Bookings bk = new Bookings();
       
       JDesktopPane jd = getDesktopPane();
       jd.add(bk);
       bk.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setBackground(new Color(96, 92, 60));

    }//GEN-LAST:event_backMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
       
    }//GEN-LAST:event_jLabel9MouseClicked
   
    private BookingSession BookingSession;
   
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
   
  
    }//GEN-LAST:event_formInternalFrameActivated

    private void eventTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventTimeActionPerformed

    private void receptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receptionActionPerformed

    private void down_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_down_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_down_payActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void eventTimeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventTimeFocusGained
         eventTime.setLineColor(new Color(153,102,0));
    }//GEN-LAST:event_eventTimeFocusGained

    private void eventTimeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventTimeFocusLost
         displayError(error1, "");
         eventTime.setForeground(Color.black);
    }//GEN-LAST:event_eventTimeFocusLost

    private void receptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_receptionFocusGained
         reception.setLineColor(new Color(153,102,0));
    }//GEN-LAST:event_receptionFocusGained

    private void receptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_receptionFocusLost
         displayError(error2, "");
         eventTime.setForeground(Color.black);
    }//GEN-LAST:event_receptionFocusLost

    private void eventDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventDateActionPerformed

    private void eventDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventDateFocusLost
        displayError(error3, "");
        eventDate.setForeground(Color.black);
    }//GEN-LAST:event_eventDateFocusLost

    private void eventDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eventDateFocusGained
        eventDate.setLineColor(new Color(153,102,0));
    }//GEN-LAST:event_eventDateFocusGained

    private void clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clientActionPerformed

    private void photographerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photographerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_photographerActionPerformed

    private void rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rateActionPerformed

    private void packActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void duraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duraActionPerformed

    private void bidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bidActionPerformed

             
      

    
    
           


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JPanel JPanel3;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private Swing.Button back;
    public javax.swing.JLabel balance;
    private javax.swing.JLabel bck;
    public javax.swing.JTextField bid;
    public javax.swing.JLabel change;
    public javax.swing.JTextField client;
    private com.raven.datechooser.DateChooser dateChooser1;
    public javax.swing.JLabel down_error;
    public Swing.TextField down_pay;
    public javax.swing.JTextField dura;
    public javax.swing.JLabel error1;
    public javax.swing.JLabel error2;
    public javax.swing.JLabel error3;
    public javax.swing.JLabel error5;
    public Swing.TextField eventDate;
    public Swing.TextField eventTime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public Swing.Combobox method;
    public javax.swing.JTextField pack;
    public javax.swing.JTextField photographer;
    public javax.swing.JTextField price;
    public javax.swing.JTextField rate;
    public Swing.TextField reception;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.RoundedPanel roundedPanel2;
    private com.raven.datechooser.SelectedDate selectedDate1;
    private Swing.Button submit;
    public javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    
}
