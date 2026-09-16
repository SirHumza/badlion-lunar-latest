package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import java.nio.charset.StandardCharsets;

public abstract class CodePointCharStream implements CharStream {
   protected final int size;
   protected final String name;
   protected int position;

   private CodePointCharStream(int var1, int var2, String var3) {
      assert var1 == 0;
      this.size = var2;
      this.name = var3;
      this.position = 0;
   }

   public static CodePointCharStream fromBuffer(CodePointBuffer var0, String var1) {
      switch (var0.getType()) {
         case BYTE:
            return new CodePointCharStream.CodePoint8BitCharStream(var0.position(), var0.remaining(), var1, var0.byteArray(), var0.arrayOffset());
         case CHAR:
            return new CodePointCharStream.CodePoint16BitCharStream(var0.position(), var0.remaining(), var1, var0.charArray(), var0.arrayOffset());
         case INT:
            return new CodePointCharStream.CodePoint32BitCharStream(var0.position(), var0.remaining(), var1, var0.intArray(), var0.arrayOffset());
         default:
            throw new UnsupportedOperationException("Not reached");
      }
   }

   @Override
   public final void consume() {
      if (this.size - this.position == 0) {
         assert this.LA(1) == -1;
         throw new IllegalStateException("cannot consume EOF");
      }

      this.position++;
   }

   @Override
   public final int index() {
      return this.position;
   }

   @Override
   public final int size() {
      return this.size;
   }

   @Override
   public final int mark() {
      return -1;
   }

   @Override
   public final void release(int var1) {
   }

   @Override
   public final void seek(int var1) {
      this.position = var1;
   }

   @Override
   public final String toString() {
      return this.getText(Interval.of(0, this.size - 1));
   }

   private static final class CodePoint16BitCharStream extends CodePointCharStream {
      private final char[] charArray;

      private CodePoint16BitCharStream(int var1, int var2, String var3, char[] var4, int var5) {
         super(var1, var2, var3);
         this.charArray = var4;
         assert var5 == 0;
      }

      @Override
      public String getText(Interval var1) {
         int var2 = Math.min(var1.a, this.size);
         int var3 = Math.min(var1.b - var1.a + 1, this.size - var2);
         return new String(this.charArray, var2, var3);
      }

      @Override
      public int LA(int var1) {
         switch (Integer.signum(var1)) {
            case -1:
               int var3 = this.position + var1;
               if (var3 < 0) {
                  return -1;
               }

               return this.charArray[var3] & 65535;
            case 0:
               return 0;
            case 1:
               int var2 = this.position + var1 - 1;
               if (var2 >= this.size) {
                  return -1;
               }

               return this.charArray[var2] & 65535;
            default:
               throw new UnsupportedOperationException("Not reached");
         }
      }
   }

   private static final class CodePoint32BitCharStream extends CodePointCharStream {
      private final int[] intArray;

      private CodePoint32BitCharStream(int var1, int var2, String var3, int[] var4, int var5) {
         super(var1, var2, var3);
         this.intArray = var4;
         assert var5 == 0;
      }

      @Override
      public String getText(Interval var1) {
         int var2 = Math.min(var1.a, this.size);
         int var3 = Math.min(var1.b - var1.a + 1, this.size - var2);
         return new String(this.intArray, var2, var3);
      }

      @Override
      public int LA(int var1) {
         switch (Integer.signum(var1)) {
            case -1:
               int var3 = this.position + var1;
               if (var3 < 0) {
                  return -1;
               }

               return this.intArray[var3];
            case 0:
               return 0;
            case 1:
               int var2 = this.position + var1 - 1;
               if (var2 >= this.size) {
                  return -1;
               }

               return this.intArray[var2];
            default:
               throw new UnsupportedOperationException("Not reached");
         }
      }
   }

   private static final class CodePoint8BitCharStream extends CodePointCharStream {
      private final byte[] byteArray;

      private CodePoint8BitCharStream(int var1, int var2, String var3, byte[] var4, int var5) {
         super(var1, var2, var3);
         assert var5 == 0;
         this.byteArray = var4;
      }

      @Override
      public String getText(Interval var1) {
         int var2 = Math.min(var1.a, this.size);
         int var3 = Math.min(var1.b - var1.a + 1, this.size - var2);
         return new String(this.byteArray, var2, var3, StandardCharsets.ISO_8859_1);
      }

      @Override
      public int LA(int var1) {
         switch (Integer.signum(var1)) {
            case -1:
               int var3 = this.position + var1;
               if (var3 < 0) {
                  return -1;
               }

               return this.byteArray[var3] & 0xFF;
            case 0:
               return 0;
            case 1:
               int var2 = this.position + var1 - 1;
               if (var2 >= this.size) {
                  return -1;
               }

               return this.byteArray[var2] & 0xFF;
            default:
               throw new UnsupportedOperationException("Not reached");
         }
      }
   }
}
