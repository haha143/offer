package offer;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class test {
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		 MessageDigest md5 = MessageDigest.getInstance("MD5");
		 String str1="gethumiture";
         byte[]bytes = md5.digest(str1.toString().getBytes("UTF-8"));
		 for(int i=0;i<bytes.length;i++)
			bytes[i] &= 0xF0;
		 String last=Base64.getEncoder().encodeToString(bytes);
		 System.out.println(last);
	}
}
