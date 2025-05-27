
package MANAGEMENT;

import CONFIG.Session;
import CONFIG.connectDB;
import CRUD.Add_Package;
import CRUD.Add_Photographer;
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
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Packages extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Packages() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 1));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
            package_tbl.getTableHeader().setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
            package_tbl.getTableHeader().setOpaque(false);
            package_tbl.getTableHeader().setBorder(null);
            package_tbl.getTableHeader().setForeground(new Color(0,0,0));
            package_tbl.getTableHeader().setBackground(new Color(102,102,102));

            package_tbl.setBackground(Color.WHITE); // Set table background to white
            package_tbl.setForeground(Color.BLACK); // Set text color to black

            package_tbl.setRowHeight(25);
            package_tbl.setSelectionForeground(Color.WHITE);
            package_tbl.setSelectionBackground(new Color(167, 134, 42)); // Selection background color

            // Set column widths
            package_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
            package_tbl.getColumnModel().getColumn(1).setPreferredWidth(150); // Package Name
            package_tbl.getColumnModel().getColumn(2).setPreferredWidth(100); // Price
            package_tbl.getColumnModel().getColumn(3).setPreferredWidth(350); // Description
            package_tbl.getColumnModel().getColumn(4).setPreferredWidth(350); // Services
            package_tbl.getColumnModel().getColumn(5).setPreferredWidth(120); // Duration
            
            
           

    }

    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
    public void displayData(){
        
         try{
           ResultSet rs = con.getData("SELECT * FROM package");         
           DefaultTableModel model = (DefaultTableModel)package_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{
                   rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4), 
                   rs.getString(5), 
                   rs.getString(6)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
        
    public int getSelectedPackageId() {
        int selectedRow = package_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(package_tbl.getValueAt(selectedRow, 0).toString()); // Get package_id from the first column
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
        search_bar = new javax.swing.JTextField();
        ScrollPane = new javax.swing.JScrollPane();
        package_tbl = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        a_photo = new javax.swing.JLabel();
        e_photo = new javax.swing.JLabel();
        d_photo = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();

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

        ScrollPane.setBackground(new java.awt.Color(51, 255, 204));

        package_tbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        package_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Package Name", "Price", "Description", "Included Services", "Duratioin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        package_tbl.setGridColor(new java.awt.Color(102, 102, 102));
        package_tbl.setOpaque(false);
        ScrollPane.setViewportView(package_tbl);

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 780, 430));

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Packages");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 80));

        a_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        a_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/add.png"))); // NOI18N
        a_photo.setText(" Add Packages");
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
        jPanel1.add(a_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 160, 30));

        e_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        e_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/editing.png"))); // NOI18N
        e_photo.setText(" Update Package");
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
        jPanel1.add(e_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 170, 30));

        d_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        d_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/trash.png"))); // NOI18N
        d_photo.setText(" Delete Package");
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
        jPanel1.add(d_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 170, 30));

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
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 90, 40));

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
       DefaultTableModel model = (DefaultTableModel)package_tbl.getModel();
       TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) package_tbl.getModel());
       package_tbl.setRowSorter(sorter);
       sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));

    }//GEN-LAST:event_search_barKeyReleased

    private void a_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_photoMouseClicked
     Add_Package ad = new Add_Package();

     // Get the desktop pane (make sure this is a JDesktopPane)
     JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

     desktopPane.add(ad);
     ad.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_a_photoMouseClicked

    private void d_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseClicked
         int row = package_tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
                return;
            }

              // Retrieve the selected user's ID from the table
            String id = package_tbl.getValueAt(row, 0).toString();
            int selectedPackageId;
            
             try {
                selectedPackageId = Integer.parseInt(id); // Ensure correct integer conversion
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

                stmt.setInt(1, selectedPackageId);
                int affectedRows = stmt.executeUpdate();

                
                
                if (affectedRows > 0) {
                    displayData(); // Refresh table data after deletion
                    
                     // Logging the action
                    Session sess = Session.getInstance();
                    String action = "Deleted package with ID " + selectedPackageId;
                    con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");
                    
                    JOptionPane.showMessageDialog(this, "Package deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete package.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }





    }//GEN-LAST:event_d_photoMouseClicked
        
      private int getLoggedInUserId() {
            Session sess = Session.getInstance();
            String userId = sess.getUser_id(); // Retrieve the user ID from the session

            if (userId == null || userId.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: User session ID is missing!", "Error", JOptionPane.ERROR_MESSAGE);
                return -1; // Return -1 to indicate an error
            }

            try {
                return Integer.parseInt(userId); // Convert to integer if applicable
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid user ID in session.", "Error", JOptionPane.ERROR_MESSAGE);
                return -1; // Return -1 to indicate an error
            }
        }

    
    
    private void e_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_photoMouseClicked
    int rowIndex = package_tbl.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, " Please select a row! ");
        }else{
             try {
                connectDB dbc = new connectDB();
                TableModel tbl = package_tbl.getModel();
                Object selectedId = tbl.getValueAt(rowIndex, 0); // get id

                ResultSet rs = dbc.getData("SELECT * FROM package WHERE pp_id = '" + selectedId + "'");

                if (rs.next()) {
                    Edit_Package up = new Edit_Package();

                    // Get the desktop pane
                    JDesktopPane desktopPane = getDesktopPane(); // works only inside JInternalFrame

                    desktopPane.add(up);
                    up.setVisible(true); // show the internal frame

                    // Populate fields
                    up.package_id.setText(rs.getString("pp_id"));
                    up.pnfield.setText(rs.getString("pp_name"));
                    up.pfield.setText(rs.getString("pp_price"));
                    up.dfield.setText(rs.getString("pp_desc"));
                    up.sfield.setText(rs.getString("pp_service"));
                    up.tfield.setText(rs.getString("pp_duration"));
                    
               
                    
                    Font FrankFont = new Font("Franklin Gothic Medium", Font.ITALIC, 16);

                 
                    up.pnfield.setFont(FrankFont);
                    up.pnfield.setForeground(Color.WHITE);

                    up.pfield.setFont(FrankFont);
                    up.pfield.setForeground(Color.WHITE);

                    up.dfield.setFont(FrankFont);
                    up.dfield.setForeground(Color.WHITE);
                    
                    up.sfield.setFont(FrankFont);
                    up.sfield.setForeground(Color.WHITE);
                    
                    up.tfield.setFont(FrankFont);
                    up.tfield.setForeground(Color.WHITE);
                    
                
                 
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel a_photo;
    private javax.swing.JLabel d_photo;
    private javax.swing.JLabel e_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable package_tbl;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    // End of variables declaration//GEN-END:variables

    
}
