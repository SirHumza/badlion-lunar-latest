package com.llamalad7.mixinextras.lib.antlr.runtime;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class CodePointBuffer {
   private final CodePointBuffer.Type type;
   private final ByteBuffer byteBuffer;
   private final CharBuffer charBuffer;
   private final IntBuffer intBuffer;

   private CodePointBuffer(CodePointBuffer.Type var1, ByteBuffer var2, CharBuffer var3, IntBuffer var4) {
      this.type = var1;
      this.byteBuffer = var2;
      this.charBuffer = var3;
      this.intBuffer = var4;
   }

   public int position() {
      switch (this.type) {
         case BYTE:
            return this.byteBuffer.position();
         case CHAR:
            return this.charBuffer.position();
         case INT:
            return this.intBuffer.position();
         default:
            throw new UnsupportedOperationException("Not reached");
      }
   }

   public int remaining() {
      switch (this.type) {
         case BYTE:
            return this.byteBuffer.remaining();
         case CHAR:
            return this.charBuffer.remaining();
         case INT:
            return this.intBuffer.remaining();
         default:
            throw new UnsupportedOperationException("Not reached");
      }
   }

   CodePointBuffer.Type getType() {
      return this.type;
   }

   int arrayOffset() {
      switch (this.type) {
         case BYTE:
            return this.byteBuffer.arrayOffset();
         case CHAR:
            return this.charBuffer.arrayOffset();
         case INT:
            return this.intBuffer.arrayOffset();
         default:
            throw new UnsupportedOperationException("Not reached");
      }
   }

   byte[] byteArray() {
      assert this.type == CodePointBuffer.Type.BYTE;
      return this.byteBuffer.array();
   }

   char[] charArray() {
      assert this.type == CodePointBuffer.Type.CHAR;
      return this.charBuffer.array();
   }

   int[] intArray() {
      assert this.type == CodePointBuffer.Type.INT;
      return this.intBuffer.array();
   }

   public static CodePointBuffer.Builder builder(int var0) {
      return new CodePointBuffer.Builder(var0);
   }

   public static class Builder {
      private CodePointBuffer.Type type = CodePointBuffer.Type.BYTE;
      private ByteBuffer byteBuffer;
      private CharBuffer charBuffer;
      private IntBuffer intBuffer;
      private int prevHighSurrogate;

      private Builder(int var1) {
         this.byteBuffer = ByteBuffer.allocate(var1);
         this.charBuffer = null;
         this.intBuffer = null;
         this.prevHighSurrogate = -1;
      }

      public CodePointBuffer build() {
         switch (this.type) {
            case BYTE:
               ((Buffer)this.byteBuffer).flip();
               break;
            case CHAR:
               ((Buffer)this.charBuffer).flip();
               break;
            case INT:
               ((Buffer)this.intBuffer).flip();
         }

         return new CodePointBuffer(this.type, this.byteBuffer, this.charBuffer, this.intBuffer);
      }

      private static int roundUpToNextPowerOfTwo(int var0) {
         int var1 = 32 - Integer.numberOfLeadingZeros(var0 - 1);
         return (int)Math.pow(2.0, var1);
      }

      public void ensureRemaining(int var1) {
         switch (this.type) {
            case BYTE:
               if (this.byteBuffer.remaining() < var1) {
                  int var5 = roundUpToNextPowerOfTwo(this.byteBuffer.capacity() + var1);
                  ByteBuffer var7 = ByteBuffer.allocate(var5);
                  ((Buffer)this.byteBuffer).flip();
                  var7.put(this.byteBuffer);
                  this.byteBuffer = var7;
               }
               break;
            case CHAR:
               if (this.charBuffer.remaining() < var1) {
                  int var4 = roundUpToNextPowerOfTwo(this.charBuffer.capacity() + var1);
                  CharBuffer var6 = CharBuffer.allocate(var4);
                  ((Buffer)this.charBuffer).flip();
                  var6.put(this.charBuffer);
                  this.charBuffer = var6;
               }
               break;
            case INT:
               if (this.intBuffer.remaining() < var1) {
                  int var2 = roundUpToNextPowerOfTwo(this.intBuffer.capacity() + var1);
                  IntBuffer var3 = IntBuffer.allocate(var2);
                  ((Buffer)this.intBuffer).flip();
                  var3.put(this.intBuffer);
                  this.intBuffer = var3;
               }
         }
      }

      public void append(CharBuffer var1) {
         this.ensureRemaining(var1.remaining());
         if (var1.hasArray()) {
            this.appendArray(var1);
         } else {
            throw new UnsupportedOperationException("TODO");
         }
      }

      private void appendArray(CharBuffer var1) {
         assert var1.hasArray();
         switch (this.type) {
            case BYTE:
               this.appendArrayByte(var1);
               break;
            case CHAR:
               this.appendArrayChar(var1);
               break;
            case INT:
               this.appendArrayInt(var1);
         }
      }

      private void appendArrayByte(CharBuffer var1) {
         assert this.prevHighSurrogate == -1;
         char[] var2 = var1.array();
         int var3 = var1.arrayOffset() + var1.position();
         int var4 = var1.arrayOffset() + var1.limit();
         byte[] var5 = this.byteBuffer.array();

         int var6;
         for (var6 = this.byteBuffer.arrayOffset() + this.byteBuffer.position(); var3 < var4; var6++) {
            char var7 = var2[var3];
            if (var7 > 255) {
               ((Buffer)var1).position(var3 - var1.arrayOffset());
               ((Buffer)this.byteBuffer).position(var6 - this.byteBuffer.arrayOffset());
               if (!Character.isHighSurrogate(var7)) {
                  this.byteToCharBuffer(var1.remaining());
                  this.appendArrayChar(var1);
                  return;
               }

               this.byteToIntBuffer(var1.remaining());
               this.appendArrayInt(var1);
               return;
            }

            var5[var6] = (byte)(var7 & 0xFF);
            var3++;
         }

         ((Buffer)var1).position(var3 - var1.arrayOffset());
         ((Buffer)this.byteBuffer).position(var6 - this.byteBuffer.arrayOffset());
      }

      private void appendArrayChar(CharBuffer var1) {
         assert this.prevHighSurrogate == -1;
         char[] var2 = var1.array();
         int var3 = var1.arrayOffset() + var1.position();
         int var4 = var1.arrayOffset() + var1.limit();
         char[] var5 = this.charBuffer.array();

         int var6;
         for (var6 = this.charBuffer.arrayOffset() + this.charBuffer.position(); var3 < var4; var6++) {
            char var7 = var2[var3];
            if (Character.isHighSurrogate(var7)) {
               ((Buffer)var1).position(var3 - var1.arrayOffset());
               ((Buffer)this.charBuffer).position(var6 - this.charBuffer.arrayOffset());
               this.charToIntBuffer(var1.remaining());
               this.appendArrayInt(var1);
               return;
            }

            var5[var6] = var7;
            var3++;
         }

         ((Buffer)var1).position(var3 - var1.arrayOffset());
         ((Buffer)this.charBuffer).position(var6 - this.charBuffer.arrayOffset());
      }

      private void appendArrayInt(CharBuffer var1) {
         char[] var2 = var1.array();
         int var3 = var1.arrayOffset() + var1.position();
         int var4 = var1.arrayOffset() + var1.limit();
         int[] var5 = this.intBuffer.array();
         int var6 = this.intBuffer.arrayOffset() + this.intBuffer.position();

         while (var3 < var4) {
            char var7 = var2[var3];
            var3++;
            if (this.prevHighSurrogate != -1) {
               if (Character.isLowSurrogate(var7)) {
                  var5[var6] = Character.toCodePoint((char)this.prevHighSurrogate, var7);
                  var6++;
                  this.prevHighSurrogate = -1;
               } else {
                  var5[var6] = this.prevHighSurrogate;
                  var6++;
                  if (Character.isHighSurrogate(var7)) {
                     this.prevHighSurrogate = var7 & '\uffff';
                  } else {
                     var5[var6] = var7 & '\uffff';
                     var6++;
                     this.prevHighSurrogate = -1;
                  }
               }
            } else if (Character.isHighSurrogate(var7)) {
               this.prevHighSurrogate = var7 & '\uffff';
            } else {
               var5[var6] = var7 & '\uffff';
               var6++;
            }
         }

         if (this.prevHighSurrogate != -1) {
            var5[var6] = this.prevHighSurrogate & 65535;
            var6++;
         }

         ((Buffer)var1).position(var3 - var1.arrayOffset());
         ((Buffer)this.intBuffer).position(var6 - this.intBuffer.arrayOffset());
      }

      private void byteToCharBuffer(int var1) {
         ((Buffer)this.byteBuffer).flip();
         CharBuffer var2 = CharBuffer.allocate(Math.max(this.byteBuffer.remaining() + var1, this.byteBuffer.capacity() / 2));

         while (this.byteBuffer.hasRemaining()) {
            var2.put((char)(this.byteBuffer.get() & 0xFF));
         }

         this.type = CodePointBuffer.Type.CHAR;
         this.byteBuffer = null;
         this.charBuffer = var2;
      }

      private void byteToIntBuffer(int var1) {
         ((Buffer)this.byteBuffer).flip();
         IntBuffer var2 = IntBuffer.allocate(Math.max(this.byteBuffer.remaining() + var1, this.byteBuffer.capacity() / 4));

         while (this.byteBuffer.hasRemaining()) {
            var2.put(this.byteBuffer.get() & 255);
         }

         this.type = CodePointBuffer.Type.INT;
         this.byteBuffer = null;
         this.intBuffer = var2;
      }

      private void charToIntBuffer(int var1) {
         ((Buffer)this.charBuffer).flip();
         IntBuffer var2 = IntBuffer.allocate(Math.max(this.charBuffer.remaining() + var1, this.charBuffer.capacity() / 2));

         while (this.charBuffer.hasRemaining()) {
            var2.put(this.charBuffer.get() & 65535);
         }

         this.type = CodePointBuffer.Type.INT;
         this.charBuffer = null;
         this.intBuffer = var2;
      }
   }

   public enum Type {
      BYTE,
      CHAR,
      INT;
   }
}
