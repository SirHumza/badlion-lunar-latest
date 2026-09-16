package org.lwjgl.actually3;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import lombok.Generated;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.MemoryUtil;

public final class BufferUtils {
   public static ByteBuffer createByteBuffer(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   static int getAllocationSize(int var0, int var1) {
      APIUtil.apiCheckAllocation(var0, APIUtil.apiGetBytes(var0, var1), 2147483647L);
      return var0 << var1;
   }

   public static ShortBuffer createShortBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 1)).asShortBuffer();
   }

   public static CharBuffer createCharBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 1)).asCharBuffer();
   }

   public static IntBuffer createIntBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 2)).asIntBuffer();
   }

   public static LongBuffer createLongBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 3)).asLongBuffer();
   }

   public static CLongBuffer createCLongBuffer(int var0) {
      return CLongBuffer.allocateDirect(var0);
   }

   public static FloatBuffer createFloatBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 2)).asFloatBuffer();
   }

   public static DoubleBuffer createDoubleBuffer(int var0) {
      return createByteBuffer(getAllocationSize(var0, 3)).asDoubleBuffer();
   }

   public static PointerBuffer createPointerBuffer(int var0) {
      return PointerBuffer.allocateDirect(var0);
   }

   public static void zeroBuffer(ByteBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(ShortBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(CharBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(IntBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(FloatBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(LongBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static void zeroBuffer(DoubleBuffer var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static <T extends CustomBuffer<T>> void zeroBuffer(T var0) {
      MemoryUtil.memSet(var0, 0);
   }

   public static short[] toArray(ShortBuffer var0) {
      if (var0.hasArray()) {
         short[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         short[] var1 = new short[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static char[] toArray(CharBuffer var0) {
      if (var0.hasArray()) {
         char[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         char[] var1 = new char[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static int[] toArray(IntBuffer var0) {
      if (var0.hasArray()) {
         int[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         int[] var1 = new int[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static long[] toArray(LongBuffer var0) {
      if (var0.hasArray()) {
         long[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         long[] var1 = new long[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static float[] toArray(FloatBuffer var0) {
      if (var0.hasArray()) {
         float[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         float[] var1 = new float[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static double[] toArray(DoubleBuffer var0) {
      if (var0.hasArray()) {
         double[] var3 = var0.array();
         int var2 = var0.arrayOffset();
         return var2 == 0 ? var3 : Arrays.copyOfRange(var3, var2, var3.length);
      } else {
         var0.rewind();
         double[] var1 = new double[var0.remaining()];
         var0.get(var1);
         return var1;
      }
   }

   public static <B extends Buffer> Object toArray(B var0) {
      if (var0 instanceof ShortBuffer var1) {
         return toArray(var1);
      } else if (var0 instanceof CharBuffer var2) {
         return toArray(var2);
      } else if (var0 instanceof IntBuffer var3) {
         return toArray(var3);
      } else if (var0 instanceof LongBuffer var4) {
         return toArray(var4);
      } else if (var0 instanceof FloatBuffer var5) {
         return toArray(var5);
      } else if (var0 instanceof DoubleBuffer var6) {
         return toArray(var6);
      } else {
         throw new RuntimeException("Unable to get array of Buffer: " + var0);
      }
   }

   @Generated
   private BufferUtils() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
