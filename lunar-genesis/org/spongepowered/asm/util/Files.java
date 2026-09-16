package org.spongepowered.asm.util;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public final class Files {
   private Files() {
   }

   public static File toFile(URL var0) {
      return var0 != null ? toFile(var0.toURI()) : null;
   }

   public static File toFile(URI var0) {
      if (var0 == null) {
         return null;
      }

      if ("file".equals(var0.getScheme()) && var0.getAuthority() != null) {
         String var1 = var0.toString();
         if (var1.startsWith("file://") && !var1.startsWith("file:///")) {
            try {
               var0 = new URI("file:////" + var1.substring(7));
            } catch (URISyntaxException var3) {
               throw new IllegalArgumentException(var3.getMessage());
            }
         }
      }

      return new File(var0);
   }

   public static void deleteRecursively(File var0) {
      if (var0 != null && var0.isDirectory()) {
         try {
            File[] var1 = var0.listFiles();
            if (var1 == null) {
               throw new IOException("Error enumerating directory during recursive delete operation: " + var0.getAbsolutePath());
            }

            for (File var5 : var1) {
               if (var5.isDirectory()) {
                  deleteRecursively(var5);
               } else if (var5.isFile() && !var5.delete()) {
                  throw new IOException("Error deleting file during recursive delete operation: " + var5.getAbsolutePath());
               }
            }

            if (!var0.delete()) {
               throw new IOException("Error deleting directory during recursive delete operation: " + var0.getAbsolutePath());
            }
         } catch (SecurityException var6) {
            throw new IOException("Security error during recursive delete operation", var6);
         }
      }
   }
}
