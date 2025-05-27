
package MANAGEMENT;

import BOOKING.Book_Update;
import BOOKING.Client;
import BOOKING.Receipt;
import BOOKING.Review;
import CONFIG.Session;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Bookings extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Bookings() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 1));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
            booking_tbl.getTableHeader().setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
            booking_tbl.getTableHeader().setOpaque(false);
            booking_tbl.getTableHeader().setBorder(null);
            booking_tbl.getTableHeader().setForeground(new Color(0,0,0));
            booking_tbl.getTableHeader().setBackground(new Color(102,102,102));

            booking_tbl.setBackground(Color.WHITE); // Set table background to white
            booking_tbl.setForeground(Color.BLACK); // Set text color to black

            booking_tbl.setRowHeight(25);
            booking_tbl.setSelectionForeground(Color.WHITE);
            booking_tbl.setSelectionBackground(new Color(167, 134, 42)); // Selection background color

            // Set column widths
            booking_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
            booking_tbl.getColumnModel().getColumn(1).setPreferredWidth(200); // Client Name
            booking_tbl.getColumnModel().getColumn(2).setPreferredWidth(200); // Photographer
            booking_tbl.getColumnModel().getColumn(3).setPreferredWidth(200); // Package
            booking_tbl.getColumnModel().getColumn(4).setPreferredWidth(150); // Event Date
            booking_tbl.getColumnModel().getColumn(5).setPreferredWidth(200); // Total Amount
            booking_tbl.getColumnModel().getColumn(6).setPreferredWidth(220); // Payment Method
            booking_tbl.getColumnModel().getColumn(7).setPreferredWidth(180); // Status

           

    }

    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
   public void displayData(){
    try {
        ResultSet rs = con.getData(
            "SELECT b.b_id, CONCAT(c.c_fname, ' ', c.c_lname) AS client_name, " +
            "ph.p_fname AS photographer_name, " +
            "p.pp_name AS package_name, " +
            "b.event_date, b.total_amount, b.balance, b.status " +
            "FROM booking b " +
            "JOIN client c ON b.client_id = c.c_id " +
            "JOIN photographer ph ON b.photographer_id = ph.p_id " +
            "JOIN `package` p ON b.package_id = p.pp_id;" // <-- Backticks added here
        );

        DefaultTableModel model = (DefaultTableModel) booking_tbl.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            model.addRow(new String[]{
                rs.getString("b_id"),
                rs.getString("client_name"),
                rs.getString("photographer_name"),
                rs.getString("package_name"),
                rs.getString("event_date"),
                rs.getString("total_amount"),
                rs.getString("balance"),
                rs.getString("status")
            });
        }

    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}

        
    public int getSelectedPackageId() {
        int selectedRow = booking_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(booking_tbl.getValueAt(selectedRow, 0).toString()); // Get package_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenu1 = new javax.swing.JMenu();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        search_icon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Continue3 = new javax.swing.JLabel();
        cancel = new Swing.Button();
        search_bar = new javax.swing.JTextField();
        Continue2 = new javax.swing.JLabel();
        view = new Swing.Button();
        ScrollPane = new javax.swing.JScrollPane();
        booking_tbl = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        Continue1 = new javax.swing.JLabel();
        approve = new Swing.Button();
        Continue = new javax.swing.JLabel();
        print = new Swing.Button();
        approved = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        income = new javax.swing.JLabel();

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

        search_icon.setBackground(new java.awt.Color(0, 0, 0));
        search_icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_icon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/search.png"))); // NOI18N
        search_icon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 30, 30));

        Continue3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue3.setForeground(new java.awt.Color(255, 255, 255));
        Continue3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/cancel (1).png"))); // NOI18N
        Continue3.setText(" Cancel");
        jPanel1.add(Continue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 80, 50));

        cancel.setBackground(new java.awt.Color(96, 92, 60));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 130, 50));

        search_bar.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 13)); // NOI18N
        search_bar.setForeground(new java.awt.Color(153, 153, 153));
        search_bar.setText(" Search...");
        search_bar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(167, 134, 42)));
        search_bar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_barFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_barFocusLost(evt);
            }
        });
        search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_barActionPerformed(evt);
            }
        });
        search_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_barKeyReleased(evt);
            }
        });
        jPanel1.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 210, 30));

        Continue2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue2.setForeground(new java.awt.Color(255, 255, 255));
        Continue2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/mata.png"))); // NOI18N
        Continue2.setText(" View");
        jPanel1.add(Continue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 80, 50));

        view.setBackground(new java.awt.Color(96, 92, 60));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 130, 50));

        ScrollPane.setBackground(new java.awt.Color(51, 255, 204));

        booking_tbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        booking_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Client Name", "Photographer", "Package", "Event Date", "Total Amount", "Balance", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booking_tbl.setGridColor(new java.awt.Color(102, 102, 102));
        booking_tbl.setOpaque(false);
        ScrollPane.setViewportView(booking_tbl);

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 780, 430));

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Bookings");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 80));

        add.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/add.png"))); // NOI18N
        add.setText(" Add Booking");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 140, 30));

        update.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/editing.png"))); // NOI18N
        update.setText(" Update Booking");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, 140, 30));

        delete.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/trash.png"))); // NOI18N
        delete.setText(" Delete Booking");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, 140, 30));

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        refresh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/refresh.png"))); // NOI18N
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 80, 30));

        Continue1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue1.setForeground(new java.awt.Color(255, 255, 255));
        Continue1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/approve.png"))); // NOI18N
        Continue1.setText(" Approve");
        jPanel1.add(Continue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 90, 50));

        approve.setBackground(new java.awt.Color(96, 92, 60));
        approve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approveMouseExited(evt);
            }
        });
        jPanel1.add(approve, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 130, 50));

        Continue.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/printing.png"))); // NOI18N
        Continue.setText(" Print");
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
        });
        jPanel1.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 90, 50));

        print.setBackground(new java.awt.Color(96, 92, 60));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, 130, 50));

        approved.setBackground(new java.awt.Color(255, 251, 240));
        approved.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        approved.setForeground(new java.awt.Color(255, 251, 240));
        approved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approved.setText("Approved");
        jPanel1.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 110, -1));

        number.setBackground(new java.awt.Color(0, 0, 0));
        number.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                numberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                numberMouseExited(evt);
            }
        });
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 90, 40));

        income.setBackground(new java.awt.Color(0, 0, 0));
        income.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        income.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        income.setText("Total Income:");
        income.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                incomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                incomeMouseExited(evt);
            }
        });
        jPanel1.add(income, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
        if(search_bar.getText().equals(" Search...")){
            search_bar.setText("");
            search_bar.setForeground(Color.BLACK);
            search_bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
    }//GEN-LAST:event_search_barFocusGained

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost
         if(search_bar.getText().isEmpty()){
            search_bar.setText(" Search...");
            search_bar.setForeground(Color.GRAY);
            search_bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        resetBorder(search_bar);
    }//GEN-LAST:event_search_barFocusLost

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
       DefaultTableModel model = (DefaultTableModel)booking_tbl.getModel();
       TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) booking_tbl.getModel());
       booking_tbl.setRowSorter(sorter);
       sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));

    }//GEN-LAST:event_search_barKeyReleased

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
     Client ad = new Client();

     // Get the desktop pane (make sure this is a JDesktopPane)
     JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

     desktopPane.add(ad);
     ad.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_addMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
         int row = booking_tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
                return;
            }

              // Retrieve the selected user's ID from the table
            String id = booking_tbl.getValueAt(row, 0).toString();
            int seledtedbookingId;
            
             try {
                seledtedbookingId = Integer.parseInt(id); // Ensure correct integer conversion
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid booking ID format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this booking?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

              
            // Database connection
            connectDB db = new connectDB();
            try (Connection conn = db.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM booking WHERE b_id = ?")) {

                stmt.setInt(1, seledtedbookingId);
                int affectedRows = stmt.executeUpdate();

                
                
                if (affectedRows > 0) {
                    displayData(); // Refresh table data after deletion
                    
                     // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Deleted booking with ID " + seledtedbookingId;
                    con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    
                    JOptionPane.showMessageDialog(this, "Booking deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete booking.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }





    }//GEN-LAST:event_deleteMouseClicked
        
       public int getSelectedBookingId() {
        int selectedRow = booking_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(booking_tbl.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

    
    
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       int rowIndex = booking_tbl.getSelectedRow();

            if (rowIndex < 0) {
                JOptionPane.showMessageDialog(null, "Please select a row!");
            } else {
                try {
                    connectDB dbc = new connectDB();
                    TableModel tbl = booking_tbl.getModel();
                    Object selectedId = tbl.getValueAt(rowIndex, 0); // booking ID

                    String query = "SELECT " +
                        "client.c_id, CONCAT(client.c_fname, ' ', client.c_lname) AS client_name, " +
                        "photographer.p_id, CONCAT(photographer.p_fname, ' ', photographer.p_lname) AS photographer_name, photographer.p_rate, " +
                        "package.pp_id, package.pp_name, package.pp_price, package.pp_duration, " +
                        "b_id, booking.event_date, booking.event_time, booking.reception, " +
                        "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance " +
                        "FROM booking " +
                        "JOIN client ON booking.client_id = client.c_id " +
                        "JOIN photographer ON booking.photographer_id = photographer.p_id " +
                        "JOIN package ON booking.package_id = package.pp_id " +
                        "WHERE booking.b_id = ?";

                    PreparedStatement ps = dbc.getConnection().prepareStatement(query);
                    ps.setObject(1, selectedId);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        Book_Update up = new Book_Update();
                        JDesktopPane desktopPane = getDesktopPane();
                        desktopPane.add(up);
                        up.setVisible(true);

                        up.bid.setText(rs.getString("b_id"));
                        up.client.setText(rs.getString("client_name"));
                        up.photographer.setText(rs.getString("photographer_name"));
                        up.pack.setText(rs.getString("pp_name"));
                        up.rate.setText(rs.getString("p_rate"));
                        up.price.setText(rs.getString("pp_price"));
                        up.dura.setText(rs.getString("pp_duration"));
                        up.eventTime.setText(rs.getString("event_time"));
                        up.reception.setText(rs.getString("reception"));
                        up.eventDate.setText(rs.getString("event_date"));
                        up.total.setText(rs.getString("total_amount"));
                        up.method.setSelectedItem(rs.getString("payment_method"));
                        up.down_pay.setText(rs.getString("downpayment"));
                        up.change.setText(rs.getString("sukli"));
                        up.balance.setText(rs.getString("balance"));
                    }

                    rs.close();
                    ps.close();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                }
            }



    }//GEN-LAST:event_updateMouseClicked

           

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
       displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(Color.black);
    }//GEN-LAST:event_addMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setForeground(Color.black);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setForeground(Color.black);
    }//GEN-LAST:event_deleteMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        int rowIndex = booking_tbl.getSelectedRow(); 

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
            try {
                connectDB dbc = new connectDB();
                TableModel tbl = booking_tbl.getModel();
                Object selectedId = tbl.getValueAt(rowIndex, 0); // booking ID

                // Step 1: Check the booking status
                String statusQuery = "SELECT status FROM booking WHERE b_id = ?";
                PreparedStatement statusPs = dbc.getConnection().prepareStatement(statusQuery);
                statusPs.setObject(1, selectedId);
                ResultSet statusRs = statusPs.executeQuery();

                if (statusRs.next()) {
                    String status = statusRs.getString("status");

                    if (status.equalsIgnoreCase("Pending") || status.equalsIgnoreCase("Cancelled")) {
                        JOptionPane.showMessageDialog(null, "You cannot print bookings with status 'Pending' or 'Cancelled'.");
                        return; // stop execution
                    }
                }

                statusRs.close();
                statusPs.close();

                // Step 2: Continue with print logic if status is allowed
                    String query = "SELECT " +
               "client.c_id, CONCAT(client.c_fname, ' ', client.c_lname) AS client_name, " +
               "photographer.p_id, CONCAT(photographer.p_fname, ' ', photographer.p_lname) AS photographer_name, photographer.p_rate, " +
               "package.pp_id, package.pp_name, package.pp_price, package.pp_duration, " +
               "booking.event_date, booking.event_time, booking.reception, " +
               "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance, booking.created_at, " +
               "user.u_id AS users_id, CONCAT(user.u_fname, ' ', user.u_lname) AS created_by_name, " + // added this line
               "booking.status " + // fixed: previously missing comma
               "FROM booking " +
               "JOIN client ON booking.client_id = client.c_id " +
               "JOIN photographer ON booking.photographer_id = photographer.p_id " +
               "JOIN package ON booking.package_id = package.pp_id " +
               "JOIN user ON booking.users_id = user.u_id " + // join the user table
               "WHERE booking.b_id = ?";


                PreparedStatement ps = dbc.getConnection().prepareStatement(query);
                ps.setObject(1, selectedId);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                   JDialog dialog = new JDialog();
                    Receipt up = new Receipt();

                    up.user.setText(rs.getString("users_id"));
                    up.client.setText(rs.getString("client_name"));
                    up.photographer.setText(rs.getString("photographer_name"));
                    up.rate.setText(rs.getString("p_rate"));
                    up.pack.setText(rs.getString("pp_name"));
                    up.price.setText(rs.getString("pp_price"));
                    up.dura.setText(rs.getString("pp_duration"));
                    up.eTime.setText(rs.getString("event_time"));
                    up.reception.setText(rs.getString("reception"));
                    up.eDate.setText(rs.getString("event_date"));
                    up.method.setText(rs.getString("payment_method"));                       
                    up.amount.setText(rs.getString("total_amount"));                      
                    up.down_pay.setText(rs.getString("downpayment"));
                    up.bal.setText(rs.getString("balance"));
                    up.created.setText(rs.getString("created_at"));
                    up.user.setText(rs.getString("created_by_name"));
                                        
                    dialog.setSize(701, 631);
                    dialog.add(up);
                    dialog.pack();
                    dialog.setLocationRelativeTo(null);
                    dialog.setModal(true);
                    dialog.setVisible(true);
                }

                rs.close();
                ps.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }

    
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(new Color(96, 92, 60));
    }//GEN-LAST:event_printMouseExited

    private void approveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseClicked
     int selectedBookingId = getSelectedBookingId(); // Get the selected booking ID

        if (selectedBookingId != -1) {
            try {
                connectDB db = new connectDB(); // Create DB connection
                Connection conn = db.getConnection();

                // First, check if the current status is "Cancelled"
                String statusQuery = "SELECT status FROM booking WHERE b_id = ?";
                PreparedStatement statusStmt = conn.prepareStatement(statusQuery);
                statusStmt.setInt(1, selectedBookingId);
                ResultSet rs = statusStmt.executeQuery();

                if (rs.next()) {
                    String currentStatus = rs.getString("status");
                    if ("Cancelled".equalsIgnoreCase(currentStatus)) {
                        JOptionPane.showMessageDialog(this, "You cannot approve a booking that is already cancelled!");
                        rs.close();
                        statusStmt.close();
                        conn.close();
                        return;
                    }
                }

                rs.close();
                statusStmt.close();

                // Proceed to approve the booking
                String updateQuery = "UPDATE booking SET status = 'Approved' WHERE b_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(updateQuery);
                pstmt.setInt(1, selectedBookingId);

                int affectedRows = pstmt.executeUpdate();

                if (affectedRows > 0) {
                    displayData(); // Refresh table

                    // Log the action
                    Session sess = Session.getInstance();
                    String action = "Approved booking ID " + selectedBookingId;
                    con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" +
                        sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                    JOptionPane.showMessageDialog(this, "Booking approved successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to approve booking.");
                }

                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a booking to approve.");
        }

    }//GEN-LAST:event_approveMouseClicked

    private void approveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseEntered
              approve.setForeground(new Color(204,204,204));

    }//GEN-LAST:event_approveMouseEntered

    private void approveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveMouseExited
          approve.setForeground(Color.black);
    }//GEN-LAST:event_approveMouseExited

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
    int rowIndex = booking_tbl.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select a row!");
} else {
    try {
        connectDB dbc = new connectDB();
        TableModel tbl = booking_tbl.getModel();
        Object selectedId = tbl.getValueAt(rowIndex, 0); // booking ID

        String query = "SELECT " +
            "client.c_id, CONCAT(client.c_fname, ' ', client.c_lname) AS client_name, " +
            "photographer.p_id, CONCAT(photographer.p_fname, ' ', photographer.p_lname) AS photographer_name, photographer.p_rate, " +
            "package.pp_id, package.pp_name, package.pp_price, package.pp_duration, " +
            "booking.event_date, booking.event_time, booking.reception, " +
            "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance, booking.created_at, " +
            "user.u_id AS users_id, CONCAT(user.u_fname, ' ', user.u_lname) AS created_by_name, " + // added this line
            "booking.status " + // fixed: previously missing comma
            "FROM booking " +
            "JOIN client ON booking.client_id = client.c_id " +
            "JOIN photographer ON booking.photographer_id = photographer.p_id " +
            "JOIN package ON booking.package_id = package.pp_id " +
            "JOIN user ON booking.users_id = user.u_id " + // join the user table
            "WHERE booking.b_id = ?";

        PreparedStatement ps = dbc.getConnection().prepareStatement(query);
        ps.setObject(1, selectedId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String status = rs.getString("status");

            if ("Cancelled".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(null, "Cannot print. This booking is cancelled.");
            } else {
                Review up = new Review();
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(up);
                up.setVisible(true);

                up.client.setText(rs.getString("client_name"));
                up.photographer.setText(rs.getString("photographer_name"));
                up.rate.setText(rs.getString("p_rate"));
                up.pack.setText(rs.getString("pp_name"));
                up.price.setText(rs.getString("pp_price"));
                up.dura.setText(rs.getString("pp_duration"));
                up.eTime.setText(rs.getString("event_time"));
                up.reception.setText(rs.getString("reception"));
                up.eDate.setText(rs.getString("event_date"));
                up.method.setText(rs.getString("payment_method"));                       
                up.amount.setText(rs.getString("total_amount"));                      
                up.down_pay.setText(rs.getString("downpayment"));
                up.bal.setText(rs.getString("balance"));
                up.created.setText(rs.getString("created_at"));
                up.user.setText(rs.getString("created_by_name")); // ← Set the user's name here
            }
        }

        rs.close();
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}







    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
                view.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
             view.setForeground(Color.black);
    }//GEN-LAST:event_viewMouseExited

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
         int rowIndex = booking_tbl.getSelectedRow();

