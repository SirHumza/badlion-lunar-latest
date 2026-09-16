package io.sigpipe.jbsdiff;

import io.sigpipe.jbsdiff.sort.SuffixSort;

public class DefaultDiffSettings implements DiffSettings {
   private String compression;

   public DefaultDiffSettings() {
      this.compression = "bzip2";
   }

   public DefaultDiffSettings(String var1) {
      this.compression = var1;
   }

   @Override
   public String getCompression() {
      return this.compression;
   }

   @Override
   public int[] sort(byte[] var1) {
      int[] var2 = new int[var1.length + 1];
      int[] var3 = new int[var1.length + 1];
      SuffixSort.qsufsort(var2, var3, var1);
      return var2;
   }
}
