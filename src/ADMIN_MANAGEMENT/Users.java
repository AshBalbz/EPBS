
package ADMIN_MANAGEMENT;

import CONFIG.Session;
import CONFIG.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
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


public class USERS extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public USERS() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 1));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
            user_tbl.getTableHeader().setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
            user_tbl.getTableHeader().setOpaque(false);
            user_tbl.getTableHeader().setBorder(null);
            user_tbl.getTableHeader().setForeground(new Color(0,0,0));
            user_tbl.getTableHeader().setBackground(new Color(102,102,102));

            user_tbl.setBackground(Color.WHITE); // Set table background to white
            user_tbl.setForeground(Color.BLACK); // Set text color to black

            user_tbl.setRowHeight(25);
            user_tbl.setSelectionForeground(Color.WHITE);
            user_tbl.setSelectionBackground(new Color(167, 134, 42)); // Selection background color

            // Set column widths
            user_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
            user_tbl.getColumnModel().getColumn(1).setPreferredWidth(120); // First Name
            user_tbl.getColumnModel().getColumn(2).setPreferredWidth(120); // Last Name
            user_tbl.getColumnModel().getColumn(3).setPreferredWidth(220); // Email
            user_tbl.getColumnModel().getColumn(4).setPreferredWidth(150); // Contact
            user_tbl.getColumnModel().getColumn(5).setPreferredWidth(150); // Username
            user_tbl.getColumnModel().getColumn(6).setPreferredWidth(80);  // Role
            user_tbl.getColumnModel().getColumn(7).setPreferredWidth(110); // Status

    }

    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
    public void displayData(){
        
         try{
           ResultSet rs = con.getData("SELECT * FROM user");         
           DefaultTableModel model = (DefaultTableModel)user_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{
                   rs.getString(1), 
                   rs.getString(2), 
                   rs.getString(3), 
                   rs.getString(4), 
                   rs.getString(5), 
                   rs.getString(6), 
                   rs.getString(8),
                   rs.getString(9)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
    }
        
    public int getSelectedUserId() {
        int selectedRow = user_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(user_tbl.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
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
        user_tbl = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        a_user = new javax.swing.JLabel();
        e_user = new javax.swing.JLabel();
        d_user = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        approval = new javax.swing.JPanel();
        approved = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("jMenu1");

        setPreferredSize(new java.awt.Dimension(820, 640));
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

        user_tbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        user_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Contact", "Username", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        user_tbl.setGridColor(new java.awt.Color(102, 102, 102));
        user_tbl.setOpaque(false);
        ScrollPane.setViewportView(user_tbl);

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 780, 390));

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Users Table");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 60));

        a_user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        a_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/add-users.png"))); // NOI18N
        a_user.setText("Add User");
        a_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_userMouseExited(evt);
            }
        });
        jPanel1.add(a_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 100, 30));

        e_user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        e_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/user-edit.png"))); // NOI18N
        e_user.setText("Update User");
        e_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e_userMouseExited(evt);
            }
        });
        jPanel1.add(e_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 120, 30));

        d_user.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        d_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/delete-user.png"))); // NOI18N
        d_user.setText("Delete User");
        d_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d_userMouseExited(evt);
            }
        });
        jPanel1.add(d_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 110, 30));

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
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 90, 40));

        approval.setBackground(new java.awt.Color(102, 102, 102));
        approval.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approvalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                approvalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                approvalMouseExited(evt);
            }
        });
        approval.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        approved.setBackground(new java.awt.Color(255, 251, 240));
        approved.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        approved.setForeground(new java.awt.Color(255, 251, 240));
        approved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approved.setText("Approved");
        approval.add(approved, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 10, 110, -1));

        jPanel1.add(approval, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, 120, 40));

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
       DefaultTableModel model = (DefaultTableModel)user_tbl.getModel();
       TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) user_tbl.getModel());
       user_tbl.setRowSorter(sorter);
       sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));
       
    }//GEN-LAST:event_search_barKeyReleased

    private void a_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_userMouseClicked
     JDialog dialog = new JDialog();
     Add_user panel = new Add_user();
     
     dialog.add(panel); // Add add_user to the dialog
     dialog.setModal(true); // Prevent interactions with the main window until closed
     dialog.setSize(585, 650); // Set the size of the window
     dialog.setLocationRelativeTo(null); // Center the window
     dialog.setVisible(true);
    }//GEN-LAST:event_a_userMouseClicked

    private void d_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_userMouseClicked
         int row = user_tbl.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Retrieve the selected user's ID from the table
            String id = user_tbl.getValueAt(row, 0).toString();
            int selectedUserId;

            try {
                selectedUserId = Integer.parseInt(id); // Ensure correct integer conversion
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid user ID format.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Fetch the currently logged-in user's ID
            int loggedInUserId = getLoggedInUserId(); 

            // Debugging Statements
            System.out.println("Selected User ID: " + selectedUserId);
            System.out.println("Logged-in User ID: " + loggedInUserId);

            // Prevent the logged-in user from deleting their own account
            if (selectedUserId == loggedInUserId) {
                JOptionPane.showMessageDialog(this, "You cannot delete your own account while logged in.", "Action Denied", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Confirm deletion
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm != JOptionPane.YES_OPTION) {
                return;
            }

            // Database connection
            connectDB db = new connectDB();
            try (Connection conn = db.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM user WHERE u_id = ?")) {

                stmt.setInt(1, selectedUserId);
                int affectedRows = stmt.executeUpdate();

                if (affectedRows > 0) {
                    displayData(); // Refresh table data after deletion
                    JOptionPane.showMessageDialog(this, "User deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to delete user.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }





    }//GEN-LAST:event_d_userMouseClicked
        
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

    
    
    private void e_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_userMouseClicked
    int rowIndex = user_tbl.getSelectedRow();
        
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, " Please select a row! ");
        }else{
            try{
                connectDB dbc = new connectDB();
                TableModel tbl = user_tbl.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM user WHERE u_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
                if(rs.next()){
                    JDialog dialog = new JDialog(); // Create a floating window
                    Edit_user newPanel = new Edit_user();
                    
                    newPanel.user_id.setText(""+rs.getString("u_id"));
                    newPanel.fnfield.setText(""+rs.getString("u_fname"));
                    newPanel.lnfield.setText(""+rs.getString("u_lname"));
                    newPanel.efield.setText(""+rs.getString("email"));
                    newPanel.pfield.setText(""+rs.getString("contact"));
                    newPanel.ufield.setText(""+rs.getString("username"));
                    newPanel.role.setSelectedItem(""+rs.getString("role"));
                    newPanel.stat.setSelectedItem(""+rs.getString("status"));
                    
                    Font FrankFont = new Font("Franklin Gothic Medium", Font.ITALIC, 16);

                    newPanel.user_id.setFont(FrankFont);
                    newPanel.user_id.setForeground(Color.WHITE);
                    newPanel.user_id.setHorizontalAlignment(CENTER);
                    
                    newPanel.fnfield.setFont(FrankFont);
                    newPanel.fnfield.setForeground(Color.WHITE);

                    newPanel.lnfield.setFont(FrankFont);
                    newPanel.lnfield.setForeground(Color.WHITE);

                    newPanel.efield.setFont(FrankFont);
                    newPanel.efield.setForeground(Color.WHITE);

                    newPanel.pfield.setFont(FrankFont);
                    newPanel.pfield.setForeground(Color.WHITE);
                    
                    newPanel.ufield.setFont(FrankFont);
                    newPanel.ufield.setForeground(Color.WHITE);
                    
                    dialog.add(newPanel); // Add add_user to the dialog
                    dialog.setSize(585, 650); // Set the size of the window
                    dialog.setLocationRelativeTo(null); // Center the window
                    dialog.setModal(true); // Prevent interactions with the main window until closed
                    dialog.setVisible(true); // Show the floating add_user
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }    
        }   
    }//GEN-LAST:event_e_userMouseClicked

           

    private void approvalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvalMouseClicked
    int selectedUserId = getSelectedUserId(); // Get the selected user's ID

        if (selectedUserId != -1) {
            try {
                connectDB db = new connectDB(); // Create an instance of dbConnector
                Connection conn = db.getConnection(); // Get database connection

                String query = "UPDATE user SET status = 'Approved' WHERE u_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                    pstmt.setInt(1, selectedUserId);

                    int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "User approved successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to approve user.");
            }
                pstmt.close();
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a user to approve.");
        }

    }//GEN-LAST:event_approvalMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
       displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void a_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_userMouseEntered
        a_user.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_a_userMouseEntered

    private void a_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_userMouseExited
        a_user.setForeground(Color.black);
    }//GEN-LAST:event_a_userMouseExited

    private void e_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_userMouseEntered
        e_user.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_e_userMouseEntered

    private void e_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_userMouseExited
       e_user.setForeground(Color.black);
    }//GEN-LAST:event_e_userMouseExited

    private void d_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_userMouseEntered
        d_user.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_d_userMouseEntered

    private void d_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_userMouseExited
        d_user.setForeground(Color.black);
    }//GEN-LAST:event_d_userMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void approvalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvalMouseEntered
        approval.setBackground(new Color(204,204,204));
      
    }//GEN-LAST:event_approvalMouseEntered

    private void approvalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvalMouseExited
       approval.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_approvalMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel a_user;
    private javax.swing.JPanel approval;
    private javax.swing.JLabel approved;
    private javax.swing.JLabel d_user;
    private javax.swing.JLabel e_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    private javax.swing.JTable user_tbl;
    // End of variables declaration//GEN-END:variables

    
}
