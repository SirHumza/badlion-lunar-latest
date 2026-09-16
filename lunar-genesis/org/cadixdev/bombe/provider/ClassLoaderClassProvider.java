package org.cadixdev.bombe.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.cadixdev.bombe.util.ByteStreams;

public class ClassLoaderClassProvider implements ClassProvider {
   private final ClassLoader loader;

   public ClassLoaderClassProvider(ClassLoader var1) {
      this.loader = var1;
   }

   @Override
   public byte[] get(String var1) {
      String var2 = var1 + ".class";

      try {
         InputStream var3 = this.loader.getResourceAsStream(var2);

         Object var9;
         label50: {
            byte[] var5;
            try {
               if (var3 == null) {
                  var9 = null;
                  break label50;
               }

               ByteArrayOutputStream var4 = new ByteArrayOutputStream();
               ByteStreams.copy(var3, var4);
               var5 = var4.toByteArray();
            } catch (Throwable var7) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var6) {
                     var7.addSuppressed(var6);
                  }
               }

               throw var7;
            }

            if (var3 != null) {
               var3.close();
            }

            return var5;
         }

         if (var3 != null) {
            var3.close();
         }

         return (byte[])var9;
      } catch (IOException var8) {
         return null;
      }
   }
}
