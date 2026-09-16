package com.typesafe.config;

import java.math.BigInteger;

public final class ConfigMemorySize {
   private BigInteger bytes;

   private ConfigMemorySize(BigInteger var1) {
      if (var1.signum() < 0) {
         throw new IllegalArgumentException("Attempt to construct ConfigMemorySize with negative number: " + var1);
      }

      this.bytes = var1;
   }

   public static ConfigMemorySize ofBytes(BigInteger var0) {
      return new ConfigMemorySize(var0);
   }

   public static ConfigMemorySize ofBytes(long var0) {
      return new ConfigMemorySize(BigInteger.valueOf(var0));
   }

   public long toBytes() {
      if (this.bytes.bitLength() < 64) {
         return this.bytes.longValue();
      } else {
         throw new IllegalArgumentException("size-in-bytes value is out of range for a 64-bit long: '" + this.bytes + "'");
      }
   }

   public BigInteger toBytesBigInteger() {
      return this.bytes;
   }

   @Override
   public String toString() {
      return "ConfigMemorySize(" + this.bytes + ")";
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof ConfigMemorySize ? ((ConfigMemorySize)var1).bytes.equals(this.bytes) : false;
   }

   @Override
   public int hashCode() {
      return this.bytes.hashCode();
   }
}
