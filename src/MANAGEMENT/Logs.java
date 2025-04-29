
package MANAGEMENT;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author mikel
 */
public class Logs extends javax.swing.JInternalFrame {

    /**
     * Creates new form Logs
     */
    public Logs() {
        initComponents();
        displayData();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
            logs_tbl.getTableHeader().setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 15));
            logs_tbl.getTableHeader().setOpaque(false);
            logs_tbl.getTableHeader().setBorder(null);
            logs_tbl.getTableHeader().setForeground(new Color(0,0,0));
            logs_tbl.getTableHeader().setBackground(new Color(102,102,102));

            logs_tbl.setBackground(Color.WHITE); // Set table background to white
            logs_tbl.setForeground(Color.BLACK); // Set text color to black

            logs_tbl.setRowHeight(25);
            logs_tbl.setSelectionForeground(Color.WHITE);
            logs_tbl.setSelectionBackground(new Color(167, 134, 42)); // Selection background color

            // Set column widths
            logs_tbl.getColumnModel().getColumn(0).setPreferredWidth(80);  // Log id
            logs_tbl.getColumnModel().getColumn(1).setPreferredWidth(400); // Action
            logs_tbl.getColumnModel().getColumn(2).setPreferredWidth(80); //  User id
            logs_tbl.getColumnModel().getColumn(3).setPreferredWidth(250); // Date and Event
            
            
    }
    
    
        private void resetBorder(JTextField field) {
            field.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(new Color(19,122,127), 1),
                new EmptyBorder(0, 5, 0, 0) 
            ));
        }


     public void displayData(){
        
        connectDB dbc = new connectDB();
        try{
           ResultSet rs = dbc.getData("SELECT * FROM logs");         
           DefaultTableModel model = (DefaultTableModel)logs_tbl.getModel();
           model.setRowCount(0);
           
           while(rs.next()){
               model.addRow(new String[]{rs.getString(1), 
                   rs.getString(3), 
                   rs.getString(2), 
                   rs.getString(4)});             
           }
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        }
        
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        logs_tbl = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        search_icon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        refresh = new javax.swing.JLabel();
        d_photo = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPane.setBackground(new java.awt.Color(51, 255, 204));

        logs_tbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        logs_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Log ID", "Action", "User ID", "Date and Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logs_tbl.setGridColor(new java.awt.Color(102, 102, 102));
        logs_tbl.setOpaque(false);
        logs_tbl.setShowHorizontalLines(false);
        logs_tbl.setShowVerticalLines(false);
        ScrollPane.setViewportView(logs_tbl);

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 780, 530));

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Logs");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 60));

        search_icon.setBackground(new java.awt.Color(0, 0, 0));
        search_icon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_icon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/search.png"))); // NOI18N
        search_icon.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

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
        jPanel1.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 210, 30));

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
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 590, 90, 40));

        d_photo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        d_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/trash.png"))); // NOI18N
        d_photo.setText("Delete");
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
        jPanel1.add(d_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 80, 40));

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
        DefaultTableModel model = (DefaultTableModel)logs_tbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) logs_tbl.getModel());
        logs_tbl.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));

    }//GEN-LAST:event_search_barKeyReleased

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void d_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseClicked
        int row = logs_tbl.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Retrieve the selected user's ID from the table
        String id = logs_tbl.getValueAt(row, 0).toString();
        int selectedLogID;

        try {
            selectedLogID = Integer.parseInt(id); // Ensure correct integer conversion
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid log ID format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this log?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Database connection
        connectDB db = new connectDB();
        try (Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM logs WHERE l_id = ?")) {

            stmt.setInt(1, selectedLogID);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                displayData(); // Refresh table data after deletion

                // Logging the action
                Session sess = Session.getInstance();
                String action = "Deleted log with ID " + selectedLogID;
                db.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                JOptionPane.showMessageDialog(this, "Log deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete photographer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_d_photoMouseClicked

    private void d_photoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseEntered
        d_photo.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_d_photoMouseEntered

    private void d_photoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_photoMouseExited
        d_photo.setForeground(Color.black);
    }//GEN-LAST:event_d_photoMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel d_photo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable logs_tbl;
    private javax.swing.JLabel refresh;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    // End of variables declaration//GEN-END:variables
}
