package org.cadixdev.atlas.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;

public final class JarRepacker {
   private JarRepacker() {
   }

   public static void verifyJarManifest(Path var0) {
      boolean var1;
      try (JarInputStream var2 = new JarInputStream(Files.newInputStream(var0))) {
         var1 = var2.getManifest() == null;
      }

      if (var1) {
         boolean var30;
         try (JarFile var31 = new JarFile(var0.toFile())) {
            var30 = var31.getManifest() != null;
         }

         if (var30) {
            fixJarManifest(var0);
         }
      }
   }

   private static void fixJarManifest(Path var0) {
      byte[] var1 = new byte[8192];
      Path var2 = Files.createTempFile(var0.getParent(), "atlas", "jar");

      try {
         try (
            JarOutputStream var3 = new JarOutputStream(Files.newOutputStream(var2));
            JarFile var5 = new JarFile(var0.toFile());
         ) {
            boolean var7 = copyManifest(var5, var3);
            Enumeration var8 = var5.entries();

            while (var8.hasMoreElements()) {
               JarEntry var9 = (JarEntry)var8.nextElement();
               String var10 = var9.getName();
               if (!var7 || !var10.equals("META-INF/") && !var10.equalsIgnoreCase("META-INF/MANIFEST.MF")) {
                  var3.putNextEntry(new ZipEntry(var10));

                  try (InputStream var11 = var5.getInputStream(var9)) {
                     copy(var11, var3, var1);
                  } finally {
                     var3.closeEntry();
                  }
               }
            }
         }

         Files.move(var2, var0, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
      } finally {
         Files.deleteIfExists(var2);
      }
   }

   private static boolean copyManifest(JarFile var0, JarOutputStream var1) {
      Manifest var2 = var0.getManifest();
      if (var2 == null) {
         return false;
      }

      var1.putNextEntry(new ZipEntry("META-INF/"));
      var1.closeEntry();
      var1.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
      var2.write(var1);
      var1.closeEntry();
      return true;
   }

   private static void copy(InputStream var0, OutputStream var1, byte[] var2) {
      int var3;
      while ((var3 = var0.read(var2)) != -1) {
         var1.write(var2, 0, var3);
      }
   }
}
