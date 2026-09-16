package org.spongepowered.asm.util;

public final class Counter {
   public int value;

   @Override
   public boolean equals(Object var1) {
      return var1 != null && var1.getClass() == Counter.class && ((Counter)var1).value == this.value;
   }

   @Override
   public int hashCode() {
      return this.value;
   }
}
