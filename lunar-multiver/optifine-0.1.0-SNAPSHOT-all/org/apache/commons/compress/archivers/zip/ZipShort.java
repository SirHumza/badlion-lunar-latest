package org.apache.commons.compress.archivers.zip;

import java.io.Serializable;

public final class ZipShort implements Serializable, Cloneable {
   private static final long serialVersionUID = 1L;
   private static final int BYTE_1_MASK = 65280;
   private static final int BYTE_1_SHIFT = 8;
   private final int value;

   public ZipShort(int var1) {
      this.value = var1;
   }

   public ZipShort(byte[] var1) {
      this(var1, 0);
   }

   public ZipShort(byte[] var1, int var2) {
      this.value = getValue(var1, var2);
   }

   public byte[] getBytes() {
      return new byte[]{(byte)(this.value & 0xFF), (byte)((this.value & 0xFF00) >> 8)};
   }

   public int getValue() {
      return this.value;
   }

   public static byte[] getBytes(int var0) {
      return new byte[]{(byte)(var0 & 0xFF), (byte)((var0 & 0xFF00) >> 8)};
   }

   public static int getValue(byte[] var0, int var1) {
      int var2 = var0[var1 + 1] << 8 & 0xFF00;
      return var2 + (var0[var1] & 0xFF);
   }

   public static int getValue(byte[] var0) {
      return getValue(var0, 0);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 != null && var1 instanceof ZipShort ? this.value == ((ZipShort)var1).getValue() : false;
   }

   @Override
   public int hashCode() {
      return this.value;
   }

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public String toString() {
      return "ZipShort value: " + this.value;
   }
}
