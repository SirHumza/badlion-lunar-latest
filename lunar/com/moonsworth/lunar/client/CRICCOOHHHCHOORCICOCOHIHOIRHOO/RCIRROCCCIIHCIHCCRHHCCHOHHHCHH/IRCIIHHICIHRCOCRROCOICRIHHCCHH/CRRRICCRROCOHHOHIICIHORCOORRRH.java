package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Map<String, Object> OOCROCOHIIRIHHCCHCIIHHOHHIOCOC = new HashMap<>();

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, Object var2) {
      this.OOCROCOHIIRIHHCCHCIIHHOHHIOCOC.put(var1, var2);
   }

   @Override
   public String getString(String var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, String.class);
   }

   @Override
   public int getInteger(String var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Integer.class);
   }

   @Override
   public double getDouble(String var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Double.class);
   }

   @Override
   public Duration getDuration(String var1) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, Duration.class);
   }

   private <T> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Class<T> var2) {
      Object var3 = this.OOCROCOHIIRIHHCCHCIIHHOHHIOCOC.get(var1);
      if (var3 == null) {
         throw new IllegalStateException("No argument bound for name: " + var1);
      } else if (!var2.isInstance(var3)) {
         throw new IllegalStateException("Argument " + var1 + " is not a " + var2.getSimpleName() + " (got " + var3.getClass().getSimpleName() + ")");
      } else {
         return (T)var2.cast(var3);
      }
   }
}
