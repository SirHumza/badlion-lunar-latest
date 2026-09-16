package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import java.io.Serializable;

abstract class ConfigNumber extends AbstractConfigValue implements Serializable {
   private static final long serialVersionUID = 2L;
   protected final String originalText;

   protected ConfigNumber(ConfigOrigin var1, String var2) {
      super(var1);
      this.originalText = var2;
   }

   public abstract Number unwrapped();

   @Override
   String transformToString() {
      return this.originalText;
   }

   int intValueRangeChecked(String var1) {
      long var2 = this.longValue();
      if (var2 >= -2147483648L && var2 <= 2147483647L) {
         return (int)var2;
      } else {
         throw new ConfigException.WrongType(this.origin(), var1, "32-bit integer", "out-of-range value " + var2);
      }
   }

   protected abstract long longValue();

   protected abstract double doubleValue();

   private boolean isWhole() {
      long var1 = this.longValue();
      return var1 == this.doubleValue();
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigNumber;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof ConfigNumber && this.canEqual(var1)) {
         ConfigNumber var2 = (ConfigNumber)var1;
         return this.isWhole() ? var2.isWhole() && this.longValue() == var2.longValue() : !var2.isWhole() && this.doubleValue() == var2.doubleValue();
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      long var1;
      if (this.isWhole()) {
         var1 = this.longValue();
      } else {
         var1 = Double.doubleToLongBits(this.doubleValue());
      }

      return (int)(var1 ^ var1 >>> 32);
   }

   static ConfigNumber newNumber(ConfigOrigin var0, long var1, String var3) {
      return var1 <= 2147483647L && var1 >= -2147483648L ? new ConfigInt(var0, (int)var1, var3) : new ConfigLong(var0, var1, var3);
   }

   static ConfigNumber newNumber(ConfigOrigin var0, double var1, String var3) {
      long var4 = (long)var1;
      return var4 == var1 ? newNumber(var0, var4, var3) : new ConfigDouble(var0, var1, var3);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }
}
