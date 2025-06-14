    package CONFIG;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
    import javax.swing.JOptionPane;

    public class connectDB {

    private Connection con;

    public connectDB() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep_bookingsystem", "root", "");
            System.out.println("Database connected successfully!");
        } catch (SQLException ex) {
            System.out.println("Can't connect to database: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }

    public ResultSet getData(String sql) throws SQLException {
        Statement stmt = con.createStatement();
        return stmt.executeQuery(sql);
    }

    // Insert Data (Parameterized Query to prevent SQL Injection)
    public int insertData(String sql, Object... params) {
        int result = 0;
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            result = pst.executeUpdate();
            System.out.println("Inserted Successfully!");
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e.getMessage());
        }
        return result;
    }

    // Validate User Login
    public boolean validateUser(String username, String password) {
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet result = pstmt.executeQuery()) {
                return result.next();  // Returns true if user exists
            }
        } catch (SQLException e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return false;
    }

    // Check if a field exists in the database
    public boolean fieldExists(String fieldName, String value) {
        String sql = "SELECT * FROM user WHERE " + fieldName + " = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, value);
            try (ResultSet result = pstmt.executeQuery()) {
                return result.next();
            }
        } catch (SQLException e) {
            System.out.println("Field Check Error: " + e.getMessage());
        }
        return false;
    }

    // Update Database Records
    public boolean updateDatabase(String sql, Object... params) {
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error in Updating: " + e.getMessage());
        }
        return false;
    }
    
   // Get the security question based on the user_id
    public String getSingleData(String sql, Object... params) {
        String result = null;

        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            // Set parameters for the prepared statement
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    result = rs.getString("question");  // Get the 'question' column value
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }

        return result;
    }
    
    public List<String> fetchColumn(String query, String userId) {
        List<String> columnData = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = con.prepareStatement(query);
            pst.setString(1, userId);
            rs = pst.executeQuery();

            while (rs.next()) {
                columnData.add(rs.getString(1)); // Gets the first column in the SELECT
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return columnData;
    }

    public int insertDataWithQuestion(String sql, String userId, String question, String hashedAnswer) {
        int result = 0;
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, userId);
            pst.setString(2, question);
            pst.setString(3, hashedAnswer);
            result = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
