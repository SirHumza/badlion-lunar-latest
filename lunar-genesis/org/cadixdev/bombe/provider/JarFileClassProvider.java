package org.cadixdev.bombe.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.cadixdev.bombe.util.ByteStreams;

public class JarFileClassProvider implements ClassProvider {
   private final JarFile jar;

   public JarFileClassProvider(JarFile var1) {
      this.jar = var1;
   }

   @Override
   public byte[] get(String var1) {
      String var2 = var1 + ".class";
      JarEntry var3 = this.jar.getJarEntry(var2);
      if (var3 == null) {
         return null;
      }

      try {
         InputStream var4 = this.jar.getInputStream(var3);

         byte[] var6;
         try {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            ByteStreams.copy(var4, var5);
            var6 = var5.toByteArray();
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }

         return var6;
      } catch (IOException var9) {
         return null;
      }
   }
}