if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select a row!");
} else {
    try {
        connectDB db = new connectDB();
        Connection conn = db.getConnection();
        TableModel tbl = booking_tbl.getModel();
        int selectedBookingId = (int) tbl.getValueAt(rowIndex, 0); // Booking ID

        // Step 1: Update booking status to "Cancelled"
        String updateQuery = "UPDATE booking SET status = 'Cancelled' WHERE b_id = ?";
        PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
        updateStmt.setInt(1, selectedBookingId);
        int affectedRows = updateStmt.executeUpdate();
        updateStmt.close();

        // Step 2: Fetch updated booking info
        String query = "SELECT " +
            "client.c_id, CONCAT(client.c_fname, ' ', client.c_lname) AS client_name, " +
            "photographer.p_id, CONCAT(photographer.p_fname, ' ', photographer.p_lname) AS photographer_name, photographer.p_rate, " +
            "package.pp_id, package.pp_name, package.pp_price, package.pp_duration, " +
            "booking.event_date, booking.event_time, booking.reception, " +
            "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance, booking.created_at, booking.user_id, " +
            "booking.status " + // include booking status
            "FROM booking " +
            "JOIN client ON booking.client_id = client.c_id " +
            "JOIN photographer ON booking.photographer_id = photographer.p_id " +
            "JOIN package ON booking.package_id = package.pp_id " +
            "WHERE booking.b_id = ?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, selectedBookingId);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            String status = rs.getString("status");

            if ("Cancelled".equalsIgnoreCase(status)) {
                JOptionPane.showMessageDialog(null, "Cannot print. This booking is cancelled.");
            } else {
                Review up = new Review();
                JDesktopPane desktopPane = getDesktopPane();
                desktopPane.add(up);
                up.setVisible(true);

                up.user.setText(rs.getString("user_id"));              
                up.client.setText(rs.getString("client_name"));
                up.photographer.setText(rs.getString("photographer_name"));
                up.rate.setText(rs.getString("p_rate"));
                up.pack.setText(rs.getString("pp_name"));
                up.price.setText(rs.getString("pp_price"));
                up.dura.setText(rs.getString("pp_duration"));
                up.eTime.setText(rs.getString("event_time"));
                up.reception.setText(rs.getString("reception"));
                up.eDate.setText(rs.getString("event_date"));
                up.method.setText(rs.getString("payment_method"));                       
                up.amount.setText(rs.getString("total_amount"));                      
                up.down_pay.setText(rs.getString("downpayment"));
                up.bal.setText(rs.getString("balance"));
                up.created.setText(rs.getString("created_at"));
            }
        }

        rs.close();
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setForeground(new Color(204,204,204));    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
         cancel.setForeground(Color.black);

    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ContinueMouseClicked

    private void numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numberMouseClicked

    private void numberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_numberMouseEntered

    private void numberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_numberMouseExited

    private void incomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeMouseClicked

    private void incomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeMouseEntered

    private void incomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incomeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeMouseExited

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
            
        String qry = "SELECT SUM(downpayment) AS total_income FROM booking";

        connectDB con = new connectDB();
        try (Connection conn = con.getConnection();
             PreparedStatement ps = conn.prepareStatement(qry);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                double totalIncome = rs.getDouble("total_income");

                // Example: set to a JLabel or JTextField
                number.setFont(new Font("Arial", Font.PLAIN, 15));
                number.setText(String.format("₱%.2f", totalIncome));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error retrieving income: " + e.getMessage());
            e.printStackTrace();
        }        
    }//GEN-LAST:event_formInternalFrameActivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JLabel Continue1;
    private javax.swing.JLabel Continue2;
    private javax.swing.JLabel Continue3;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel add;
    private Swing.Button approve;
    private javax.swing.JLabel approved;
    private javax.swing.JTable booking_tbl;
    private Swing.Button cancel;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel income;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel number;
    private Swing.Button print;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    private javax.swing.JLabel update;
    private Swing.Button view;
    // End of variables declaration//GEN-END:variables

    
}
