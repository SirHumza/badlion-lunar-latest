package io.sentry.util;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class FileUtils {
   public static boolean deleteRecursively(@Nullable File var0) {
      if (var0 != null && var0.exists()) {
         if (var0.isFile()) {
            return var0.delete();
         }

         File[] var1 = var0.listFiles();
         if (var1 == null) {
            return true;
         }

         for (File var5 : var1) {
            if (!deleteRecursively(var5)) {
               return false;
            }
         }

         return var0.delete();
      } else {
         return true;
      }
   }

   @Nullable
   public static String readText(@Nullable File var0) {
      if (var0 != null && var0.exists() && var0.isFile() && var0.canRead()) {
         StringBuilder var1 = new StringBuilder();
         BufferedReader var2 = new BufferedReader(new FileReader(var0));

         try {
            String var3;
            if ((var3 = var2.readLine()) != null) {
               var1.append(var3);
            }

            while ((var3 = var2.readLine()) != null) {
               var1.append("\n").append(var3);
            }
         } catch (Throwable var6) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }

            throw var6;
         }

         var2.close();
         return var1.toString();
      } else {
         return null;
      }
   }

   public static byte[] readBytesFromFile(String var0, long var1) {
      File var3 = new File(var0);
      if (!var3.exists()) {
         throw new IOException(String.format("File '%s' doesn't exists", var3.getName()));
      }

      if (!var3.isFile()) {
         throw new IOException(String.format("Reading path %s failed, because it's not a file.", var0));
      }

      if (!var3.canRead()) {
         throw new IOException(String.format("Reading the item %s failed, because can't read the file.", var0));
      }

      if (var3.length() > var1) {
         throw new IOException(
            String.format(
               "Reading file failed, because size located at '%s' with %d bytes is bigger than the maximum allowed size of %d bytes.",
               var0,
               var3.length(),
               var1
            )
         );
      }

      FileInputStream var4 = new FileInputStream(var0);

      byte[] var10;
      try {
         BufferedInputStream var5 = new BufferedInputStream(var4);

         try {
            ByteArrayOutputStream var6 = new ByteArrayOutputStream();

            try {
               byte[] var7 = new byte[1024];
               byte var9 = 0;

               int var8;
               while ((var8 = var5.read(var7)) != -1) {
                  var6.write(var7, var9, var8);
               }

               var10 = var6.toByteArray();
            } catch (Throwable var14) {
               try {
                  var6.close();
               } catch (Throwable var13) {
                  var14.addSuppressed(var13);
               }

               throw var14;
            }

            var6.close();
         } catch (Throwable var15) {
            try {
               var5.close();
            } catch (Throwable var12) {
               var15.addSuppressed(var12);
            }

            throw var15;
         }

         var5.close();
      } catch (Throwable var16) {
         try {
            var4.close();
         } catch (Throwable var11) {
            var16.addSuppressed(var11);
         }

         throw var16;
      }

      var4.close();
      return var10;
   }
}
