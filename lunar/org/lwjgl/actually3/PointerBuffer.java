package org.lwjgl.actually3;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.CheckIntrinsics;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Pointer;

public class PointerBuffer extends CustomBuffer<PointerBuffer> implements Comparable<PointerBuffer> {
   protected PointerBuffer(long var1, @Nullable ByteBuffer var3, int var4, int var5, int var6, int var7) {
      super(var1, var3, var4, var5, var6, var7);
   }

   public static PointerBuffer allocateDirect(int var0) {
      ByteBuffer var1 = BufferUtils.createByteBuffer(BufferUtils.getAllocationSize(var0, POINTER_SHIFT));
      return PointerDefault.wrap(PointerBuffer.class, MemoryUtil.memAddress(var1), var0, var1);
   }

   public static PointerBuffer create(long var0, int var2) {
      return PointerDefault.wrap(PointerBuffer.class, var0, var2);
   }

   public static PointerBuffer create(ByteBuffer var0) {
      int var1 = var0.remaining() >> POINTER_SHIFT;
      return PointerDefault.wrap(PointerBuffer.class, MemoryUtil.memAddress(var0), var1, var0);
   }

   protected PointerBuffer self() {
      return this;
   }

   public int sizeof() {
      return POINTER_SIZE;
   }

   public long get() {
      return MemoryUtil.memGetAddress(this.address + Integer.toUnsignedLong(this.nextGetIndex()) * POINTER_SIZE);
   }

   public static long get(ByteBuffer var0) {
      if (var0.remaining() < POINTER_SIZE) {
         throw new BufferUnderflowException();
      }

      try {
         return MemoryUtil.memGetAddress(MemoryUtil.memAddress(var0));
      } finally {
         var0.position(var0.position() + POINTER_SIZE);
      }
   }

   public PointerBuffer put(long var1) {
      MemoryUtil.memPutAddress(this.address + Integer.toUnsignedLong(this.nextPutIndex()) * POINTER_SIZE, var1);
      return this;
   }

   public static void put(ByteBuffer var0, long var1) {
      if (var0.remaining() < POINTER_SIZE) {
         throw new BufferOverflowException();
      }

      try {
         MemoryUtil.memPutAddress(MemoryUtil.memAddress(var0), var1);
      } finally {
         var0.position(var0.position() + POINTER_SIZE);
      }
   }

   public long get(int var1) {
      return MemoryUtil.memGetAddress(this.address + Checks.check(var1, this.limit) * POINTER_SIZE);
   }

   public static long get(ByteBuffer var0, int var1) {
      CheckIntrinsics.checkFromIndexSize(var1, POINTER_SIZE, var0.limit());
      return MemoryUtil.memGetAddress(MemoryUtil.memAddress0(var0) + var1);
   }

   public PointerBuffer put(int var1, long var2) {
      MemoryUtil.memPutAddress(this.address + Checks.check(var1, this.limit) * POINTER_SIZE, var2);
      return this;
   }

   public static void put(ByteBuffer var0, int var1, long var2) {
      CheckIntrinsics.checkFromIndexSize(var1, POINTER_SIZE, var0.limit());
      MemoryUtil.memPutAddress(MemoryUtil.memAddress0(var0) + var1, var2);
   }

   public PointerBuffer put(Pointer var1) {
      this.put(var1.address());
      return this;
   }

   public PointerBuffer put(int var1, Pointer var2) {
      this.put(var1, var2.address());
      return this;
   }

   public PointerBuffer put(ByteBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(ShortBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(IntBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(LongBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(FloatBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(DoubleBuffer var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer putAddressOf(CustomBuffer<?> var1) {
      this.put(MemoryUtil.memAddress(var1));
      return this;
   }

   public PointerBuffer put(int var1, ByteBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer put(int var1, ShortBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer put(int var1, IntBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer put(int var1, LongBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer put(int var1, FloatBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer put(int var1, DoubleBuffer var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public PointerBuffer putAddressOf(int var1, CustomBuffer<?> var2) {
      this.put(var1, MemoryUtil.memAddress(var2));
      return this;
   }

   public ByteBuffer getByteBuffer(int var1) {
      return MemoryUtil.memByteBuffer(this.get(), var1);
   }

   public ShortBuffer getShortBuffer(int var1) {
      return MemoryUtil.memShortBuffer(this.get(), var1);
   }

   public IntBuffer getIntBuffer(int var1) {
      return MemoryUtil.memIntBuffer(this.get(), var1);
   }

   public LongBuffer getLongBuffer(int var1) {
      return MemoryUtil.memLongBuffer(this.get(), var1);
   }

   public FloatBuffer getFloatBuffer(int var1) {
      return MemoryUtil.memFloatBuffer(this.get(), var1);
   }

   public DoubleBuffer getDoubleBuffer(int var1) {
      return MemoryUtil.memDoubleBuffer(this.get(), var1);
   }

   public PointerBuffer getPointerBuffer(int var1) {
      return (PointerBuffer)MemoryUtil.memPointerBuffer(this.get(), var1);
   }

   public String getStringASCII() {
      return MemoryUtil.memASCII(this.get());
   }

   public String getStringUTF8() {
      return MemoryUtil.memUTF8(this.get());
   }

   public String getStringUTF16() {
      return MemoryUtil.memUTF16(this.get());
   }

   public ByteBuffer getByteBuffer(int var1, int var2) {
      return MemoryUtil.memByteBuffer(this.get(var1), var2);
   }

   public ShortBuffer getShortBuffer(int var1, int var2) {
      return MemoryUtil.memShortBuffer(this.get(var1), var2);
   }

   public IntBuffer getIntBuffer(int var1, int var2) {
      return MemoryUtil.memIntBuffer(this.get(var1), var2);
   }

   public LongBuffer getLongBuffer(int var1, int var2) {
      return MemoryUtil.memLongBuffer(this.get(var1), var2);
   }

   public FloatBuffer getFloatBuffer(int var1, int var2) {
      return MemoryUtil.memFloatBuffer(this.get(var1), var2);
   }

   public DoubleBuffer getDoubleBuffer(int var1, int var2) {
      return MemoryUtil.memDoubleBuffer(this.get(var1), var2);
   }

   public PointerBuffer getPointerBuffer(int var1, int var2) {
      return (PointerBuffer)MemoryUtil.memPointerBuffer(this.get(var1), var2);
   }

   public String getStringASCII(int var1) {
      return MemoryUtil.memASCII(this.get(var1));
   }

   public String getStringUTF8(int var1) {
      return MemoryUtil.memUTF8(this.get(var1));
   }

   public String getStringUTF16(int var1) {
      return MemoryUtil.memUTF16(this.get(var1));
   }

   public PointerBuffer get(long[] var1) {
      return this.get(var1, 0, var1.length);
   }

   public PointerBuffer get(long[] var1, int var2, int var3) {
      if (BITS64) {
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

   public PointerBuffer put(long[] var1) {
      return this.put(var1, 0, var1.length);
   }

   public PointerBuffer put(long[] var1, int var2, int var3) {
      if (BITS64) {
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
      if (!(var1 instanceof PointerBuffer var2)) {
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

   public int compareTo(PointerBuffer var1) {
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
