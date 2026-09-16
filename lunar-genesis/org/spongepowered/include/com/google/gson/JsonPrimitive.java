package org.spongepowered.include.com.google.gson;

import java.math.BigInteger;
import org.spongepowered.include.com.google.gson.internal.$Gson$Preconditions;
import org.spongepowered.include.com.google.gson.internal.LazilyParsedNumber;

public final class JsonPrimitive extends JsonElement {
   private static final Class<?>[] PRIMITIVE_TYPES = new Class[]{
      int.class,
      long.class,
      short.class,
      float.class,
      double.class,
      byte.class,
      boolean.class,
      char.class,
      Integer.class,
      Long.class,
      Short.class,
      Float.class,
      Double.class,
      Byte.class,
      Boolean.class,
      Character.class
   };
   private Object value;

   public JsonPrimitive(Boolean var1) {
      this.setValue(var1);
   }

   public JsonPrimitive(Number var1) {
      this.setValue(var1);
   }

   public JsonPrimitive(String var1) {
      this.setValue(var1);
   }

   void setValue(Object var1) {
      if (var1 instanceof Character) {
         char var2 = (Character)var1;
         this.value = String.valueOf(var2);
      } else {
         $Gson$Preconditions.checkArgument(var1 instanceof Number || isPrimitiveOrString(var1));
         this.value = var1;
      }
   }

   public boolean isBoolean() {
      return this.value instanceof Boolean;
   }

   @Override
   Boolean getAsBooleanWrapper() {
      return (Boolean)this.value;
   }

   @Override
   public boolean getAsBoolean() {
      return this.isBoolean() ? this.getAsBooleanWrapper() : Boolean.parseBoolean(this.getAsString());
   }

   public boolean isNumber() {
      return this.value instanceof Number;
   }

   @Override
   public Number getAsNumber() {
      return this.value instanceof String ? new LazilyParsedNumber((String)this.value) : (Number)this.value;
   }

   public boolean isString() {
      return this.value instanceof String;
   }

   @Override
   public String getAsString() {
      if (this.isNumber()) {
         return this.getAsNumber().toString();
      } else {
         return this.isBoolean() ? this.getAsBooleanWrapper().toString() : (String)this.value;
      }
   }

   @Override
   public double getAsDouble() {
      return this.isNumber() ? this.getAsNumber().doubleValue() : Double.parseDouble(this.getAsString());
   }

   @Override
   public long getAsLong() {
      return this.isNumber() ? this.getAsNumber().longValue() : Long.parseLong(this.getAsString());
   }

   @Override
   public int getAsInt() {
      return this.isNumber() ? this.getAsNumber().intValue() : Integer.parseInt(this.getAsString());
   }

   private static boolean isPrimitiveOrString(Object var0) {
      if (var0 instanceof String) {
         return true;
      }

      Class var1 = var0.getClass();

      for (Class var5 : PRIMITIVE_TYPES) {
         if (var5.isAssignableFrom(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int hashCode() {
      if (this.value == null) {
         return 31;
      } else if (isIntegral(this)) {
         long var3 = this.getAsNumber().longValue();
         return (int)(var3 ^ var3 >>> 32);
      } else if (this.value instanceof Number) {
         long var1 = Double.doubleToLongBits(this.getAsNumber().doubleValue());
         return (int)(var1 ^ var1 >>> 32);
      } else {
         return this.value.hashCode();
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         JsonPrimitive var2 = (JsonPrimitive)var1;
         if (this.value == null) {
            return var2.value == null;
         } else if (isIntegral(this) && isIntegral(var2)) {
            return this.getAsNumber().longValue() == var2.getAsNumber().longValue();
         } else if (this.value instanceof Number && var2.value instanceof Number) {
            double var3 = this.getAsNumber().doubleValue();
            double var5 = var2.getAsNumber().doubleValue();
            return var3 == var5 || Double.isNaN(var3) && Double.isNaN(var5);
         } else {
            return this.value.equals(var2.value);
         }
      } else {
         return false;
      }
   }

   private static boolean isIntegral(JsonPrimitive var0) {
      if (!(var0.value instanceof Number)) {
         return false;
      }

      Number var1 = (Number)var0.value;
      return var1 instanceof BigInteger || var1 instanceof Long || var1 instanceof Integer || var1 instanceof Short || var1 instanceof Byte;
   }
}
