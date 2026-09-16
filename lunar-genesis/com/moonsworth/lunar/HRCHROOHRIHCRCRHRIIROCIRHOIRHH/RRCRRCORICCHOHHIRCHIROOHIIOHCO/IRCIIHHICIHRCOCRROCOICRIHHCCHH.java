package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipFile;
import lombok.Generated;

public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final char[] HHCOCHOCOHIIICIIOOOHRRROHCRICH = "0123456789abcdef".toCharArray();

   public static boolean IOHIHIIHCCCCCIHRORIOIOORCIOHII(Path var0) {
      try {
         if (Files.notExists(var0)) {
            return true;
         }

         String var1 = var0.toString();
         if (!var1.endsWith(".zip") && !var1.endsWith(".jar")) {
            return true;
         }

         try {
            new ZipFile(var0.toFile()).close();
            return false;
         } catch (Exception var3) {
            Files.delete(var0);
            return true;
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public static String RCIROOOOICRHCCRRCIORHHIRCOIIIC(Path var0) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, "SHA-1");
   }

   public static String HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var0, String var1) {
      try {
         MessageDigest var2 = MessageDigest.getInstance(var1);

         try (FileInputStream var3 = new FileInputStream(var0.toFile())) {
            byte[] var4 = new byte[8192];

            for (int var5 = var3.read(var4); var5 != -1; var5 = var3.read(var4)) {
               var2.update(var4, 0, var5);
            }

            return ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(var2.digest());
         }
      } catch (Exception var9) {
         return "";
      }
   }

   public static String OOCCRCRCOHIIORCCORCRCIRRROIOOR(Path var0) {
      try {
         CRC32 var1 = new CRC32();

         try (
            FileInputStream var2 = new FileInputStream(var0.toFile());
            CheckedInputStream var3 = new CheckedInputStream(var2, var1);
         ) {
            byte[] var4 = new byte[8192];
            int var5 = var3.read(var4);

            while (var5 != -1) {
               var5 = var3.read(var4);
            }

            return Long.toHexString(var1.getValue());
         }
      } catch (Exception var11) {
         return "";
      }
   }

   public static String ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(byte[] var0) {
      char[] var1 = new char[var0.length * 2];

      for (int var2 = 0; var2 < var0.length; var2++) {
         int var3 = var0[var2] & 255;
         var1[var2 * 2] = HHCOCHOCOHIIICIIOOOHRRROHCRICH[var3 >>> 4];
         var1[var2 * 2 + 1] = HHCOCHOCOHIIICIIOOOHRRROHCRICH[var3 & 15];
      }

      return new String(var1);
   }

   @Generated
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
