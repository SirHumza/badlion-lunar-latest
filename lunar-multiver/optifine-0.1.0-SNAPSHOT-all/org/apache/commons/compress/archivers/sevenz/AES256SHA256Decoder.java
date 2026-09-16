package org.apache.commons.compress.archivers.sevenz;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class AES256SHA256Decoder extends CoderBase {
   AES256SHA256Decoder() {
      super();
   }

   @Override
   InputStream decode(final InputStream var1, long var2, final Coder var4, final byte[] var5) {
      return new InputStream() {
         private boolean isInitialized = false;
         private CipherInputStream cipherInputStream = null;

         private CipherInputStream init() {
            if (this.isInitialized) {
               return this.cipherInputStream;
            }

            int var1x = 255 & var4.properties[0];
            int var2x = var1x & 63;
            int var3 = 255 & var4.properties[1];
            int var4x = (var1x >> 6 & 1) + (var3 & 15);
            int var5x = (var1x >> 7 & 1) + (var3 >> 4);
            if (2 + var5x + var4x > var4.properties.length) {
               throw new IOException("Salt size + IV size too long");
            }

            byte[] var6 = new byte[var5x];
            System.arraycopy(var4.properties, 2, var6, 0, var5x);
            byte[] var7 = new byte[16];
            System.arraycopy(var4.properties, 2 + var5x, var7, 0, var4x);
            if (var5 == null) {
               throw new IOException("Cannot read encrypted files without a password");
            }

            byte[] var8;
            if (var2x == 63) {
               var8 = new byte[32];
               System.arraycopy(var6, 0, var8, 0, var5x);
               System.arraycopy(var5, 0, var8, var5x, Math.min(var5.length, var8.length - var5x));
            } else {
               MessageDigest var9;
               try {
                  var9 = MessageDigest.getInstance("SHA-256");
               } catch (NoSuchAlgorithmException var15) {
                  IOException var11 = new IOException("SHA-256 is unsupported by your Java implementation");
                  var11.initCause(var15);
                  throw var11;
               }

               byte[] var10 = new byte[8];

               for (long var18 = 0L; var18 < 1L << var2x; var18++) {
                  var9.update(var6);
                  var9.update(var5);
                  var9.update(var10);

                  for (int var13 = 0; var13 < var10.length; var13++) {
                     var10[var13]++;
                     if (var10[var13] != 0) {
                        break;
                     }
                  }
               }

               var8 = var9.digest();
            }

            SecretKeySpec var16 = new SecretKeySpec(var8, "AES");

            try {
               Cipher var17 = Cipher.getInstance("AES/CBC/NoPadding");
               var17.init(2, var16, new IvParameterSpec(var7));
               this.cipherInputStream = new CipherInputStream(var1, var17);
               this.isInitialized = true;
               return this.cipherInputStream;
            } catch (GeneralSecurityException var14) {
               IOException var19 = new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)");
               var19.initCause(var14);
               throw var19;
            }
         }

         @Override
         public int read() {
            return this.init().read();
         }

         @Override
         public int read(byte[] var1x, int var2x, int var3) {
            return this.init().read(var1x, var2x, var3);
         }

         @Override
         public void close() {
         }
      };
   }
}
