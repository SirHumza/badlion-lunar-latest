package org.cadixdev.bombe.jar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.jar.Manifest;

public class JarManifestEntry extends AbstractJarEntry {
   private static final String NAME = "META-INF/MANIFEST.MF";
   private static final String EXTENSION = "MF";
   private final Manifest manifest;

   public JarManifestEntry(long var1, Manifest var3) {
      super("META-INF/MANIFEST.MF", var1);
      this.manifest = var3;
   }

   public final Manifest getManifest() {
      return this.manifest;
   }

   @Override
   public final String getExtension() {
      return "MF";
   }

   @Override
   public final byte[] getContents() {
      try {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         byte[] var2;
         try {
            this.manifest.write(var1);
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

   public JarManifestEntry accept(JarEntryTransformer var1) {
      return var1.transform(this);
   }
}
