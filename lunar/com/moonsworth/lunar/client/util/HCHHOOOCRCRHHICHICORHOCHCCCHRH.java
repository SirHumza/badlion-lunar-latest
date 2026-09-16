package com.moonsworth.lunar.client.util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class HCHHOOOCRCRHHICHICORHOCHCCCHRH<T> {
   private final ArrayDeque<HCHHOOOCRCRHHICHICORHOCHCCCHRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>> ORROCCRICOOIOOOHROOCHORHHHORHH = new ArrayDeque<>();

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1, long var2) {
      this.ORROCCRICOOIOOOHROOCHORHHHORHH.addLast(new HCHHOOOCRCRHHICHICORHOCHCCCHRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>((T)var1, var2));
   }

   public Optional<HCHHOOOCRCRHHICHICORHOCHCCCHRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, int var3) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var3);
      return Optional.ofNullable(this.ORROCCRICOOIOOOHROOCHORHHHORHH.peekFirst());
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(long var1, int var3) {
      while (!this.ORROCCRICOOIOOOHROOCHORHHHORHH.isEmpty() && var1 - this.ORROCCRICOOIOOOHROOCHORHHHORHH.peekFirst().ORRCIHHRRHCOHHOOOIOCHIHIRCOORR() > var3) {
         this.ORROCCRICOOIOOOHROOCHORHHHORHH.pollFirst();
      }
   }

   public List<HCHHOOOCRCRHHICHICORHOCHCCCHRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>> HHCCIRHCCCIIRHCROHIORHIRHHIORH(long var1, int var3) {
      ArrayList var4 = null;

      while (!this.ORROCCRICOOIOOOHROOCHORHHHORHH.isEmpty() && var1 - this.ORROCCRICOOIOOOHROOCHORHHHORHH.peekFirst().ORRCIHHRRHCOHHOOOIOCHIHIRCOORR() > var3) {
         if (var4 == null) {
            var4 = new ArrayList();
         }

         var4.add(this.ORROCCRICOOIOOOHROOCHORHHHORHH.pollFirst());
      }

      return var4 == null ? List.of() : var4;
   }

   public boolean isEmpty() {
      return this.ORROCCRICOOIOOOHROOCHORHHHORHH.isEmpty();
   }

   public void clear() {
      this.ORROCCRICOOIOOOHROOCHORHHHORHH.clear();
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>() {
      private final T RCOHORRHICHRRROIHCIRHHIIOOIROR;
      private final long tick;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(T var1, long var2) {
         this.RCOHORRHICHRRROIHCIRHHIIOOIROR = (T)var1;
         this.tick = var2;
      }

      public T value() {
         return this.RCOHORRHICHRRROIHCIRHHIIOOIROR;
      }

      public long ORRCIHHRRHCOHHOOOIOCHIHIRCOORR() {
         return this.tick;
      }
   }
}
