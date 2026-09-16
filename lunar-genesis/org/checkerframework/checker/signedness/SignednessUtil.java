package org.checkerframework.checker.signedness;

import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.checkerframework.checker.signedness.qual.Unsigned;

public final class SignednessUtil {
   private SignednessUtil() {
      throw new Error("Do not instantiate");
   }

   public static ByteBuffer wrapUnsigned(@Unsigned byte[] var0) {
      return ByteBuffer.wrap(var0);
   }

   public static ByteBuffer wrapUnsigned(@Unsigned byte[] var0, int var1, int var2) {
      return ByteBuffer.wrap(var0, var1, var2);
   }

   public static @Unsigned int getUnsignedInt(ByteBuffer var0) {
      return var0.getInt();
   }

   public static @Unsigned short getUnsignedShort(ByteBuffer var0) {
      return var0.getShort();
   }

   public static @Unsigned byte getUnsigned(ByteBuffer var0) {
      return var0.get();
   }

   public static @Unsigned byte getUnsigned(ByteBuffer var0, int var1) {
      return var0.get(var1);
   }

   public static ByteBuffer getUnsigned(ByteBuffer var0, byte[] var1, int var2, int var3) {
      return var0.get(var1, var2, var3);
   }

   public static ByteBuffer putUnsigned(ByteBuffer var0, @Unsigned byte var1) {
      return var0.put(var1);
   }

   public static ByteBuffer putUnsigned(ByteBuffer var0, int var1, @Unsigned byte var2) {
      return var0.put(var1, var2);
   }

   public static IntBuffer putUnsigned(IntBuffer var0, @Unsigned int var1) {
      return var0.put(var1);
   }

   public static IntBuffer putUnsigned(IntBuffer var0, int var1, @Unsigned int var2) {
      return var0.put(var1, var2);
   }

   public static IntBuffer putUnsigned(IntBuffer var0, @Unsigned int[] var1) {
      return var0.put(var1);
   }

   public static IntBuffer putUnsigned(IntBuffer var0, @Unsigned int[] var1, int var2, int var3) {
      return var0.put(var1, var2, var3);
   }

   public static @Unsigned int getUnsigned(IntBuffer var0, int var1) {
      return var0.get(var1);
   }

   public static ByteBuffer putUnsignedShort(ByteBuffer var0, @Unsigned short var1) {
      return var0.putShort(var1);
   }

   public static ByteBuffer putUnsignedShort(ByteBuffer var0, int var1, @Unsigned short var2) {
      return var0.putShort(var1, var2);
   }

   public static ByteBuffer putUnsignedInt(ByteBuffer var0, @Unsigned int var1) {
      return var0.putInt(var1);
   }

   public static ByteBuffer putUnsignedInt(ByteBuffer var0, int var1, @Unsigned int var2) {
      return var0.putInt(var1, var2);
   }

   public static ByteBuffer putUnsignedLong(ByteBuffer var0, int var1, @Unsigned long var2) {
      return var0.putLong(var1, var2);
   }

   @Deprecated
   public static @Unsigned byte readUnsignedByte(RandomAccessFile var0) {
      return var0.readByte();
   }

   public static @Unsigned char readUnsignedChar(RandomAccessFile var0) {
      return var0.readChar();
   }

   @Deprecated
   public static @Unsigned short readUnsignedShort(RandomAccessFile var0) {
      return var0.readShort();
   }

   public static @Unsigned int readUnsignedInt(RandomAccessFile var0) {
      return var0.readInt();
   }

   public static @Unsigned long readUnsignedLong(RandomAccessFile var0) {
      return var0.readLong();
   }

   public static int readUnsigned(RandomAccessFile var0, @Unsigned byte[] var1, int var2, int var3) {
      return var0.read(var1, var2, var3);
   }

   public static void readFullyUnsigned(RandomAccessFile var0, @Unsigned byte[] var1) {
      var0.readFully(var1);
   }

   public static void writeUnsigned(RandomAccessFile var0, @Unsigned byte[] var1, int var2, int var3) {
      var0.write(var1, var2, var3);
   }

   public static void writeUnsignedByte(RandomAccessFile var0, @Unsigned byte var1) {
      var0.writeByte(toUnsignedInt(var1));
   }

   public static void writeUnsignedChar(RandomAccessFile var0, @Unsigned char var1) {
      var0.writeChar(toUnsignedInt(var1));
   }

   public static void writeUnsignedShort(RandomAccessFile var0, @Unsigned short var1) {
      var0.writeShort(toUnsignedInt(var1));
   }

   public static void writeUnsignedInt(RandomAccessFile var0, @Unsigned int var1) {
      var0.writeInt(var1);
   }

   public static void writeUnsignedLong(RandomAccessFile var0, @Unsigned long var1) {
      var0.writeLong(var1);
   }

   public static void getUnsigned(ByteBuffer var0, @Unsigned byte[] var1) {
      var0.get(var1);
   }

   @Deprecated
   public static int compareUnsigned(@Unsigned long var0, @Unsigned long var2) {
      return Long.compare(var0 + Long.MIN_VALUE, var2 + Long.MIN_VALUE);
   }

