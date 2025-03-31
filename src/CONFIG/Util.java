
package CONFIG;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {
      public static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean checkPassword(String password, String storedHashedPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static boolean verifyPassword(String enteredPassword, String storedHash) throws NoSuchAlgorithmException {
        String hashedEnteredPassword = hashPassword(enteredPassword); // Hash input password
        return hashedEnteredPassword.equals(storedHash); // Compare with stored hash
    }
}
