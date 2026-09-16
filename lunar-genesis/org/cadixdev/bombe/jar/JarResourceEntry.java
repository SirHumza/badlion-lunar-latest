package org.cadixdev.bombe.jar;

public class JarResourceEntry extends AbstractJarEntry {
   private final byte[] contents;
   private String extension;

   public JarResourceEntry(int var1, String var2, long var3, byte[] var5) {
      super(var1, var2, var3);
      this.contents = var5;
   }

   public JarResourceEntry(String var1, long var2, byte[] var4) {
      super(var1, var2);
      this.contents = var4;
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
      return this.contents;
   }

   public final JarResourceEntry accept(JarEntryTransformer var1) {
      return var1.transform(this);
   }
}
