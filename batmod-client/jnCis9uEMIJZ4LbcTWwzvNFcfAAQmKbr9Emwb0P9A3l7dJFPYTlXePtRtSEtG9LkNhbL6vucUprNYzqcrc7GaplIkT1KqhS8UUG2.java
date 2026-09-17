import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2 {
   public static SecretKey BatModClient() {
      try {
         KeyGenerator var0 = KeyGenerator.getInstance("AES");
         var0.init(128);
         return var0.generateKey();
      } catch (NoSuchAlgorithmException var1) {
         throw new Error(var1);
      }
   }

   public static KeyPair Button() {
      try {
         KeyPairGenerator var0 = KeyPairGenerator.getInstance("RSA");
         var0.initialize(1024);
         return var0.generateKeyPair();
      } catch (NoSuchAlgorithmException var1) {
         var1.printStackTrace();
         BatModJson.CustomSpinner(
            "Key pair generation failed!"
         );
         return null;
      }
   }

   public static byte[] BatModClient(PublicKey var0, SecretKey var1) {
      try {
         return BatModClient(
            "SHA-1", "".getBytes("ISO_8859_1"), var1.getEncoded(), var0.getEncoded()
         );
      } catch (UnsupportedEncodingException var3) {
         var3.printStackTrace();
         return null;
      }
   }

   private static byte[] BatModClient(String var0, byte[]... var1) {
      try {
         MessageDigest var2 = MessageDigest.getInstance(var0);

         for (byte[] var6 : var1) {
            var2.update(var6);
         }

         return var2.digest();
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static PublicKey BatModClient(byte[] var0) {
      try {
         X509EncodedKeySpec var1 = new X509EncodedKeySpec(var0);
         KeyFactory var2 = KeyFactory.getInstance("RSA");
         return var2.generatePublic(var1);
      } catch (NoSuchAlgorithmException | InvalidKeySpecException var3) {
         var3.printStackTrace();
         BatModJson.CustomSpinner(
            "Public key reconstitute failed!"
         );
         return null;
      }
   }

   public static SecretKey BatModClient(PrivateKey var0, byte[] var1) {
      return new SecretKeySpec(Button(var0, var1), "AES");
   }

   public static byte[] BatModClient(Key var0, byte[] var1) {
      return BatModClient(1, var0, var1);
   }

   public static byte[] Button(Key var0, byte[] var1) {
      return BatModClient(2, var0, var1);
   }

   private static byte[] BatModClient(int var0, Key var1, byte[] var2) {
      try {
         return Objects.requireNonNull(
               BatModClient(var0, var1.getAlgorithm(), var1)
            )
            .doFinal(var2);
      } catch (IllegalBlockSizeException | BadPaddingException var4) {
         var4.printStackTrace();
         BatModJson.CustomSpinner(
            "Cipher data failed!"
         );
         return null;
      }
   }

   private static Cipher BatModClient(int var0, String var1, Key var2) {
      try {
         Cipher var3 = Cipher.getInstance(var1);
         var3.init(var0, var2);
         return var3;
      } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException var4) {
         var4.printStackTrace();
         BatModJson.CustomSpinner(
            "Cipher creation failed!"
         );
         return null;
      }
   }

   public static Cipher BatModClient(int var0, Key var1) {
      try {
         Cipher var2 = Cipher.getInstance("AES/CFB8/NoPadding");
         var2.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var2;
      } catch (GeneralSecurityException var3) {
         throw new RuntimeException(var3);
      }
   }
}
