package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> IIOORCCHHOCHRIICICCCROHCRRCHCC = new WeakHashMap<>();

   private HICHRCOHCCRHOHCICOOCHOIHCCHIRI() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static Field getField(Enum<?> var0) {
      Class var1 = var0.getDeclaringClass();

      try {
         return var1.getDeclaredField(var0.name());
      } catch (NoSuchFieldException var3) {
         throw new AssertionError(var3);
      }
   }

   public static <T extends Enum<T>> ORHIOICIOCRRHOOCOHRORIHICHRCRR<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<T> var0, String var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      return ICICIOCHHHIHOCHCOHORIHRCOHHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> populateCache(Class<T> var0) {
      HashMap var1 = new HashMap();

      for (Enum var3 : EnumSet.allOf(var0)) {
         var1.put(var3.name(), new WeakReference<>(var3));
      }

      IIOORCCHHOCHRIICICCCROHCRRCHCC.put(var0, var1);
      return var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> getEnumConstants(Class<T> var0) {
      synchronized (IIOORCCHHOCHRIICICCCROHCRRCHCC) {
         Map var2 = IIOORCCHHOCHRIICICCCROHCRRCHCC.get(var0);
         if (var2 == null) {
            var2 = populateCache(var0);
         }

         return var2;
      }
   }

   public static <T extends Enum<T>> CORCOCICIRIOHROHROIIOOHICCHCRR<String, T> IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(Class<T> var0) {
      return new HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var0);
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends Enum<T>> extends CORCOCICIRIOHROHROIIOOHICCHCRR<String, T> implements Serializable {
      private final Class<T> ICHHOIHCICIROHOHRROIHCRIHCCCOH;
      private static final long IORRRHHOCICOOHIIIHIHRCCIRORIHC = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<T> var1) {
         this.ICHHOIHCICIROHOHRROIHCRIHCCCOH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      }

      protected T doForward(String var1) {
         return Enum.valueOf(this.ICHHOIHCICIROHOHRROIHCRIHCCCOH, var1);
      }

      protected String doBackward(T var1) {
         return var1.name();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return this.ICHHOIHCICIROHOHRROIHCRIHCCCOH.equals(var2.ICHHOIHCICIROHOHRROIHCRIHCCCOH);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.ICHHOIHCICIROHOHRROIHCRIHCCCOH.hashCode();
      }

      @Override
      public String toString() {
         return "Enums.stringConverter(" + this.ICHHOIHCICIROHOHRROIHCRIHCCCOH.getName() + ".class)";
      }
   }
}
