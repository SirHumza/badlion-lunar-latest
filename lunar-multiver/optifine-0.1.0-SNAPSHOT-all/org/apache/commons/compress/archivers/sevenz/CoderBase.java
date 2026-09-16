package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import java.io.OutputStream;

abstract class CoderBase {
   private final Class<?>[] acceptableOptions;
   private static final byte[] NONE = new byte[0];

   protected CoderBase(Class<?>... var1) {
      this.acceptableOptions = var1;
   }

   boolean canAcceptOptions(Object var1) {
      for (Class var5 : this.acceptableOptions) {
         if (var5.isInstance(var1)) {
            return true;
         }
      }

      return false;
   }

   byte[] getOptionsAsProperties(Object var1) {
      return NONE;
   }

   Object getOptionsFromCoder(Coder var1, InputStream var2) {
      return null;
   }

   abstract InputStream decode(InputStream var1, long var2, Coder var4, byte[] var5);

   OutputStream encode(OutputStream var1, Object var2) {
      throw new UnsupportedOperationException("method doesn't support writing");
   }

   protected static int numberOptionOrDefault(Object var0, int var1) {
      return var0 instanceof Number ? ((Number)var0).intValue() : var1;
   }
}
