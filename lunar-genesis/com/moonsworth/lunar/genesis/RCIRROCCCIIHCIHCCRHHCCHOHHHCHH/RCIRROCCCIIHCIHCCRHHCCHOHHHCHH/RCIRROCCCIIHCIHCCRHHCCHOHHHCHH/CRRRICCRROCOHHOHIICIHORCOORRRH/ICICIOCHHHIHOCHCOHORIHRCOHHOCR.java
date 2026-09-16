package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class ICICIOCHHHIHOCHCOHORIHRCOHHOCR {
   static void checkEntryNotNull(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException("null key in entry: null=" + var1);
      }

      if (var1 == null) {
         throw new NullPointerException("null value in entry: " + var0 + "=null");
      }
   }

   @CanIgnoreReturnValue
   static int checkNonnegative(int var0, String var1) {
      if (var0 < 0) {
         throw new IllegalArgumentException(var1 + " cannot be negative but was: " + var0);
      } else {
         return var0;
      }
   }

   @CanIgnoreReturnValue
   static long checkNonnegative(long var0, String var2) {
      if (var0 < 0L) {
         throw new IllegalArgumentException(var2 + " cannot be negative but was: " + var0);
      } else {
         return var0;
      }
   }

   static void checkPositive(int var0, String var1) {
      if (var0 <= 0) {
         throw new IllegalArgumentException(var1 + " must be positive but was: " + var0);
      }
   }

   static void checkRemove(boolean var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         var0, "no calls to next() since the last call to remove()"
      );
   }
}
