package org.cadixdev.bombe.jar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class JarServiceProviderConfigurationEntry extends AbstractJarEntry {
   private final ServiceProviderConfiguration config;
   private String extension;

   public JarServiceProviderConfigurationEntry(long var1, ServiceProviderConfiguration var3) {
      super("META-INF/services/" + var3.getService(), var1);
      this.config = var3;
   }

   public final ServiceProviderConfiguration getConfig() {
      return this.config;
   }

   @Override
   public final String getExtension() {
      if (this.extension != null) {
         return this.extension;
      }

      int var1 = this.name.lastIndexOf(46);
      return var1 == -1 ? (this.extension = "") : (this.extension = this.name.substring(var1 + 1));
   }

   @Override
   public final byte[] getContents() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         byte[] var2;
         try {
            this.config.write(var1);
            var2 = var1.toByteArray();
         } catch (Throwable var5) {
            try {
               var1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }

            throw var5;
         }

         var1.close();
         return var2;
      } catch (IOException var6) {
         return null;
      }
   }

   public final JarServiceProviderConfigurationEntry accept(JarEntryTransformer var1) {
      return var1.transform(this);
   }
}
