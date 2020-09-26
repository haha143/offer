import java.security.MessageDigest;
import java.util.Base64;

public class GdlTokenUtils {

    public static String judegeToeken(String type)   {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(type.getBytes("UTF-8"));
            for (int i = 0; i < hash.length; i++) {
                hash[i]&=0xF0;
            }
            String value= Base64.getEncoder().encodeToString(hash);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
    	String type="gethumiture";
    	System.out.println(judegeToeken(type));
	}
}
