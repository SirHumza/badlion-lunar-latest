package org.apache.commons.compress.archivers.tar;

public class TarArchiveSparseEntry implements TarConstants {
   private final boolean isExtended;

   public TarArchiveSparseEntry(byte[] var1) {
      int var2 = 0;
      var2 += 504;
      this.isExtended = TarUtils.parseBoolean(var1, var2);
   }

   public boolean isExtended() {
      return this.isExtended;
   }
}
