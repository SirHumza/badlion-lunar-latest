package org.lwjgl.actually3;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.CheckIntrinsics;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryUtil;

public class CLongBuffer extends CustomBuffer<CLongBuffer> implements Comparable<CLongBuffer> {
   protected CLongBuffer(long var1, @Nullable ByteBuffer var3, int var4, int var5, int var6, int var7) {
      super(var1, var3, var4, var5, var6, var7);
   }

   public static CLongBuffer allocateDirect(int var0) {
      ByteBuffer var1 = BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(var0, CLONG_SHIFT));
      return (CLongBuffer)wrap(CLongBuffer.class, MemoryUtil.memAddress(var1), var0, var1);
   }

   public static CLongBuffer create(long var0, int var2) {
      return (CLongBuffer)wrap(CLongBuffer.class, var0, var2);
   }

   public static CLongBuffer create(ByteBuffer var0) {
      int var1 = var0.remaining() >> CLONG_SHIFT;
      return (CLongBuffer)wrap(CLongBuffer.class, MemoryUtil.memAddress(var0), var1, var0);
   }

   protected CLongBuffer self() {
      return this;
   }

   public int sizeof() {
      return CLONG_SIZE;
   }

   public long get() {
      return MemoryUtil.memGetCLong(this.address + Integer.toUnsignedLong(this.nextGetIndex()) * CLONG_SIZE);
   }

   public static long get(ByteBuffer var0) {
      if (var0.remaining() < CLONG_SIZE) {
         throw new BufferUnderflowException();
      }

      try {
         return MemoryUtil.memGetCLong(MemoryUtil.memAddress(var0));
      } finally {
         var0.position(var0.position() + CLONG_SIZE);
      }
   }

   public CLongBuffer put(long var1) {
      MemoryUtil.memPutCLong(this.address + Integer.toUnsignedLong(this.nextPutIndex()) * CLONG_SIZE, var1);
      return this;
   }

   public static void put(ByteBuffer var0, long var1) {
      if (var0.remaining() < CLONG_SIZE) {
         throw new BufferOverflowException();
      }

      try {
         MemoryUtil.memPutCLong(MemoryUtil.memAddress(var0), var1);
      } finally {
         var0.position(var0.position() + CLONG_SIZE);
      }
   }

   public long get(int var1) {
      return MemoryUtil.memGetCLong(this.address + Checks.check(var1, this.limit) * CLONG_SIZE);
   }

   public static long get(ByteBuffer var0, int var1) {
      CheckIntrinsics.checkFromIndexSize(var1, CLONG_SIZE, var0.limit());
      return MemoryUtil.memGetCLong(MemoryUtil.memAddress0(var0) + var1);
   }

   public CLongBuffer put(int var1, long var2) {
      MemoryUtil.memPutCLong(this.address + Checks.check(var1, this.limit) * CLONG_SIZE, var2);
      return this;
   }

   public static void put(ByteBuffer var0, int var1, long var2) {
      CheckIntrinsics.checkFromIndexSize(var1, CLONG_SIZE, var0.limit());
      MemoryUtil.memPutCLong(MemoryUtil.memAddress0(var0) + var1, var2);
   }

   public CLongBuffer get(long[] var1) {
      return this.get(var1, 0, var1.length);
   }

   public CLongBuffer get(long[] var1, int var2, int var3) {
      if (CLONG_SIZE == 8) {
         MemoryUtil.memLongBuffer(this.address(), this.remaining()).get(var1, var2, var3);
         this.position(this.position() + var3);
      } else {
         this.get32(var1, var2, var3);
      }

      return this;
   }

   private void get32(long[] var1, int var2, int var3) {
      CheckIntrinsics.checkFromIndexSize(var2, var3, var1.length);
      if (this.remaining() < var3) {
         throw new BufferUnderflowException();
      }

      int var4 = var2;

      for (int var5 = var2 + var3; var4 < var5; var4++) {
         var1[var4] = this.get();
      }
   }

   public CLongBuffer put(long[] var1) {
      return this.put(var1, 0, var1.length);
   }

   public CLongBuffer put(long[] var1, int var2, int var3) {
      if (CLONG_SIZE == 8) {
         MemoryUtil.memLongBuffer(this.address(), this.remaining()).put(var1, var2, var3);
         this.position(this.position() + var3);
      } else {
         this.put32(var1, var2, var3);
      }

      return this;
   }

   private void put32(long[] var1, int var2, int var3) {
      CheckIntrinsics.checkFromIndexSize(var2, var3, var1.length);
      if (this.remaining() < var3) {
         throw new BufferOverflowException();
      }

      int var4 = var2 + var3;

      for (int var5 = var2; var5 < var4; var5++) {
         this.put(var1[var5]);
      }
   }

   @Override
   public int hashCode() {
      int var1 = 1;
      int var2 = this.position();

      for (int var3 = this.limit() - 1; var3 >= var2; var3--) {
         var1 = 31 * var1 + (int)this.get(var3);
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof CLongBuffer var2)) {
         return false;
      } else {
         if (this.remaining() != var2.remaining()) {
            return false;
         }

         int var3 = this.position();
         int var4 = this.limit() - 1;

         for (int var5 = var2.limit() - 1; var4 >= var3; var5--) {
            long var6 = this.get(var4);
            long var8 = var2.get(var5);
            if (var6 != var8) {
               return false;
            }

            var4--;
         }

         return true;
      }
   }

   public int compareTo(CLongBuffer var1) {
      int var2 = this.position() + Math.min(this.remaining(), var1.remaining());
      int var3 = this.position();

      for (int var4 = var1.position(); var3 < var2; var4++) {
         long var5 = this.get(var3);
         long var7 = var1.get(var4);
         if (var5 != var7) {
            if (var5 < var7) {
               return -1;
            }

            return 1;
         }

         var3++;
      }

      return this.remaining() - var1.remaining();
   }
}
