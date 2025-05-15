
package BOOKING;

import CONFIG.BookingSession;
import CONFIG.connectDB;
import CONFIG.panelPrinter;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class Print extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Print() {
        initComponents();
        setBackground(new Color(0, 0, 0, 1));
        
        
        
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
        receipt = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        eDate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        reception = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        eTime = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        down_pay = new javax.swing.JLabel();
        method = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        created = new javax.swing.JLabel();
        roundedPanel6 = new Swing.RoundedPanel();
        Title5 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        roundedPanel5 = new Swing.RoundedPanel();
        Title4 = new javax.swing.JLabel();
        roundedPanel2 = new Swing.RoundedPanel();
        Title1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        client = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        photographer = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rate = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dura = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        roundedPanel4 = new Swing.RoundedPanel();
        Title3 = new javax.swing.JLabel();
        roundedPanel3 = new Swing.RoundedPanel();
        Title2 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Balbz_logo = new javax.swing.JLabel();
        pack = new javax.swing.JLabel();
        Continue2 = new javax.swing.JLabel();
        cont1 = new Swing.Button();

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

        receipt.setBackground(new java.awt.Color(255, 255, 255));
        receipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel21.setText("Event Date:");

        eDate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel17.setText("Reception:");

        reception.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel16.setText("Event Time:");

        eTime.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel22.setText("Balance:");

        bal.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel23.setText("Payment Method: ");

        jLabel24.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel24.setText("Down Payment: ");

        down_pay.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        method.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel20.setText("Date Created:");

        created.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        roundedPanel6.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel6.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title5.setText("Payment Information:");
        roundedPanel6.add(Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 190, 30));

        amount.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel19.setText("Total Amount:");

        roundedPanel5.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel5.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title4.setText("Booking Information:");
        roundedPanel5.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, 30));

        roundedPanel2.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("Client Information:");
        roundedPanel2.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 160, 30));

        jLabel15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel15.setText("Client Name:");

        client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel10.setText("Photographer Name:");

        photographer.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel11.setText("Rate Per Hour:");

        rate.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel12.setText("Package Name:");

        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel13.setText("Price:");

        jLabel18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jLabel18.setText("Duration (hrs):");

        dura.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        price.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        roundedPanel4.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel4.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title3.setText("Package Information:");
        roundedPanel4.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        roundedPanel3.setBackground(new java.awt.Color(51, 51, 0));
        roundedPanel3.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title2.setText("Photographer Information:");
        roundedPanel3.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 220, 30));

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(51, 51, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Event Photography Booking Receipt");

        Balbz_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo1.png"))); // NOI18N

        pack.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N

        javax.swing.GroupLayout receiptLayout = new javax.swing.GroupLayout(receipt);
        receipt.setLayout(receiptLayout);
        receiptLayout.setHorizontalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptLayout.createSequentialGroup()
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(created, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Balbz_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(roundedPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(method, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(down_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(receiptLayout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(eTime, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(receiptLayout.createSequentialGroup()
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(reception, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(receiptLayout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(eDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(99, 99, 99)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roundedPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(roundedPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(photographer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(receiptLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dura, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(receiptLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(141, 141, 141))
        );
        receiptLayout.setVerticalGroup(
            receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptLayout.createSequentialGroup()
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balbz_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(created, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reception, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(roundedPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(method, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(down_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(receiptLayout.createSequentialGroup()
                        .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photographer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(receiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
        );

        jPanel1.add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 750, 560));

        Continue2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue2.setForeground(new java.awt.Color(255, 255, 255));
        Continue2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/printing.png"))); // NOI18N
        Continue2.setText(" Print");
        jPanel1.add(Continue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 70, 50));

        cont1.setBackground(new java.awt.Color(96, 92, 60));
        cont1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cont1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cont1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cont1MouseExited(evt);
            }
        });
        jPanel1.add(cont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private BookingSession BookingSession;
   
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
     
  
    }//GEN-LAST:event_formInternalFrameActivated

    private void cont1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseExited
        cont1.setBackground(new Color(96, 92, 60));
    }//GEN-LAST:event_cont1MouseExited

    private void cont1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseEntered
        cont1.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_cont1MouseEntered

    private void cont1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseClicked
        JPanel  newpanel = new JPanel();
        panelPrinter panelprint = new panelPrinter(receipt);
        panelprint.printPanel();
    }//GEN-LAST:event_cont1MouseClicked

             
      

    
    
           


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Balbz_logo;
    private javax.swing.JLabel Continue2;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    public javax.swing.JLabel amount;
    public javax.swing.JLabel bal;
    public javax.swing.JLabel client;
    public Swing.Button cont1;
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
    public javax.swing.JPanel receipt;
    public javax.swing.JLabel reception;
    private Swing.RoundedPanel roundedPanel2;
    private Swing.RoundedPanel roundedPanel3;
    private Swing.RoundedPanel roundedPanel4;
    private Swing.RoundedPanel roundedPanel5;
    private Swing.RoundedPanel roundedPanel6;
    private com.raven.datechooser.SelectedDate selectedDate1;
    // End of variables declaration//GEN-END:variables

    
}
