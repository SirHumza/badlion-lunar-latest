package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

public final class LazilyParsedNumber extends Number {
   private final String value;

   public LazilyParsedNumber(String var1) {
      this.value = var1;
   }

   private BigDecimal asBigDecimal() {
      return NumberLimits.parseBigDecimal(this.value);
   }

   @Override
   public int intValue() {
      try {
         return Integer.parseInt(this.value);
      } catch (NumberFormatException var4) {
         try {
            return (int)Long.parseLong(this.value);
         } catch (NumberFormatException var3) {
            return this.asBigDecimal().intValue();
         }
      }
   }

   @Override
   public long longValue() {
      try {
         return Long.parseLong(this.value);
      } catch (NumberFormatException var2) {
         return this.asBigDecimal().longValue();
      }
   }

   @Override
   public float floatValue() {
      return Float.parseFloat(this.value);
   }

   @Override
   public double doubleValue() {
      return Double.parseDouble(this.value);
   }

   @Override
   public String toString() {
      return this.value;
   }

   private Object writeReplace() {
      return this.asBigDecimal();
   }

   private void readObject(ObjectInputStream var1) {
      throw new InvalidObjectException("Deserialization is unsupported");
   }

   @Override
   public int hashCode() {
      return this.value.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof LazilyParsedNumber) {
         LazilyParsedNumber var2 = (LazilyParsedNumber)var1;
         return this.value.equals(var2.value);
      } else {
         return false;
      }
   }
}
