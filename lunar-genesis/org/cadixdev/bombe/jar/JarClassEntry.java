package org.cadixdev.bombe.jar;

public class JarClassEntry extends AbstractJarEntry {
   private static final String EXTENSION = "class";
   private final byte[] contents;

   public JarClassEntry(int var1, String var2, long var3, byte[] var5) {
      super(var1, var2, var3);
      this.contents = var5;
   }

   public JarClassEntry(String var1, long var2, byte[] var4) {
      super(var1, var2);
      this.contents = var4;
   }

   @Override
   public final String getExtension() {
      return "class";
   }

   @Override
   public final byte[] getContents() {
      return this.contents;
   }

   public final JarClassEntry accept(JarEntryTransformer var1) {
      return var1.transform(this);
   }
}
