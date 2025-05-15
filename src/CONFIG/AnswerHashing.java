
package CONFIG;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AnswerHashing {
    public static String hashAnswer(String answer) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    byte[] hashBytes = md.digest(answer.getBytes(StandardCharsets.UTF_8));
    StringBuilder sb = new StringBuilder();
    for (byte b : hashBytes) {
        sb.append(String.format("%02x", b));
    }
    return sb.toString();
}
    }


