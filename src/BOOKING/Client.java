
package BOOKING;

import CONFIG.BookingSession;
import CONFIG.connectDB;
import CRUD.Add_Client;
import MANAGEMENT.Bookings;
import java.awt.Color;
import static java.awt.Desktop.getDesktop;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Client extends javax.swing.JInternalFrame {

    connectDB con = new connectDB();
  
    public Client() {
        initComponents();
        displayData();
        setBackground(new Color(0, 0, 0, 1));
        
        back.setBackground(new Color(96, 92,60));
        
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
        
    public int getSelectedUserId() {
        int selectedRow = client_tbl.getSelectedRow(); // Get the selected row index

            if (selectedRow != -1) { // Check if a row is selected
                return Integer.parseInt(client_tbl.getValueAt(selectedRow, 0).toString()); // Get user_id from the first column
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
        client_tbl = new javax.swing.JTable();
        a_client = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        bck = new javax.swing.JLabel();
        Continue = new javax.swing.JLabel();
        back = new Swing.Button();
        cont = new Swing.Button();
        roundedPanel1 = new Swing.RoundedPanel();
        Title = new javax.swing.JLabel();

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

        jPanel1.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 30));

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
        jPanel1.add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 30));

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

        jPanel1.add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 780, 450));

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
        jPanel1.add(a_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 40));

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 15)); // NOI18N
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

        bck.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        bck.setForeground(new java.awt.Color(255, 255, 255));
        bck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/bc.png"))); // NOI18N
        bck.setText("  Back");
        jPanel1.add(bck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 50));

        Continue.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        Continue.setForeground(new java.awt.Color(255, 255, 255));
        Continue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Continue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PHOTOS/next.png"))); // NOI18N
        Continue.setText("  Continue");
        jPanel1.add(Continue, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 110, 50));

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
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 140, 50));

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
        jPanel1.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 140, 50));

        roundedPanel1.setBackground(new java.awt.Color(167, 134, 42));
        roundedPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Select From Client Table:");
        roundedPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 50));

        jPanel1.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 320, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 830, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        displayData();
    }//GEN-LAST:event_refreshMouseClicked

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

    private void contMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseClicked
       int selectedRow = client_tbl.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select a row!");
            } else {
                BookingSession session = new BookingSession();

                session.setC_id(client_tbl.getValueAt(selectedRow, 0).toString());
                session.setC_fname(client_tbl.getValueAt(selectedRow, 1).toString());
                session.setC_lname(client_tbl.getValueAt(selectedRow, 2).toString());
                session.setC_address(client_tbl.getValueAt(selectedRow, 3).toString());
                session.setC_email(client_tbl.getValueAt(selectedRow, 4).toString());
                session.setC_contact(client_tbl.getValueAt(selectedRow, 5).toString());

                BookingSession.setInstance(session);

                // Load next internal frame (Photographer page)
                Photo ph = new Photo();
                JDesktopPane pane = getDesktopPane(); // this gets the JDesktopPane that this frame is inside
                pane.add(ph);
                ph.setVisible(true);

                this.dispose(); // close current frame
            }
    }//GEN-LAST:event_contMouseClicked

    private void contMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseEntered
        cont.setBackground(new Color(176, 172, 140));
    }//GEN-LAST:event_contMouseEntered

    private void contMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contMouseExited
        cont.setBackground(new Color(96, 92, 60));
    }//GEN-LAST:event_contMouseExited

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

             
      

    
    
           


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Continue;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel a_client;
    private Swing.Button back;
    private javax.swing.JLabel bck;
    private javax.swing.JTable client_tbl;
    private Swing.Button cont;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel refresh;
    private Swing.RoundedPanel roundedPanel1;
    private javax.swing.JTextField search_bar;
    private javax.swing.JPanel search_icon;
    // End of variables declaration//GEN-END:variables

    
}
