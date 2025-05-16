
package MANAGEMENT;

import BOOKING.Book_Update;
import BOOKING.Client;
import BOOKING.Print;
import BOOKING.Receipt;
import BOOKING.Review;
import CONFIG.BookingSession;
import CONFIG.Session;
import CONFIG.connectDB;
import CRUD.Edit_Client;
import CRUD.Edit_Package;
import CRUD.Edit_Photographer;
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
        cont3 = new Swing.Button();
        search_bar = new javax.swing.JTextField();
        Continue2 = new javax.swing.JLabel();
        cont2 = new Swing.Button();
        ScrollPane = new javax.swing.JScrollPane();
        booking_tbl = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        a_photo = new javax.swing.JLabel();
        e_photo = new javax.swing.JLabel();
        d_photo = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        Continue1 = new javax.swing.JLabel();
        cont1 = new Swing.Button();
        Continue = new javax.swing.JLabel();
        cont = new Swing.Button();
        approved = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("jMenu1");

        setPreferredSize(new java.awt.Dimension(820, 650));
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

        cont3.setBackground(new java.awt.Color(96, 92, 60));
        cont3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cont3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cont3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cont3MouseExited(evt);
            }
        });
        cont3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont3ActionPerformed(evt);
            }
        });
        jPanel1.add(cont3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 130, 50));

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
        jPanel1.add(Continue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 80, 50));

        cont2.setBackground(new java.awt.Color(96, 92, 60));
        cont2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cont2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cont2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cont2MouseExited(evt);
            }
        });
        cont2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cont2ActionPerformed(evt);
            }
        });
        jPanel1.add(cont2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 130, 50));

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

        a_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        a_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/add.png"))); // NOI18N
        a_photo.setText(" Add Booking");
        a_photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_photoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_photoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_photoMouseExited(evt);
            }
        });
        jPanel1.add(a_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, 140, 30));

        e_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        e_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/editing.png"))); // NOI18N
        e_photo.setText(" Update Booking");
        e_photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_photoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e_photoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e_photoMouseExited(evt);
            }
        });
        jPanel1.add(e_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 140, 30));

        d_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        d_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/trash.png"))); // NOI18N
        d_photo.setText(" Delete Booking");
        d_photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_photoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d_photoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d_photoMouseExited(evt);
            }
        });
        jPanel1.add(d_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 540, 140, 30));

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
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 80, 30));

        Continue1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue1.setForeground(new java.awt.Color(255, 255, 255));
        Continue1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/approve.png"))); // NOI18N
        Continue1.setText(" Approve");
        jPanel1.add(Continue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 520, 90, 50));

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
        jPanel1.add(cont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 130, 50));

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
        jPanel1.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 90, 50));

        cont.setBackground(new java.awt.Color(96, 92, 60));
        cont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                contMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contMouseExited(evt);
            }
        });
        jPanel1.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 130, 50));

        approved.setBackground(new java.awt.Color(255, 251, 240));
        approved.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        approved.setForeground(new java.awt.Color(255, 251, 240));
        approved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approved.setText("Approved");
        jPanel1.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 110, -1));

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

    private void a_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_photoMouseClicked
     Client ad = new Client();

     // Get the desktop pane (make sure this is a JDesktopPane)
     JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

     desktopPane.add(ad);
     ad.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_a_photoMouseClicked

    private void d_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseClicked
         int row = booking_tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
                return;
            }

              // Retrieve the selected user's ID from the table
            String id = booking_tbl.getValueAt(row, 0).toString();
            int selectedPacakageId;
            
             try {
                selectedPacakageId = Integer.parseInt(id); // Ensure correct integer conversion
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid package ID format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this package?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

              
            // Database connection
            connectDB db = new connectDB();
            try (Connection conn = db.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM package WHERE pp_id = ?")) {

                stmt.setInt(1, selectedPacakageId);
                int affectedRows = stmt.executeUpdate();

                
                
                if (affectedRows > 0) {
                    displayData(); // Refresh table data after deletion
                    
                     // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Deleted package with ID " + selectedPacakageId;
                    con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    
                    JOptionPane.showMessageDialog(this, "Package deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete photographer.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }





    }//GEN-LAST:event_d_photoMouseClicked
        
       public int getSelectedBookingId() {
        int selectedRow = booking_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(booking_tbl.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
            }
        return -1; // Return -1 if no row is selected
    }

    
    
    private void e_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_photoMouseClicked
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



    }//GEN-LAST:event_e_photoMouseClicked

           

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
       displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void a_photoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_photoMouseEntered
        a_photo.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_a_photoMouseEntered

    private void a_photoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_photoMouseExited
        a_photo.setForeground(Color.black);
    }//GEN-LAST:event_a_photoMouseExited

    private void e_photoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_photoMouseEntered
        e_photo.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_e_photoMouseEntered

    private void e_photoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_photoMouseExited
       e_photo.setForeground(Color.black);
    }//GEN-LAST:event_e_photoMouseExited

    private void d_photoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseEntered
        d_photo.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_d_photoMouseEntered

    private void d_photoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseExited
        d_photo.setForeground(Color.black);
    }//GEN-LAST:event_d_photoMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseClicked
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
                    "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance, booking.created_at " +
                    "FROM booking " +
                    "JOIN client ON booking.client_id = client.c_id " +
                    "JOIN photographer ON booking.photographer_id = photographer.p_id " +
                    "JOIN package ON booking.package_id = package.pp_id " +
                    "WHERE booking.b_id = ?";

                PreparedStatement ps = dbc.getConnection().prepareStatement(query);
                ps.setObject(1, selectedId);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                   JDialog dialog = new JDialog();
                    Receipt up = new Receipt();


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

    
    }//GEN-LAST:event_contMouseClicked

    private void contMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseEntered
        cont.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_contMouseEntered

    private void contMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseExited
        cont.setBackground(new Color(96, 92, 60));
    }//GEN-LAST:event_contMouseExited

    private void cont1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseClicked
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

    }//GEN-LAST:event_cont1MouseClicked

    private void cont1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseEntered
              cont1.setForeground(new Color(204,204,204));

    }//GEN-LAST:event_cont1MouseEntered

    private void cont1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont1MouseExited
          cont1.setForeground(Color.black);
    }//GEN-LAST:event_cont1MouseExited

    private void cont2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont2MouseClicked
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
            "booking.status " + // include booking status
            "FROM booking " +
            "JOIN client ON booking.client_id = client.c_id " +
            "JOIN photographer ON booking.photographer_id = photographer.p_id " +
            "JOIN package ON booking.package_id = package.pp_id " +
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
            }
        }

        rs.close();
        ps.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
    }
}






    }//GEN-LAST:event_cont2MouseClicked

    private void cont2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont2MouseEntered
                cont2.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_cont2MouseEntered

    private void cont2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont2MouseExited
             cont2.setForeground(Color.black);
    }//GEN-LAST:event_cont2MouseExited

    private void cont2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont2ActionPerformed

    private void cont3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont3MouseClicked
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
            "booking.total_amount, booking.payment_method, booking.downpayment, booking.sukli, booking.balance, booking.created_at, " +
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

    }//GEN-LAST:event_cont3MouseClicked

    private void cont3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont3MouseEntered
        cont3.setForeground(new Color(204,204,204));    }//GEN-LAST:event_cont3MouseEntered

    private void cont3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cont3MouseExited
         cont3.setForeground(Color.black);

    }//GEN-LAST:event_cont3MouseExited

    private void cont3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cont3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cont3ActionPerformed

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ContinueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JLabel Continue1;
    private javax.swing.JLabel Continue2;
    private javax.swing.JLabel Continue3;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel a_photo;
    private javax.swing.JLabel approved;
    private javax.swing.JTable booking_tbl;
    private Swing.Button cont;
    private Swing.Button cont1;
    private Swing.Button cont2;
    private Swing.Button cont3;
    private javax.swing.JLabel d_photo;
    private javax.swing.JLabel e_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    // End of variables declaration//GEN-END:variables

    
}
