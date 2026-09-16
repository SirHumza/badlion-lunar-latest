package org.mozilla.universalchardet;

import java.io.InputStream;
import java.io.PushbackInputStream;

public class UnicodeBOMInputStream extends InputStream {
   private final PushbackInputStream in;
   private final UnicodeBOMInputStream.BOM bom;
   private boolean skipped = false;

   public UnicodeBOMInputStream(InputStream var1) {
      this(var1, true);
   }

   public UnicodeBOMInputStream(InputStream var1, boolean var2) {
      if (var1 == null) {
         throw new NullPointerException("invalid input stream: null is not allowed");
      }

      this.in = new PushbackInputStream(var1, 4);
      byte[] var3 = new byte[4];
      int var4 = this.in.read(var3);
      switch (var4) {
         case 4:
            if (var3[0] == -1 && var3[1] == -2 && var3[2] == 0 && var3[3] == 0) {
               this.bom = UnicodeBOMInputStream.BOM.UTF_32_LE;
               break;
            } else if (var3[0] == 0 && var3[1] == 0 && var3[2] == -2 && var3[3] == -1) {
               this.bom = UnicodeBOMInputStream.BOM.UTF_32_BE;
               break;
            }
         case 3:
            if (var3[0] == -17 && var3[1] == -69 && var3[2] == -65) {
               this.bom = UnicodeBOMInputStream.BOM.UTF_8;
               break;
            }
         case 2:
            if (var3[0] == -1 && var3[1] == -2) {
               this.bom = UnicodeBOMInputStream.BOM.UTF_16_LE;
               break;
            } else if (var3[0] == -2 && var3[1] == -1) {
               this.bom = UnicodeBOMInputStream.BOM.UTF_16_BE;
               break;
            }
         default:
            this.bom = UnicodeBOMInputStream.BOM.NONE;
      }

      if (var4 > 0) {
         this.in.unread(var3, 0, var4);
      }

      if (var2) {
         this.skipBOM();
      }
   }

   public final UnicodeBOMInputStream.BOM getBOM() {
      return this.bom;
   }

   public final synchronized UnicodeBOMInputStream skipBOM() {
      if (!this.skipped) {
         long var1 = this.bom.bytes.length;
         long var3 = this.in.skip(var1);

         for (long var5 = var3; var5 < var1; var5++) {
            this.in.read();
         }

         this.skipped = true;
      }

      return this;
   }

   @Override
   public int read() {
      this.skipped = true;
      return this.in.read();
   }

   @Override
   public int read(byte[] var1) {
      this.skipped = true;
      return this.in.read(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      this.skipped = true;
      return this.in.read(var1, var2, var3);
   }

   @Override
   public long skip(long var1) {
      this.skipped = true;
      return this.in.skip(var1);
   }

   @Override
   public int available() {
      return this.in.available();
   }

   @Override
   public void close() {
      this.in.close();
   }

   @Override
   public synchronized void mark(int var1) {
      this.in.mark(var1);
   }

   @Override
   public synchronized void reset() {
      this.in.reset();
   }

   @Override
   public boolean markSupported() {
      return this.in.markSupported();
   }

   public static final class BOM {
      final byte[] bytes;
      private final String description;
      public static final UnicodeBOMInputStream.BOM NONE = new UnicodeBOMInputStream.BOM(new byte[0], "NONE");
      public static final UnicodeBOMInputStream.BOM UTF_8 = new UnicodeBOMInputStream.BOM(new byte[]{-17, -69, -65}, "UTF-8");
      public static final UnicodeBOMInputStream.BOM UTF_16_LE = new UnicodeBOMInputStream.BOM(new byte[]{-1, -2}, "UTF-16 little-endian");
      public static final UnicodeBOMInputStream.BOM UTF_16_BE = new UnicodeBOMInputStream.BOM(new byte[]{-2, -1}, "UTF-16 big-endian");
      public static final UnicodeBOMInputStream.BOM UTF_32_LE = new UnicodeBOMInputStream.BOM(new byte[]{-1, -2, 0, 0}, "UTF-32 little-endian");
      public static final UnicodeBOMInputStream.BOM UTF_32_BE = new UnicodeBOMInputStream.BOM(new byte[]{0, 0, -2, -1}, "UTF-32 big-endian");

      @Override
      public final String toString() {
         return this.description;
      }

      public final byte[] getBytes() {
         int var1 = this.bytes.length;
         byte[] var2 = new byte[var1];
         System.arraycopy(this.bytes, 0, var2, 0, var1);
         return var2;
      }

      private BOM(byte[] var1, String var2) {
         assert var1 != null : "invalid BOM: null is not allowed";
         assert var2 != null : "invalid description: null is not allowed";
         assert var2.length() != 0 : "invalid description: empty string is not allowed";
         this.bytes = var1;
         this.description = var2;
      }
   }
}
