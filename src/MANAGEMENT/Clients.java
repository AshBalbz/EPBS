
package MANAGEMENT;

import CONFIG.Session;
import CONFIG.connectDB;
import CRUD.Add_Client;
import CRUD.Edit_Client;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Clients extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Clients() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 1));
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
       
            client_tbl.getTableHeader().setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
            client_tbl.getTableHeader().setOpaque(false);
            client_tbl.getTableHeader().setBorder(null);
            client_tbl.getTableHeader().setForeground(new Color(0,0,0));
            client_tbl.getTableHeader().setBackground(new Color(102,102,102));

            client_tbl.setBackground(Color.WHITE); // Set table background to white
            client_tbl.setForeground(Color.BLACK); // Set text color to black

            client_tbl.setRowHeight(25);
            client_tbl.setSelectionForeground(Color.WHITE);
            client_tbl.setSelectionBackground(new Color(167, 134, 42)); // Selection background color

            // Set column widths
            client_tbl.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
            client_tbl.getColumnModel().getColumn(1).setPreferredWidth(120); // First Name
            client_tbl.getColumnModel().getColumn(2).setPreferredWidth(120); // Last Name
            client_tbl.getColumnModel().getColumn(3).setPreferredWidth(220); // Address
            client_tbl.getColumnModel().getColumn(4).setPreferredWidth(150); // Email
            client_tbl.getColumnModel().getColumn(5).setPreferredWidth(150); // Phone No.
          

    }

    private void resetBorder(JTextField field) {
        field.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(new Color(19,122,127), 1),
            new EmptyBorder(0, 5, 0, 0) 
        ));
    }
    
    public void displayData(){
        
         try{
           ResultSet rs = con.getData("SELECT * FROM client");         
           DefaultTableModel model = (DefaultTableModel)client_tbl.getModel();
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
        client_tbl = new javax.swing.JTable();
        a_client = new javax.swing.JLabel();
        d_client = new javax.swing.JLabel();
        e_client = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
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

        client_tbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        client_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Address", "Email", "Phone No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        client_tbl.setGridColor(new java.awt.Color(102, 102, 102));
        client_tbl.setOpaque(false);
        ScrollPane.setViewportView(client_tbl);

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 780, 440));

        a_client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        a_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/add.png"))); // NOI18N
        a_client.setText(" Add Client");
        a_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_clientMouseExited(evt);
            }
        });
        jPanel1.add(a_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 110, 30));

        d_client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        d_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/trash.png"))); // NOI18N
        d_client.setText(" Delete Client");
        d_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                d_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                d_clientMouseExited(evt);
            }
        });
        jPanel1.add(d_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 130, 30));

        e_client.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
        e_client.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/editing.png"))); // NOI18N
        e_client.setText(" Update Client");
        e_client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_clientMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                e_clientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                e_clientMouseExited(evt);
            }
        });
        jPanel1.add(e_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 130, 30));

        Title.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Client Table");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 80));

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
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_clientMouseExited
        a_client.setForeground(Color.black);
    }//GEN-LAST:event_a_clientMouseExited

    private void a_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_clientMouseEntered
        a_client.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_a_clientMouseEntered

    private void a_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_clientMouseClicked
        Add_Client ad = new Add_Client();

        // Get the desktop pane (make sure this is a JDesktopPane)
        JDesktopPane desktopPane = getDesktopPane(); // assuming you're inside a JInternalFrame

        desktopPane.add(ad);
        ad.setVisible(true); // instead of .show(), which is deprecated
    }//GEN-LAST:event_a_clientMouseClicked

    private void search_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_barKeyReleased
        DefaultTableModel model = (DefaultTableModel)client_tbl.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) client_tbl.getModel());
        client_tbl.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(search_bar.getText()));

    }//GEN-LAST:event_search_barKeyReleased

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_barFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusLost
        if(search_bar.getText().isEmpty()){
            search_bar.setText(" Search...");
            search_bar.setForeground(Color.GRAY);
            search_bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
        resetBorder(search_bar);
    }//GEN-LAST:event_search_barFocusLost

    private void search_barFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_barFocusGained
        if(search_bar.getText().equals(" Search...")){
            search_bar.setText("");
            search_bar.setForeground(Color.BLACK);
            search_bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        }
    }//GEN-LAST:event_search_barFocusGained

    private void e_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_clientMouseExited
        e_client.setForeground(Color.black);
    }//GEN-LAST:event_e_clientMouseExited

    private void e_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_clientMouseEntered
        e_client.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_e_clientMouseEntered

    private void e_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_clientMouseClicked
        int rowIndex = client_tbl.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
        } else {
            try {
                connectDB dbc = new connectDB();
                TableModel tbl = client_tbl.getModel();
                Object selectedId = tbl.getValueAt(rowIndex, 0); // get id

                ResultSet rs = dbc.getData("SELECT * FROM client WHERE c_id = '" + selectedId + "'");

                if (rs.next()) {
                    Edit_Client up = new Edit_Client();

                    // Get the desktop pane
                    JDesktopPane desktopPane = getDesktopPane(); // works only inside JInternalFrame

                    desktopPane.add(up);
                    up.setVisible(true); // show the internal frame

                    // Populate fields
                    up.client_id.setText(rs.getString("c_id"));
                    up.fname.setText(rs.getString("c_fname"));
                    up.lname.setText(rs.getString("c_lname"));
                    up.address.setText(rs.getString("c_address"));
                    up.email.setText(rs.getString("c_email"));
                    up.phone_no.setText(rs.getString("c_contact"));

                    // Set fonts and colors
                    Font FrankFont = new Font("Franklin Gothic Medium", Font.PLAIN, 16);

                    up.client_id.setFont(FrankFont);
                    up.client_id.setForeground(Color.WHITE);
                    up.client_id.setHorizontalAlignment(SwingConstants.CENTER);

                    up.fname.setFont(FrankFont);
                    up.fname.setForeground(Color.BLACK);

                    up.lname.setFont(FrankFont);
                    up.lname.setForeground(Color.BLACK);

                    up.address.setFont(FrankFont);
                    up.address.setForeground(Color.BLACK);

                    up.email.setFont(FrankFont);
                    up.email.setForeground(Color.BLACK);

                    up.phone_no.setFont(FrankFont);
                    up.phone_no.setForeground(Color.BLACK);
                }
            } catch (SQLException ex) {
                System.out.println("SQL Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_e_clientMouseClicked

    private void d_clientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_clientMouseExited
        d_client.setForeground(Color.black);
    }//GEN-LAST:event_d_clientMouseExited

    private void d_clientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_clientMouseEntered
        d_client.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_d_clientMouseEntered

    private void d_clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_clientMouseClicked
        int row = client_tbl.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Retrieve the selected user's ID from the table
        String id = client_tbl.getValueAt(row, 0).toString();
        int selectedPhotographerId;

        try {
            selectedPhotographerId = Integer.parseInt(id); // Ensure correct integer conversion
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid client ID format.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Confirm deletion
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this client?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Database connection
        connectDB db = new connectDB();
        try (Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM client WHERE c_id = ?")) {

            stmt.setInt(1, selectedPhotographerId);
            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                displayData(); // Refresh table data after deletion

                // Logging the action
                Session sess = Session.getInstance();
                String action = "Deleted a client with ID " + selectedPhotographerId;
                con.insertData("INSERT INTO logs (u_id, action, date_time) VALUES ('" + sess.getUser_id() + "', '" + action + "', '" + LocalDateTime.now() + "')");

                JOptionPane.showMessageDialog(this, "Client deleted successfully.", "Deleted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to delete client.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_d_clientMouseClicked

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

             
      

    
    
           


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel a_client;
    private javax.swing.JTable client_tbl;
    private javax.swing.JLabel d_client;
    private javax.swing.JLabel e_client;
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
