
package BOOKING;

import CONFIG.BookingSession;
import CONFIG.connectDB;
import MANAGEMENT.Bookings;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Review extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Review() {
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
        JPanel1 = new javax.swing.JPanel();
        JPanel4 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        roundedPanel1 = new Swing.RoundedPanel();
        Title = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        eDate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        reception = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        eTime = new javax.swing.JLabel();
        client = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        photographer = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rate = new javax.swing.JLabel();
        pack = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        down_pay = new javax.swing.JLabel();
        method = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        created = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        dura = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        roundedPanel5 = new Swing.RoundedPanel();
        Title4 = new javax.swing.JLabel();
        roundedPanel4 = new Swing.RoundedPanel();
        Title3 = new javax.swing.JLabel();
        roundedPanel3 = new Swing.RoundedPanel();
        Title2 = new javax.swing.JLabel();
        roundedPanel2 = new Swing.RoundedPanel();
        Title1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

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

        JPanel1.setBackground(new java.awt.Color(255, 255, 255));
        JPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel4.setBackground(new java.awt.Color(255, 255, 255));
        JPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 160, 30));

        jLabel25.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel25.setText("Created by: ");
        JPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, 30));

        roundedPanel1.setBackground(new java.awt.Color(167, 134, 42));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Booking Detail Reviews:");
        roundedPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 240, 50));

        JPanel4.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 280, 50));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel21.setText("Event Date:");
        JPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 90, 30));

        eDate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(eDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 160, 30));

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel17.setText("Reception:");
        JPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 80, 30));

        reception.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(reception, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 170, 30));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel15.setText("Client Name:");
        JPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 30));

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel16.setText("Event Time:");
        JPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 90, 30));

        eTime.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(eTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 160, 30));

        client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(client, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 230, 30));

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel22.setText("Balance:");
        JPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 70, 30));

        bal.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 180, 30));

        photographer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(photographer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 180, 30));

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel10.setText("Photographer Name:");
        JPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 150, 30));

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel11.setText("Rate Per Hour:");
        JPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        rate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 220, 30));

        pack.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(pack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 210, 30));

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel23.setText("Payment Method: ");
        JPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 130, 30));

        jLabel24.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel24.setText("Down Payment: ");
        JPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 120, 30));

        down_pay.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(down_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 130, 30));

        method.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(method, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 120, 30));

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel12.setText("Package Name:");
        JPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, 30));

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel13.setText("Price:");
        JPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 30));

        price.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 280, 30));

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel20.setText("Date Created:");
        JPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 110, 30));

        created.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(created, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 140, 30));

        amount.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 140, 30));

        dura.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        JPanel4.add(dura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 220, 30));

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel19.setText("Total Amount:");
        JPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 110, 30));

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel18.setText("Duration (hrs):");
        JPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, 30));

        roundedPanel5.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title4.setText("Booking Information:");
        roundedPanel5.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 30));

        JPanel4.add(roundedPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 300, 30));

        roundedPanel4.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title3.setText("Package Information:");
        roundedPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 30));

        JPanel4.add(roundedPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 310, 250, 30));

        roundedPanel3.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("Photographer Information:");
        roundedPanel3.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 220, 30));

        JPanel4.add(roundedPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 280, 30));

        roundedPanel2.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Client Information:");
        roundedPanel2.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 30));

        JPanel4.add(roundedPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 220, 30));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/back-button_black.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        JPanel4.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 60));

        JPanel1.add(JPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 740, 570));

        jPanel1.add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 780, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private BookingSession BookingSession;
   
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
     
  
    }//GEN-LAST:event_formInternalFrameActivated

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Bookings pack = new Bookings();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(pack);
        pack.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_backMouseClicked

             
      

    
    
           


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel4;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    public javax.swing.JLabel amount;
    private javax.swing.JLabel back;
    public javax.swing.JLabel bal;
    private javax.swing.JLabel bck;
    public javax.swing.JLabel client;
    public javax.swing.JLabel created;
    private com.raven.datechooser.DateChooser dateChooser1;
    public javax.swing.JLabel down_pay;
    public javax.swing.JLabel dura;
    public javax.swing.JLabel eDate;
    public javax.swing.JLabel eTime;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel method;
    public javax.swing.JLabel pack;
    public javax.swing.JLabel photographer;
    public javax.swing.JLabel price;
    public javax.swing.JLabel rate;
    public javax.swing.JLabel reception;
    private Swing.RoundedPanel roundedPanel1;
    private Swing.RoundedPanel roundedPanel2;
    private Swing.RoundedPanel roundedPanel3;
    private Swing.RoundedPanel roundedPanel4;
    private Swing.RoundedPanel roundedPanel5;
    private com.raven.datechooser.SelectedDate selectedDate1;
    public javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    
}
