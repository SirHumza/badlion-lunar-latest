package org.spongepowered.include.com.google.common.collect;

import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

final class CollectPreconditions {
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

   static void checkRemove(boolean var0) {
      Preconditions.checkState(var0, "no calls to next() since the last call to remove()");
   }
}