   @Deprecated
   public static int compareUnsigned(@Unsigned int var0, @Unsigned int var1) {
      return Integer.compare(var0 + Integer.MIN_VALUE, var1 + Integer.MIN_VALUE);
   }

   public static int compareUnsigned(@Unsigned short var0, @Unsigned short var1) {
      return compareUnsigned(toUnsignedInt(var0), toUnsignedInt(var1));
   }

   public static int compareUnsigned(@Unsigned byte var0, @Unsigned byte var1) {
      return compareUnsigned(toUnsignedInt(var0), toUnsignedInt(var1));
   }

   @Deprecated
   public static String toUnsignedString(@Unsigned long var0) {
      return toUnsignedBigInteger(var0).toString();
   }

   @Deprecated
   public static String toUnsignedString(@Unsigned long var0, int var2) {
      return toUnsignedBigInteger(var0).toString(var2);
   }

   @Deprecated
   public static String toUnsignedString(@Unsigned int var0) {
      return Long.toString(toUnsignedLong(var0));
   }

   @Deprecated
   public static String toUnsignedString(@Unsigned int var0, int var1) {
      return Long.toString(toUnsignedLong(var0), var1);
   }

   public static String toUnsignedString(@Unsigned short var0) {
      return Long.toString(toUnsignedLong(var0));
   }

   public static String toUnsignedString(@Unsigned short var0, int var1) {
      return Long.toString(toUnsignedLong(var0), var1);
   }

   public static String toUnsignedString(@Unsigned byte var0) {
      return Long.toString(toUnsignedLong(var0));
   }

   public static String toUnsignedString(@Unsigned byte var0, int var1) {
      return Long.toString(toUnsignedLong(var0), var1);
   }

   private static @Unsigned BigInteger toUnsignedBigInteger(@Unsigned long var0) {
      if (var0 >= 0L) {
         return BigInteger.valueOf(var0);
      }

      int var2 = (int)(var0 >>> 32);
      int var3 = (int)var0;
      return BigInteger.valueOf(toUnsignedLong(var2)).shiftLeft(32).add(BigInteger.valueOf(toUnsignedLong(var3)));
   }

   @Deprecated
   public static @Unsigned long toUnsignedLong(@Unsigned int var0) {
      return var0 & 4294967295L;
   }

   @Deprecated
   public static @Unsigned long toUnsignedLong(@Unsigned short var0) {
      return var0 & 65535L;
   }

   @Deprecated
   public static @Unsigned int toUnsignedInt(@Unsigned short var0) {
      return var0 & 65535;
   }

   @Deprecated
   public static @Unsigned long toUnsignedLong(@Unsigned byte var0) {
      return var0 & 255L;
   }

   @Deprecated
   public static @Unsigned int toUnsignedInt(@Unsigned byte var0) {
      return var0 & 0xFF;
   }

   public static @Unsigned short toUnsignedShort(@Unsigned byte var0) {
      return (short)(var0 & 0xFF);
   }

   public static @Unsigned long toUnsignedLong(@Unsigned char var0) {
      return var0 & 255L;
   }

   public static @Unsigned int toUnsignedInt(@Unsigned char var0) {
      return var0 & 0xFF;
   }

   public static @Unsigned short toUnsignedShort(@Unsigned char var0) {
      return (short)(var0 & 0xFF);
   }

   public static float toFloat(@Unsigned byte var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).floatValue();
   }

   public static float toFloat(@Unsigned short var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).floatValue();
   }

   public static float toFloat(@Unsigned int var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).floatValue();
   }

   public static float toFloat(@Unsigned long var0) {
      return toUnsignedBigInteger(var0).floatValue();
   }

   public static double toDouble(@Unsigned byte var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).doubleValue();
   }

   public static double toDouble(@Unsigned short var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).doubleValue();
   }

   public static double toDouble(@Unsigned int var0) {
      return toUnsignedBigInteger(toUnsignedLong(var0)).doubleValue();
   }

   public static double toDouble(@Unsigned long var0) {
      return toUnsignedBigInteger(var0).doubleValue();
   }

   public static @Unsigned byte byteFromFloat(float var0) {
      assert var0 >= 0.0F;
      return (byte)var0;
   }

   public static @Unsigned short shortFromFloat(float var0) {
      assert var0 >= 0.0F;
      return (short)var0;
   }

   public static @Unsigned int intFromFloat(float var0) {
      assert var0 >= 0.0F;
      return (int)var0;
   }

   public static @Unsigned long longFromFloat(float var0) {
      assert var0 >= 0.0F;
      return (long)var0;
   }

   public static @Unsigned byte byteFromDouble(double var0) {
      assert var0 >= 0.0;
      return (byte)var0;
   }

   public static @Unsigned short shortFromDouble(double var0) {
      assert var0 >= 0.0;
      return (short)var0;
   }

   public static @Unsigned int intFromDouble(double var0) {
      assert var0 >= 0.0;
      return (int)var0;
   }

   public static @Unsigned long longFromDouble(double var0) {
      assert var0 >= 0.0;
      return (long)var0;
   }
}
